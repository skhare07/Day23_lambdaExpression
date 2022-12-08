package com.bridgelabz.lambdaexpression;

import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface ILName {
    public String validate(String regex, String field);
}

public class LastName {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last name :");
        String field = sc.next();
        IFName isValidLastName = (pattern, lastName) -> {

            return "The input provided is " + Pattern.compile(pattern).matcher(lastName).matches();
        };

        System.out.println(isValidLastName.validate("^[A-Z]{1}[a-z]{3,9}$", field));
    }

}
