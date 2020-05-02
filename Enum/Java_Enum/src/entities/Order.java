package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Order {
	private int id;
	private Date moment;
	private OrderStatus status;
	
	public Order() {	
	}
	public Order(int id, Date moment, OrderStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}
	
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
}