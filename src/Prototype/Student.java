package Prototype;

public class Student implements Prototype<Student> {

    private int age;
    private String name;
    private String batch;
    private double averageBatchPsp;
    private double studentPsp;

    public Student(){

    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getBatch() {
        return batch;
    }

    public double getAverageBatchPsp() {
        return averageBatchPsp;
    }

    public double getStudentPsp() {
        return studentPsp;
    }

    public Student(Student student){
        this.age = student.age;
        this.name = student.name;
        this.batch = student.batch;
        this.averageBatchPsp = student.averageBatchPsp;
        this.studentPsp = student.studentPsp;
    }
    @Override
    public Student clone() {
        return new Student(this);
    }
}
