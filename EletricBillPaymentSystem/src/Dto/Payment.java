package Dto;

import java.time.LocalDate;

public class Payment {
				
	
	private int id;
	private int bill_id;
	private int amount_paid;
	private LocalDate payment_date;
	
	
	public Payment() {}
	
	public Payment(int id, int bill_id, int amount_paid, LocalDate payment_date) {
		super();
		this.id = id;
		this.bill_id = bill_id;
		this.amount_paid = amount_paid;
		this.payment_date = payment_date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBill_id() {
		return bill_id;
	}

	public void setBill_id(int bill_id) {
		this.bill_id = bill_id;
	}

	public int getAmount_paid() {
		return amount_paid;
	}

	public void setAmount_paid(int amount_paid) {
		this.amount_paid = amount_paid;
	}

	public LocalDate getPayment_date() {
		return payment_date;
	}

	public void setPayment_date(LocalDate payment_date) {
		this.payment_date = payment_date;
	}

	@Override
	public String toString() {
		return "Payment [id=" + id + ", bill_id=" + bill_id + ", amount_paid=" + amount_paid + ", payment_date="
				+ payment_date + "]";
	}
	
	
	
	
}
