package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String originalPassword = "TheSoftwareInstitute";
            String inputPassword = in.nextLine();

            passwordChecker(originalPassword, inputPassword);

            passwordChecker(originalPassword, editPassword(inputPassword));

        }

        public static void passwordChecker(String originalPassword, String inputPassword){
            if(originalPassword.equals(inputPassword)){
                System.out.println("The password is the same");
            } else {
                System.out.println("This password is incorrect, it should be: " + originalPassword + ", whilst you entered: " + inputPassword );
            }
        }

        public static String editPassword(String inputPassword){
            String password = inputPassword;
            Random random = new Random();
            int number = random.nextInt(6);
            switch (number) {
                case 1 -> password = password.toLowerCase();
                case 2 -> password = password.toUpperCase();
                case 3 -> password = password.concat("AAA");
                case 4 -> password = password.replace( 'I', 'G' );
                case 5 -> password = password.replaceAll("a|e|i|o|u| |", "");
            }
            return password;
        }
}
