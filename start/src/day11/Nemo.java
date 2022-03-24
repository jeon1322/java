package day11;

import java.util.Scanner;

public class Nemo {
	private int garo, sero, area, rank;
	
	public Nemo() {
		
	}
	public Nemo(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		setArea();
		rank = 1;
	}

	public static void main(String[] args) {
		new Nemo();
	}


	public int getGaro() {
		return garo;
	}


	public void setGaro(int garo) {
		this.garo = garo;
	}


	public int getSero() {
		return sero;
	}


	public void setSero(int sero) {
		this.sero = sero;
	}


	public int getArea() {
		return area;
	}


	public void setArea(int area) {
		this.area = area;
	}
	
	public void setArea() {
		area = garo * sero;
	}

	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	@Override
	public String toString() {
		return "Nemo [garo=" + garo + ", sero=" + sero + ", area=" + area + "]";
	}

}
