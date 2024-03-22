package org.example.restfulsamplejpa.dto;

import lombok.Builder;

@Builder
public record ProductResponse(
        int id,
        String title,
        String description,
        String imageUri,
        float price
) {

}
