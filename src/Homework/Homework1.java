package Homework;
import com.sun.xml.internal.ws.message.FaultDetailHeader;
import java.util.Scanner;
/**
 * 1) Store below scenario value in an appropriate dataType variable, and print the same in console.
 * 	1. number of hours in a day
 * 	2. number of max no. of days in a years
 * 	3. total number of employees in an organisation
 * 	4. population in a country
 * 	5. interest rate
 * 	6. balance in a bank account
 * 	7. does the sun rise from the west? Store answer
 * 	8. initials of your name
 * 	9. Your name
 * 2) Implement code to convert temperature values using below formulae:
 * °F = 9/5 ( °C) + 32
 * °F = 9/5 (K - 273) + 32
 * K = °C + 273
 * °C = K - 273
 * K = 5/9 (° F - 32) + 273
 * Check your result using the link: "http://www.onlineconversion.com/temperature.htm"
 */

public class Homework1 {

    public static void main(String[] args) {


        byte dayHours = 24;
        System.out.println("Hours in a day: " + dayHours);

        short maxDaysInYear = 366;
        System.out.println("Maximum days in a year: " + maxDaysInYear);

        int totalEmployees = 100;
        System.out.println("Total Employees: " + totalEmployees);

        long countryPopulation = 250000000L;
        System.out.println("Country Population: " + countryPopulation);

        float interestRate = 6.78f;
        System.out.println("Interest Rate: " + interestRate);

        long bankBalance = 4000000L;
        System.out.println("Current Bank Balance: " + bankBalance);

        boolean sunriseWest = false;
        System.out.println("The sun rises in the west: " + sunriseWest);

        char firstInitial = 'R';
        System.out.println("First Initial: " + firstInitial);

        char lastInitial = 'S';
        System.out.println("Last Initial: " + lastInitial);

        String myName = "Ramizah Salim";
        System.out.println("Full Name: " + myName);



        double fahrenheit, celsius, kelvin;
        int conversionType;

        Scanner initiateConversion = new Scanner(System.in);
        System.out.println("Press 1 for C to F " +
                "OR 2 for K to F " +
                "OR 3 for C to K " +
                "OR 4 K to C " +
                "OR 5 for F to K " +
                "OR 6 for F to C. ");
        conversionType = initiateConversion.nextInt();

        Scanner input = new Scanner(System.in);

        if (conversionType == 1) {
            System.out.println("Please enter degrees Celsius.");
            celsius = input.nextDouble();
            fahrenheit = celsius * (9 / 5) + 32;
            System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit.");
        } else if (conversionType == 2) {
            System.out.println("Please enter degrees Kelvin");
            kelvin = input.nextDouble();
            fahrenheit = 9 / 5 * (kelvin - 273) + 32;
            System.out.println(kelvin + " degrees Kelvin is " + fahrenheit + " degrees Fahrenheit.");
        } else if (conversionType == 3) {
            System.out.println("Please enter degrees Celsius");
            celsius = input.nextDouble();
            kelvin = celsius + 273;
            System.out.println(celsius + " degrees Celsius is " + kelvin + " degrees Kelvin.");
        } else if (conversionType == 4) {
            System.out.println("Please enter degrees Kelvin");
            kelvin = input.nextDouble();
            celsius = kelvin - 273;
            System.out.println(kelvin + " degrees Kelvin is " + celsius + " degrees Celsius.");
        } else if (conversionType == 5) {
            System.out.println("Please enter degrees Fahrenheit");
            fahrenheit = input.nextDouble();
            kelvin = 5 / 9 * (fahrenheit - 32) + 273;
            System.out.println(fahrenheit + " degrees Fahrenheit is " + kelvin + " degrees Kelvin.");
        } else if (conversionType == 6) {
            System.out.println("Please enter degrees Fahrenheit.");
            fahrenheit = input.nextDouble();
            celsius = (5 / 9) * (fahrenheit - 32);
            System.out.println(fahrenheit + " degrees Fahrenheit is " + celsius + " degrees Celsius");
        } else {
            System.out.println("Please enter a valid conversion type.");
            System.out.println("Press 1 for C to F " +
                    "OR 2 for K to F " +
                    "OR 3 for C to K " +
                    "OR 4 K to C " +
                    "OR 5 for F to K " +
                    "OR 6 for F to C. ");
        }








    }



}
