package org.api.java.api__v2__2826502.services;

import org.api.java.api__v2__2826502.entities.Product;
import org.api.java.api__v2__2826502.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.List;

@Service
public class ProductService {

    //Dependecia inyectada
    //objeto necesario pra cumplir
    //operaciones en una clase
    @Autowired
    private  ProductRepository repositorio;

    //CRUD:
    //seleccionar todos los
    //productos
    //SQL:select* from
    public List<Product>findAll(){
        return (List<Product>)
                repositorio.findAll();
    }
   //seleccionar producto por id
    //SQL : select : from where id =
    public Product findById(Long id){
        return repositorio.findById(id).get();
    }
}
