package com.productservice.productservice.inheritancerelations.tablePerClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tpc_student")
public class Student extends User {
    private Double psp;
}
