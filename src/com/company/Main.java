package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
//Ввести n чисел с консоли.
    //Вывести числа в порядке возрастания (убывания) значений их длины.
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();
        String str = reader.readLine();
        int[] numArr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i=0; i< numArr.length; i++){
            arrayList.add(String.valueOf(Math.abs(Integer.parseInt(Integer.toString(numArr[i])))));
        }
        SortingNumbers.sort(arrayList);//используем пузырьковую сортировку
        System.out.println("Числа в порядке возрастания значений их длины: ");
        for(int i=0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
        System.out.println();
        System.out.println("Числа в порядке убывания значений их длины: ");
        for (int i=arrayList.size()-1; i>=0; i--) {
            System.out.println(arrayList.get(i)+" ");
        }
    }
}
