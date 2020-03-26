
public class Application {
    public static void main(String[] args) {

        Student student = new Student();
        Student firstStudent = new Student("Danylo",30);
        Student secondStudent = new Student("Ivan",40);
        Student thirdStudent = new Student("Roman",35);

        System.out.println("Average rating : "+student.averageRating(firstStudent,secondStudent,thirdStudent));

        System.out.println("Compare two students :");
        System.out.println(student.betterStudent(firstStudent,secondStudent));

        System.out.println("Change rating : ");
        System.out.println("Rating before change : "+firstStudent.getRating());
        student.changeRating(firstStudent,50);
        System.out.println("Rating after change : "+firstStudent.getRating());

        System.out.println("Average rating after change rating of student : "
                + student.averageRating(firstStudent,secondStudent,thirdStudent));
    }
}
