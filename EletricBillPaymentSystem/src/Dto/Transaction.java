package Dto;

import java.sql.Date;

public class Transaction {
    
	private int id;
	private String bill_number;
	private Date bill_cycle_start_date;
	private Date bill_cycle_end_date;
	private int total_units_consumed;
	private Date payment_date;
	private double amount_paid;
	private int bill_id;
	private int consumer_id;
	private String bill_status;
	
	public Transaction(String bill_number,int consumer_id, Date bill_cycle_start_date, Date bill_cycle_end_date, int total_units_consumed, String bill_status, Date payment_date, double amount_paid){
		super();
		this.bill_number = bill_number;
		this.consumer_id = consumer_id;
		this.bill_cycle_start_date = bill_cycle_start_date;
		this.bill_cycle_end_date = bill_cycle_end_date;
		this.total_units_consumed = total_units_consumed;
		this.payment_date = payment_date;
		this.amount_paid = amount_paid;
		this.bill_status = bill_status;
	}
	
//	public Transaction(int id, String bill_number, Date bill_cycle_start_date, Date bill_cycle_end_date,
//			int total_units_consumed, Date payment_date, double amount_paid, int bill_id, int consumer_id,
//			String bill_status) {
//		super();
//		this.id = id;
//		this.bill_number = bill_number;
//		this.bill_cycle_start_date = bill_cycle_start_date;
//		this.bill_cycle_end_date = bill_cycle_end_date;
//		this.total_units_consumed = total_units_consumed;
//		this.payment_date = payment_date;
//		this.amount_paid = amount_paid;
//		this.bill_id = bill_id;
//		
//		this.bill_status = bill_status;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBill_number() {
		return bill_number;
	}

	public void setBill_number(String bill_number) {
		this.bill_number = bill_number;
	}

	public Date getBill_cycle_start_date() {
		return bill_cycle_start_date;
	}

	public void setBill_cycle_start_date(Date bill_cycle_start_date) {
		this.bill_cycle_start_date = bill_cycle_start_date;
	}

	public Date getBill_cycle_end_date() {
		return bill_cycle_end_date;
	}

	public void setBill_cycle_end_date(Date bill_cycle_end_date) {
		this.bill_cycle_end_date = bill_cycle_end_date;
	}

	public int getTotal_units_consumed() {
		return total_units_consumed;
	}

	public void setTotal_units_consumed(int total_units_consumed) {
		this.total_units_consumed = total_units_consumed;
	}

	public Date getPayment_date() {
		return payment_date;
	}

	public void setPayment_date(Date payment_date) {
		this.payment_date = payment_date;
	}

	public double getAmount_paid() {
		return amount_paid;
	}

	public void setAmount_paid(double amount_paid) {
		this.amount_paid = amount_paid;
	}

	public int getBill_id() {
		return bill_id;
	}

	public void setBill_id(int bill_id) {
		this.bill_id = bill_id;
	}

	public int getConsumer_id() {
		return consumer_id;
	}

	public void setConsumer_id(int consumer_id) {
		this.consumer_id = consumer_id;
	}

	public String getBill_status() {
		return bill_status;
	}

	public void setBill_status(String bill_status) {
		this.bill_status = bill_status;
	}


	
	

}



