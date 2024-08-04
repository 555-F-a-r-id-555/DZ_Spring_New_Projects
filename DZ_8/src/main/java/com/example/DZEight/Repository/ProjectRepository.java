package com.example.DZEight.Repository;

import com.example.DZEight.Model.Employee;
import com.example.DZEight.Model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;



@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

    Optional<Project> findByProjectName(String projectName);

    @Query("SELECT e FROM EmployeeProject ep JOIN ep.employee e WHERE ep.project.projectId = :id")
    List<Employee> findProjectEmployees(@Param("id") Long id);

}