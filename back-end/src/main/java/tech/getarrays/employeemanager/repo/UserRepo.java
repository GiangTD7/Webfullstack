package tech.getarrays.employeemanager.repo;

import tech.getarrays.employeemanager.model.User;

public interface UserRepo {
    public User findByEmail(String username);
}
