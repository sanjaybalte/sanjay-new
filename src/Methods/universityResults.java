package Methods;

public class universityResults {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		universityResults ur=new universityResults();
		ur.studentsinfo2("sanjay", 2222, 'A', 4500);
		universityResults employee_det =new universityResults();
		employee_det.studentsinfo11("sanjay", 420, 'A', 290000);
		employee_det.studentsinfo11("vijay", 450, 'a', 35000);
		employee_det.studentsinfo11("shital", 555, 'A', 25000);
	
	}
	
		
		

	public void studentsinfo2(String studentName,int roll_number,char grade,float total_marks)
	
	{
		
		System.out.println("student name is "+studentName);
		System.out.println("student roll no is "+roll_number);
		System.out.println("student grade is "+grade);
		System.out.println("student total marks "+total_marks);
		System.out.println("*****************************");
	}
	
	
	public static void studentsinfo11(String Employeename,int employee_id,  char grade
			,int employee_salary)
	{
		System.out.println("*******************************");
		System.out.println("employee name is "+Employeename);
		System.out.println("employee id is "+employee_id);
		System.out.println("employee grade is "+grade  );
		System.out.println("employee salary is "+employee_salary);
		System.out.println("**********************************");
	}
	
}
