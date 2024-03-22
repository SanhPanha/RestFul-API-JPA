package org.example.restfulsamplejpa.model;


import jakarta.persistence.*;

@Entity
@Table(name = "product_tbl")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    private String imageUri;
    private float price;

}
