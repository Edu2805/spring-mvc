package com.devinhouse.showproduct.model.securityModel;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "authorities")
public class UserAuthority {

    private String username;
    @Id
    private String authority;
}
