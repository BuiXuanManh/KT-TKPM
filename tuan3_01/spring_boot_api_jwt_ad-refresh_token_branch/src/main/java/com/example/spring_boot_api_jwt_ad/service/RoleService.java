package com.example.spring_boot_api_jwt_ad.service;

import com.example.spring_boot_api_jwt_ad.entity.Role;

public interface RoleService {
    Role createRole(Role role);
    Role findById(Long id);
}
