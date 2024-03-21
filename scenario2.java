public class PatientRecord {

    public static void main(String[] args) {
        Patient patient = new Patient();

        try {
            patient.setAge(25); // Valid age
            System.out.println("Patient age set successfully.");
        } catch (InvalidAgeException e) {
            System.out.println("Error setting age: " + e.getMessage());
        }

        try {
            patient.setAge(-5); // Invalid age
            System.out.println("Patient age set successfully."); // This won't be printed
        } catch (InvalidAgeException e) {
            System.out.println("Error setting age: " + e.getMessage());
        }
    }
}

class Patient {
    private int age;

    public void setAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 130) {
            throw new InvalidAgeException("Invalid age provided: " + age + ". Age must be between 0 and 130.");
        }
        this.age = age;
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
