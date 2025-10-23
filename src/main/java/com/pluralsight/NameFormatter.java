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
            //start with last name
            sb.append(lastName);

            //add comma and prefix/first/middle
            sb.append(", ");

            if (prefix != null && !prefix.isEmpty()) {
                sb.append(prefix).append(" ");
            }

            sb.append(firstName);

            if (middleName != null && !middleName.isEmpty()) {
                sb.append(" ").append(middleName);
            }

            //add suffix if it exists
            if (suffix != null && !suffix.isEmpty()) {
                sb.append(", ").append(suffix);
            }

            return sb.toString();
        }

}
