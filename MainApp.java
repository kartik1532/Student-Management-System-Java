import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentOperations op = new StudentOperations();

        while (true) {
            System.out.println("\n--- STUDENT MANAGEMENT SYSTEM ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Course: ");
                    String course = sc.nextLine();

                    op.addStudent(new Student(id, name, age, course));
                    break;

                case 2:
                    op.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    op.searchStudent(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    int uid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("New Name: ");
                    String uname = sc.nextLine();
                    System.out.print("New Age: ");
                    int uage = sc.nextInt();
                    sc.nextLine();
                    System.out.print("New Course: ");
                    String ucourse = sc.nextLine();

                    op.updateStudent(uid, uname, uage, ucourse);
                    break;

                case 5:
                    System.out.print("Enter ID: ");
                    op.deleteStudent(sc.nextInt());
                    break;

                case 6:
                    System.out.println("Application Closed");
                    System.exit(0);

                    
                    
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}

