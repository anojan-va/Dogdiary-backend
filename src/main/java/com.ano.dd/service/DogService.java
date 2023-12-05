package com.ano.dd.service;

import com.ano.dd.model.Dog;

import java.util.List;

public interface DogService {
    Dog saveDog(Dog dog);
    void deleteDog(int id);
    Dog updateDog(Dog dog);
}
