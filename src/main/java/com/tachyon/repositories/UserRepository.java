package com.tachyon.repositories;

import com.tachyon.domain.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    //List<User> findAllByDeleted(@Param("deletedFalse") boolean userDeleted); //future feature
}
