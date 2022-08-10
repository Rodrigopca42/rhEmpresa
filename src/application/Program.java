package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmpoyee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner tec = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Digite o número de funcionários: ");
		int n = tec.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do funcionário nº " + i + ":"); 
			System.out.print("Terceirizado (s/n)? ");
			char ch = tec.next().charAt(0);
			
			System.out.print("Nome: ");
			tec.nextLine();
			String name = tec.nextLine();
			 
			System.out.print("Quantas horas trabalhadas? ");
			int hour = tec.nextInt();
			
			System.out.print("Valor por hora: ");
			double valuePerHour = tec.nextDouble();
			
			if(ch == 's') {
				System.out.print("Cobrança adicional: ");
				double additionalCharges = tec.nextDouble();
				
				Employee emp = new OutsourcedEmpoyee(name, hour, valuePerHour, additionalCharges);
				
				list.add(emp);
			}
			else {
				Employee emp = new Employee(name, hour, valuePerHour);
			list.add(emp);
			}
		}
		
		System.out.println("");
		System.out.println("PAGAMENTOS:");
		for( Employee emp: list) {
			System.out.println(emp.getName() + ", R$" + String.format("%.2f", emp.payment()));
		}
		
		
		
		
		
		tec.close();
	}
}
