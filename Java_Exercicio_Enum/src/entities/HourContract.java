package entities;

import java.util.Date;

public class HourContract {
	private Date date;
	private double valuePerHour;
	private int hours;
	
	public HourContract() {
	}
	public HourContract(Date data, double valorPerHour, int horas) {
		this.date = data;
		this.valuePerHour = valorPerHour;
		this.hours = horas;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date data) {
		this.date = data;
	}
	public double getValuePerHour() {
		return valuePerHour;
	}
	public void setValuePerHour(double valorPerHour) {
		this.valuePerHour = valorPerHour;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int horas) {
		this.hours = horas;
	}
	
	public double totalValue() {
		return valuePerHour * hours;
	}
}
