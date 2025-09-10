package design_pattern.BuilderPattern;

public class Student {
    private String name;
    private int age;
    private double psp;
    private String universityName;
    private String batch;
    private long id;
    private int gradeYear;
    private String phoneNumber;


    public static Builder builder(){
        return new Builder();
    }

    public Student(Builder builder) {
        if(builder.getAge() < 20){
            throw new IllegalArgumentException("Age must be greater than 20");
        }
        if(builder.getGradeYear() < 2020){
            throw new IllegalArgumentException("Grade year must be greater than 2020");
        }

        this.name = builder.getName();
        this.age = builder.getAge();
        this.universityName = builder.getUniversityName();
        this.batch = builder.getBatch();
        this.phoneNumber = builder.getPhoneNumber();
        this.id = builder.getId();
        this.gradeYear = builder.getGradeYear();
        this.psp = builder.getPsp();
    }
}
