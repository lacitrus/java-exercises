package exercises;

import java.util.Scanner;


public class Alice {

    public static void main(String[] args){
        System.out.println("Hello World");
        Scanner input;
        String name;


        input = new Scanner(System.in);
        System.out.println("Please input your name");
        name = input.next();

        System.out.println("Hello " + name);



    }
}
