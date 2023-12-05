package com.productservice.productservice.inheritancerelations.tablePerClass;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    @Override
    User  save(User user);
}
