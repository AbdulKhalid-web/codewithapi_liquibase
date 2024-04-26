package com.example.codewithapi.serives;

import com.example.codewithapi.dao.ProductRepository;
import com.example.codewithapi.product.Product;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class servies {
    private ProductRepository productRepository;

    public List<Product> listall(){
        return productRepository.findAll();
    }
    public Product getProduct(int id){
        return productRepository.getReferenceById(id);
    }
    public void save(Product product) {
        productRepository.save(product);
    }

    public void deletepro(int id){
        productRepository.deleteById(id);
    }

}
