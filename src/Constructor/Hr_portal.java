package Constructor;

public class Hr_portal {

	public static void main(String[] args) {

		employee sachinT=new employee();
		sachinT.employee_name="sachin tendulkar";
		sachinT.employee_dept="IT";
		sachinT.employee_gender='M';
		sachinT.employee_id=4526;
		sachinT.employee_salary=50000.50f;
		
		employee zaheer=new employee();
		zaheer.employee_name="sachin tendulkar";
		zaheer.employee_dept="IT";
		zaheer.employee_gender='M';
		zaheer.employee_id=4526;
		zaheer.employee_salary=50000.50f;
		
		sachinT.employeeinfo();
		zaheer.employeeinfo();
		
		
		
	}

}
