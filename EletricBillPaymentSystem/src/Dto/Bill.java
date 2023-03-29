package Dto;

import java.time.LocalDate;

public class Bill {
	
	private int id;
	private String bill_number;
	private int consumer_id;
	private LocalDate bill_cycle_start_date;
	private LocalDate bill_cycle_end_date;
	private int total_units_consumed;
	private double fixed_charge;
	private double taxes;
	private double adjustment;
	private String bill_status;
	
	
	public Bill () {}


	public Bill(int id, String bill_number, int consumer_id, LocalDate bill_cycle_start_date,
			LocalDate bill_cycle_end_date, int total_units_consumed, double fixed_charge, double taxes,
			double adjustment, String bill_status) {
		super();
		this.id = id;
		this.bill_number = bill_number;
		this.consumer_id = consumer_id;
		this.bill_cycle_start_date = bill_cycle_start_date;
		this.bill_cycle_end_date = bill_cycle_end_date;
		this.total_units_consumed = total_units_consumed;
		this.fixed_charge = fixed_charge;
		this.taxes = taxes;
		this.adjustment = adjustment;
		this.bill_status = bill_status;
	}


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


	public int getConsumer_id() {
		return consumer_id;
	}


	public void setConsumer_id(int consumer_id) {
		this.consumer_id = consumer_id;
	}


	public LocalDate getBill_cycle_start_date() {
		return bill_cycle_start_date;
	}


	public void setBill_cycle_start_date(LocalDate bill_cycle_start_date) {
		this.bill_cycle_start_date = bill_cycle_start_date;
	}


	public LocalDate getBill_cycle_end_date() {
		return bill_cycle_end_date;
	}


	public void setBill_cycle_end_date(LocalDate bill_cycle_end_date) {
		this.bill_cycle_end_date = bill_cycle_end_date;
	}


	public int getTotal_units_consumed() {
		return total_units_consumed;
	}


	public void setTotal_units_consumed(int total_units_consumed) {
		this.total_units_consumed = total_units_consumed;
	}


	public double getFixed_charge() {
		return fixed_charge;
	}


	public void setFixed_charge(double fixed_charge) {
		this.fixed_charge = fixed_charge;
	}


	public double getTaxes() {
		return taxes;
	}


	public void setTaxes(double taxes) {
		this.taxes = taxes;
	}


	public double getAdjustment() {
		return adjustment;
	}


	public void setAdjustment(double adjustment) {
		this.adjustment = adjustment;
	}


	public String getBill_status() {
		return bill_status;
	}


	public void setBill_status(String bill_status) {
		this.bill_status = bill_status;
	}


	@Override
	public String toString() {
		return "Bill [id=" + id + ", bill_number=" + bill_number + ", consumer_id=" + consumer_id
				+ ", bill_cycle_start_date=" + bill_cycle_start_date + ", bill_cycle_end_date=" + bill_cycle_end_date
				+ ", total_units_consumed=" + total_units_consumed + ", fixed_charge=" + fixed_charge + ", taxes="
				+ taxes + ", adjustment=" + adjustment + ", bill_status=" + bill_status + "]";
	}
	
	
	
}
