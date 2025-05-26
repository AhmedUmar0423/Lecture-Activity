import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s1=new Student();
        Student s2=new Student();

        System.out.println("Student ID : ");
        s1.setStdId(sc.nextInt());
        sc.nextLine();
        System.out.println("Student Name : ");
        s1.setName(sc.nextLine());
        System.out.println("Batch ID : ");
        s1.setBatchId(sc.nextLine());

        System.out.println("Student ID : ");
        s2.setStdId(sc.nextInt());
        sc.nextLine();
        System.out.println("Student Name : ");
        s2.setName(sc.nextLine());
        System.out.println("Batch ID : ");
        s2.setBatchId(sc.nextLine());

        s1.displaydetails();
        System.out.println();
        s2.displaydetails();

    }
}
