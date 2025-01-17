package org.api.java.api__v2__2826502.controllers;

import org.api.java.api__v2__2826502.entities.Product;
import org.api.java.api__v2__2826502.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    //inyectar el servicio
    @Autowired
    private ProductService productService;

    //Endpoint
    //Listar todos los product
    @GetMapping
    public List<Product> getProducts(){
        return productService.findAll();

    }

    //Endpoint
    //obtener un producto por id
    @GetMapping("/{id}")
    public Product getProduct(@PathVariable Long id){
        return productService.findById(id);
    }
}
