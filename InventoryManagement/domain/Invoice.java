package LLD.InventoryManagement.domain;

import LLD.InventoryManagement.service.InvoiceStatus;

public class Invoice {
    String id;
    double amount;
    double tax;
    double totalAmount;
    InvoiceStatus invoiceStatus;

    public void updateStatusToPaid() {
    }
}
