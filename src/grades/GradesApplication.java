package grades;

import util.Input;

import java.util.HashMap;
import java.util.Map;

public class GradesApplication {
    private final int CHOICE_EXIT = 5;

    private Map<String, Student> students;
    private Input input = new Input();

    public static void main(String[] args) {
        GradesApplication app = new GradesApplication();
        app.start();
    }

    public void start() {
        // init the hashmap
        initStudents();

        printWelcome();

        while(true) {
            printMenu();

            int choice = input.getInt(1, CHOICE_EXIT, "Make a choice: ");

            if(choice == CHOICE_EXIT) {
                break;
            }

            doChoice(choice);

        }

        System.out.println("Goodbye!");

    }

    private void doChoice(int choice) {
        switch (choice) {
            case 1 -> magicStuffForGHUser();
            case 2 -> printAllStudentsGrades();
            case 3 -> printClassAverage();
            case 4 -> printCSV();
            default -> System.out.println("Invalid menu choice: " + choice);
        }
    }

    private void printCSV() {
        System.out.println("name,github_username,average");
        for (String key : students.keySet()) {
            Student student = students.get(key);
            System.out.printf("%s,%s,%.1f\n",
                    student.getName(),
                    key,
                    student.getGradeAverage());
        }
        System.out.println("--------------------");
    }

    private void printClassAverage() {
        System.out.print("Class average: ");
        double sum = 0;
        for (String key : students.keySet()) {
            Student student = students.get(key);
            sum += student.getGradeAverage();
        }
        System.out.printf("%.1f\n", sum / students.size());
        System.out.println("--------------------");
    }

    private void printAllStudentsGrades() {
        // loop through all students in hashmap
        // print out each student's name and their grades
        System.out.println("All students' grades:");
        for (String key : students.keySet()) {
            Student student = students.get(key);
            System.out.printf("Student: %s  Grades: %s\n"
                    , student.getName()
                    , student.getGradeString());
        }
        System.out.println("--------------------");
    }

    private void magicStuffForGHUser() {
        System.out.println("Here are the GitHub usernames of our students:\n");
        printStudents();

        System.out.println("\nWhat student would you like to see more information on?\n");

        String ghName = input.getString("> ");

        printStudentByGHName(ghName);

//        System.out.println("Would you like to see another student?\n");
//        boolean seeMoreStudents = input.yesNo("> ");

    }

    private void printMenu() {
        System.out.println("""
                1. Print a user by GH name
                2. Print all user's grades
                3. Print class average
                4. Print CSV
                5. Exit
                """);
    }

    private void printStudentByGHName(String ghName) {
        Student student = students.get(ghName);
        if(student == null) {
            System.out.println("\nSorry, no student found with the GitHub username of \"" + ghName + "\".\n");
        } else {
            // found the student so print out the student
            System.out.printf("""
                    
                    Name: %s - GitHub Username: %s
                    Current Average: %.1f
                    Grades: %s
                    Attendance %%: %.1f 
                    Absent on: %s 
                    """, student.getName(), ghName
                    , student.getGradeAverage()
                    , student.getGradeString()
                    , student.getAttendancePercentage()
                    , student.getAbsentDates().toString());
        }
    }


    private void printWelcome() {
        System.out.println("""
                Welcome! 
                  
                """);

    }

    private void printStudents() {
        // iterate through the hashmap's keyset
        for (String key : students.keySet()) {
            System.out.print("|" + key + "| ");
        }
        System.out.println();
    }

    private void initStudents() {
        students = new HashMap<>();

        // add bob to students
        Student bob = new Student("bob");
        bob.addGradeBatch(50, 75, 68, 88, 100, 44);
//        bob.addGrade(50);
//        bob.addGrade(75);
//        bob.addGrade(68);
        students.put("gh-bob", bob);

        Student sue = new Student("sue");
        sue.addGrade(85);
        sue.addGrade(93);
        sue.addGrade(98);
        sue.recordAttendance("2023-01-01", "p");
        sue.recordAttendance("2023-01-02", "p");
        sue.recordAttendance("2023-01-03", "a");
        students.put("gh-sue", sue);

    }
}
