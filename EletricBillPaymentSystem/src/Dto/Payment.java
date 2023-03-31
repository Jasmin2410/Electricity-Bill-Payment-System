package Dto;

import java.time.LocalDate;

public class Payment {
    private int id;
    private int billId;
    private double amountPaid;
    private LocalDate paymentDate;

    public Payment(int id, int billId, double amountPaid, LocalDate paymentDate) {
        this.id = id;
        this.billId = billId;
        this.amountPaid = amountPaid;
        this.paymentDate = paymentDate;
    }

    public int getId() {
        return id;
    }

    public int getBillId() {
        return billId;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    // Other methods as needed
}
