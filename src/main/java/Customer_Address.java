public class Customer_Address {
    String city;

    public Customer_Address(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return " "+
                 city
                ;
    }
}
