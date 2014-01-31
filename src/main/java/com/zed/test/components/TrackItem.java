package com.zed.test.components;

import com.fasterxml.jackson.annotation.JsonAutoDetect;


//@JsonAutoDetect
public class TrackItem {
	
	private String owner;
	private String process;
	private String item;
	private String stage;
	private String step;
	private String stagetime;
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getProcess() {
		return process;
	}
	public void setProcess(String process) {
		this.process = process;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
	public String getStep() {
		return step;
	}
	public void setStep(String step) {
		this.step = step;
	}
	public String getStagetime() {
		return stagetime;
	}
	public void setStagetime(String stagetime) {
		this.stagetime = stagetime;
	}
	
	

}
