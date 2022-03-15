package com.example.demo.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.UsersEntity;

@Repository
public interface UsersRepository extends  JpaRepository<UsersEntity, Long>{
 
}

	