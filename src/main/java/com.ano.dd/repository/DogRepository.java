package com.ano.dd.repository;

import com.ano.dd.model.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepository extends JpaRepository<Dog,Integer> {
}
