package ru.edu.module13.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.edu.module13.entity.MyUser;

@Repository
public interface MyUserRepository extends JpaRepository<MyUser, Long> {

}
