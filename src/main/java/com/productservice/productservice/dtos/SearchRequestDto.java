package com.productservice.productservice.dtos;

import com.productservice.productservice.models.SortParam;
import lombok.Data;

import java.util.List;

@Data
public class SearchRequestDto {
    private String query;
    private int pageNumber;
    private int itemsPerpage;
    private List<SortParam> sortParams;
}

