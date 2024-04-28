package Inheritence;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomerManager {
    private List<Customer> customers;


    public CustomerManager(){
        customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setId(1);
        customer.setFirstName("Yagiz");
        customer.setLastName("Delibas");
        customer.setEmail("yagizdelibas@etiya.com");
        customer.setPassword("yagiz123");
        customer.setCreatedDate(LocalDate.now());

        customers.add(customer);
    }

    public void add(Customer addedCust){
        addedCust.setCreatedDate(LocalDate.now());
        customers.add(addedCust);
    }

    public void update(Customer customer){
        for(Customer updatedCustomer: customers){
            updatedCustomer.setUpdatedDate(LocalDate.now());
            updatedCustomer.setId(customer.getId());
            updatedCustomer.setFirstName(customer.getFirstName());
            updatedCustomer.setLastName(customer.getLastName());
            updatedCustomer.setPassword(customer.getPassword());
            updatedCustomer.setEmail(updatedCustomer.getEmail());
        }
    }
    public void delete(int id){
        Iterator<Customer> iterator = customers.iterator();
        while(iterator.hasNext()){
            Customer customer = iterator.next();
            if (customer.getId() == id){
                customer.setDeletedDate(LocalDate.now());
                iterator.remove();
            }
        }
    }

    public List<Customer> getList(){
        return customers;
    }

    public Customer getById(int id){
        for(Customer customer: customers){
            if (customer.getId()==id)
                return customer;
        }
        return null;
    }
}
