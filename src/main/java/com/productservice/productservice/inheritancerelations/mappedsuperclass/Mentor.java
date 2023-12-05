package com.productservice.productservice.inheritancerelations.mappedsuperclass;

import jakarta.persistence.Entity;
import jdk.jfr.Enabled;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "ms_mentor")
public class Mentor extends User{
    private Double avgRating;
}
