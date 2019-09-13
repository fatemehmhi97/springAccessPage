package com.version6.demo6.Repositories;


import com.version6.demo6.Models.Access;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccessRepository extends JpaRepository<Access, Long>{
     Access findByPageName(String name);
}
