package Inheritence;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees;

    public EmployeeManager(){
        employees = new ArrayList<>();
        Employee employee = new Employee();

        employee.setId(1);
        employee.setFirstName("Hamza");
        employee.setLastName("Yıldırım");
        employee.setEmail("hamzayildirim@etiya.com");
        employee.setPassword("hamza123");
        employee.setDepartment("QA Test");
        employee.setCreatedDate(LocalDate.now());

        employees.add(employee);
    }
    public void add(Employee employee){
        employee.setCreatedDate(LocalDate.now());
        employees.add(employee);
    }

    public void update(Employee employee){
        for (Employee updatedEmployee: employees){
            if (updatedEmployee.getId()==employee.getId()){
                updatedEmployee.setUpdatedDate(LocalDate.now());
                updatedEmployee.setId(employee.getId());
                updatedEmployee.setDepartment(employee.getDepartment());
                updatedEmployee.setPassword(employee.getPassword());
                updatedEmployee.setLastName(employee.getLastName());
                updatedEmployee.setFirstName(employee.getFirstName());
                updatedEmployee.setEmail(employee.getEmail());
            }

        }
    }
    public void delete(int id){
        Iterator<Employee> iterator = employees.iterator();
        while(iterator.hasNext()){
            Employee employee = iterator.next();
            if (employee.getId()==id){
                iterator.remove();
            }
        }
    }

    public List<Employee> getList(){
        return employees;
    }

    public Employee getById(int id){
        for (Employee employee:employees){
            if (employee.getId()==id)
                return employee;
        }
        return null;
    }

}
