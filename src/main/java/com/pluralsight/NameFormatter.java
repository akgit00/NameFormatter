package com.pluralsight;

public class NameFormatter {

    //private constructor so I don't have to instantiate it
    private NameFormatter() {
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

        if (!prefix.isEmpty()) {
            sb.append(prefix).append(" ");
        }

        sb.append(firstName);

        if (!middleName.isEmpty()) {
            sb.append(" ").append(middleName);
        }

        //add suffix if it exists
        if (!suffix.isEmpty()) {
            sb.append(", ").append(suffix);
        }

        return sb.toString();
    }

    //take full names
    public static String format(String fullName) {
        // Split into main name and suffix
        String[] parts = fullName.split(",", 2);
        String namePart = parts[0].trim();
        String suffix = (parts.length > 1) ? parts[1].trim() : "";

        // Split name part by spaces
        String[] nameTokens = namePart.split(" ");

        String prefix = "";
        String firstName = "";
        String middleName = "";
        String lastName = "";

        //nameToken possible inputs
        if (nameTokens.length == 4) {
            prefix = nameTokens[0];
            firstName = nameTokens[1];
            middleName = nameTokens[2];
            lastName = nameTokens[3];

        } else if (nameTokens.length == 3) {
            if (nameTokens[0].endsWith(".")) {
                prefix = nameTokens[0];
                firstName = nameTokens[1];
                lastName = nameTokens[2];

            } else {
                firstName = nameTokens[0];
                middleName = nameTokens[1];
                lastName = nameTokens[2];

            }
        } else if (nameTokens.length == 2) {
            firstName = nameTokens[0];
            lastName = nameTokens[1];
        }
        return format(prefix, firstName, middleName, lastName, suffix);

    }
}
