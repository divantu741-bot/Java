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