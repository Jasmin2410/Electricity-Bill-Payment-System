package Dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Transaction {
    private int id;
    private int billId;
    private BigDecimal amountPaid;
    private LocalDate paymentDate;

    public Transaction(int id, int billId, BigDecimal amountPaid, LocalDate paymentDate) {
        this.id = id;
        this.billId = billId;
        this.amountPaid = amountPaid;
        this.paymentDate = paymentDate;
    }

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getBillId() { return billId; }
    public void setBillId(int billId) { this.billId = billId; }

    public BigDecimal getAmountPaid() { return amountPaid; }
    public void setAmountPaid(BigDecimal amountPaid) { this.amountPaid = amountPaid; }

    public LocalDate getPaymentDate() { return paymentDate; }
    public void setPaymentDate(LocalDate paymentDate) { this.paymentDate = paymentDate; }
}
