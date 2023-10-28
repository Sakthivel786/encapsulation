package practise;

class student {
	private String name;
	private int age;
	private double marks;
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age=age;
	}
	public double getmarks() {
		return marks;
	}
	public void setmarks(double marks) {
		this.marks=marks;
	}
	public void info() {
		System.out.println("name :"+name);
		System.out.println("age :"+age);
		System.out.println("marks :"+marks);
	}
}

  