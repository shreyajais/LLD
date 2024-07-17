package LLD.VehicleRental.domain.PaymentDomain;

public class Invoice {
    String id;
    double amount;
    double tax;
    double totalAmount;
    InvoiceStatus invoiceStatus;

    public void updateStatusToPaid() {
    }
}
