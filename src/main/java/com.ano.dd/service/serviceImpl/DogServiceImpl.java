package com.ano.dd.service.serviceImpl;

import com.ano.dd.model.Dog;
import com.ano.dd.repository.DogRepository;
import com.ano.dd.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DogServiceImpl implements DogService {
    @Autowired
    DogRepository dogRepository;
   //Save dog
    @Override
    public Dog saveDog(Dog dog) {
        return dogRepository.save(dog);
    }

    //Delete a dog
    @Override
    public void deleteDog(int id) {
        Optional<Dog> dog = dogRepository.findById(id);
        if(dog.isPresent()){
           dogRepository.delete(dog.get());
        }else {
            ResponseEntity.notFound();
        }

    }
    //Update dog details
    @Override
    public Dog updateDog(Dog dog) {
        return dogRepository.save(dog);
    }
}
