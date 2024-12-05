import java.util.*;
public class eligibleforvote{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int age=s.nextInt();
        int flag=0;
        if(age>=18){
            flag=1;
            switch(flag){
                case 0:
                    System.out.println("not eligible");
                    break;
                case 1:
                    System.out.println("eligible");
                    break;    
            }
        }
    }
}
           