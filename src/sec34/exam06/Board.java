package sec34.exam06;

import java.io.*;
import java.util.*;


public class Board implements Serializable{
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date date;
	
	
	public Board(int bno, String title,String content,String writer, Date date) {
	this.bno = bno;
	this.title = title;
	this.content = content;
	this.writer = writer;
	this.date = date;

	}
	public int getBno() {return bno;}
	public void setBno(int bno) {this.bno = bno;}
	
	public String gettitle() {return title;}
	public void setTitle(String title) {this.title = title;}
	
	public String getcontent() {return content;}
	public void setContent(String content) {this.content = content;}
	
	public String getWriter() {return writer;}
	public void setWtriter(String writer) {this.writer = writer;}
	
	public Date getDate() {return date;}
	public void setDate(Date date) {this.date = date;}
	



}
