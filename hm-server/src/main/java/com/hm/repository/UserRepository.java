package com.hm.repository;

import com.hm.dto.HmUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<HmUser, Long> {


    HmUser findByUsername(String username);
}
