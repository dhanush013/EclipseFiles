
public class student {

		int roll;
		String name;
		String subject;
		
		void study() {
			System.out.println("Student is Studying");

		}
		void assessment() {
			System.out.println("Student is giving assessment");

		}
		void playgame() {
			System.out.println("Student is playying");

		}
		
		public static void main(String[] args) {
			
			student student1= new student();
			student student2= new student();
			
			//student1 -- refrence variable
			//new student() -- create object
			
			
			student1.roll=1001;
			student1.name="Arvind Kumar";
			student1.subject="Math";
			
			System.out.println(student1.roll);
			System.out.println(student1.name);
			System.out.println(student1.subject);
			
			student1.study();
			student1.assessment();
			student1.playgame();
			
		}

}
