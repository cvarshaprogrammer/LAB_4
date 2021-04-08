package com.company;
import java.util.*;

public class Main
{

    public static void main(String[] args)
    {

                double a,vol;
                Scanner in=new Scanner(System.in);
                System.out.println("Enter values for EDGE:");
                a=in.nextDouble();

                vol= a*a*a;
                System.out.println("EDGE IS: " + a);
                System.out.println("VOLUME IS: " + vol);


    }
}
