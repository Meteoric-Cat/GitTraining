/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gittraining;

/**
 *
 * @author danhn
 */
public class GitTraining {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        GitTraining.displayFinabonacciSequence(50);
//        GitTraining.countNumberOfOccurance("123123 123 32123 12", "123");
        GitTraining.displayContainingSubString("hello world hellhis", "hell");
    }
    
    public static void displayFinabonacciSequence(int n) {
        long a1 = 0, a2 = 1, a3 = 0;
        if (n >= 1) 
            System.out.println(a1);
        if (n >= 2) 
            System.out.println(a2);
        for (int i = 3; i <= n; i++) {
            a3 = a1 + a2;
            System.out.println(a3);
            a1 = a2;
            a2 = a3;
        }
    }
    
    public static void countNumberOfOccurance(String s1, String s2) {
        int result = 0, fromIndex = 0;
        while ((fromIndex = s1.indexOf(s2, fromIndex)) != -1) {
            result++;
            fromIndex += s2.length();
        }
        System.out.println(result);
    }
    
    public static void displayContainingSubString(String s1, String s2) {
        int result = 0;
        String[] subStrings = s1.split(" ");
        
        for (String subString : subStrings) {
            if (subString.contains(s2)) {
                System.out.println(subString);
            }
        }
        
    }
}
