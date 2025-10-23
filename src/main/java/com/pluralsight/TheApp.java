package com.pluralsight;

public class TheApp {
    public static void main(String[] args) {
        //simple version
        System.out.println(NameFormatter.format("Ahmad", "Kourouma"));

        //full version
        System.out.println(NameFormatter.format("Dr.", "Ahmad", "I", "Kourouma", "PhD"));

        // fullName version
        System.out.println(NameFormatter.format("Dr. Ahmad I Kourouma, PhD"));

        System.out.println(NameFormatter.format("Ahmad Kourouma"));
    }

    }
