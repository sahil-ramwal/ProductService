package com.productservice.productservice.thirdPartyClients.fakestoreclient;

import com.productservice.productservice.dtos.FakeStoreProductDto;
import com.productservice.productservice.dtos.GenericProductDto;
import com.productservice.productservice.exceptions.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RequestCallback;
import org.springframework.web.client.ResponseExtractor;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class FakeStoreClient {
    @Autowired
    private RestTemplateBuilder restTemplateBuilder;
    //  @Value("${fakestore.api.url}")
    private String fakeStoreUrl;
    // @Value("${fakestore.api.paths.products}")
    private String pathForProducts;
    private String specificProductUrl;
    private String genericProductUrl;


    FakeStoreClient(RestTemplateBuilder restTemplateBuilder, @Value("${fakestore.api.url}") String fakeStoreUrl, @Value("${fakestore.api.paths.products}") String pathForProducts) {
        this.restTemplateBuilder = restTemplateBuilder;
        this.specificProductUrl = fakeStoreUrl + pathForProducts + "/{id}";
        this.genericProductUrl = fakeStoreUrl + pathForProducts;
        this.fakeStoreUrl = fakeStoreUrl;
    }


    public FakeStoreProductDto getProductById(Long id) throws ProductNotFoundException {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductDto> responseEntity = restTemplate.getForEntity(specificProductUrl, FakeStoreProductDto.class, id);
        //convert fakestore to genericdto
        if (null == responseEntity.getBody()) {
            throw new ProductNotFoundException("product with id " + id + " not found");
        }
        return responseEntity.getBody();
    }


    public List<FakeStoreProductDto> getAllProducts() {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductDto[]> responseEntity = restTemplate.getForEntity(genericProductUrl, FakeStoreProductDto[].class);
        return List.of(responseEntity.getBody());
    }


    public FakeStoreProductDto deleteproductById(Long id) {
        RestTemplate restTemplate = restTemplateBuilder.build();
        //this part of code is from resttemplate.getentity made modifications to return fakestore product dto
        RequestCallback requestCallback = restTemplate.acceptHeaderRequestCallback(FakeStoreProductDto.class);
        ResponseExtractor<ResponseEntity<FakeStoreProductDto>> responseExtractor = restTemplate.responseEntityExtractor(FakeStoreProductDto.class);
        ResponseEntity<FakeStoreProductDto> responseEntity = restTemplate.execute(specificProductUrl, HttpMethod.DELETE, requestCallback, responseExtractor, id);
        return responseEntity.getBody();


    }

    public FakeStoreProductDto createProduct(GenericProductDto genericProductDto) {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductDto> fakeStoreProductDtoResponseEntity
                = restTemplate.postForEntity(genericProductUrl, genericProductDto, FakeStoreProductDto.class);
        return fakeStoreProductDtoResponseEntity.getBody();
    }


    public FakeStoreProductDto updateproductById(Long id, GenericProductDto genericProductDto) {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductDto> responseEntity = restTemplate.postForEntity(genericProductUrl, genericProductDto, FakeStoreProductDto.class, id);
        return responseEntity.getBody();
    }
}
