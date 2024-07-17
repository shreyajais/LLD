package LLD.InventoryManagement.domain;

public enum OrderStatus {
    CREATED,
    PAYMENT_PENDING,
    PROCESSING,
    IN_TRANSIT,
    OUT_FOR_DELIVERY,
    DELIVERY_FAILED,
    CANCELLED,
    PAYMENT_FAILED,
    DELIVERED
}
