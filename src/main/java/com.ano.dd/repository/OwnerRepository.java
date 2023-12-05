package com.ano.dd.repository;

import com.ano.dd.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner,Integer> {
    Owner findByPhone(String phone);
}
