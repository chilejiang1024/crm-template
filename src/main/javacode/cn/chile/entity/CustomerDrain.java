package cn.chile.entity;

import java.util.Date;

public class CustomerDrain extends IdEntity {

	private Customer customer;

	private Date lastOrderDate;
	private Date drainDate;

	private String delay;
	private String reason;
	private String status;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getLastOrderDate() {
		return lastOrderDate;
	}

	public void setLastOrderDate(Date lastOrderDate) {
		this.lastOrderDate = lastOrderDate;
	}

	public Date getDrainDate() {
		return drainDate;
	}

	public void setDrainDate(Date drainDate) {
		this.drainDate = drainDate;
	}

	public String getDelay() {
		return delay;
	}

	public void setDelay(String delay) {
		this.delay = delay;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
