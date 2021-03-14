public class Student {
    private String firstName;
    private String lastName;
    private int score;
    static int number = 1;
    private int randomNum;


    Student(){
        firstName = "";
        lastName = "";
        score = 100;
        randomNum = number;
        number++;
    }
    Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.score =score;

        this.randomNum =number;
        number++;//constructor 只会运行一个  比如你new一个Student（）或者Student（firstName，lastname）只会运行其中一个constructor
        //而且randomNum应该不需要，number就可以了


    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public void maxScore(){
        if(score > 100){
            score = 100;
        }
    }
    public void minScore(){
        if(score < 0) {
            score = 0;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", score=" + score +
                ", randomNum=" + randomNum +
                '}';
    }
}
