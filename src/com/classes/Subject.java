package com.classes;

public class Subject {

	private String name;
	private float marks;
	
	public Subject()
	{
		name="";
		marks=0.0f;
	}
	
	@Override
	public String toString()
	{
		return name+"\t"+marks;
	}
	
	public Subject(String name, float marks)
	{
		this.name=name;
		this.marks=marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}
	
}
