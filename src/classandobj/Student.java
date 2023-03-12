package classandobj;

public class Student {
	int roll;
	String name,addr,pin,city;
	double result;
	
	public Student(int roll, String name, double result,String addr,String city,String pin) {
		super();
		this.roll = roll;
		this.name = name;
		this.result = result;
		this.addr=addr;
		this.city=city;
		this.pin=pin;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	
	
	
	@Override
	public String toString() {
		return roll + " \t    " + name + " \t      " + result + "\t   "+addr+"\t   "+city+"\t   "+pin+"\n";
	}
	
	

}
