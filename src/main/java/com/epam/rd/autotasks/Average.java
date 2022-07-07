package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0,number,size=-1;
        do {
            number=scanner.nextInt();
            sum+=number;
            size++;
        }
        while (number!=0);
        System.out.println(sum/size);
    }

}