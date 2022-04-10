package com.devinhouse.showproduct.controller;

import com.devinhouse.showproduct.model.Product;
import com.devinhouse.showproduct.model.dto.request.ProductDeleteDto;
import com.devinhouse.showproduct.model.dto.request.ProductInsertDto;
import com.devinhouse.showproduct.model.dto.request.ProductUpdateDto;
import com.devinhouse.showproduct.model.dto.response.GetProductUpdateDto;
import com.devinhouse.showproduct.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

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


    @PostMapping("/products")
    public String insertProduct(ProductInsertDto productDto){
        Product product = productDto.productDtoConverter();
        productService.insert(product);

        return "redirect:/products";
    }

    @PostMapping("/updateproduct/save")
    public ModelAndView updateProduct(@ModelAttribute("product") Product product){

        productService.update(product);
        return new ModelAndView("redirect:/products");

    }

    @GetMapping("/updateproduct/{id}")
    public ModelAndView getAndUpdate(@PathVariable UUID id, GetProductUpdateDto getProductUpdateDto){
        Optional<Product> productOptional = productService.findById(id);

        if(productOptional.isPresent()){
            Product product = productOptional.get();
            getProductUpdateDto.fromProduct(product);

            ModelAndView modelAndView = new ModelAndView("product/update");

            modelAndView.addObject("product", product);
            return modelAndView;
        } else {
            return new ModelAndView("redirect:/products");
        }
    }

    @GetMapping("deleteproduct/{id}")
    public ModelAndView getDeleteProduct(@PathVariable UUID id, GetProductUpdateDto getProductUpdateDto){
        Optional<Product> productOptional = productService.findById(id);

        if(productOptional.isPresent()){
            Product product = productOptional.get();
            getProductUpdateDto.fromProduct(product);

            ModelAndView modelAndView = new ModelAndView("product/delete");

            modelAndView.addObject("product", product);
            return modelAndView;
        } else {
            return new ModelAndView("redirect:/products");
        }
    }

    @PostMapping("/updateproduct/delete")
    public ModelAndView deleteProduct(@ModelAttribute("product") Product product){

        productService.delete(product);
        return new ModelAndView("redirect:/products");

    }

    @GetMapping("/insert")
    public ModelAndView showInsert(){
        return new ModelAndView("product/insert");
    }

    @GetMapping("/update")
    public ModelAndView showUpdate(){
        return new ModelAndView("product/update");
    }

    @GetMapping("/delete")
    public ModelAndView showDelete(){
        return new ModelAndView("product/delete");
    }
}
