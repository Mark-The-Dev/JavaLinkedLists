public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Mark", 54.96);
        Customer anotherCustomer = customer;
        anotherCustomer.setBalance(1000.00);
        System.out.println("Balance for customer "+ customer.getName() + " is " + customer.getBalance());
    }
}
