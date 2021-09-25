package Employee;

public class EmpWageuc5 {
	public static void main(String[] args) {
		int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int EMP_RATE_PER_HOUR = 20;
        int EMP_DAY_PER_MONTH = 20;
        
        
        int empHrs = 0;
        int empWage = 0;
        int empDay = 0;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        
        if (empCheck == IS_FULL_TIME) {
            empHrs = 8;
        }
        if (empCheck == IS_PART_TIME){
            empHrs = 4;
        }
        else
            empHrs = 0;
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp Wage: " + empWage);
        empDay = empWage * EMP_DAY_PER_MONTH;
        System.out.println("Emp Day PER Month:" + empDay);

	}

}
