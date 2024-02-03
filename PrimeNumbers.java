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
        int count [] = {2, 3, 5, 7, 11};
        int notPrime = 0;
        // for loop repeats 100 times
        for(int i=2; i<101; i++) {
            for(int j=0; j<count.length; j++){ //iterates through array containing prime bases
                if(i%count[j]==0 && i!=count[j]) { //Adds 1 to notPrime if i doesn't meet requirements
                    notPrime++;
                }
            }
            // If there is no instances of notPrime, then i is a prime number
            if(notPrime==0){
                System.out.println(i);
            }
            // resets notPrime for next i value
            notPrime = 0;
        }
        System.out.println("\nThank you for using the program!");
    }
}
