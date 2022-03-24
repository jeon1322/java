package day19;

import java.util.*;
import java.util.Date;
import java.sql.*;

public class Member {
	private String name, id, pw, addr, tel, mail, birth, jdate;
	private Date date, joinDate;
	private Time btime, joinTime;   
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getBtime() {
		return btime;
	}
	public void setBtime(Time btime) {
		this.btime = btime;
	}
	
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", id=" + id + ", pw=" + pw + ", addr=" + addr + ", tel=" + tel + ", mail="
				+ mail + ", birth=" + birth + ", jdate=" + jdate + ", date=" + date + ", joinDate=" + joinDate
				+ ", btime=" + btime + ", joinTime=" + joinTime + "]";
	}
}
