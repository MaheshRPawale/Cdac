package com.lcwd.electronic.store.repositries;

import com.lcwd.electronic.store.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository  extends JpaRepository<User,String>
{
// implementation run time la automatic krt . @autowire
 //   then creat servicerepo

    Optional<User> findByEmail(String email);

    Optional<User> findByEmailAndPassword(String email,String password);

    List<User> findByNameContaining(String keywords);

}
