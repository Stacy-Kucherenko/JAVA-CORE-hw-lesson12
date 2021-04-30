package lviv.lgs.ua;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {
	static void menu() {
		System.out.println("Enter 1 to display an array of random cars");
		System.out.println("Enter 2 to fill the array with the same values for a random car");
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
//		Material materialForWheel[] = Material.values();
		List <Material> SteeringWheelMaterialList = new ArrayList <Material>();
		
		for (Material steeringWheelMaterialValue : Material.values()) {
			SteeringWheelMaterialList.add(steeringWheelMaterialValue);
		}
		
		while (true) {
			menu();
			switch (scanner.nextInt()) {
			case 1: {
				
//				Car carArray [] [] = new Car [getRandomValueFromRange(1, 5)][getRandomValueFromRange(1, 5)];
				List <Car> carArrayList = new  ArrayList<Car> ();
				for (int i = 0; i < getRandomValueFromRange(1, 5); i++) {
					for (int j = 0; j < getRandomValueFromRange(1, 5); j++) {
						carArrayList.add(new Car (getRandomValueFromRange(100, 250), getRandomValueFromRange(1980, 2018), 
								new SteeringWheel (getRandomValueFromRange(35, 50), SteeringWheelMaterialList.get(getRandomValueFromRange(0, SteeringWheelMaterialList.size()- 1)).toString()), 
								new Engine (getRandomValueFromRange(2, 12))));
								
					
						
				}
System.out.println(carArrayList);
				
				break;
			}
			}
				case 2:{
					Car car = new Car (getRandomValueFromRange(120, 250), 
							getRandomValueFromRange(1999, 2021), 
					new SteeringWheel (getRandomValueFromRange(30, 55),SteeringWheelMaterialList.get(getRandomValueFromRange(0, SteeringWheelMaterialList.size()- 1)).toString() ),
					new Engine(getRandomValueFromRange(2, 12)));
					
					List <Car> carArrayList = new  ArrayList<Car> ();
					for (int i = 0; i < getRandomValueFromRange(1, 5); i++) {
						carArrayList.add(car);
					}
					System.out.println(carArrayList);
					
					break;
				}
				default: {
					System.out.println("The entered number must be 1 or 2");

					break;
				}
			}
		}
		}
		
		
		
	
	
public static int getRandomValueFromRange(int min, int max) {
		
		if(min>=max) {
			throw new IllegalArgumentException("min value must be smaller than max value");
			
		}
		
		Random r = new Random ();
		return r.nextInt(max-min +1)+min;
		
		
		
		
	}
}
