package com.productservice.productservice.inheritancerelations.tablePerClass;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity(name = "tpc_user")
@ToString
@Inheritance(strategy =InheritanceType.TABLE_PER_CLASS )
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;

}
