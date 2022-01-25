package com.kanislupus.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanislupus.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
