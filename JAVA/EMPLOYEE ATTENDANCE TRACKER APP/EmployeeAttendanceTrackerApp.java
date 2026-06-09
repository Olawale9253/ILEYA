import java.util.Scanner;
import java.util.Arrays;
public class EmployeeAttendanceTrackerApp{

    public static void main(String[] args){
    
        EmployeeAttendanceTracker attendanceTracker = new EmployeeAttendanceTracker();
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int numberOfEmployee = input.nextInt();
        System.out.print("Enter number of weeks: ");
        int numberOfWeeks = input.nextInt();
        
        int[][] employeeAttendance = new int[numberOfEmployee][numberOfWeeks];
        
        
        for(int employeeNumber = 0; employeeNumber < numberOfEmployee; employeeNumber++){
            System.out.printf("Employee %d%n", employeeNumber+1);
            for(int weekNumber = 0; weekNumber < numberOfWeeks; weekNumber++){
                System.out.printf("Days present in Week %d: ", weekNumber+1);
                
                int numberOfDaysPresent = input.nextInt();
                
                
                while(numberOfDaysPresent < 0 || numberOfDaysPresent > 5){
                
                    System.out.printf("Days present in Week %d: ", weekNumber+1);
                    numberOfDaysPresent = input.nextInt();
                }
                employeeAttendance[employeeNumber][weekNumber] = numberOfDaysPresent;

            }
        }
        int[] totalDaysPresent = attendanceTracker.calculateEmployeeTotalDaysPresent(employeeAttendance, numberOfEmployee, numberOfWeeks);
        double[] attendancePercentage = attendanceTracker.calculatePercentageOfDaysPresent(totalDaysPresent, numberOfWeeks);
        String[] attendanceStatus = attendanceTracker.getEmployeeAttendanceStatus(attendancePercentage, numberOfEmployee);
        int countOfLowAttendance = attendanceTracker.countOfLowAttendancePercentage(attendancePercentage, numberOfEmployee);
        double[][] flaggedEmployee = attendanceTracker.getEmployeeWithLowAttendance(attendancePercentage, countOfLowAttendance);
        
        System.out.printf("=================== EMPLOYEE ATTENDANCE REPORT ===================%nEMPLOYEE");
        
        for(int week = 0; week < numberOfWeeks; week++){
            System.out.printf("\tWK%d", week+1);
        }

        System.out.printf("%8s%8s%12s%n%s","TOTAL","%","STATUS","------------------------------------------------------------------");
        for(int employee = 0; employee < numberOfEmployee; employee++){
            System.out.printf("%nEmployee %d", employee+1);
            for(int week = 0; week < numberOfWeeks; week++){
            
                System.out.printf("\t%d",employeeAttendance[employee][week]);
            
            }
            System.out.printf("\t%d", totalDaysPresent[employee]);
            System.out.printf("\t%.1f%%", attendancePercentage[employee]);
            System.out.printf("\t%s", attendanceStatus[employee]);
        }
        System.out.printf("%n------------------------------------------------------------------%n%nEmployees with attendance below 60%%: ");
        for(int employee = 0; employee < countOfLowAttendance; employee++){
            
            System.out.printf("%n -> Employee %d (%.1f%%) - FLAGGED",(int)flaggedEmployee[employee][1], flaggedEmployee[employee][0]);
            
            
        }
        
    }
}
