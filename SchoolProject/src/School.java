import java.util.ArrayList;

public class School {
    private String name;
    private ArrayList<Teacher> teachers = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();

    public School(){
        teachers = new ArrayList<Teacher>();
        students = new ArrayList<Student>();
    }

    public School(String name)
    {
        this();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getAllStudents() {
        return students;
    }

    public ArrayList<Teacher> getAllTeachers() {
        return teachers;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", teachers=" + teachers +
                ", students=" + students +
                '}';
    }
}
