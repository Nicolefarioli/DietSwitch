package com.example.dietswitch;

import java.util.Scanner;

public class FatGramsCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double totNumOfCalories;
        double fatGrams;
        double caloriesFromFat;
        double percentageOfCaloriesFromFat;


        System.out.println("Please enter the number of calories(Total)");
        totNumOfCalories = scanner.nextDouble();

        System.out.println("Please enter the number of fat Grams in the food");
        fatGrams = scanner.nextDouble();

        caloriesFromFat = fatGrams * 9;
        percentageOfCaloriesFromFat = caloriesFromFat/totNumOfCalories;

        if(caloriesFromFat > totNumOfCalories){
            System.out.println("Invalid input");
        }else{
            if(caloriesFromFat < (30/100)*totNumOfCalories){
                System.out.println("The food is low in fat");
            }
            System.out.printf("The percentage of calories that came from fat is %.2f%%",percentageOfCaloriesFromFat);
        }
    }
}
