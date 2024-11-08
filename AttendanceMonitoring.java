
package attendancemonitoring;

import java.util.Scanner;


public class AttendanceMonitoring {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     boolean exit=true;   
    do{
        System.out.println("WELCOME TO FACULTY ATTENDANCE MONITORING");
        System.out.println("");
        System.out.println("1. FACULTY");
        System.out.println("2. ATTENDANCE");
        System.out.println("3. TIME IN");
        System.out.println("4. TIMEOUT");
        System.out.println("5. EXIT");
        
        System.out.println("Enter action: ");
        int action =sc.nextInt();
        

        switch(action){
            case 1:
                Faculty cs = new Faculty();
                cs.Frecord();
                break;
                case 5:
                System.out.println("Exit Selected.... type 'yes' to continue: ");
                String resp =sc.next();
                if(resp.equalsIgnoreCase("yes")){
                exit=false;
                break;
                


        }
     }while(exit);
    }
    
}