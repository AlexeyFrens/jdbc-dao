package org.example.application;

import org.example.model.dao.DaoFactory;
import org.example.model.dao.DepartmentDao;
import org.example.model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("\n=== TEST 1: department insert ===");
        Department department =  new Department(null, "Operations");
        departmentDao.insert(department);
        System.out.println("Inserted! New Id = " + department.getId());

        System.out.println("\n=== TEST 2: department update ===");
        department = departmentDao.findById(5);
        department.setName("Electric");
        departmentDao.update(department);
        System.out.println("Department Updated");

        System.out.println("\n=== TEST 3: department deleteById ===");
        System.out.println("Insert the department id to delete");
        int id = scanner.nextByte();
        departmentDao.deleteById(id);
        System.out.println("Department deleted");

        System.out.println("\n=== TEST 4: department findById ===");
        department = departmentDao.findById(6);
        System.out.println(department);

        System.out.println("\n=== TEST 5: department findAll ===");
        List<Department> list = departmentDao.findAll();
        for(Department dep : list){
            System.out.println(dep);
        }
    }
}
