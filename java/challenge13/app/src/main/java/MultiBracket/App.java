/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package MultiBracket;

import MultiBracket.stucture.Stack;

public class App {


    public static void main(String[] args) {

        Stack validateBrackets = new Stack();



        try {
            System.out.println(validateBrackets.ValidateBrackets("{}(){}"));
        }catch (Exception e){
            System.err.println(e.getMessage());
        }


    }

}
