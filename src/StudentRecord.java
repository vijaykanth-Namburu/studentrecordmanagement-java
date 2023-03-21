import java.util.*;
import java.util.Scanner;

public class StudentRecord {
		
		
		public String toString() {
			return id +" "+name +" "+ age;
		}private int id;
		private String name;
		private int age;
		
		StudentRecord(int id,String name,int age){
			this.id = id;
			this.name = name;
			this.age = age;
		}
		public int getAge() {
			return age;
		}
		public int getId() {
			return id;
		}
		public String getName()
		{
			return name;
		}
		
}
class Operations{
	public static void main(String Args[]) {
		
		Collection<StudentRecord> sr = new ArrayList<StudentRecord>();
		int ch ;
		
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your choice : ");
		do{
			System.out.println("1.Insert");
			System.out.println("2.Show");
			System.out.println("3.search");
			System.out.println("4.delete");
			
			System.out.println("5.particular name");
			ch = s.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter student id:");
				int id = s.nextInt();
				System.out.println("Enter student name:");
				String name =s.next();
				System.out.println("Enter student age:");
				int age = s1.nextInt();
			    sr.add(new StudentRecord(id,name,age));
			break;
			case 2:
				Iterator<StudentRecord> i =sr.iterator();
				while(i.hasNext()) {
					StudentRecord m =i.next();
					System.out.println(m);
				}
				
			break;
			case 3:
				boolean found =false;
				System.out.println("Enter Studentid to search: ");
				id = s.nextInt();
				i =sr.iterator();
				while(i.hasNext()) {
					StudentRecord m =i.next();
					if(m.getId() ==id) {
						System.out.println(m);
						found = true;
				}
					else
						System.out.println("Record Not found");
				}
					
			break;
			case 4:
				boolean done = false;
				System.out.println("Enter Studentid to delete: ");
				id = s.nextInt();
				i =sr.iterator();
				while(i.hasNext()) {
					StudentRecord m =i.next();
					if(m.getId() ==id) {
						i.remove();;
						found = true;
				}
				}
					if(!done) {
						System.out.println("Record Not found");
					}
					else {
						System.out.println("Record deleted");
						
					}
			case 5:
				boolean success = false;
				System.out.println("Enter Student name to delete: ");
				name = s.next();
				i =sr.iterator();
				while(i.hasNext()) {
					StudentRecord m =i.next();
					if(m.getName().equalsIgnoreCase(name)) {
						i.remove();;
						success = true;
			}
			}
				if(!success) {
						System.out.println("Record Not found");
					}
					else {
						System.out.println("Record deleted");
					}
			}
		
			}while(ch!=0);
	 
		
 }
}
	
	

