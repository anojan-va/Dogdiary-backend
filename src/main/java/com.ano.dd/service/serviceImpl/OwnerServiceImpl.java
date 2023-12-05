package com.ano.dd.service.serviceImpl;

import com.ano.dd.model.Owner;
import com.ano.dd.repository.OwnerRepository;
import com.ano.dd.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OwnerServiceImpl implements OwnerService {
    @Autowired
    OwnerRepository ownerRepository;
    @Override
    public Owner saveOwner(Owner owner) {
        return ownerRepository.save(owner);
    }

    @Override
    public Owner updateOwner(Owner owner) {
        return ownerRepository.save(owner);
    }

    @Override
    public Owner getOwnerByEmail(String email) {
        return null;
    }

    @Override
    public Owner getOwnerByPhone(String phone) {
        return ownerRepository.findByPhone(phone);
    }

    @Override
    public List<Owner> getOwnerList() {
        return ownerRepository.findAll();
    }

    @Override
    public void deleteOwner(int id) {
        Optional<Owner> owner = ownerRepository.findById(id);
        if(owner.isPresent()){
            ownerRepository.delete(owner.get());
        }else {
            ResponseEntity.notFound();
        }

    }
}
