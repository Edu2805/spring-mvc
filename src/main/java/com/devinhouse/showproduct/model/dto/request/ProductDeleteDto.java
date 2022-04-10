package com.devinhouse.showproduct.model.dto.request;

import com.devinhouse.showproduct.model.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDeleteDto {

    private UUID id;

    public Product productDeleteDtoConverter(){
        Product product = new Product();

        product.setId(this.id);

        return product;
    }
}
