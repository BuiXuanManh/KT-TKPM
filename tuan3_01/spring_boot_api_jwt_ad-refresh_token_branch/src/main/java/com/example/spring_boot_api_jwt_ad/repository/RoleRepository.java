package com.example.spring_boot_api_jwt_ad.repository;

import com.example.spring_boot_api_jwt_ad.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
}
