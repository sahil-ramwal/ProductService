package com.productservice.productservice.services;

import com.productservice.productservice.dtos.GenericProductDto;
import com.productservice.productservice.dtos.SearchRequestDto;
import com.productservice.productservice.models.Product;
import com.productservice.productservice.repository.ProductRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchService {
    private ProductRepository productRepository;
    public SearchService(ProductRepository productRepository){
        this.productRepository=productRepository;
    }
    public List<GenericProductDto> searchProducts(SearchRequestDto searchRequestDto) {
     PageRequest pageRequest=PageRequest.of(searchRequestDto.getPageNumber(),searchRequestDto.getItemsPerpage());
     Sort sort=Sort.by("title").ascending();
        List<Product>products=productRepository.findAllByTitleContaining(searchRequestDto.getQuery(),pageRequest);
        List<GenericProductDto>genericProductDtos=new ArrayList<>();
        for(Product product:products){
         genericProductDtos.add( product.from(product));
        }

        return genericProductDtos;
    }
}
