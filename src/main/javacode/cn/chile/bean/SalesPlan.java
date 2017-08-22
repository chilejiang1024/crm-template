package cn.chile.bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class SalesPlan extends IdEntity {

	// 计划实施的时间
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date date;
	// 计划怎么做
	private String todo;
	// 计划的执行结果
	private String result;
	// 对应的销售机会
	private SalesChance chance;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTodo() {
		return todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public SalesChance getChance() {
		return chance;
	}

	public void setChance(SalesChance chance) {
		this.chance = chance;
	}

}
