package com.packt.webstore.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.Employee;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    @Query("SELECT e FROM Employee e where e.employeeNumber = :employeeNumber")
    Employee locateOneEmployeeByHisNumber(@Param("employeeNumber") int key);

    @Query("SELECT e FROM Employee e order by e.employeeNumber")
    List<Employee> getAllEmployees();
}

