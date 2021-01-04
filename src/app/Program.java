package app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employees> employees = new ArrayList<Employees>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i);
			System.out.print("Id: ");
			sc.nextLine();
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			employees.add(new Employees(id, name, salary));
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		sc.nextLine();
		int id = sc.nextInt();
		Employees result = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(result != null) {
			System.out.print("Enter the percentage: ");
			sc.nextLine();
			double percent = sc.nextDouble();
			result.increase(percent);
		}
		else {
			System.out.println("This id does not exist!");
		}
		
		System.out.println();
		System.out.println("List of employees");
		
		for (Employees x : employees) {
			System.out.println(x);
		}
		
		sc.close();
	}

}






















