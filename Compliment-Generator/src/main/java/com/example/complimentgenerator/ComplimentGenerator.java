package com.example.complimentgenerator;

import java.util.Scanner;
import java.util.Random;

public class ComplimentGenerator {
    private static String[] compliments = {
            "%s, you're doing an %s job with your %s! Keep it up!",
            "%s, have I told you that you're %s at %s? Because you totally are!",
            "%s, you're incredibly %s when it comes to %s; it’s impressive!",
            "%s, you're extremely %s at %s, and it shows in everything you do!",
            "%s, you bring such %s energy to %s, making it even more enjoyable!",
            "%s, you're remarkably %s at %s; it’s a joy to watch you!",
            "%s, you have a %s unique way of %s that always stands out!",
            "%s, you're absolutely %s at %s, and it inspires everyone around you!",
            "%s, your %s attitude towards %s is truly remarkable!",
            "%s, you’re doing an %s job with your %s; keep pushing forward!",
    };

    private static String[] adjectives = {"amazing", "outstanding", "awesome", "incredible", "astounding", "extraordinary","impressive"};

    public static String generateCompliment(String name, String hobby) {
        Random random = new Random();
        int complimentIndex = random.nextInt(compliments.length);
        int adjIndex = random.nextInt(adjectives.length);

        return String.format(compliments[complimentIndex], name, adjectives[adjIndex], hobby);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Ask user for their favorite hobby
        System.out.print("Enter your favorite hobby: ");
        String hobby = scanner.nextLine();

        // Generate and print compliment
        String compliment = generateCompliment(name, hobby);
        System.out.println(compliment);
    }
}