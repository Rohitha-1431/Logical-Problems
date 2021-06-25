package com.bridgelabz.logicalprograms;
import java.util.Scanner;
public class TemperatureConversion {
    public static void main(String[] args) 
    {
        double celsius, fahrenheit;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit:");
        fahrenheit = scanner.nextDouble();
        celsius = (fahrenheit-32)*(0.5556);
        scanner.close();
        System.out.println("Temperature in Celsius:"+celsius);        
    }
}
