package com.anbc.model;

public class DistributeModel {
	private int id;
	private String tablename;
	private int start;
	private int end;
	private String ip;
	private String port;
	private String microservice;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTablename() {
		return tablename;
	}
	public void setTablename(String tablename) {
		this.tablename = tablename;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getMicroservice() {
		return microservice;
	}
	public void setMicroservice(String microservice) {
		this.microservice = microservice;
	}
	@Override
	public String toString() {
		return "DistributeModel [id=" + id + ", tablename=" + tablename + ", start=" + start + ", end=" + end + ", ip="
				+ ip + ", port=" + port + ", microservice=" + microservice + "]";
	}
}
