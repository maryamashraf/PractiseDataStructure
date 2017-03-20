/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author US
 */
import java.util.Scanner;
public class Division {
     public static void main(String[] args)
    {
    int x,y,div;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first value:");
    x=sc.nextInt();
    System.out.println("Enter second value:");
    y=sc.nextInt();
    div=x/y;
    System.out.println("Result is:"+div);
    
}
    
}
