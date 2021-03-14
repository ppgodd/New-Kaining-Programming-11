public class Main {
    public static void main(String[] args) {

        School school = new School("kcl");
        for (int i = 0; i < 10; i++) {
            school.getAllStudents().add(new Student("stu"+(i+1),"--"));
        }
        for (int i = 0; i < 3; i++) {
            school.getAllTeachers().add(new Teacher("tea"+(i+1),"--","course"+i));
        }
        System.out.println(school.toString());
        for (int i = 0; i < 2; i++) {
            school.getAllStudents().remove(i);
        }
        for (int i = 0; i < 1; i++) {
            school.getAllTeachers().remove(i);
        }
        System.out.println(school.toString());

    }
}
