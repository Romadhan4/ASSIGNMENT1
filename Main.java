import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println ("\t\t\t==== COMPANY DETAILS ====");
			System.out.println ("Company Name \t: Writing");
			System.out.println ("Contact Us \t: 019299190");
			System.out.println ("E-Mail \t\t: CSwriting@gmail.com\n");
			
			Marketing ma=new Marketing();
			System.out.println ("\t\t\t=== MARKETING ===");
			ma.setMarket();
			System.out.println (ma.getMarket());
			
			info();
			Advertisement ();
			
			Employee e= new Employee();
			System.out.println ("=== FILL DETAIL OF EMPLOYEE ===");
			e.setName();
			e.setId();
			e.setPosition();
			e.setAddress();
			e.setAge();
			e.setHour();
			
			
			System.out.println ("\n\t\t\t==== EMPLOYEE DETAIL ====");
			System.out.println ("Name\t\t:"+e.getName());
			System.out.println ("Position\t:"+e.getPosition());
			System.out.println ("Address\t\t:"+e.getAddress());
			System.out.println ("ID\t\t:"+e.getId());			
			System.out.println ("Age\t\t:"+e.getAge()+"years old");
			System.out.println ("Work hours\t:"+e.getHour()+"hours");
			
			finance c=new finance();
			System.out.println ("=== FILL THE HOUR TOTAL WORK  ===");
			c.setSalary();
			System.out.println ("=== FILL THE DURATION ===");
			c.setCostAdv();
			
			System.out.println ("\n\t\t\t==== FINANCE ====");
			System.out.println ("Salary in a month        : RM"+c.getSalary());
			System.out.println ("Total cost advertisement : RM"+c.getCostAdv());
			
			bookWr();
			
	
		
	}
	private static void Advertisement() {
		// TODO Auto-generated method stub
			System.out.println ("\n\t\t\t  ==== ADVERTISEMENT ====\n");
		String adv;
		adv="\t\t Teringin menjadi E-Book Writer yang mahir??\n"+
				"\t\t   Jom sertai kelas belajar menulis E-Book.";
			System.out.println (adv);
			
			
			System.out.println ("\t\t\t   *** E-BOOK WRITING ***");
			System.out.println ("\t\t          Now only 10 seat available.\n"+
								"\t\t       And get a sepcial discount from us.\n"+
								"\t\t         ONLY RM.200 for one(1) month.");
			System.out.println ("\t\t              BOOK FAST NOW!!!!");
			System.out.println ("\t\t           No Whatsapp1 : 0119090909\n"+
					"\t\t           No Whatsapp2 : 019299190\n");
	}
	public static void info () {
			System.out.println ("\n\t\t\t=== INFO ===");
			System.out.println ("This E-Book Writing is a service to help you write e-books. \n");
			}
	public static void bookWr() {
		System.out.println("\n\t\t\t==== CUSTOMER SERVICE ====");
		System.out.println("CONTACT\t\t: 0119090909");
		System.out.println("COMPANY NAME\t: WritingCom");
		System.out.println("E-Mail\t\t: CSWritingCom@gmail.co.my");
	}
	}
	
