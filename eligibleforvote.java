import java.util.*;
public class eligibleforvote{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int flag=0;
        if(n>=18){
            flag=1;}
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


           