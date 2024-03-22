package org.example.restfulsamplejpa.mapper;

import org.example.restfulsamplejpa.dto.ProductRequest;
import org.example.restfulsamplejpa.dto.ProductResponse;
import org.example.restfulsamplejpa.model.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductResponse mapToProductResponse(Product product);
    Product mapToProduct(ProductRequest productRequest);
}
