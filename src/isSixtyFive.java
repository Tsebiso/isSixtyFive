/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

   public class isSixtyFive {
    public static boolean isSixtyFive(int num1, int num2) {
        return num1 == 65 || num2 == 65 || (num1 + num2) == 65;
    }

    public static void main(String[] args) {
        
        boolean result1 = isSixtyFive(20, 45);
        System.out.println(result1);  

        boolean result2 = isSixtyFive(15, 30);
        System.out.println(result2);  
    }
}

    

