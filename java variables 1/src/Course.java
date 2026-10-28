public class Course {
    private String courseName;
    private int studentsRegistered;
    private static int totalStudents = 0;

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
}

    class UniversityEnrolment {
        public static void main(String[] args) {
            Course course1 = new Course("Object-Oriented Programming", 45);
            Course course2 = new Course("Operating Systems", 38);
            Course course3 = new Course("Systems Analysis and Design", 52);
            System.out.println("===== INDIVIDUAL COURSE STATISTICS =====");
            course1.displayCourseStatistics();
            course2.displayCourseStatistics();
            course3.displayCourseStatistics();

            int[] oopAttendance = {40, 42, 38, 44, 41};
            double avgAttendance = course1.calculateAverageAttendance(oopAttendance);
            double passRate = course1.calculatePassPercentage(36);

            System.out.println("\n===== TEMPORARY CALCULATIONS (" + course1.getCourseName() + ") =====");
            System.out.printf("Average attendance: %.2f students per session%n", avgAttendance);
            System.out.printf("Pass percentage   : %.2f%%%n", passRate);

            System.out.println("\n===== UNIVERSITY-WIDE STATISTICS =====");
            System.out.println("Total students (all courses): " + Course.getTotalStudents());

            course2.registerStudents(5);

            System.out.println("\n===== AFTER REGISTERING 5 MORE IN OPERATING SYSTEMS =====");
            course1.displayCourseStatistics();
            course2.displayCourseStatistics();
            course3.displayCourseStatistics();
            System.out.println("Total students (all courses): " + Course.getTotalStudents());
        }
    }

