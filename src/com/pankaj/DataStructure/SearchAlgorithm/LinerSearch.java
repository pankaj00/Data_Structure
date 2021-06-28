package com.pankaj.DataStructure.SearchAlgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LinerSearch {
    public static void main(String [] args){
        boolean found = false;
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(2);
        numbers.add(87);
        numbers.add(6);
        numbers.add(66);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to search : ");
        int search = sc.nextInt();
        for (Integer num : numbers){
            if(search == num){
                found =true;
                break;
            }
        }
        if(!found)
            System.out.println("Number does not found in list");
        else
            System.out.println("Number found !!!");
    }
}