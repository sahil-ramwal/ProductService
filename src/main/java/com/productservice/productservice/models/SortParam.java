package com.productservice.productservice.models;

import lombok.Data;

@Data
public class SortParam {
    private String sortParamName;
    private SortType sortType;
}
