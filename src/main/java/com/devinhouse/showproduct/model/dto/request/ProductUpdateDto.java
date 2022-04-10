package com.devinhouse.showproduct.model.dto.request;

import com.devinhouse.showproduct.model.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductUpdateDto {

    private String name;
    private String description;
    private LocalDate releaseDate;
    private BigDecimal value;

    public Product productUpdateDtoConverter(){
        Product product = new Product();

        product.setName(this.name);
        product.setDescription(this.description);
        product.setReleaseDate(product.getReleaseDate());
        product.setValue(this.value);

        return product;
    }
}
