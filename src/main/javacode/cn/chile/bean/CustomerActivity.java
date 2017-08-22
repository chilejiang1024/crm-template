package cn.chile.bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class CustomerActivity extends IdEntity{

	private Customer customer;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date date;
	
	private String place;
	private String title;
	
	private String description;

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

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
