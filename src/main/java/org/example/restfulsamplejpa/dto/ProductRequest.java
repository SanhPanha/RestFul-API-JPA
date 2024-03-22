package org.example.restfulsamplejpa.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Builder;

@Builder
public record ProductRequest(
        @NotNull
        @NotEmpty
        String title,
        String description,

        @NotEmpty
        String imageUri,

        @Positive
        float price
) {

}
