package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {




	public static void main(String[] args) {
		List<Integer> numberList=new ArrayList<>();
		numberList.add(1);
		numberList.add(10);
		numberList.add(15);
		numberList.add(5);



		Problem1 problem1=new Problem1();
		int sumForloop=problem1.sumOfForloop(numberList);
		int sumforWhileLoop=problem1.sumForWhileloop(numberList);
		int sumforrecursion=problem1.sumRecusrion(numberList);
		System.out.println("sumForloop "+sumForloop);
		System.out.println("sum while-loop "+sumforWhileLoop);
		System.out.println("sum reecursion "+sumforrecursion);



		List<Integer> numList=new ArrayList<>();
		numList.add(3);
		numList.add(5);
		numList.add(8);
		numList.add(2);

		List<String> strList=new ArrayList<>();
		strList.add("apple");
		strList.add("dog");
		strList.add("cat");
		strList.add("car");


		Problem2 problem2=new Problem2();
		List combinelist=problem2.getCombineList(numList,strList);

		for(int i = 0; i < combinelist.size(); i++) {
			System.out.print(combinelist.get(i));
		}

		Problem3 problem3=new Problem3();
		problem3.calculateFibNumber();


		Problem5 Problem5=new Problem5();
		Problem5.getSequence();
		SpringApplication.run(DemoApplication.class, args);
	}

}
