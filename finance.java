import java.util.Scanner;
public class finance {
private int salary;
private int costAdv;
int hour;
int salaryOneHour = 20;
int duration,costTotal;
int costPerSecond1=15,costPerSecond2=13;
Scanner scan=new Scanner(System.in);
public void setSalary() {
	
	System.out.println ("Enter your work total hour in mount :");
	hour=scan.nextInt();
	
	salary = hour*salaryOneHour;
	
}
public void setCostAdv() {
	
	System.out.println ("Enter duration of advertisement (in second):");
	this.duration=scan.nextInt();
	if (this.duration >= 15) {
		costAdv = costPerSecond2*duration;
	}
	else if (this.duration<15){
		costAdv=costPerSecond1*duration;
	}
}

public Integer getSalary() {
	return this.salary;
}
public Integer getCostAdv() {
	return this.costAdv;
}
}
