// Programmers: Bonita Rodrigues
// Course: CS212, Professor Nweke
// Due Date: 2/2/24
// Lab Assignment: Prime Numbers (class activity)
// Problem Statement: Output all prime number between 0 and 100
// Data In: none
// Data Out: prime numbers between 0 and 100
// Credits: none
public class PrimeNumbers {
    public static void main(String [] args){
        System.out.println("This program will print all prime numbers from 0 to 100\n");
        // for loop repeats 100 times and increments i by 2
        for(int i=0; i<101; i+=2) {
            System.out.println(i);
        }
        System.out.println("\nThank you for using the program!");
    }
}
