package com.intuit.craftdemo.Repo;

import com.intuit.craftdemo.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
