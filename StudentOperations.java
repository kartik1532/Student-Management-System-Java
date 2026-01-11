import java.util.ArrayList;

public class StudentOperations {

    ArrayList<Student> list = new ArrayList<>();

    void addStudent(Student s) {
        list.add(s);
        System.out.println("Student Added Successfully");
    }

    void viewStudents() {
        if (list.isEmpty()) {
            System.out.println("No Records Found");
        } else {
            for (Student s : list) {
                System.out.println(s);
            }
        }
    }

    void searchStudent(int id) {
        for (Student s : list) {
            if (s.id == id) {
                System.out.println(s);
                return;
            }
        }
        System.out.println("Student Not Found");
    }

    void updateStudent(int id, String name, int age, String course) {
        for (Student s : list) {
            if (s.id == id) {
                s.name = name;
                s.age = age;
                s.course = course;
                System.out.println("Student Updated Successfully");
                return;
            }
        }
        System.out.println("Student Not Found");
    }

    void deleteStudent(int id) {
        for (Student s : list) {
            if (s.id == id) {
                list.remove(s);
                System.out.println("Student Deleted Successfully");
                return;
            }
        }
        System.out.println("Student Not Found");
    }
}
