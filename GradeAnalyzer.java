package com.hello;


public class GradeAnalyzer {
    public static void main(String[] args) {
        // Initialize the array with the grades of 10 students
        int[] grades = {65, 89, 78, 81, 75, 65, 54, 95, 72, 68};

        // Calculate the average grade
        double averageGrade = calculateAverage(grades);

        // Find the highest and lowest grades
        int highestGrade = findHighestGrade(grades);
        int lowestGrade = findLowestGrade(grades);

        // Print out the results
        System.out.println("Average Grade: " + averageGrade);
        System.out.println("Highest Grade: " + highestGrade);
        System.out.println("Lowest Grade: " + lowestGrade);
    }

    public static double calculateAverage(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public static int findHighestGrade(int[] grades) {
        int highest = grades[0];
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    public static int findLowestGrade(int[] grades) {
        int lowest = grades[0];
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}