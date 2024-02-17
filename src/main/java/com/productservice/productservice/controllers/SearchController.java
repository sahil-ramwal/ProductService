package com.productservice.productservice.controllers;

import com.productservice.productservice.dtos.GenericProductDto;
import com.productservice.productservice.dtos.SearchRequestDto;
import com.productservice.productservice.services.SearchService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/search")
public class SearchController {
    private SearchService searchService;

    public SearchController(SearchService searchService){
        this.searchService=searchService;
    }
    @PostMapping()
    public Page<GenericProductDto> searchProducts(@RequestBody SearchRequestDto searchRequestDto){
        List<GenericProductDto> genericProductDtos=searchService.searchProducts(searchRequestDto);
        Page<GenericProductDto> genericProductpage=new PageImpl<>(genericProductDtos, PageRequest.of(searchRequestDto.getPageNumber(), searchRequestDto.getItemsPerpage()),(long) genericProductDtos.size());
//        for(GenericProductDto genericProductDto:genericProductDtos){
//
//        }
       return genericProductpage;
    }

}
