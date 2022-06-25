package Day3_EmpWage;

public class line_Comparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Line Comparision Program");
		
		int x1 = 1 , x2 = 2 , x3 = 3 , x4 = 4;
		int y1 = 5 , y2 = 6 , y3 = 7 , y4 = 8;
		
		double lenght_of_line1 = Math.sqrt(Math.pow((x2-x1),2)+ Math.pow((y2-y1),2));
		double lenght_of_line2 = Math.sqrt(Math.pow((x4-x3),2)+ Math.pow((y4-y3),2));
		
		System.out.println("Lenght of line1 = "+lenght_of_line1);
		System.out.println("Lenght of line2 = "+lenght_of_line2);
		
	 Integer line1 = new Integer((int) lenght_of_line1);
	 Integer line2 = new Integer((int) lenght_of_line2);
	 
	 System.out.println("These line is Equal = "+line1.equals(line2));
	 
	 if(line1.compareTo(line2)>0) {
		 System.out.println("Lenght of line1 is greater");
	 }
	 else {
		 System.out.println("Lenght of line2 is greater");
	 }

	} 

}
