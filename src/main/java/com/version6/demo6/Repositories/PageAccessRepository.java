package com.version6.demo6.Repositories;

import com.version6.demo6.Models.PageAccess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PageAccessRepository extends JpaRepository<PageAccess,Long> {

}
