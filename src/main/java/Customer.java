import sun.jvm.hotspot.debugger.Address;

public class Customer {
    private int id;
    private String name;
    Customer_Address address;

    public Customer(int id, String name, Customer_Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Customer_Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "" +
                "" + address
                ;
    }
}
