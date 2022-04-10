package com.devinhouse.showproduct.repository;

import com.devinhouse.showproduct.model.securityModel.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
