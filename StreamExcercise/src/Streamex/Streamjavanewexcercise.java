package Streamex;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamjavanewexcercise {

	public static void main(String[] args) {
		// This program is based on the using of stream functions in java8 much helpful in backend programming
		
		List<Employeemodel> emp= new ArrayList<Employeemodel>();
		
		emp.add(new Employeemodel(1,"vignesh",25,4,25000,2018));
		emp.add(new Employeemodel(2,"chitra",26,5,35000,2017));
		emp.add(new Employeemodel(3,"praveen",26,4,45000,2017));
		emp.add(new Employeemodel(4,"vicky",25,4,24000,2016));
		emp.add(new Employeemodel(5,"pandi",24,4,26000,2018));
		emp.add(new Employeemodel(6,"nagesh",22,4,27000,2020));
		emp.add(new Employeemodel(7,"yuva",19,4,28000,2019));
		emp.add(new Employeemodel(7,"yuva",19,4,28000,2019));
		// this method is to print the name of employee who has experience of four years
		
		Stream<Employeemodel> detailstream= emp.stream();
		Stream<Employeemodel> filteremp= detailstream.filter(e -> e.getExp()== 4);
		
		Stream<String> mapstream= filteremp.map(Employeemodel :: getName);
		//mapstream.forEach(System.out::println);
		
		//this method is to print the employee name whose age is greater than 20
		
		Stream<Employeemodel> streamempp= emp.stream();
		Stream<Employeemodel> filterbyage= streamempp.filter(e -> e.getAge()>22);
		Stream<String> mapbyname= filterbyage.map(Employeemodel :: getName);
		//mapbyname.forEach(System.out::println);
		
		//to remove the duplicate names and print the employee whose age is greater than 18
		
		Set<String> empname= emp.stream().filter(e -> e.getAge()>18).map(Employeemodel :: getName).collect(Collectors.toSet());
		//empname.forEach(System.out::println);
		
		//to print the employee details based on the joined year by using the map collections i can print the details
		
		Map<Integer,List<Employeemodel>> grouping= emp.stream().collect(Collectors.groupingBy(Employeemodel :: getJoinyear));
		//grouping.forEach((k,v) -> System.out.println("key=" +k + "value" +v));
		
		//to print the group of employees details based on the years of experience
		
		Map<Integer,List<Employeemodel>> groupbyexp= emp.stream().collect(Collectors.groupingBy(Employeemodel :: getExp));
		//groupbyexp.forEach((k,v) -> System.out.println("key="+k + "value" +v));
		
		//To print the two partiton or two section of details based on the age it will print the group of details whose age is greater
		//than18 and balance in another group
		
		Map<Boolean,List<Employeemodel>> partition= emp.stream().collect(Collectors.partitioningBy(e -> e.getAge()>20));
		//partition.forEach((k,v) -> System.out.println("key="+k+"value="+v));
		
		Set <Employeemodel> groupit= emp.stream().filter(e -> e.getAge()>20).collect(Collectors.toSet());
		groupit.forEach(System.out:: println);
	

	}

}
