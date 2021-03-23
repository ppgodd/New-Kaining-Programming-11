package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class Controller {
    public TextField getName;
    public TextField getNum;
    public ListView<friend> friendList = new ListView<>();
    public Label lbName;
    public Label lbNum;

    public void addFriend(ActionEvent actionEvent) {
        friend temp = new friend(getName.getText(),Integer.parseInt(getNum.getText()));
        friendList.getItems().add(temp);
        getName.clear();
        getNum.clear();
    }

    public void displayFriend(MouseEvent mouseEvent) {
        friend temp;
        temp = friendList.getSelectionModel().getSelectedItem();
        lbName.setText(temp.name);
        lbNum.setText(Integer.toString(temp.getPhoneNumber()));
    }

    public void deleteFriend(ActionEvent actionEvent) {
        friendList.getItems().remove(friendList.getSelectionModel().getSelectedIndex());

    }
}
