package com.devinhouse.showproduct.model.dto.response;

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
public class GetProductDeleteDto {

    private String name;
    private String description;
    private LocalDate releaseDate;
    private BigDecimal value;

    public void fromProduct(Product product){
        this.name = product.getName();
        this.description = product.getDescription();
        this.releaseDate = product.getReleaseDate();
        this.value = product.getValue();
    }
}
