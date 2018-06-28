package com.xml.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xml.user.Role;
import com.xml.user.RoleEnum;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByRole(RoleEnum role);
}
