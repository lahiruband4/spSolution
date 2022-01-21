package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {

    public List getCombineList(List<Integer> numberList,List<String> stringList){

        List newList=new ArrayList();
        for(int i=0;i<numberList.size();i++){
            newList.add(numberList.get(i));
            newList.add(stringList.get(i));

        }

        return newList;

    }

}
