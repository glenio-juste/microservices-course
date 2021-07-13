package com.juste.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juste.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
