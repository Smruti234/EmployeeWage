package Employee;

public class EmpWageuc4 {
	 public static void main(String[] args) {
		 int IS_FULL_TIME = 1;
	        int IS_PART_TIME = 2;
	        int EMP_RATE_PER_HOUR = 20;
	        int empHrs = 0;
	        int empWage = 0;


	        double empCheck = Math.floor(Math.random() * 10) % 3;
	        int c = (int)empCheck;
	        switch(c) {
	        case 1 :
	        	empHrs = 8;
	        	empWage = empHrs * EMP_RATE_PER_HOUR;
	        	
	        break;
	        case 2:
	        	 empHrs = 4;
	        	 empWage = empHrs * EMP_RATE_PER_HOUR;
	        	 
	        break;
	        default:
	        	empHrs = 0;	        	 	        
	        }
	        System.out.println(empWage);
	        
	}

}
