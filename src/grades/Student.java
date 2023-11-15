package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private String name;
    private List<Integer> grades;

    private Map<String, String> attendance;

    public Student(String name) throws StudentNotMadeRightException {
        // a student must have a non-blank name
        if(name.length() == 0) {
            throw new StudentNotMadeRightException("Students must have non-blank names.");
        }
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }

    public void recordAttendance(String date, String value) {
        if(!value.equalsIgnoreCase("P")
                && !value.equalsIgnoreCase("A")) {
            throw new IllegalArgumentException("Value must be either P or A.");
        }
        attendance.put(date, value);
    }

    public double getAttendancePercentage() {
        double countPs = 0;
        for (String key : attendance.keySet()) {
            String entry = attendance.get(key);
            if(entry.equalsIgnoreCase("P")) {
                countPs++;
            }
        }
        return countPs / attendance.size() * 100;
    }

    public List<String> getAbsentDates() {
        List<String> dates = new ArrayList<>();
        for (String key : attendance.keySet()) {
            String entry = attendance.get(key);
            if (entry.equalsIgnoreCase("A")) {
                dates.add(key);
            }
        }
        return dates;
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;

        // sum up the grades
        for (Integer grade : grades) {
            sum += grade;
        }

        return sum / grades.size();
    }

    public void addGradeBatch(Integer... gradesToAdd) {
        for (Integer grade : gradesToAdd) {
            addGrade(grade);
        }
    }

    public String getGradeString() {
        return grades.toString();
    }
}
