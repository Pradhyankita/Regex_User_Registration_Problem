package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Regex regex=new Regex();
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter first name :");
        String firstName=scanner.next();
        regex.validateFirstName(firstName);

    }

    public void validateFirstName(String firstName){
//        first name starts with Cap and has minimum 3 characters
        Pattern pattern=Pattern.compile("^[A-Z][a-zA-Z]{2,}");
        boolean matches = pattern.matcher(firstName).matches();
        if (matches){
            System.out.println("firstName is valid");
        }else
            System.out.println("firstName is not valid");
    }
}
