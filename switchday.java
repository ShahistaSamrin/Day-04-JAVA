import java.util.*;
public class switchday{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int day=s.nextInt();
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break; 
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;  
            case 6:
                System.out.println("Saturday");
                break; 
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
                break;  
        }
    }
}