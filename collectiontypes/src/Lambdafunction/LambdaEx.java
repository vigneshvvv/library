package Lambdafunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;


public class LambdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map<Integer,Model> list = new HashMap<Integer,Model>();
		List<Model> listnew= new ArrayList<Model>();
		listnew.add(new Model(1,"vicky",23,20000));
		listnew.add(new Model(12,"svdv",24,30000));
		listnew.add(new Model(3,"vickynn",18,40000));
		
		List<Model> sortedone= listnew.stream().filter(e -> e.getAge()>20).collect(Collectors.toList());
        sortedone.forEach(e -> System.out.println(+e.getAge()));
			
		}
		
		
		
		
		

	}


