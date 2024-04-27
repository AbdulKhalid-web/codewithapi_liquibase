package com.example.codewithapi.serives;

import com.example.codewithapi.dao.ProductRepository;
import com.example.codewithapi.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class servies {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> listall(){
        return productRepository.findAll();
    }
<<<<<<< HEAD


=======
>>>>>>> ac8073bb527029a75a2be63c217e15db95c74bad
    public Product getProduct(int id) {
//        productRepository.findAllById(id);
        Optional<Product> productOptional = productRepository.findById(id);
        return productOptional.orElse(null);

    }

    public void save(Product product) {
        productRepository.save(product);
    }

    public void deleteProduct(int id){
        productRepository.deleteById(id);
    }
    public String update(int id, Product updatedProduct) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        if (optionalProduct.isPresent()) {
            Product product = optionalProduct.get();
            product.setName(updatedProduct.getName());
            product.setModel(updatedProduct.getModel());
            product.setDescription(updatedProduct.getDescription());
            productRepository.save(product);
            return "Product updated successfully";
        } else {
            return "Product not found";
        }}

<<<<<<< HEAD
    public String update(int id, Product updatedProduct) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        if (optionalProduct.isPresent()) {
            Product product = optionalProduct.get();
            product.setName(updatedProduct.getName());
            product.setModel(updatedProduct.getModel());
            product.setDescription(updatedProduct.getDescription());
            productRepository.save(product);
            return "Product updated successfully";
        } else {
            return "Product not found";
        }}

=======
>>>>>>> ac8073bb527029a75a2be63c217e15db95c74bad
    }
