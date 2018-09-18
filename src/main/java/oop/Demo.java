package oop;


class Person {
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(name + " is eating");
		
	}
	
	void sleep(){
		System.out.println(name + " is sleeping");
	}
}

public class Demo {

	public static void main(String[] args) {
		// Instantiating an object
		Person person1 = new Person();
		
		// Define some properties
		person1.name = "Joe";
		person1.email = "joe@testmail.com";
		person1.phone = "7897897894";
		
		// Abstraction
		person1.walk();
		person1.eat();
		person1.sleep();
		
		Person person2 = new Person();
		person2.name = "Sarah";
		person2.sleep();
		
		
		
		
	/*
		//Person-
		
		// Attributes, variables, adjectives, description
		String name = "Joe";
		String email = "joe@testemail.com";
		String phone = "788932442";
		
		// Action, activity, behaviour
		System.out.println(name + " is Walking");
		System.out.println(name + " is eating");
		
		// What if we wanted to do this for another person?
		String name2 = "Sarah";
		String email2 = "sarah@testemail.com";
		String phone2 = "321316548";
		
		// Action, activity, behavior
		
	*/
	}

}
