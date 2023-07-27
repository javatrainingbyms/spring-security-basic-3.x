package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.UserInfo;

public interface UserInfoRepository extends CrudRepository<UserInfo, Integer> {
	public Optional<UserInfo> findByName(String username);
}
