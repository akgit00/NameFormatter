package com.pluralsight;

public class NameFormatter {

    //private constructor so I don't have to instantiate it
    private NameFormatter(){
    }

        // simple version (firstName + lastName)
        public static String format(String firstName, String lastName) {
            return lastName + ", " + firstName;
        }

        // full version with prefix, middle and suffix
        public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
            StringBuilder sb = new StringBuilder();
    }
}
