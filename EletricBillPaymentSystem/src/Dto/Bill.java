package Dto;

import java.math.BigDecimal;
import java.sql.Date;

public class Bill {
    private int billId;
    private int consumerId;
    private Date billCycleStartDate;
    private Date billCycleEndDate;
    private BigDecimal fixedCharge;
    private int unitsConsumed;
    private BigDecimal taxes;
    private BigDecimal adjustment;
    private BigDecimal totalAmount;
    private String status;
    private int isDeleted;

    // Constructor
    public Bill(int billId, int consumerId, Date billCycleStartDate, Date billCycleEndDate, BigDecimal fixedCharge, int unitsConsumed, BigDecimal taxes, BigDecimal adjustment, BigDecimal totalAmount, String status, int isDeleted) {
        this.billId = billId;
        this.consumerId = consumerId;
        this.billCycleStartDate = billCycleStartDate;
        this.billCycleEndDate = billCycleEndDate;
        this.fixedCharge = fixedCharge;
        this.unitsConsumed = unitsConsumed;
        this.taxes = taxes;
        this.adjustment = adjustment;
        this.totalAmount = totalAmount;
        this.status = status;
        this.isDeleted = isDeleted;
    }

    // Getters and Setters
    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public int getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(int consumerId) {
        this.consumerId = consumerId;
    }

    public Date getBillCycleStartDate() {
        return billCycleStartDate;
    }

    public void setBillCycleStartDate(Date billCycleStartDate) {
        this.billCycleStartDate = billCycleStartDate;
    }

    public Date getBillCycleEndDate() {
        return billCycleEndDate;
    }

    public void setBillCycleEndDate(Date billCycleEndDate) {
        this.billCycleEndDate = billCycleEndDate;
    }

    public BigDecimal getFixedCharge() {
        return fixedCharge;
    }

    public void setFixedCharge(BigDecimal fixedCharge) {
        this.fixedCharge = fixedCharge;
    }

    public int getUnitsConsumed() {
        return unitsConsumed;
    }

    public void setUnitsConsumed(int unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }

    public BigDecimal getTaxes() {
        return taxes;
    }

    public void setTaxes(BigDecimal taxes) {
        this.taxes = taxes;
    }

    public BigDecimal getAdjustment() {
        return adjustment;
    }

    public void setAdjustment(BigDecimal adjustment) {
        this.adjustment = adjustment;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }
}
