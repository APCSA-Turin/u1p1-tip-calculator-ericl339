package com.example.project;


public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        //your code here
                       
        double tipAmount = (((double) percent / 100) * cost) - 0.000001;
        tipAmount = Math.round(tipAmount * 100.0) / 100.0; // I learned this from https://www.educative.io/answers/how-to-use-the-java-mathround-method

        double totalBillWithTip = tipAmount + cost;

        double perCostBeforeTip = (cost / people) - 0.000001;
        perCostBeforeTip = Math.round(perCostBeforeTip * 100.0) / 100.0;

        double tipPerPerson = (tipAmount / people) - 0.000001;
        tipPerPerson = Math.round(tipPerPerson * 100.0) / 100.0;

        double totalCostPerPerson = (totalBillWithTip / people) - 0.000001;
        totalCostPerPerson = Math.round(totalCostPerPerson * 100.0) / 100.0;


        result.append("-------------------------------\n");
        result.append("Total bill before tip: " + "$" + cost); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("\n");
        result.append("Total percentage: " + percent + "%");
        result.append("\n");
        result.append("Total tip: " + "$" + tipAmount);
        result.append("\n");
        result.append("Total Bill with tip: " + "$" + totalBillWithTip);
        result.append("\n");
        result.append("Per person cost before tip: " + "$" + perCostBeforeTip);
        result.append("\n");
        result.append("Tip per person: " + "$" + tipPerPerson);
        result.append("\n");
        result.append("Total cost per person: " + "$" + totalCostPerPerson);
        result.append("\n");
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 6; 
        int percent = 25;
        double cost = 52.27;              
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
