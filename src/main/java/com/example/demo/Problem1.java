package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {


    public int sumOfForloop(List<Integer> numberList){

        int sum=0;
        for(int i=0;i<numberList.size();i++){
            sum=sum+numberList.get(i);

        }

        return sum;
    }

    public  int sumForWhileloop(List<Integer> numberList){
        int sum=0;
        int i=0;
        while (i<numberList.size()){
            sum=sum+numberList.get(i);
            i++;
        }
        return sum;
    }

    public  int sumRecusrion(List<Integer> numberList){

        Integer arr[] = new Integer[numberList.size()];
        numberList.toArray(arr);


        int sum = sumOfArray(arr, arr.length - 1);
        return sum;
    }

    public static int sumOfArray(Integer[] arr, int n)
    {
        if (n == 0)
            return arr[n];
        else
            return arr[n] + sumOfArray(arr, n - 1);
    }
}
