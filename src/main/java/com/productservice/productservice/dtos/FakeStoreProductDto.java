package com.productservice.productservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FakeStoreProductDto {
   private long  id;
    private String title;
   private int price;
   private String category;
    private String description;
   private String image;
}
