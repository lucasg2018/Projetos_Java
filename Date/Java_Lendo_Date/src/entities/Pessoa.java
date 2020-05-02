package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {
	private String name;
	private int age;
	private Date date;
	
	public Pessoa() {
	}

	public Pessoa(String name, int age, Date date) {
		this.name = name;
		this.age = age;
		this.date = date;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public String toString() {
		return "\nPessoa [name=" + name + ", age=" + age + ", date=" + sdf.format(date) + "]";
	}
	
	
}
