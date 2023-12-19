package DayTwo;

public class EmployeeWage {
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;
    static final int EMPLOYEE_RATE_PER_HOUR = 125;
    static final int NUM_WORKING_DAYS = 30;
    static final int MAX_HOUR_INA_MONTH = 100;

    public static void main(String[] args) {
        int empHrs = 0, empWage = 0, totalEmpWage = 0, totalEmpHour = 0, totalWorkingDays = 0;
        while(totalEmpHour < MAX_HOUR_INA_MONTH || totalWorkingDays < NUM_WORKING_DAYS){
            totalWorkingDays++;
            double empCheck = Math.floor(Math.random()*10)%3;
            System.out.println("Employee Attendance Check: "+empCheck);
            switch ((int) empCheck){
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHour = totalEmpHour + empHrs;
            empWage = empHrs*EMPLOYEE_RATE_PER_HOUR;
            System.out.println("Employee Wage is "+empWage);
            totalEmpWage = totalEmpWage + empWage;
        }
        System.out.println("Total Employee Wage is " + totalEmpWage);
    }
}
