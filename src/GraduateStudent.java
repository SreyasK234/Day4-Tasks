public class GraduateStudent extends absStudent {
    public GraduateStudent(String StudentID) {
        super(StudentID);
    }

    @Override
    public String getStatus() {
        return "Graduate Student";
    }
}
