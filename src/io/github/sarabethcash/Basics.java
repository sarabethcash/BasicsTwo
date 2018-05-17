package io.github.sarabethcash;

import java.util.ArrayList;

class Eleven{
    public void perimeter(double r){
        double perimeter = 2 * Math.PI * r;

        System.out.print(perimeter + "\n");
    }
}

class Twelve{
    public void average(double numOne, double numTwo, double numThree){
        double average = (numOne + numTwo + numThree)/3;

        System.out.print(average + "\n");
    }
}

class Thirteen{
    public void rectangle(double l, double w){
        double area = l * w;
        double perimeter = 2 * (l + w);

        System.out.println("The area is " + area );
        System.out.print("The perimeter is " + perimeter + "\n");
    }
}

class Fourteen{
    public void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After the swap, the number a is " + a);
        System.out.println("After the swap, the number b is " + b);
    }
}

class Fifteen{
    public void reverse(String str){
        String reverse = "";
        for(int i = str.length()-1; i >= 0; i--){
            reverse  = reverse + str.charAt(i);
        }
        System.out.println("the reversed string is " + reverse + ".");

    }
}

class Sixteen{
    public void count(String str){
        int letterCount = 0;
        int numberCount = 0;
        int spaceCount = 0;
        int count = 0;
        for(int i = 0; i < str.length()-1; i ++){
            if((str.charAt(i) >= 65 && str.charAt(i) <= 90) || (str.charAt(i) >= 97 && str.charAt(i) <= 122)) {
                letterCount++;
            }
            if(str.charAt(i) >= 48 && str.charAt(i) <= 57){
                numberCount++;
            }
            if(str.charAt(i) == 32) {
                spaceCount++;
            }
            else
                count++;
        }
        System.out.println(letterCount);
        System.out.println(numberCount);
        System.out.println(spaceCount);
        System.out.println(count);
    }
}
