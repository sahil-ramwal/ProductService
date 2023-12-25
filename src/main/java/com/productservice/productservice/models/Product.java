package com.productservice.productservice.models;

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


}
