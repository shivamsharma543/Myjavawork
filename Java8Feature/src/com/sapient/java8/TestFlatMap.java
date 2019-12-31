package com.sapient.java8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestFlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  Code to print the the name of employee which is inside the two nested list

		List<List<Employee>> listOfList = new ArrayList<List<Employee>>();
		List<Employee> listOfEmployee = new ArrayList<Employee>();

		listOfEmployee.add(new Employee("shivam"));
		listOfEmployee.add(new Employee("PRAKHAR"));
		listOfEmployee.add(new Employee("AKASH"));

		listOfList.add(listOfEmployee);

		/*
		 * List<Employee> map = listOfList.stream().flatMap(list ->
		 * list.stream()).collect(Collectors.toList()); map.forEach(l ->
		 * System.out.println(l.getName()));
		 */

// Counting the repetative character from list

		List<Integer> ls = new ArrayList(Arrays.asList(1, 2, 3, 1, 3, 5, 6, 67, 67, 1, 1));

		Map<Integer, Long> map1 = ls.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		 System.out.println(map1);

		List<Item> items = Arrays.asList(new Item("apple", 10, new BigDecimal("9.99")),
				new Item("banana", 20, new BigDecimal("19.99")), new Item("orang", 10, new BigDecimal("29.99")),
				new Item("watermelon", 10, new BigDecimal("29.99")), new Item("papaya", 20, new BigDecimal("9.99")),
				new Item("apple", 10, new BigDecimal("9.99")), new Item("banana", 10, new BigDecimal("19.99")),
				new Item("apple", 20, new BigDecimal("9.99")));

		Map<BigDecimal, Set<String>> result = items.stream()
				.collect(Collectors.groupingBy(Item::getPrice, Collectors.mapping(Item::getName, Collectors.toSet())));

		// System.out.println(result);

		// To find the list of name of employee.
		List<String> lsss = listOfEmployee.stream().map(e -> e.getName()).distinct().collect(Collectors.toList());
		//System.out.println(lsss);

	}

}

class Employee {

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(String string) {
		this.name = string;
	}

	public String toString() {
		return name;

	}

}

class Item {

	private String name;
	private int qty;
	private BigDecimal price;

	public Item(String name, int qty, BigDecimal price) {

		this.name = name;
		this.qty = qty;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}