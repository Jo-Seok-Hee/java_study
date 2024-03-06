package ref;

public class Method2 {

    public static void main(String[] args) {

        Student student1 = createStudent("석희",20,100);

        Student student2 = createStudent("윤호",30,50);


        printStudent(student1);
        printStudent(student2);

    }
    public static Student createStudent(String name, int age, int grade) {

        Student student = new Student();

        student.name = name;
        student.age = age;
        student.grade = grade;

        return student;
    }

    public static void printStudent(Student student) {

        System.out.println("이름 : "+student.name+", 나이 : "+student.age+", 성적 : "+student.grade);
    }


}
