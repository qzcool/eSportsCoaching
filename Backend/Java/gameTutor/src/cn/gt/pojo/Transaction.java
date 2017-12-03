package cn.gt.pojo;

import java.sql.Date;

public class Transaction {

	private int trId;
	private Date data;
	private int cId;
	private int uId;
	private int payWay;
	private int amount;
	private int commission;
	private String cChannel;
	public int getTrId() {
		return trId;
	}
	public void setTrId(int trId) {
		this.trId = trId;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public int getPayWay() {
		return payWay;
	}
	public void setPayWay(int payWay) {
		this.payWay = payWay;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getCommission() {
		return commission;
	}
	public void setCommission(int commission) {
		this.commission = commission;
	}
	public String getcChannel() {
		return cChannel;
	}
	public void setcChannel(String cChannel) {
		this.cChannel = cChannel;
	}
	
}
