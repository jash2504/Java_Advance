
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {

    private String studentName;
    private String studentCity;
    private int studentAge;
    private double studentHeight;
    private double studentWeight;
    private String studentGender;

    public Student(String studentName, String studentCity, int studentAge, double studentHeight, double studentWeight, String studentGender) {
        this.studentName = studentName;
        this.studentCity = studentCity;
        this.studentAge = studentAge;
        this.studentHeight = studentHeight;
        this.studentWeight = studentWeight;
        this.studentGender = studentGender;
    }

    // Getters for student attributes
    public String getStudentName() {
        return studentName;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public double getStudentHeight() {
        return studentHeight;
    }

    public double getStudentWeight() {
        return studentWeight;
    }

    public String getStudentGender() {
        return studentGender;
    }
}

public class StudentFiltering {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", "Ahmedabad", 20, 165.0, 60.0, "FEMALE"),
                new Student("Bob", "Mumbai", 22, 175.0, 70.5, "MALE"),
                new Student("Carol", "Ahmedabad", 19, 160.5, 58.0, "FEMALE"),
                new Student("David", "Delhi", 25, 180.0, 72.5, "MALE"),
                new Student("Eve", "Bangalore", 17, 163.5, 64.0, "FEMALE")
        );

        // Scenario 1: Students who are FEMALE and coming from Ahmedabad
        List<Student> femaleStudentsFromAhmedabad = students.stream()
                .filter(student -> student.getStudentGender().equals("FEMALE") && student.getStudentCity().equals("Ahmedabad"))
                .collect(Collectors.toList());

        System.out.println("Female students from Ahmedabad:");
        femaleStudentsFromAhmedabad.forEach(student -> System.out.println(student.getStudentName()));

        // Scenario 2: Students who are MALE and have weight between 65.0 and 73.0
        List<Student> maleStudentsWithWeightInRange = students.stream()
                .filter(student -> student.getStudentGender().equals("MALE") && student.getStudentWeight() >= 65.0 && student.getStudentWeight() <= 73.0)
                .collect(Collectors.toList());

        System.out.println("\nMale students with weight between 65.0 and 73.0:");
        maleStudentsWithWeightInRange.forEach(student -> System.out.println(student.getStudentName()));

        // Scenario 3: Students who have crossed age 18 and are MALE or FEMALE
        List<Student> studentsAboveAge18 = students.stream()
                .filter(student -> student.getStudentAge() > 18)
                .collect(Collectors.toList());

        System.out.println("\nStudents above 18 years old:");
        studentsAboveAge18.forEach(student -> System.out.println(student.getStudentName()));
    }
}
