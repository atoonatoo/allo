package com.toy.allo.user.repository;

import com.toy.allo.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Long, User>, UserRepositoryCustom {
}