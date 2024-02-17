package com.productservice.productservice.models;

import com.productservice.productservice.dtos.GenericProductDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product extends BaseModel {

    private String title;
    private String description;
    /*
      product:price
      1:1
      m:1
     */
    @OneToOne(cascade = {CascadeType.REMOVE, CascadeType.PERSIST}, optional = false)
    @JoinColumn(nullable = false, unique = true)
    private Price price;
    private String image;

    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    private Category category;
    public GenericProductDto from(Product product){
        GenericProductDto genericProductDto=new GenericProductDto();
        genericProductDto.setTitle(product.getTitle());
        genericProductDto.setCategory(product.getCategory().getName());
        genericProductDto.setImage(product.getImage());
        genericProductDto.setDescription(product.getDescription());
        //  genericProductDto.setPrice(product.getPrice().getValue());
        return genericProductDto;
    }


}
