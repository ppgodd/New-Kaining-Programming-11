package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class display {
    private String number1;
    private String number2;
    private String operater;
    public double answer;
// creating the display for the two numbers that are being calculated, the operator, and the answer.
    display(String number1, String number2, String operator ,double answer){
        this.number1 = number1;
        this.number2 = number2;
        this.operater = operator;
        this.answer = answer;
    }
// Create a new txt file and write the display into the calculatorAnswer.txt file.
    public void writeToDisplay() throws IOException {

        FileWriter fw = new FileWriter("calculatorAnswer.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(number1+ " " + operater + " " + number2 + " = " + answer + ",\r");
        bw.close();
    }


}
