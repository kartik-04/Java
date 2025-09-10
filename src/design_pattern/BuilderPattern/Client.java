package design_pattern.BuilderPattern;

public class Client {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setName("Kartik");
        builder.setAge(26);
        builder.setPsp(80);
        builder.setPhoneNumber("+91123456789");
        builder.setBatch("MWF");
        builder.setUniversityName("Scaler");
        builder.setId(20);
        builder.setGradeYear(2022);

        Student student = new Student(builder);
        System.out.println("Debug");
    }
}
