package io.github.sarabethcash;

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

/*class Fourteen{
    public void flag(){
        System.out.println()
    }
}*/

class Fifteen{
    public void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After the swap, the number a is " + a);
        System.out.println("After the swap, the number b is " + b);
    }
}
