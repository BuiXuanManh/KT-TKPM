package com.example.spring_boot_api_jwt_ad.service;

import com.example.spring_boot_api_jwt_ad.entity.Role;
import com.example.spring_boot_api_jwt_ad.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService{
    @Autowired
    private RoleRepository repository;
    @Override
    public Role createRole(Role role) {
        return repository.save(role);
    }

    @Override
    public Role findById(Long id) {
        return repository.findById(id).get();
    }
}
