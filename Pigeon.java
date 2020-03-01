package com.aydin.interfaces;

public class Pigeon extends Bird {

	public Pigeon(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void fly()
	{
		System.out.println("Kuş  "+name+"  uçuyor....");
	}
	
	public void land()
	{
		System.out.println("Kuş  "+name+"  konuyor...");
	}
}
