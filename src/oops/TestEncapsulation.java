package oops;

public class TestEncapsulation {
	public static void main (String[] args)  
    { 
        Encapsulate obj = new Encapsulate(); 
        obj.setName("pranathi"); 
        obj.setAge(23); 
        obj.setRoll(45); 
        System.out.println("My name: " + obj.getName()); 
        System.out.println("My age: " + obj.getAge()); 
        System.out.println("My roll: " + obj.getRoll());      
    } 


}



