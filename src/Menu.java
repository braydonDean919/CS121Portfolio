import java.util.Scanner;

public class Menu {
    Bank bank = new Bank();
    Scanner input = new Scanner(System.in);
    public void displayMenu(){
        boolean keepGoing = true;
        while(keepGoing) {
            System.out.println("""
                    ******** Menu ********
                                    
                    Please make a selection:
                    1) Access Account
                    2) Open a New Account
                    3) Close All Accounts
                    4) Exit""");
            int userInput = input.nextInt();
            if(userInput == 1){
                accessAccount();
            }else if(userInput == 2){
                newAccount();
            }else if(userInput == 3){
                closeAccounts();
            }else if(userInput == 4) {
                keepGoing = false;
            }
        }
    }
    private void accessAccount(){
        System.out.println("Please enter your pin number.");
        int userPin = input.nextInt();
        Customer customer = bank.getCustomer(userPin);
        if(customer == null){
            System.out.println("PIN is not valid.");
            return;
        }else{
            System.out.println(customer.getCustomerAccounts());
            System.out.println("Enter your number of the account you would like to access.");
            int userAccount = input.nextInt();
            Account account = customer.getAccount(userAccount);
            if (account == null) {
                System.out.println("Account number invalid");
                return;
            }else {
                boolean keepGoing = true;
                while (keepGoing) {
                    System.out.println("""
                            Please make a selection:
                            1) Make a deposit
                            2) Make a withdrawal
                            3) See account balance
                            4) Close account
                            5) Exit""");
                    int userChoice = input.nextInt();
                    if (userChoice == 1) {
                        System.out.println("How much would you like to deposit?");
                        double userMoney = input.nextDouble();
                        account.deposit(userMoney);

                    } else if (userChoice == 2) {
                        System.out.println("How much would you like to withdrawal?");
                        double userMoney = input.nextDouble();
                        account.withdraw(userMoney);
                    } else if (userChoice == 3) {
                        System.out.println(account.getBalance());
                    } else if (userChoice == 4) {
                        customer.removeAccount(account);
                        keepGoing = false;
                    } else if (userChoice == 5) {
                        keepGoing = false;
                    }
                }
            }
        }
    }
    private void newAccount(){
        System.out.println("Are you a new customer? yes or no.");
        String userInput = input.next();
        Customer customer = null;
        if(userInput.equalsIgnoreCase("yes")){
            customer = newCustomer();
        } else if (userInput.equalsIgnoreCase("no")) {
            System.out.println("Enter your pin");
            int userPin = input.nextInt();
            customer = bank.getCustomer(userPin);
            if (customer == null) {
                return;
            }
        }
        System.out.println("Enter a deposit amount.");
        double userMoney = input.nextDouble();
        Account account = new Account(userMoney, Account.getNumAccounts());
        customer.addAccount(account);
        System.out.println("New account opened." + account.getAccNum());
    }

    private Customer newCustomer(){
        System.out.println("What is your first name?");
        String firstName = input.next();
        System.out.println("What is your last name?");
        String lastName = input.next();
        System.out.println("What 4 digit pin number would you like?");
        int pin = input.nextInt();
        Customer customer = new Customer(firstName,lastName,pin);
        bank.addCustomer(customer);
        return customer;
    }
    private void closeAccounts(){
        System.out.println("Enter your pin.");
        int pin = input.nextInt();
        Customer customer = bank.getCustomer(pin);
        if (customer == null) {
            return;
        } else {
            bank.removeCustomer(customer);
            System.out.println("Customer has been removed from the bank.");
        }
    }

}
