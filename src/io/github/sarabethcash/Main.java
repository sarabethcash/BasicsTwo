package io.github.sarabethcash;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*System.out.print("\nEnter 1 numbers: ");
        double r = scan.nextDouble();
        Eleven objectEleven = new Eleven();
        objectEleven.perimeter(r);

        System.out.print("\nEnter 3 numbers: ");
        double numOne = scan.nextDouble();
        double numTwo = scan.nextDouble();
        double numThree = scan.nextDouble();
        Twelve objectTwelve = new Twelve();
        objectTwelve.average(numOne, numTwo, numThree);

        System.out.print("\nEnter 2 numbers: ");
        double length = scan.nextDouble();
        double width = scan.nextDouble();
        Thirteen objectThirteen = new Thirteen();
        objectThirteen.rectangle(length, width);

        Fourteen objectFourteen = new Fourteen();
        objectFourteen.flag();*/

        System.out.print("\nEnter 2 numbers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("The number a is " + a);
        System.out.println("The number b is " + b);
        Fifteen objectFifteen = new Fifteen();
        objectFifteen.swap(a, b);
    }
}