package human;

public class Admin extends Human {

	final static String account = "administrator";
	final static String accountPassWord = "abc@123";

	public Admin() {
	}
	

	@Override
	public void setName() {
		System.out.println("Enter Admin's name: ");
		this.name = input.next();
	}

	public String toString() {
		return "Name's Admin" + getName()+ " , age: "+ getAge()+" , Address: "+ getAddress()+ " ,Phone number; "+ getPhoneNumer();
	}

}
