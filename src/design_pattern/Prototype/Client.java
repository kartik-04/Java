package design_pattern.Prototype;

public class Client {
    private static void fillRegistery(StudentRegistery studentRegistery) {
        Student aug25EvePrototype =  new Student();
        aug25EvePrototype.setBatch("Aug25Eve");
        aug25EvePrototype.setAverageBatchPsp(70);
        aug25EvePrototype.setUniversityName("Scaler");
        studentRegistery.register("Aug25LLDEve", aug25EvePrototype);

        Student sep25EvePrototype =  new Student();
        sep25EvePrototype.setBatch("Sep25Eve");
        sep25EvePrototype.setAverageBatchPsp(76);
        sep25EvePrototype.setUniversityName("Scaler");
        studentRegistery.register("Sep25LLDEve", sep25EvePrototype);

        IntelligentStudent intelligentStudent = new IntelligentStudent();
        intelligentStudent.setBatch("Intelligent");
        intelligentStudent.setAverageBatchPsp(90);
        intelligentStudent.setUniversityName("Scaler");
        intelligentStudent.setIq(110);
        studentRegistery.register("Sep25LLDEveIS", intelligentStudent);
    }
    public static void main(String[] args) {
        StudentRegistery studentRegistery = new StudentRegistery();
        Client.fillRegistery(studentRegistery);

        Student kartik = studentRegistery.get("Aug25LLDEve").clone();
        kartik.setName("Kartik");
        kartik.setAge(26);

        Student smartKartik = studentRegistery.get("Sep25LLDEveIS").clone();
        smartKartik.setName("SmartKartik");
        smartKartik.setAge(26);
        System.out.println("Debug");
    }
}
