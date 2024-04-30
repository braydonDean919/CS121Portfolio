import java.util.ArrayList;
import java.util.LinkedList;

public class Bank {
    LinkedList<Customer> customers = new LinkedList<>();
    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    public void removeCustomer(Customer customer){
        customers.remove(customer);
    }
    public StringBuilder getAllCustomers(){
        StringBuilder cour = new StringBuilder();
        for (Customer course : customers){
            cour.append(course).append("\n");
        }
        return cour;
    }
    public Customer getCustomer(int pin){
        Customer customer = null;
        for(Customer placeCustomer:customers ){
            if(placeCustomer.getPin() == pin){
                customer=placeCustomer;
            }
        }
        return customer;

    }
}
