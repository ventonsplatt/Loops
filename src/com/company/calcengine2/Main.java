package com.company.calcengine2;

public class Main {

    public static void main(String[] args) {

        int kVal = 5;
        int factorial = 1;

        // while loop ////////////////////
        // longhand
        while (kVal > 1){
            factorial *= kVal;
            kVal -=1;
        }
        System.out.println(factorial);

        kVal = 5;
        factorial = 1;
        //shorthand
        while (kVal > 1)
            factorial *= kVal--;

        System.out.println(factorial);


        // do while loop ////////////////////
        // checks at end of loop so always executes at least once
        int iVal = 5;
        do{
            System.out.print(iVal);
            System.out.print(" * 2 = ");
            iVal *= 2;

            System.out.println(iVal);

        } while(iVal < 100);


        // for loop  ////////////////////////////////

        for(int eVal = 1; eVal < 100; eVal *=2){
            // do some stuff
            System.out.println(eVal);
        }

        // for each loop (with arrays) ////////////////////////////////
        float [] theVals = { 45.3f, 22.8f, 12.8f, 13f};
        float sum = 0.0f;

        for (float currentVal : theVals)
            sum += currentVal;
        System.out.print("sum of array elements: ");
        System.out.println(sum);

    }
}
