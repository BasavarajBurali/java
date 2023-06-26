package programCollection;

import java.util.Scanner;

public class TechNumber {
   public static void main(String[] args) {
        System.out.println("enter the input value");
        Scanner sc=new Scanner(System.in);
        int value=sc.nextInt();
        int num1=value/100;
        int num2=value%200;
        int add=num1+num2;
        int org_num=add*add;
        System.out.println("the out put will be"+org_num);
        System.out.println("the out put will be"+add);

    }
}
