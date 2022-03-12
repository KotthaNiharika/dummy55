package Flowstmts;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class IfElseDemo {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.close();
        int i;
  while(true) {      
if(n % 2 == 1) 
{
    for(n=1; n<=100; n++);
  System.out.println("weird");
}
else if (n % 2 == 0) {
    for(i=2; i<=5; i++);
    System.out.println("Not Weird");
}
else if (n % 2 == 0) {
    for(i=6; i<=20 ; i++);
System.out.println("Weird");
}
     else {
    System.out.println("Not Weird");
} 
    }
}
}
