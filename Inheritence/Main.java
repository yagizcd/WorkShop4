package Inheritence;

import java.time.LocalDate;
import java.util.EmptyStackException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        List<Customer> customers1 = customerManager.getList();

        Customer customer1 = new Customer();

        for (Customer cust: customers1){
            System.out.println(cust.getId()+" Idli "+cust.getFirstName()+" "+cust.getLastName()
                    +" Isimli Musteri "+ cust.getCreatedDate()+" tarihinde yaratıldı");
        }

        customer1.setId(2);
        customer1.setFirstName("Can");
        customer1.setLastName("Beskardes");
        customer1.setEmail("canbeskardes@gmail.com");
        customer1.setPassword("can123");

        customerManager.add(customer1);

        customers1 = customerManager.getList();
        System.out.println("After adding id2");
        for (Customer cust: customers1){
            System.out.println(cust.getId()+" Idli "+cust.getFirstName()+" "+cust.getLastName()
            +" Isimli Musteri "+ cust.getCreatedDate()+" tarihinde yaratıldı");
        }
        customerManager.delete(1);
        System.out.println("After Deleting id:1");
        for (Customer cust: customers1){
            System.out.println(cust.getId()+" Idli "+cust.getFirstName()+" "+cust.getLastName()
                    +" Isimli Musteri "+ cust.getCreatedDate()+" tarihinde yaratıldı");
        }
        //Employee Operations

        System.out.println("-----------------------------");
        System.out.println("Employee Operations");


        EmployeeManager employeeManager = new EmployeeManager();
        List<Employee> employees1 = employeeManager.getList();

        Employee employee1 = new Employee();
        employee1.setId(2);
        employee1.setFirstName("Yılmaz");
        employee1.setLastName("Kara");
        employee1.setEmail("yilmazkara@gmail.com");
        employee1.setPassword("yilmaz123");
        employee1.setDepartment("QA Test");



        for (Employee emp: employees1){
            System.out.println(emp.getId()+" Idli "+emp.getFirstName()+" "+emp.getLastName()
                    +" Isimli Musteri "+ emp.getCreatedDate()+" tarihinde yaratıldı"+" Department "+emp.getDepartment());
        }

        employeeManager.add(employee1);
        System.out.println("After added id 2");
        for (Employee emp: employees1){
            System.out.println(emp.getId()+" Idli "+emp.getFirstName()+" "+emp.getLastName()
                    +" Isimli Musteri "+ emp.getCreatedDate()+" tarihinde yaratıldı"+" Department "+emp.getDepartment());
        }

        Employee employee2 = new Employee();
        employee2.setId(2);
        employee2.setFirstName("Haydar");
        employee2.setLastName("Haydar");
        employee2.setEmail("haydarhaydar@gmail.com");
        employee2.setPassword("haydar123");
        employee2.setDepartment("QA Test");

        employeeManager.update(employee2);

        System.out.println("After Updating id 2");
        for (Employee emp: employees1){
            System.out.println(emp.getId()+" Idli "+emp.getFirstName()+" "+emp.getLastName()
                    +" Isimli Musteri "+ emp.getCreatedDate()+" tarihinde yaratıldı"+" Department "+emp.getDepartment());
        }



    }








}
