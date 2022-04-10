package com.devinhouse.showproduct.model.dto.request;

import com.devinhouse.showproduct.model.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductInsertDto {

    private String name;
    private String description;
    private LocalDate releaseDate = LocalDate.now();
    private BigDecimal value;

    public Product productDtoConverter(){
        Product product = new Product();

        product.setName(this.name);
        product.setDescription(this.description);
        product.setReleaseDate(this.releaseDate);
        product.setValue(this.value);

        return product;
    }
}
