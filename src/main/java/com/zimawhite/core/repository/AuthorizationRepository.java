package com.zimawhite.core.repository;

import com.zimawhite.core.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AuthorizationRepository extends JpaRepository<User, UUID>{

    User findByUsername(String username);

}
