package com.model;

public class AddCourse {
	private int tid;
	private String cname;
	public AddCourse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AddCourse(int tid, String cname) {
		super();
		this.tid = tid;
		this.cname = cname;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	

}
