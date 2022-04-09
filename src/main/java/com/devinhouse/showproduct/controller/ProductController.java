package com.devinhouse.showproduct.controller;

import com.devinhouse.showproduct.model.Product;
import com.devinhouse.showproduct.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/productlist")
public class ProductController {

    private ProductService productService;

    @GetMapping("/product")
    public ModelAndView findAll (){
        List<Product> products = productService.findAll();
        ModelAndView modelAndView = new ModelAndView("product/product");
        modelAndView.addObject("products", products);

        return modelAndView;
    }


}
