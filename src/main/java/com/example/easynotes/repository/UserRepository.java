package com.example.easynotes.repository;

import com.example.easynotes.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository /* Bootstrap repository during component scan */
public interface UserRepository extends JpaRepository<User, Long> {

    /* JpaRepository methods: save(), findAll(), count(), delete(), etc*/
    /* Interface: usa els metodes predefinits de la classe extesa,
    *  a no ser que els redefinim en aquesta nova classe */
}