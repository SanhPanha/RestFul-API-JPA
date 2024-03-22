package org.example.restfulsamplejpa.restController;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.restfulsamplejpa.dto.ProductRequest;
import org.example.restfulsamplejpa.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Objects;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
@Slf4j
public class ProductRestController {
    private final ProductService productService;

    private HashMap<String, Object> generateResponse(Object data, String message, int statusCode) {
        HashMap<String, Object> response = new HashMap<>();
        response.put("message", message);
        response.put("data", data);
        response.put("status", statusCode);
        return response;
    }

    @GetMapping
    public HashMap<String, Object> getAllProducts() {
        return generateResponse(
                productService.getAllProducts(),
                "Successfully get all products",
                HttpStatus.OK.value()
        );
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public HashMap<String, Object> createProduct(@Valid @RequestBody ProductRequest request) {
        log.info("This is the Info" + request);
        return generateResponse(
                productService.createProduct(request),
                "Successfully create product",
                HttpStatus.CREATED.value());
    }
}
