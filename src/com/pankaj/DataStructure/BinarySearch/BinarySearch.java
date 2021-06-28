package com.pankaj.DataStructure.BinarySearch;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        int arr[] = {10,15,20,22,37,40,57,69,71};
        int mid,begin = 0;
        int end = arr.length-1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to search :: ");
        int search = sc.nextInt();
        while(begin < end) {
            if(arr[begin] == search || arr[end] == search){
                System.out.println("Found!!");
                break;
            }
            mid = (begin + end) / 2;
            if (arr[mid] == search) {
                System.out.println("Found !!");
                break;
            } else if (arr[mid] > search) {
                end = mid - 1;
            } else {
                begin = mid + 1;
            }
        }
    }
}
