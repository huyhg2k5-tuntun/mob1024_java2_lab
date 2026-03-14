package Polymirphism;

import java.util.ArrayList;

public class Demoanimal {
	public static void main(String[]args) {
	ArrayList<Animal>lisAnimal = new ArrayList<Animal>();
	lisAnimal.add(new Dog());
	lisAnimal.add(new Cat());
	
	for(Animal a:lisAnimal){
		a.sound();
	}
	}
}
