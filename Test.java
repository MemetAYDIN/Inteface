package com.aydin.interfaces;

public class Test {
	
	public static void main(String[] args) {
		Pigeon pigeon=new Pigeon("Taklacı");
		pigeon.fly();
		pigeon.land();
		
		
		Bird bird=new Pigeon("Paçalı");
		bird.fly();
		bird.land();
		
		
		Flyable flyable=new  Pigeon("Postacı");
		flyable.fly();
		flyable.land();
		
		Bat bat=new Bat("Batman");
		bat.fly();
		bat.land();
		
		Flyable flyable2=new Bat("Vampir");
		flyable2.fly();
		flyable2.land();
		
		
		Mammal mammal=new Bat("Robin");// Memeli uçamaz yani. Memelilerin uçabilme özelliği olmaığı için çalışmaz
		//mammal.fly();
		//mammal.land();
		
		makeFly(pigeon);
		makeFly(bird);
		makeFly(flyable);
		makeFly(flyable2);
		
		
		
	}
	
	
	private static void makeFly(Flyable flyable)
	{
		System.out.println();
		System.out.println("UÇ!");
		flyable.fly();
		System.out.println("KON!");
		flyable.land();
		
	}
	
	

}
