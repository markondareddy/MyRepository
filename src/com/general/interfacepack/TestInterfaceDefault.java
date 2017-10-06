package com.general.interfacepack;

public class TestInterfaceDefault {

	public static void main(String[] args) {
		
		Drawable d = new Circle();
		d.draw();

	}

}

class Rectangle implements Drawable {

	@Override
	public void draw() {
		
		System.out.println("drawing rectangle");

	}

}

class Circle extends Rectangle{
	
public void draw() {
		
		System.out.println("drawing Circle");

	}
	
}
