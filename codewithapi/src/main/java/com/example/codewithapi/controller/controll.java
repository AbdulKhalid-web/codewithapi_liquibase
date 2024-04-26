package com.example.codewithapi.controller;
/*
import com.example.codewithapi.dao.ProductRepository;
import com.example.codewithapi.product.Product;
import com.example.codewithapi.foroppsapi.productlist;
//import com.example.codewithapi.product.servies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class controll {
//    private final servies servies;
    private final productlist servies;

//    @Autowired
//    public controll(servies servies) {
//        this.servies = servies;
//    }
    @Autowired
    public controll(productlist productlist) {
        this.servies = productlist;
    }

    @GetMapping("/home")
    public String home() {
        return "this is way to controller";
    }

    @GetMapping("/products")
    public List<Product> getProductList() {
        return servies.getProductList();
    }

    @GetMapping("/products/id")
    public Product getProduct(@RequestParam int id) {
        return  servies.getProduct(id);
    }

    @PostMapping("/products")
    public Product postProduct(@RequestBody Product product){
        servies.addProduct(product);
        return product;
    }

    @DeleteMapping("/products/{id}")
    public List<Product> deletepro(@PathVariable int id){
        return servies.deletepro(id) ;
    }
}
*/

/*
import com.example.codewithapi.product.Product;
import com.example.codewithapi.serives.servies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class controll {
    @Autowired
    private servies servies;

    @GetMapping("/home")
    public String home() {
        return "lets try to make fun with new task";

    }
    @GetMapping("/products")
    public List<Product> getProductList() {
        try{
        return servies.listall();}
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping("/products/{id}")
//    public Product getProduct(@RequestParam int id) {
    public Product getProduct(@PathVariable int id) {
        return  servies.getProduct(id);
    }

    @PostMapping("/products")
    public Product postProduct(@RequestBody Product product){
        servies.save(product);
        return product;
    }

    @DeleteMapping("/products/{id}")
    public void  deletepro(@PathVariable int id){
        servies.deletepro(id) ;
    }

    @PutMapping("/products/{id}")
    public String update(@RequestBody Product product, @PathVariable int id) {
        return servies.update(id, product);
    }
}

 */

import com.example.codewithapi.product.Product;
import com.example.codewithapi.serives.servies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class controll{

    @Autowired
    private servies servies;

    @GetMapping("/home")
    public String home() {
        return "Welcome to the product API";
    }

    @GetMapping
    public List<Product> getAllProducts() {
        try {
            return servies.listall();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {
        try {
            return servies.getProduct(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        try {
            servies.save(product);
            return product;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable int id) {
        try {
            servies.deletepro(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @PutMapping("/{id}")
    public String updateProduct(@RequestBody Product product, @PathVariable int id) {
        try {
            return servies.update(id, product);
        } catch (Exception e) {
            e.printStackTrace();
            return "Error updating product";
        }
    }
}