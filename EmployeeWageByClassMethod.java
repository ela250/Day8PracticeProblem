package com.employee;


public class EmployeeWageByClassMethod{
        static final int PartTime = 1;
        static final int FullTime = 2;
        static final int EmployeeRatePerHour = 20;
        static final int NumberOfWorkingDays = 20;
        static final int maximumHoursInMonth = 100;

        void employeeMonthlyWage() {
            int employeeHours = 0;
            int TotalEmployeeHours = 0;
            int TotalWorkingDays = 0;
            while (TotalEmployeeHours <= maximumHoursInMonth && TotalWorkingDays < NumberOfWorkingDays) {
                TotalWorkingDays++;
                int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
                switch (employeeCheck) {
                    case PartTime:
                        employeeHours = 4;
                        break;
                    case FullTime:
                        employeeHours = 8;
                        break;
                    default:
                        employeeHours = 0;
                }
                TotalEmployeeHours += employeeHours;
                System.out.println("Day : " + TotalWorkingDays + " employee Hours:" + employeeHours);
            }
            int TotalEmployeeWage = TotalEmployeeHours * EmployeeRatePerHour;
            System.out.println("Total Employee Wage: " + TotalEmployeeWage);
        }

        public static void main(String[] args) {
            EmployeeWageByClassMethod employeeWage = new EmployeeWageByClassMethod();
            employeeWage.employeeMonthlyWage();
        }
}



