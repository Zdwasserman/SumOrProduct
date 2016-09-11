package Wasserman.Zachary.SumOrProduct;

import java.util.Scanner;

public class SumOrProduct {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num = input.nextInt();
            System.out.println("1. find sum");
            System.out.println("2. find product");
            int  choice = input.nextInt();
            int counter = 0;
            if (choice == 1){
                int sum = 0;

                while (counter <= num){
                    sum = counter + sum;
                    counter++;
                }
                System.out.println(sum);
            }
            if(choice == 2){
                counter = 1;
                int product = 1;
                while (counter <= num){
                    product = product * counter;
                    counter++;
                }
                System.out.println(product);
                System.out.println("End of program");
            }

        }


}
