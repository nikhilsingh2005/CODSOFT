import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // enter marks for each subject
        System.out.println("Enter marks (out of 100) for each subject:");

        System.out.print("science: ");
        int scienceMarks = sc.nextInt();

        System.out.print("mathematics: ");
        int mathematicsMarks = sc.nextInt();

        System.out.print("hindi: ");
        int hindiMarks = sc.nextInt();

        System.out.print("french: ");
        int frenchMarks = sc.nextInt();

        System.out.print("sanskrit: ");
        int sanskritMarks = sc.nextInt();

        // Calculating the average marks
        double averageMarks = calculateAverage(scienceMarks, mathematicsMarks, hindiMarks, frenchMarks, sanskritMarks);

        char grade = calculateGrade(averageMarks);

        // Displaying the results
        System.out.println("\nResults:");
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Grade: " + grade);

        sc.close();
    }

    // Function for calculating the average marks
    private static double calculateAverage(int... marks) {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        return (double) totalMarks / marks.length;
    }

    // Function for calculating the grade based on average marks
    private static char calculateGrade(double averageMarks) {
        if (averageMarks >= 90) {
            return 'A';
        } else if (averageMarks >= 80) {
            return 'B';
        } else if (averageMarks >= 70) {
            return 'C';
        } else if (averageMarks >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
