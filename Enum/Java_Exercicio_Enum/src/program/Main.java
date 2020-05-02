package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Main {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    
	    System.out.print("Enter department's name: ");
	    String departmentName = ler.nextLine();
	    System.out.println("Enter worker data: ");
	    System.out.print("Name: ");
	    String workername = ler.nextLine();
	    System.out.print("Level(JUNIOR/MID_LEVEL/SENIOR): ");
	    String workerLevel = ler.nextLine();
	    System.out.print("Base Salary: ");
	    double baseSalary = ler.nextDouble();
	    
	    Worker worker = new Worker(workername, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
	    
	    System.out.print("How many contract to this worker? ");
	    int n = ler.nextInt();
	    ler.nextLine();
	     
	    for(int i = 1; i <= n; i++)
	    { 
	    	System.out.println("Enter contract #" + i + " data:" );
	    	System.out.print("Date (DD/MM/YYYY):");
	    	try {
				Date contractDate = sdf.parse(ler.next());
				System.out.print("Value per hour: ");
		    	double valuePerHour = ler.nextDouble();
		    	System.out.print("Duration (hours): ");
		    	int hours = ler.nextInt();
		    	
		    	HourContract contract = new HourContract(contractDate, valuePerHour, hours);
		    	worker.addContract(contract);
	    	} catch (ParseException e) {
				e.printStackTrace();
			}    	
	    }
	    
	    System.out.println();
	    System.out.print("Enter with month and year to calculate income  (MM/YYYY): ");
	    String monthAndYear = ler.next();
	    int month = Integer.parseInt((monthAndYear.substring(0, 2)));
	    int year = Integer.parseInt(monthAndYear.substring(3));
	    
	    System.out.println("Name: " + worker.getNome());
	    System.out.println("Department: " + worker.getDepartment().getNome());
	    System.out.println("Income for " + monthAndYear + ": " + worker.income(year, month));
	    
	    ler.close();
	}
}