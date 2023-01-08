package oops;

public class classAndObjectDemo {
	public static void main(String[] args) {
//		creating an object from class motercycle
		motercycle motercycle1 = new motercycle("Hero honda Passion", "AP29R4198", "Balaiah Ande", "40") ;
		
		System.out.println(motercycle1);
		
	}

}
// creating a class called motercycle; 

class motercycle{
	String name ;
	String number;
	String ownername;
	String milage;
	
//	empty constructor
	
	public motercycle() {
	}
	
//	parameterized constructor
	
public motercycle(String name, String number, String ownername, String milage) {
	super();
	this.name = name;
	this.number = number;
	this.ownername = ownername;
	this.milage = milage;
	
//	getter and setter methods 
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getNumber() {
	return number;
}

public void setNumber(String number) {
	this.number = number;
}

public String getOwnername() {
	return ownername;
}

public void setOwnername(String ownername) {
	this.ownername = ownername;
}

public String getMilage() {
	return milage;
}

public void setMilage(String milage) {
	this.milage = milage;
}

@Override
public String toString() {
	return "motercycle [name=" + name + ", number=" + number + ", ownername=" + ownername + ", milage=" + milage + "]";
}
	
// to string method


	
}
