public class Assignment1 {
    public static void main(String[] args) {
        //constant
        int IS_FULL_TIME = 1;
        int Emp_Rate_Per_Hour = 20;
        //variables
        int employeehr = 0;
        int employeewage = 0;
        //computation
        double empCheck = Math.floor(Math.random() * 10) % 2;
        
        if (empCheck == IS_FULL_TIME)
        {
        employeehr = 8;
        }
        else{
        employeehr = 0;
        }

        employeewage = employeehr * Emp_Rate_Per_Hour;
        System.out.println("Emp Wage: " + employeewage);
    }
}
    

