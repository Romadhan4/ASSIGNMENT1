import java.util.Scanner;
public class Employee extends Main {
		private String id,name, position,address;
		private int age,hour;
		
		
		Scanner scan=new Scanner(System.in);
		
		public void setId() {
			
			System.out.println ("Enter your ID :");
			this.id=scan.nextLine();
		}
		public void setName() {
			System.out.println ("Enter your Name :");
			this.name=scan.nextLine();
		}
		public void setPosition() {
			System.out.println ("Enter your position in company :");
			this.position=scan.nextLine();
		}
		public void setAddress() {
			System.out.println ("Enter your address :");
			this.address=scan.nextLine();
		}
		public void setAge() {
			System.out.println ("Enter your age :");
			this.age=scan.nextInt();
		}
		
		public void setHour() {
			System.out.println ("Enter your work hours :");
			this.hour=scan.nextInt();
		}
		public Integer getAge() {
			return this.age;
		}
		public Integer getHour() {
			return this.hour;
		}
		public String getId() {
			return this.id;
		}
		public String getName() {
			return this.name;
		}
		public String getPosition() {
			return this.position ;
		}
		public String getAddress() {
			return this.address;
		}
}
