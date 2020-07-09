package com.ncs.green.vo;

public class BoardVO {
	private int seq;
	private String id;
	private String title;
	
	public int getSeq() { return seq; }
	public void setSeq(int seq) { this.seq = seq; }
	public String getId() { return id; }
	public void setId(String id) { this.id = id;}
	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title;}
	@Override
	public String toString() {
		return "BoardVO [seq=" + seq + ", id=" + id
				+ ", title=" + title + "]";
	}
} // class
