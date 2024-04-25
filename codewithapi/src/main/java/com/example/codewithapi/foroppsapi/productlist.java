//package com.example.codewithapi.foroppsapi;
//
//import com.example.codewithapi.product.Product;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Component
//public class productlist {
//    private List<Product> productList;
//
//    public productlist() {
//        productList = new ArrayList<>();
//        productList.add(new Product(1, "xuc", 33, "io"));
//        productList.add(new Product(2, "xu90", 3345, "iosmart"));
//        productList.add(new Product(3, "xu32", 334, "iosupercool"));
//    }
//
//    public List<Product> getProductList() {
//        return productList;
//    }
//
//    public void  addProduct(Product product){
//        productList.add(product);
//    }
//    public Product getProduct(int i) {
//            for (Product pr : getProductList()) {
//                if (pr.getId() == i) {
//                    return pr;
//                }
//            }
//            return null;
//    }
//    public List<Product> deletepro(int id){
//        for (Product pr : getProductList()) {
//            if (pr.getId() == id) {
//             productList.remove(id +1);
//             return productList;
//            }
//        }
//        return null;
//
//    }
//    }
//
//
//
//
//
