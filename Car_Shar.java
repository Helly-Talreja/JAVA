class Car{
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getmYear() {
		return mYear;
	}
	public void setmYear(int mYear) {
		this.mYear = mYear;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getRegistration() {
		return registration;
	}
	public void setRegistration(String registration) {
		this.registration = registration;
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	
	public Car(){}
	public Car(int no, String Registration, int capacity, String color, double mileage, int mYear) {
		this.setNo(no);
		this.setRegistration(Registration);
		this.setCapacity(capacity);
		this.setMileage(mileage);
		this.setColor(color);
		this.setmYear(mYear);
	}
	
	int no, capacity, mYear;
	String color, registration;
	private double mileage;
	public void finalise() throws Throwable{
		System.out.printf("Car No. %d is destroyed", this.no);
	}
	public void display() {
		System.out.println("CAR's No.: "+this.getNo());
		System.out.println("CAR's Registration: " +this.getRegistration());
		System.out.println("CAR's Capacity: " +this.getCapacity());
		System.out.println("CAR's Mileage: " + this.getMileage());
		System.out.println("CAR's color: " + this.getColor());
		System.out.println("CAR's Manufacturing Year: " + this.getmYear());
	}
	public String toString() {
		return "CAR's No.:" + this.getNo() + "\nCAR's registration: " + this.getRegistration() + "\nCAR's Capacity: " + this.getCapacity() + "\nCAR's Mileage: " + this.getMileage() + "\nCAR's Color: " + this.getColor() + "\nCAR's Manufacturing Year: " + this.getmYear();
	}
}
public class Car_Shar{
	public static void main(String Args[]) throws Throwable {
		Car c1 = new Car();
		c1.setNo(0);
		c1.setColor("Purple");
		c1.setmYear(2024);
		c1.setCapacity(5);
		c1.setMileage(20.0);
		c1.setRegistration("GJ 01 RJ 1000");
		c1.display();
		Car c2 = new Car(1, "GJ 01 RJ 1001", 5, "Red", 14.5, 2000);
		System.out.println("\n"+c2);
		c1.finalise();
		c2.finalise();
	}
}