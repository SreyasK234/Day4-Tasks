public class UnderGraduateStudent extends absStudent{
    public UnderGraduateStudent(String studentID){
        super(studentID);
    }

    @Override
    public String getStatus(){
        return "Undergraduate Student";
    }
}
