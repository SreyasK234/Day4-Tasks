public class MainStudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("S2001");
        Student s2 = new Student("S2002");
        Student s3 = new Student("S2003");

        s1.setGpa(3.5);
        s2.setGpa(4.2);
        s3.setGpa(2.7);

        s1.displayProfile();
        s2.displayProfile();
        s3.displayProfile();

        System.out.println("Total Student Count: " + Student.getStudentCount());
    }
}
