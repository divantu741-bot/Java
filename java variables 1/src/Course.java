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