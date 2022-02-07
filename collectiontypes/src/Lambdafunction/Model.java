package Lambdafunction;

public class Model {
	
	private int id;
	private String name;
	private int age;
	private int salary;
	
	
	public Model() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Model(int id, String name, int age, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Model [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	

}
