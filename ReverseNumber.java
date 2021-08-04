package com.keyword;

import java.util.Scanner;

public class ReverseNumber
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: " );
        int number = in.nextInt();
        int reverse=0;
        while(number>0)
        {
            int last = number%10;
            reverse=reverse*10+last;
            number=number/10;

        }
        System.out.println("The number after reversing is "+reverse);
    }

}
