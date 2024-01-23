package com.example.demo.repository;

import com.example.demo.model.UserEntitiy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntitiy, String> {
    //一致するユーザーIDの情報を取得する
    UserEntitiy findByUserId(String userid);
}