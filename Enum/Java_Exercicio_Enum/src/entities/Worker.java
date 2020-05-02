package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
  private String nome;
  private WorkerLevel level;  
  private double baseSalarial;
  
  private Department department;
  private List<HourContract> contracts = new ArrayList<>();
  
  public Worker(){
  }
  
  public Worker(String name, WorkerLevel level, double baseSalary, Department department)
  {
    this.nome = name;
    this.level = level;
    this.baseSalarial = baseSalary;
    this.department = department;
  }
  
  public String getNome() {
	return nome;
  }

  public void setNome(String nome) {
	this.nome = nome;
  }

  public WorkerLevel getLevel() {
	return level;
  }

  public void setLevel(WorkerLevel level) {
	this.level = level;
  }

  public double getBaseSalarial() {
	return baseSalarial;
  }

  public void setBaseSalarial(double baseSalarial) {
	this.baseSalarial = baseSalarial;
  }

  public Department getDepartment() {
	return department;
  }

  public void setDepartment(Department department) {
	this.department = department;
  }	

  public List<HourContract> getContracts() {
	return contracts;
  }

  public void addContract(HourContract contract) {
	contracts.add(contract);
  }
  
  public void removeContract(HourContract contract) {
	contracts.remove(contract);
  }

  public double income(int year, int month) {
	double sum = baseSalarial;
	Calendar cal = Calendar.getInstance();
	for(HourContract c : contracts) {
		cal.setTime(c.getDate());
		int c_year = cal.get(Calendar.YEAR);
		int c_month = 1 + cal.get(Calendar.MONTH);
		if(c_year == year && c_month == month) {
			sum += c.totalValue();
		}
	}
	return sum;
  }	
}