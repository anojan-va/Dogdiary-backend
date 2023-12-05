package com.ano.dd.controller;

import com.ano.dd.model.Owner;
import com.ano.dd.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/owner")
public class OwnerController {
    @Autowired
    OwnerService ownerService;

    @PostMapping("/add")
    Owner addOwer(@RequestBody Owner owner){
        return ownerService.saveOwner(owner);
    }

    @PostMapping("/update")
    Owner updateOwner(@RequestBody Owner owner){
        return ownerService.updateOwner(owner);
    }

    @DeleteMapping("/delete")
    void deleteOwner(int id){
        ownerService.deleteOwner(id);
    }

    @GetMapping("/list")
    List<Owner> getOwnerList(){
        return ownerService.getOwnerList();
    }

    @GetMapping("search-by-phone")
    Owner getOwnerbyPhone(String phone){
        return ownerService.getOwnerByPhone(phone);
    }
    @GetMapping("search-by-email")
    Owner getOwnerbyEmail(String email){
        return ownerService.getOwnerByEmail(email);
    }



}
