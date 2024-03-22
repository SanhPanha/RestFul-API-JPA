package org.example.restfulsamplejpa.dto;

import lombok.Builder;

@Builder
public record ProductRequest(
        String title,
        String description,
        String imageUri,
        float price
) {

}
