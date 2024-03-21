public class GradeAssignment {

    public static void main(String[] args) {
        String studentName = "Alice";

        try {
            assignGrade(studentName, 85); // Valid grade
            System.out.println("Grade assigned successfully for " + studentName);
        } catch (IllegalArgumentException e) {
            System.out.println("Error assigning grade: " + e.getMessage());
        } finally {
            System.out.println("Grade assignment attempted for " + studentName);
        }

        try {
            assignGrade(studentName, -10); // Invalid grade
            System.out.println("Grade assigned successfully for " + studentName); // This won't be printed
        } catch (IllegalArgumentException e) {
            System.out.println("Error assigning grade: " + e.getMessage());
        } finally {
            System.out.println("Grade assignment attempted for " + studentName);
        }
    }

    public static void assignGrade(String studentName, int grade) throws IllegalArgumentException {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Invalid grade: " + grade);
        }
        // Simulate storing the grade (replace with actual storage logic)
        System.out.println("Grade " + grade + " assigned for student: " + studentName);
    }
}
