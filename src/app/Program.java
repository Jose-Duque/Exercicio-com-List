package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employees> employees = new ArrayList<Employees>();
		
		System.out.print("How many employees will be registered");
		int n = sc.nextInt();
		
		sc.close();
	}

}
