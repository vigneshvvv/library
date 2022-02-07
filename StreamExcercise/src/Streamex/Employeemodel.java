package Streamex;

public class Employeemodel {

	private int id;
	private String name;
	private int age;
	private int exp;
	private int salary;
	private int joinyear;
	
	public Employeemodel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employeemodel(int id, String name, int age, int exp, int salary, int joinyear) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.exp = exp;
		this.salary = salary;
		this.joinyear = joinyear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getJoinyear() {
		return joinyear;
	}

	public void setJoinyear(int joinyear) {
		this.joinyear = joinyear;
	}

	@Override
	public String toString() {
		return "Employeemodel [id=" + id + ", name=" + name + ", age=" + age + ", exp=" + exp + ", salary=" + salary
				+ ", joinyear=" + joinyear + "]";
	}
	
	
	
	
	
	

}
