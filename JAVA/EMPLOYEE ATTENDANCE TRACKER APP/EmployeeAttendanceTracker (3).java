public class EmployeeAttendanceTracker{

    public int[] calculateEmployeeTotalDaysPresent(int[][] employeeAttendance, int numberOfEmployee, int numberOfWeeks){
    
        int[] totalDaysArray = new int[numberOfEmployee];
        for(int employeeNumber = 0; employeeNumber < numberOfEmployee; employeeNumber++){
            int totalDays = 0;
            for(int weekNumber = 0; weekNumber < numberOfWeeks; weekNumber++){
    
                totalDays += employeeAttendance[employeeNumber][weekNumber];
            
            }totalDaysArray[employeeNumber] = totalDays;
            
        }return totalDaysArray;
    }
    
    public double[] calculatePercentageOfDaysPresent(int[] totalDaysArray, int numberOfWeeks){
    
        int overallTotalDays = numberOfWeeks*5;
        double [] percentageOfDaysPresent = new double[totalDaysArray.length];
        
        for(int days = 0; days < totalDaysArray.length; days++){
            double attendancePercentage = 0.0;
            attendancePercentage = ((double)totalDaysArray[days] / overallTotalDays) * 100;
            percentageOfDaysPresent[days] = attendancePercentage;
        }
        return percentageOfDaysPresent;
    
    }
    
    public String[] getEmployeeAttendanceStatus(double[] percentageOfDaysPresent, int numberOfEmployee){
    
        String[] status = new String[percentageOfDaysPresent.length];
        
        for (int employee = 0; employee < percentageOfDaysPresent.length; employee++){
        
            if (percentageOfDaysPresent[employee] < 60)
                status[employee] = "*** LOW ***";
            else
                status[employee] = "OK";
        
        }return status;

    }
    
    public int countOfLowAttendancePercentage(double[] percentageOfDaysPresent, int numberOfEmployee){
        
        int lowStatus = 0;
        for (int employee = 0; employee < percentageOfDaysPresent.length; employee++){
        
            if (percentageOfDaysPresent[employee] < 60.00)
                lowStatus++;
        
        }return lowStatus;

    }
    
    public double[][] getEmployeeWithLowAttendance(double[] percentageOfDaysPresent, int lowStatusCount){
    
        double[][] flaggedEmployee = new double[lowStatusCount][2];
        int count = 0; 
        while(count < lowStatusCount){
            for (int employee = 0; employee < percentageOfDaysPresent.length; employee++){
        
                if(percentageOfDaysPresent[employee] < 60.0){
                
                    flaggedEmployee[count][0] = percentageOfDaysPresent[employee];
                    flaggedEmployee[count][1] = employee+1;
                    count++;
                    
                }
            }
        }
        return flaggedEmployee;
    }

}
