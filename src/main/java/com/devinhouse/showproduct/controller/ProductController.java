package com.devinhouse.showproduct.controller;

import com.devinhouse.showproduct.model.Product;
import com.devinhouse.showproduct.model.dto.request.ProductDto;
import com.devinhouse.showproduct.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@AllArgsConstructor
@Controller
public class ProductController {

    private ProductService productService;

    @GetMapping("/products")
    public ModelAndView findAll (){
        List<Product> products = productService.findAll();
        ModelAndView modelAndView = new ModelAndView("product/product");
        modelAndView.addObject("products", products);

        return modelAndView;
    }

    @GetMapping("/insert")
    public ModelAndView showInsert(){
        return new ModelAndView("product/insert");
    }

    @PostMapping("/products")
    public String insertProduct(ProductDto productDto){
        Product product = productDto.productDtoConverter();
        productService.insert(product);

        return "redirect:/products";
    }
}
