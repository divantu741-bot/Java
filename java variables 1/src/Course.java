class Course {
    private String courseName;
    private int studentsRegistered;
    private static int totalStudents = 0;
}
public Course(String name, int students) {
    this.courseName = name;
    this.studentsRegistered = students;
    totalStudents += students;
}
public void registerStudents(int count) {
    studentsRegistered += count;
    totalStudents += count;
}
public double calculateAverageAttendance(int[] attendancePerSession) {
    int sum = 0;
    for (int attended : attendancePerSession) {
        sum += attended;
    }
    double average = (double) sum / attendancePerSession.length;
    return average;
}
public double calculatePassPercentage(int passed) {
    double percentage = ((double) passed / studentsRegistered) * 100;
    return percentage;
}
public void displayCourseStatistics() {
    System.out.println("Course: " + courseName + " | Students registered: " + studentsRegistered);
}
public static int getTotalStudents() {
    return totalStudents;
}

public String getCourseName() {
    return courseName;
}

public class UniversityEnrolment {
    public static void main(String[] args) {
        Course course1 = new Course("Object-Oriented Programming", 45);
        Course course2 = new Course("Operating Systems", 38);
        Course course3 = new Course("Systems Analysis and Design", 52);