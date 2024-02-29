import java.time.LocalDate;
import java.time.Period;

public class Student implements Study{
    private String name;
    private String surName;
    private char gender;
    private LocalDate dateOfStart;
    private EducationCenter educationCenter;

    public Student(String name, String surName, char gender, LocalDate dateOfStart, EducationCenter educationCenter){
        this.name=name;
        this.surName=surName;
        this.gender=gender;
        this.dateOfStart=dateOfStart;
        this.educationCenter=educationCenter;
    }

    @Override
    public void getStudentsEducationCenter() {
        System.out.println(name+" "+ surName+" поступил в "+dateOfStart+" числа в "+educationCenter.getName()+".");
    }

    @Override
    public void getStudentsStudyingYear() {
        LocalDate currentTime = LocalDate.now();
        System.out.println(name+" учится уже "+ Period.between(dateOfStart,currentTime).getYears()+"-ый год.");

    }
}
