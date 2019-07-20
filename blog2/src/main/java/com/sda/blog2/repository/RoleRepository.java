package com.sda.blog2.repository;

import com.sda.blog2.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRole(String admin);
}
