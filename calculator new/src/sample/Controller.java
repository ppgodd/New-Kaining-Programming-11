package sample;

import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Controller {
    @FXML
    public TextField display;
    public ListView<display> displayNum = new ListView<>();
    private ArrayList<String> numberlist = new ArrayList<String>();
    private String operation="";
    private String out="";
    private String number="";

    // Methods to add in the numbers to the text field in javafx.

    public void addSeven(MouseEvent mouseEvent) {
        this.number += 7;
        display.setText(number);
    }

    public void addEight(MouseEvent mouseEvent) {
        this.number += 8;
        display.setText(number);
    }

    public void addNine(MouseEvent mouseEvent) {
        this.number += 9;
        display.setText(number);
    }

    public void addFour(MouseEvent mouseEvent) {
        this.number += 4;
        display.setText(number);
    }

    public void addFive(MouseEvent mouseEvent) {
        this.number += 5;
        display.setText(number);
    }

    public void addSix(MouseEvent mouseEvent) {
        this.number += 6;
        display.setText(number);
    }

    public void addOne(MouseEvent mouseEvent) {
        this.number += 1;
        display.setText(number);
    }

    public void addTwo(MouseEvent mouseEvent) {
        this.number += 2;
        display.setText(number);
    }

    public void addThree(MouseEvent mouseEvent) {
        this.number += 3;
        display.setText(number);
    }

    public void addZero(MouseEvent mouseEvent) {
        this.number += 0;
        display.setText(number);

    }

    public void dot(MouseEvent mouseEvent) {
        if(this.number.indexOf('.')==-1){
            this.number += '.';
            display.setText(number);
        }
    }
// Method to get the result and adding it into the text field in javafx.
    public void getResult(MouseEvent mouseEvent) throws IOException {
        numberlist.add(number);

        String number1;
        String number2;

        if(numberlist.size()==1){
            number2 = numberlist.get(numberlist.size()-1);
            number = "";
            display.setText(number2);
            numberlist.clear();
            return ;
        }else {
            number1 = numberlist.get(numberlist.size() - 2);
            number2 = numberlist.get(numberlist.size() - 1);
        }


        int number1int = 0;
        boolean int1 = false;
        int number2int = 0;
        boolean int2 = false;

        double number1double = 0;
        boolean doub1 = false;
        double number2double = 0;
        boolean doub2 = false;

        int resint = 0;
        double resdouble = 0.0 ;

        if (number1.indexOf('.')==-1){
            number1int = Integer.valueOf(number1).intValue();
            int1 = true;
        }else {
            number1double = Double.valueOf(number1).doubleValue();
            doub1 = true;
        }
        if (number2.indexOf('.')==-1){
            number2int = Integer.valueOf(number2).intValue();
            int2 = true;
        }else {
            number2double = Double.valueOf(number2).doubleValue();
            doub2 = true;
        }
        System.out.println(int1);
        System.out.println(int2);
        System.out.println(doub1);
        System.out.println(doub2);

        if (operation=="+"){
            if(int1&&int2){
                //resint = number1int + number2int;
                resdouble =(double) number1int + number2int;
            }else if(int1&&doub2){
                resdouble = number1int + number2double;
            }else if(doub1&&int2){
                resdouble = number1double + number2int;
            }else if(doub1&&doub2){
                resdouble = number1double + number2double;
            }
        }else if (operation=="-"){
            if(int1&&int2){
                //resint = number1int - number2int;
                resdouble =(double) number1int - number2int;
            }else if(int1&&doub2){
                resdouble = number1int - number2double;
            }else if(doub1&&int2){
                resdouble = number1double - number2int;
            }else if(doub1&&doub2){
                resdouble = number1double - number2double;
            }
        }else if (operation=="*"){
            if(int1&&int2){
                //resint = number1int * number2int;
                resdouble =(double) number1int * number2int;
            }else if(int1&&doub2){
                resdouble = number1int * number2double;
            }else if(doub1&&int2){
                resdouble = number1double * number2int;
            }else if(doub1&&doub2){
                resdouble = number1double * number2double;
            }
        }else if (operation=="/"){
            if(int1&&int2){
                //resint = number1int / number2int;
                resdouble =(double) number1int / number2int;
            }else if(int1&&doub2){
                resdouble = number1int / number2double;
            }else if(doub1&&int2){
                resdouble = number1double / number2int;
            }else if(doub1&&doub2){
                resdouble = number1double / number2double;
            }
        }
        if(resint==0&&resdouble==0.0){
            number = "";
            display.setText(String.valueOf(0));
        }else if(resint!=0){
            number = String.valueOf(resint);
            display.setText(String.valueOf(resint));
            display ss = new display(number1,number2,operation,resint);
            ss.writeToDisplay();
        }else {
            number = String.valueOf(resdouble);
            display.setText(String.valueOf(resdouble));
            display ss = new display(number1,number2,operation,resdouble);
            ss.writeToDisplay();
        }





    }
// Method to delete the number at the end from the text field.
    public void delete(MouseEvent mouseEvent) {
        number = number.substring(0,number.length()-1);
        display.setText(number);
    }
    // Methods to add operators into the field.
    public void plus(MouseEvent mouseEvent) {
        numberlist.add(number);
        number="";
        operation = "+";
    }

    public void minus(MouseEvent mouseEvent) {
        numberlist.add(number);
        number="";
        operation = "-";
    }

    public void multiply(MouseEvent mouseEvent) {
        numberlist.add(number);
        number="";
        operation = "*";
    }

    public void divide(MouseEvent mouseEvent) {
        numberlist.add(number);
        number="";
        operation = "/";
    }
// Method to clear the text field.
    public void clear(MouseEvent mouseEvent) {
        out="";
        number="";
        numberlist.clear();
        operation="";
        display.setText("0");
    }




}
