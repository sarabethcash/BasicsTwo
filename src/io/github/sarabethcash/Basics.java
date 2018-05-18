package io.github.sarabethcash;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

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

class Sixteen {
    public void count(String str) {
        int letterCount = 0;
        int numberCount = 0;
        int spaceCount = 0;
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
                letterCount++;
            } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                numberCount++;
            } else if (str.charAt(i) == 32) {
                spaceCount++;
            } else
                count++;
        }
        System.out.println(letterCount);
        System.out.println(numberCount);
        System.out.println(spaceCount);
        System.out.println(count);
    }
}

class Seventeen{
    public void format(){
        System.out.println("Twinkle, twinkle, little star,");
        System.out.println("\t\tHow I wonder what you are!");
        System.out.println("\t\t\t\tUp above the world so high,");
        System.out.println("\t\t\t\tLike a diamond in the sky.");
        System.out.println("Twinkle, twinkle, little star,");
        System.out.println("\t\tHow I wonder what you are!");
    }
}

class Eighteen {
    public void systemTime() {
        Date date = new Date();

        System.out.println("Current Date time: " + date);
    }
}

class Nineteen{
    public void formatTime(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/dd/MM HH:MM:ss.SSS");
        Date date = new Date();
        String str = sdf.format(date);

        System.out.println("Now: " + str);
    }
}

class Twenty{
    public void printOdd(){
        for(int i = 0; i < 100; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}