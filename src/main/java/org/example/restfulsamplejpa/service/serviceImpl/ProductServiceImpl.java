package org.example.restfulsamplejpa.service.serviceImpl;

import lombok.RequiredArgsConstructor;
import org.example.restfulsamplejpa.dto.ProductRequest;
import org.example.restfulsamplejpa.dto.ProductResponse;
import org.example.restfulsamplejpa.mapper.ProductMapper;
import org.example.restfulsamplejpa.model.Product;
import org.example.restfulsamplejpa.repository.ProductRepository;
import org.example.restfulsamplejpa.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Override
    public List<ProductResponse> getAllProducts() {

        return productRepository.findAll()
                .stream()
                .map(productMapper::mapToProductResponse)
                .toList();
    }

    @Override
    public ProductResponse createProduct(ProductRequest product) {
        return null;
    }

    @Override
    public ProductResponse updateProduct(Long id, ProductRequest product) {
        return null;
    }

    @Override
    public void deleteProduct(Long id) {

    }

}
