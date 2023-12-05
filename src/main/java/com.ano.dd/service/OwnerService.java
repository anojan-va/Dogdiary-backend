package com.ano.dd.service;

import com.ano.dd.model.Owner;

import java.util.List;

public interface OwnerService {
    Owner saveOwner(Owner owner);
    Owner updateOwner(Owner owner);
    Owner getOwnerByEmail(String email);
    Owner getOwnerByPhone(String phone);
    List<Owner> getOwnerList();
    void deleteOwner(int id);
}
