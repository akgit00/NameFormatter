package com.pluralsight;

public class NameFormatter {

    //private constructor so I don't have to instantiate it
    private NameFormatter(){
    }

        // Method 1: simplest version (FirstName + LastName)
        public static String format(String firstName, String lastName) {
            return lastName + ", " + firstName;
        }

        // Method 2: full version with prefix, middle, suffix
        public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
            StringBuilder sb = new StringBuilder();
    }
}
