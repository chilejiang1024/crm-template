package cn.chile.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Order extends IdEntity {
	private String no;
	private Customer customer;
	private Date date;

	private String address;
	private String status;
	private HashSet<OrderItem> items = new HashSet<OrderItem>();

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set<OrderItem> getItems() {
		return items;
	}

	public void setItems(HashSet<OrderItem> items) {
		this.items = items;
	}

}
