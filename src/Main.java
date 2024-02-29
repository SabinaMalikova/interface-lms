import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        EducationCenter school = new School();
        school.setName("Школа №99");
        school.setLocatedCountry("Kyrgyzstan");
        school.setFoundationYear(LocalDate.of(2002,12,12));
        EducationCenter college = new College();
        college.setName("Колледж KSTC");
        college.setLocatedCountry("Kyrgyzstan");
        college.setFoundationYear(LocalDate.of(1986,11,11));
        EducationCenter university = new University();
        university.setName("Университет AUCA");
        university.setLocatedCountry("Kyrgyzstan");
        university.setFoundationYear(LocalDate.of(2001,9,9));

        Student student1 = new Student("Nurkyz","Zikirdinova",'f',LocalDate.of(2019,1,8),college);
        Student student2 = new Student("Sabina","Malikova",'f',LocalDate.of(2022,9,1),university);
        Student student3 = new Student("Bektur","Duisheev",'M',LocalDate.of(2015,8,8),school);
        Student student4 = new Student("Nurmuhammed","Alishev",'M',LocalDate.of(2022,2,7),college);
        Student student5 = new Student("Aiza","Toktalieva",'F',LocalDate.of(2019,6,6),school);
        Student student6 = new Student("Sezim","Nurdinbekova",'F',LocalDate.of(2018,5,5),college);
        Student student7 = new Student("Artem","Karaev",'M',LocalDate.of(2023,1,1),university);
        Student student8 = new Student("Aidar","Asanov",'M',LocalDate.of(2019,2,15),school);
        Student student9 = new Student("Ulan","Asanov",'M',LocalDate.of(2017,1,17),school);
        Student student10 = new Student("Beka","Nurlanov",'M',LocalDate.of(2018,1,1),college);

        EducationCenter[] educationCenters = {school,college,university};
        Student[] students = {student1,student2,student3,student4,student5,student6,student7,student8,student9,student10};

        for (EducationCenter educationCenter:educationCenters){
            educationCenter.getInfo();
        }

        System.out.println();

        for (Student student:students){
            student.getStudentsEducationCenter();
            student.getStudentsStudyingYear();
            System.out.println();
        }
    }
}