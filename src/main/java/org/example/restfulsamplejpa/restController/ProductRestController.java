package org.example.restfulsamplejpa.restController;


import lombok.RequiredArgsConstructor;
import org.example.restfulsamplejpa.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Objects;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductRestController {
    private final ProductService productService;

    @GetMapping
    public HashMap<String, Object> getAllProducts(){
        HashMap<String, Object> response = new HashMap<>();
        response.put("message", "Successfully Retrived Data");
        response.put("data", productService.getAllProducts());
        response.put("status", 200);
        return response;
    }
}
