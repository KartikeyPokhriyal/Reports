public class Report {

    public static String generateReport(Customer customer) {
       return customer.getId() + " " + customer.getName() + customer.getAddress();
    }
}
