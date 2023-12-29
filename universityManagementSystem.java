import java.util.ArrayList;

class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private ArrayList<Course> courses;

    public Student(int studentId, String firstName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courses = new ArrayList<>();
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void enroll(Course course) {
        this.courses.add(course);
    }
}

class Course {
    private int courseId;
    private String courseName;
    private Instructor instructor;

    public Course(int courseId, String courseName, Instructor instructor) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }
}

class Instructor {
    private int instructorId;
    private String firstName;
    private String lastName;

    public Instructor(int instructorId, String firstName, String lastName) {
        this.instructorId = instructorId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public static void main(String[] args) {
        Instructor instructor1 = new Instructor(1, "John", "Doe");
        Instructor instructor2 = new Instructor(2, "Jane", "Doe");
        Instructor instructor3 = new Instructor(3, "Jack", "Doe");

        Course course1 = new Course(1, "Java", instructor1);
        Course course2 = new Course(2, "Python", instructor2);
        Course course3 = new Course(3, "C++", instructor3);

        Student student1 = new Student(1, "John", "Doe");
        Student student2 = new Student(2, "Jane", "Doe");
        Student student3 = new Student(3, "Jack", "Doe");

        student1.enroll(course1);
        student1.enroll(course2);
        student1.enroll(course3);

        student2.enroll(course1);
        student2.enroll(course2);

        student3.enroll(course1);

        System.out.println("Student 1: " + student1.getFirstName() + " " + student1.getLastName());
        System.out.println("Courses: ");
        for (Course course : student1.getCourses()) {
            System.out.println(course.getCourseName() + " " + course.getInstructor().getFirstName() + " " + course.getInstructor().getLastName());
        }

        System.out.println("Student 2: " + student2.getFirstName() + " " + student2.getLastName());
        System.out.println("Courses: ");
        for (Course course : student2.getCourses()) {
            System.out.println(course.getCourseName() + " " + course.getInstructor().getFirstName() + " " + course.getInstructor().getLastName());
        }

        System.out.println("Student 3: " + student3.getFirstName() + " " + student3.getLastName());
        System.out.println("Courses: ");
        for (Course course : student3.getCourses()) {
            System.out.println(course.getCourseName() + " " + course.getInstructor().getFirstName() + " " + course.getInstructor().getLastName());
        }
    }
}
