public abstract class absStudent {
    private final String studentID;
    private double gpa;
    private static int studentCount = 0;

    public absStudent(String studentID) {
        if(studentID == null || studentID.trim().isEmpty()){
            throw new IllegalArgumentException("Student ID cannot be null or empty");
        }
        this.studentID = studentID;
        studentCount++;
    }
    public void setGpa(double gpa) {
        if(gpa < 0 || gpa > 4){
            System.out.println("Invalid GPA: " + gpa + "must be between 0 and 4");
            return;
        }
        this.gpa = gpa;
    }
    public double getGPA(){
        return gpa;
    }
    public String getStudentID(){
        return studentID;
    }
    public static int getStudentCount(){
        return studentCount;
    }
    public void displayProfile(){
        System.out.println("Student ID: " + studentID);
        System.out.println("GPA: " + gpa);
    }
    public abstract String getStatus();
}
