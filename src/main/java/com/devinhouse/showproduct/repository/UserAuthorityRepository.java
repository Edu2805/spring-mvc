package com.devinhouse.showproduct.repository;

import com.devinhouse.showproduct.model.securityModel.UserAuthority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAuthorityRepository extends JpaRepository<UserAuthority, String> {
}
