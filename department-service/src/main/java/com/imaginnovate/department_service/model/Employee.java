package com.imaginnovate.department_service.model;

import java.util.List;

public record Employee(Long id, Long departmentId, String name, int age, String position) {

    public static List<Employee> findByDepartment(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
