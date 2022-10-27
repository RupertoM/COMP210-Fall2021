package a1;

import java.util.Scanner;

public class A1Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    /* Declares and creates two objects of type Summer and for
    the parameter to the constructor uses 30...  meaning each
    Summer object can deal with up to 30 ints sent to it */

    Summer evenSummer = new Summer(30);
    Summer oddSummer = new Summer(30);

    /* Gets a single integer from the scanner
    refers to that int as N
    we will use N as an upper limit in a for loop */
    int N = input.nextInt();

    // Loops N times.
    /* In each loop iteration does these things:
      -- gets an integer from the input scanner
      -- decides if that int is even or odd
      -- if its even , sends it to the even Summer obj
         by calling its "add" method
      -- if that int is odd, sends it to the odd Summer obj
         by calling its "add" method
    The loop ends when all N integers have been obtained from input */

    for (int i = 0; i < N; i++) {
      int integer = input.nextInt();
      if ((integer % 2) == 0) {
        evenSummer.add(integer);
      }
      if ((integer % 2 != 0)) {
        oddSummer.add(integer);
      }
    }

    printStats(evenSummer, oddSummer);

    // The loop has now "loaded" each of the two Summer objects
    // with data from input
    // one Summer obj is full of even ints
    // the other Summer obj is full of odd ints
    // Prints output
  }

  static void printStats(Summer evenSummer, Summer oddSummer) {
    // This is a helper method for Task 2.

    System.out.print("Number of evens: ");
    System.out.print(evenSummer.count());
    System.out.println();

    System.out.print("Sum of evens: ");
    System.out.print(evenSummer.sum());
    System.out.println();

    System.out.print("Average of evens: ");
    System.out.print(evenSummer.average());
    System.out.println();

    System.out.print("Largest even: ");
    System.out.print(evenSummer.high());
    System.out.println();

    System.out.print("Smallest even: ");
    System.out.print(evenSummer.low());
    System.out.println();

    System.out.print("Average of evens over 10: ");
    System.out.print(evenSummer.avgOver(10));
    System.out.println();

    System.out.print("Number of odds: ");
    System.out.print(oddSummer.count());
    System.out.println();

    System.out.print("Sum of odds: ");
    System.out.print(oddSummer.sum());
    System.out.println();

    System.out.print("Average of odds: ");
    System.out.print(oddSummer.average());
    System.out.println();

    System.out.print("Largest odd: ");
    System.out.print(oddSummer.high());
    System.out.println();

    System.out.print("Smallest odd: ");
    System.out.print(oddSummer.low());
    System.out.println();

    System.out.print("Average of odds over 10: ");
    System.out.print(oddSummer.avgOver(10));
    System.out.println();
  }
}
