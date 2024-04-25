import java.util.ArrayList;

public class Bank {
    ArrayList<Customer> customers = new ArrayList<>();
    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    public void removeCustomer(Customer customer){
        customers.remove(customer);
    }
    public ArrayList<Customer> getAllCustomers(){
        return customers;
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
