package cn.chile.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.format.annotation.DateTimeFormat;

public class SalesChance extends IdEntity {

	// 机会来源
	private String source;
	// 客户名称
	private String custName;

	// 概要
	private String title;
	// 成功几率
	private Long rate;

	// 联系人
	private String contact;
	// 联系人电话
	private String contactTel;

	// 机会描述
	private String description;
	// 创建人
	private User createBy;

	// <input type="hidden" name="createBy.id" value="${sessionScope.user.id}"/>
	
	// 创建时间
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createDate;
	// 指派人
	private User designee;

	// 销售机会的状态: 1 才被创建; 2. 执行中; 3 转换为客户; 4 转换失败
	private int status;
	// 销售计划
	private Set<SalesPlan> salesPlans = new HashSet<>();
	
	// 指派时间
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date designeeDate;

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getRate() {
		return rate;
	}

	public void setRate(Long rate) {
		this.rate = rate;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getContactTel() {
		return contactTel;
	}

	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getCreateBy() {
		return createBy;
	}

	public void setCreateBy(User createBy) {
		this.createBy = createBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public User getDesignee() {
		return designee;
	}

	public void setDesignee(User designee) {
		this.designee = designee;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Set<SalesPlan> getSalesPlans() {
		return salesPlans;
	}

	public void setSalesPlans(Set<SalesPlan> salesPlans) {
		this.salesPlans = salesPlans;
	}

	public Date getDesigneeDate() {
		return designeeDate;
	}

	public void setDesigneeDate(Date designeeDate) {
		this.designeeDate = designeeDate;
	}

	@Override
	public String toString() {
		return "SalesChance [id=" + id + "]";
	}
}
