package br.com.revisancodigo.hrworker.repository;

import br.com.revisancodigo.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker,Long> {
}
