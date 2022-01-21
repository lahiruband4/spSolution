package com.example.demo;

public class Problem3 {

    public void calculateFibNumber(){

        int firstnum=0;
        int secNumber=1;



        for(int counter=3;counter<=100;counter++){

            if(firstnum==0 && secNumber==1){
                System.out.println(firstnum);
                System.out.println(secNumber);
            }
            int nextnumber=firstnum+secNumber;
            System.out.println(nextnumber);

            firstnum=secNumber;
            secNumber=nextnumber;

        }
    }
}
