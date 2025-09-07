package design_pattern.Prototype;

public class IntelligentStudent extends Student {
    private int Iq;

    public int getIq() {
        return Iq;
    }

    public void setIq(int iq) {
        Iq = iq;
    }

    public IntelligentStudent(IntelligentStudent student) {
        super(student);
        this.Iq = student.Iq;
    }

    public IntelligentStudent(){

    }

    @Override
    public Student clone() {
        return new IntelligentStudent(this);
    }
}
