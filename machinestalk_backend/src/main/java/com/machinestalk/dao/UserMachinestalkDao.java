package com.machinestalk.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.machinestalk.entities.UserMachinestalk;

public interface UserMachinestalkDao extends JpaRepository<UserMachinestalk, Long> {
}
