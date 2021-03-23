package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

import java.util.Random;

public class Controller {
    public TextField textBetAmount;
    public Button btnGetStart;
    public Label moneyLeft;
    public Label getFirstNum;
    public Button getHigh;
    public Button getLow;
    public Label getSecNum;
    public TextArea getResult;

    public void bottomHigh(ActionEvent actionEvent) {
        Random rand = new Random();
        int secdic = rand.nextInt(5) + 1;
        this.getSecNum.setText(String.valueOf(secdic));
        String firdice = this.getFirstNum.getText();
        int firstdice = Integer.valueOf(firdice);
        int amount = Integer.valueOf(this.textBetAmount.getText());
        int amountnumber = Integer.valueOf(this.moneyLeft.getText());
        if (secdic > firstdice) {
            this.moneyLeft.setText(String.valueOf(amountnumber + amount));
            this.getResult.appendText("You Win! you get " + this.textBetAmount.getText() + "\n");
        } else {
            this.moneyLeft.setText(String.valueOf(amountnumber - amount));
            this.getResult.appendText("You Lose! you lose " + this.textBetAmount.getText() + "\n");
        }

        this.btnGetStart.setDisable(true);
        this.getHigh.setDisable(true);
        this.getLow.setDisable(true);
    }

    public void bottomLow(ActionEvent actionEvent) {
        Random rand = new Random();
        int secdic = rand.nextInt(5) + 1;
        this.getSecNum.setText(String.valueOf(secdic));
        String firdice = this.getFirstNum.getText();
        int firstdice = Integer.valueOf(firdice);
        int amount = Integer.valueOf(this.textBetAmount.getText());
        int amountnumber = Integer.valueOf(this.moneyLeft.getText());
        if (secdic < firstdice) {
            this.moneyLeft.setText(String.valueOf(amountnumber + amount));
            this.getResult.appendText("You Win! you get " + this.textBetAmount.getText() + "\n");
        } else {
            this.moneyLeft.setText(String.valueOf(amountnumber - amount));
            this.getResult.appendText("You Lose! you lose " + this.textBetAmount.getText() + "\n");
        }

        this.btnGetStart.setDisable(true);
        this.getHigh.setDisable(true);
        this.getLow.setDisable(true);
    }


        @FXML
        public void bottomStart(ActionEvent actionEvent) {
            Random rand = new Random();
            int a = rand.nextInt(5) + 1;
            this.getFirstNum.setText(String.valueOf(a));
            this.getHigh.setDisable(false);
            this.getLow.setDisable(false);
        }




        @FXML
        public void bottomAmount(KeyEvent keyEvent) {
            this.btnGetStart.setDisable(false);
        }
    }

