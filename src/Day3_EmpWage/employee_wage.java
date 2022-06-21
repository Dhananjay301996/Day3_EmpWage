package Day3_EmpWage;
import java.util.Random;

public class employee_wage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Program");
		
		Random random_value = new Random(); 
		//Employee Attendance 
		int employee_Present = 1;
		int employee_check = (int) ((Math.random()*10) % 2);
		
		//Full time Wages
		int working_Hours = 8;
		int wage_per_Hour = 20;
		int daily_wage = (working_Hours * wage_per_Hour);
		
		//Part time wages
		int parttime_hours = (working_Hours/2);
		int parttime_wage = (parttime_hours * wage_per_Hour);
		
		
		if(employee_Present == employee_check) {
			System.out.println("Employee is Present");
			System.out.println("Employee daily wage= " +  daily_wage);
			System.out.println("Employee Part time wage= " +  parttime_wage);
			
			
			
		}
		else {
			System.out.println("Employee is Absent");
			System.out.println("Employee daily wage= 0");
			System.out.println("Employee Part time wage= 0");
		}
		
		
		
		
		

	}

}
