package human;

public class User extends Human {
	protected String user;
	protected String password;

	public User() {
		super();
	}

	public User(String name, int age, String gender, String phoneNumber, String email, String address) {
		super(name, age, gender, phoneNumber, email, address);
	}

	public User(String user, String password, String name, int age, String gender, String phoneNumber, String email,
			String address) {
		super(name, age, gender, phoneNumber, email, address);
		this.user = user;
		this.password = password;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setUser() {
		System.out.println("Username: ");
		this.user = input.nextLine();
	}

	public String getUser() {
		return this.user;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPassword() {
		System.out.println("Password: ");
		this.password = input.nextLine();
	}

	public String getPassword() {
		return this.password;
	}

	@Override
	public void setName() {
		System.out.println("Enter User's name: ");
		this.name = input.nextLine();
	}

	public String toString() {
		return "Information of user: " + "UserName: " + getUser() + " " + super.toString() + " ,age:" + getAge()
				+ " ,email:" + getEmail() + " ,Adress:" + getAddress();
	}

}
