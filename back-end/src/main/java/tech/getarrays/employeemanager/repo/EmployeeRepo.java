package tech.getarrays.employeemanager.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import tech.getarrays.employeemanager.model.Employee;

import java.util.Optional;

public interface EmployeeRepo extends PagingAndSortingRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
