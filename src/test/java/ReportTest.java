import org.junit.Test;

import java.beans.Customizer;

import static org.junit.Assert.assertEquals;

public class ReportTest {

    @Test
    public void shouldReturnCustomerReport() {
        Customer customer = new Customer(2, "Britney", new Customer_Address("California"));

        assertEquals("2 Britney California", Report.generateReport(customer));
    }
}
