package com.ano.dd.controller;

import com.ano.dd.model.Dog;
import com.ano.dd.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/dog")
@RestController
public class DogController {
    @Autowired
    DogService dogService;

    //Add new dog
    @PostMapping("/add")
    Dog saveDog(@RequestBody Dog dog){
        System.out.println(dog.toString());
        return dogService.saveDog(dog);
    }

    //update dog
    @PostMapping("/update")
    Dog updateDog(@RequestBody Dog dog){
        return dogService.updateDog(dog);
    }

    //delete a dog
    @DeleteMapping("/delete")
    void deleteDog(int id){
        dogService.deleteDog(id);
    }


}
