package com.example.tmspringboot.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.tmspringboot.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{
    List<Task> findByFinished(boolean finished);
    List<Task> findByTitleContaining(String title);
}
