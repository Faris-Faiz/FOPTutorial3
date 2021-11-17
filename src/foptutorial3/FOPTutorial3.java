/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package foptutorial3;

import java.util.Scanner;

/**
 *
 * @author Faris Faiz
 */
public class FOPTutorial3 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String temp, strings="";
        String[] string_list = new String[99]; 
        int string_count=0;
    
        for(int i=0; i<999; i++){
            System.out.print("Enter the string [Quit to quit]: ");
            strings = keyboard.nextLine();
            switch(strings){
                case "Quit":
                    i=998;
                    break;
                default:
                    string_list[i] = strings;
                    string_count++;
                    break;
            }
        }
        
        for(int j=0; j<string_count; j++){
            for(int k= j + 1; k < string_count; k++){
                if(string_list[j].compareTo(string_list[k])>0){
                    temp = string_list[j];
                    string_list[j] = string_list[k];
                    string_list[k] = temp;
                }
            }
        }
        
        System.out.print("Strings in Sorted Order: ");
        for (int i = 0; i <= string_count - 1; i++) 
        {
            System.out.print(string_list[i] + ", ");
        }
    }
    
}
