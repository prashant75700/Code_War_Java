package Clumsy.D3.Array;

import java.util.Scanner;

public class Search_In_Array {
    public static void main(String[] args) {
        int [] random = {12,25,13,48,67,95,68,13,00,46};

        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nArrays Elements: ");
        for (int ran : random) {
            System.out.print( ran + " ");
        }

        Boolean found = false;
        int position = -1;

        System.out.print("\n\nEnter Your Element to search: ");
        int search_element = sc.nextInt();

        for (int i = 0; i < random.length - 1; i++) {

            if (random[i] == search_element) {
                found = true;
                position = i;

                break;
            }
        }

        if (found) {
            System.out.println("\nHurrreee! Match Found " + search_element + " at Index " + position);
        }
        else {
            System.out.println("\nSHittt, Match not Found for " + search_element + " search Query! T-T ");
        }
        System.out.println("");

        sc.close();


    }
}
