import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeAttendanceTrackerTest{

    EmployeeAttendanceTracker attendanceTracker = new EmployeeAttendanceTracker();
    
    @Test
    public void testThatTotalNumberOfDaysGivesAccurateResult(){
    int [][] employeeAttendance = {{3, 4, 3},{3, 3, 2}};
    int [] actual = attendanceTracker.calculateEmployeeTotalDaysPresent(employeeAttendance, 2, 3);
    int [] result = {10, 8};
    assertArrayEquals(result, actual);
    }
    
    @Test
    public void testThatTotalNumberOfDaysWithZeroGivesAccurateResult(){
    int [][] employeeAttendance = {{2, 0, 3},{0, 4, 2}};
    int [] actual = attendanceTracker.calculateEmployeeTotalDaysPresent(employeeAttendance, 2, 3);
    int [] result = {5, 6};
    assertArrayEquals(result, actual);
    }
    
    @Test
    public void testThatPercentageOfDaysPresentGivesAccurateResult(){
    int [] totalDays = {5, 10};
    double [] actual = attendanceTracker.calculatePercentageOfDaysPresent(totalDays, 2);
    double [] result = {50.0, 100.0};
    assertArrayEquals(result, actual);
    }
    
    @Test
    public void testThatEmployeeAttendanceGivesAccurateStatus(){
    double[] percentage = {50.00, 75.00}; 
    String[] actual = attendanceTracker.getEmployeeAttendanceStatus(percentage, 1);
    String [] status = {"*** LOW ***", "OK"};
    assertArrayEquals(status, actual);
    }

}
