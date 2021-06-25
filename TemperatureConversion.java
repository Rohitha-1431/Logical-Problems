package com.bridgelabz.logicalprograms;
import java.util.Scanner;
public class TemperatureConversion {
    public static void main(String[] args) 
    {
        double celsius, fahrenheit;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit:");
        System.out.println("Enter temperature in Celsius:");
        fahrenheit = scanner.nextDouble();
        celsius = scanner.nextDouble();
        celsius = (fahrenheit-32)*(0.5556);
        fahrenheit = (celsius*1.8)+32;
        scanner.close();
        System.out.println("Temperature in Celsius:"+celsius);
        System.out.println("Temperature in fahrenheit:"+fahrenheit);
    }
}
