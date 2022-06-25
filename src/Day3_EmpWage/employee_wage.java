package Day3_EmpWage;
import java.util.Random;

public class employee_wage {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Program");
		
		Random random_value = new Random(); 
		//Employee Attendance 
		int employee_Present = 1;
		int employee_check = (int) ((Math.random()*10) % 2);
		
		if(employee_Present == employee_check) {
			System.out.println("Employee is Present");	
		}
		else {
			System.out.println("Employee is Absent");
		}
		/*
		 * 
		 * 
		 * 
		 */
		//Full time Wages
		int is_fulltime = 1;
		int working_Hours = 8;
		int wage_per_Hour = 20;
		int fulltime_wage = (working_Hours * wage_per_Hour);
		
		//Part time wages
		int is_Parttime = 2;
		int parttime_hours = 4;
		int parttime_wage = (parttime_hours * wage_per_Hour);
		int employee_check1 = (int) ((Math.random()*10) % 3);
		
		if(is_fulltime == employee_check1) {
			System.out.println("Employee fulltime wage= " + fulltime_wage);
				
		}
		else if ( is_Parttime == employee_check1) {	
			System.out.println("Employee Part time wage= " + parttime_wage);
		}
		else {
			System.out.println("Employee wage is = 0");
		}
		
//		switch(employee_check) {
//			
//		case 1 :
//			System.out.println("Employee is Present");
//			System.out.println("Employee daily wage= " +  daily_wage);
//			System.out.println("Employee Part time wage= " +  parttime_wage);
//			break;
//		
//		default :
//			System.out.println("Employee is Absent");
//			System.out.println("Employee daily wage= 0");
//			System.out.println("Employee Part time wage= 0");
//			
//		}
		
		
		

	}

}
