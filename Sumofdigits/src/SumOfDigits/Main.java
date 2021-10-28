package ex;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("What is your number? ");
        int number=sc.nextInt();
        if (number <10) {
            System.out.println("invalid input");
        }else{
        int sum=0;
        while(number>0){
            int digit=number%10;
            sum+=digit;
            number/=10;
        }
        System.out.println("The sum of the digit are "+sum);}
    }
    }

