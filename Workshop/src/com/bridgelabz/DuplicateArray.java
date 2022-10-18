package com.bridgelabz;


import java.util.Scanner;

class DuplicateArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); //use scanner class
        System.out.println("Enter the size of an array ");
        int n = sc.nextInt();              // taking input from user
        int arr[]=new int [n];
        System.out.println("Enter The Elements of array");
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
            System.out.println("duplicate elements are");
            for (int i=0; i<arr.length;i++){    //search for duplicate elements
                for (int j =i+1; j<arr.length ;j++){
                    if (arr[i]==arr[j])
                        System.out.println(arr[j]);
                }
            }


                }
            }



