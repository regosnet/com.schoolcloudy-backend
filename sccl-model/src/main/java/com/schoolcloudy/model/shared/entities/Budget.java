package com.schoolcloudy.model.shared.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//@Entity
//@Table(name="BUDGET")
public class Budget {

	@Id
	@GeneratedValue
	@Column(name = "BUDGET_ID")
	private Long budgetId;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "GOAL_AMOUNT")
	private BigDecimal goalAmount;
	
	@Column(name = "PERIOD")
	private String period;
	
	private List<Transaction> transaction = new ArrayList<>();

	public Long getBudgetId() {
		return budgetId;
	}

	public void setBudgetId(Long budgetId) {
		this.budgetId = budgetId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getGoalAmount() {
		return goalAmount;
	}

	public void setGoalAmount(BigDecimal goalAmount) {
		this.goalAmount = goalAmount;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public List<Transaction> getTransaction() {
		return transaction;
	}

	public void setTransaction(List<Transaction> transaction) {
		this.transaction = transaction;
	}
	
	
}
