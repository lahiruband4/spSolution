package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Problem5 {

    public void getSequence(){
         List<Integer> integerList=new ArrayList<>();
        integerList.add(50);
        integerList.add(2);
        integerList.add(1);
        integerList.add(9);

        String[] arr;

        String number="";
        for(int i=0;i<integerList.size();i++){
            number=number+integerList.get(i).toString();
        }
        System.out.println(number);
        char[] a = number.toCharArray();

    }
}
