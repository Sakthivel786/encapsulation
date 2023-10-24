package practise;

public class driverencapsulation {

	public static void main(String[] args) {
		
		//object creation
		encapsulation ref=new encapsulation();
		String res=ref.getcompany();
		System.out.println("the company name is "+res);
		System.out.println(ref.name);
		System.out.println(ref.salary);
		

	}

}
