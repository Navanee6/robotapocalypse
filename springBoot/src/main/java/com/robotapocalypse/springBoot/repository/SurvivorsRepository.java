package com.robotapocalypse.springBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robotapocalypse.springBoot.bean.Survivors;

public interface SurvivorsRepository extends JpaRepository<Survivors, Integer> {

}
