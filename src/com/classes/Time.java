package com.classes;

public class Time {
	
	private int hour, minute, second;

	public Time() {
		//super();
		// TODO Auto-generated constructor stub
	}

	public Time(int hour, int minute, int second) {
		//super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + ", second="
				+ second + "]";
	}
	
	@Override
	//t1.equals(t2)
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(!(obj instanceof Time)) return false;
		
		Time time=(Time)obj;
		if(hour==time.getHour() && minute==time.getMinute() && second==time.getSecond())
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Time t1, t2;
		t1=new Time(10,10,10);
		t2=new Time(10,10,10);
		
		//if(t1.equals(t2))
		if(t1.equals("SEED"))
			System.out.println("t1 equals t2");
		else
			System.out.println("t1 NOT equals t2");
	}
}
