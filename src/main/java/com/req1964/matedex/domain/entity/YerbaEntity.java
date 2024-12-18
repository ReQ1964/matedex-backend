package com.req1964.matedex.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity(name = "yerba")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class YerbaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String company;

    private Short rating;
    private Short bitterness;
    private Short dust;
    private Short power;

    private byte[] imageData;

    @OneToMany(mappedBy = "yerbaEntity")
    private List<ReviewEntity> reviews;
}
