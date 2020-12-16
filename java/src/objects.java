class student {
    public void nameofStudent(String name) {
        System.out.println("name is "+ name);
    }
    public void grade(double val) {
        System.out.println("grade is " + val);
    }
}
public class objects {
    public static void main (String args[]) {
        student student1 = new student();
        student1.nameofStudent("abdullah");
        student1.grade(4.56);
    }
}
