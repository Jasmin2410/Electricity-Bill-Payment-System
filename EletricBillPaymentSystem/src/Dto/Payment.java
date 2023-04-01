package Dto;

import java.sql.Date;

public class Payment {
    private int id;
    private int billId;
    private double amountPaid;
    private Date paymentDate;

    public Payment(int id, int billId, double amountPaid, Date paymentDate) {
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

    public Date getPaymentDate() {
        return paymentDate;
    }

    // Other methods as needed
}
