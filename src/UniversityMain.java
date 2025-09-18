import java.util.ArrayList;
import java.util.List;

public class UniversityMain {
    public static void main(String[] args) {
        List<absStudent> students = new ArrayList<absStudent>();

        GraduateStudent g1 = new GraduateStudent("G2001");
        GraduateStudent g2 = new GraduateStudent("G2002");
        g1.setGpa(3.5);
        g2.setGpa(2.9);

        UnderGraduateStudent u1 = new UnderGraduateStudent("U2001");
        UnderGraduateStudent u2 = new UnderGraduateStudent("U2002");
        u1.setGpa(3.9);
        u2.setGpa(1.9);

        students.add(g1);
        students.add(g2);
        students.add(u1);
        students.add(u2);

        for(absStudent s: students){
            s.displayProfile();
            System.out.println("Status: " + s.getStatus());
        }
    }
}
