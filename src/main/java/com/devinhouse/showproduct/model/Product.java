package com.devinhouse.showproduct.model;

import com.devinhouse.showproduct.model.securityModel.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_product")
public class Product implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, length = 60)
    private String name;
    @Column(nullable = false, length = 100)
    private String description;
    private LocalDate releaseDate = LocalDate.now();
    @Column(nullable = false)
    private BigDecimal value;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}
