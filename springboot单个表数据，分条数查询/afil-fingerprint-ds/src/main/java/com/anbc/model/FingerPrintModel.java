package com.anbc.model;
/**
 * 指纹model
 * @author wanghao
 * @date 2017年11月20日
 */
public class FingerPrintModel {
	private int id;
	private String name;
	private String finger;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFinger() {
		return finger;
	}
	public void setFinger(String finger) {
		this.finger = finger;
	}
	@Override
	public String toString() {
		return "FingerPrintModel [id=" + id + ", name=" + name + ", finger=" + finger + "]";
	}
}
