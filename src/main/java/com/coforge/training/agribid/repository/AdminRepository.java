package com.coforge.training.agribid.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;

import com.coforge.training.agribid.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {

	Admin save(Admin admin);
	
	List<User> findByRole(String role);

}

