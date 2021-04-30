package lviv.lgs.ua.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List <MyArrayList> myArrayListForDelivery = new ArrayList <MyArrayList> ();
		
		myArrayListForDelivery.add(new MyArrayList("London"));
		myArrayListForDelivery.add(new MyArrayList("Paris"));
		myArrayListForDelivery.add(new MyArrayList("New York"));
		myArrayListForDelivery.add(new MyArrayList("Toronto"));
		myArrayListForDelivery.add(new MyArrayList("Lviv"));
		myArrayListForDelivery.add(0, new MyArrayList("Dnipro"));;
		System.out.println(myArrayListForDelivery);
		System.out.println(myArrayListForDelivery.size());
		
		
		myArrayListForDelivery.remove(0);
		myArrayListForDelivery.remove(4);
		System.out.println(myArrayListForDelivery);
		
		
	}
	
}
