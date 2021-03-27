package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.ArrayList;

public class Controller {
    public TextField getName;
    public TextField getNum;
    public ListView<friend> friendList = new ListView<>();
    public Label lbName;
    public Label lbNum;
    public TextField groupName;

    public void addFriend(ActionEvent actionEvent) {
        friendList.getItems().add(new friend(getName.getText(),Integer.parseInt(getNum.getText()), groupName.getText()+".txt"));
        getName.clear();
        getNum.clear();
    }

    public void displayFriend(MouseEvent mouseEvent) {
        friend temp;
        temp = friendList.getSelectionModel().getSelectedItem();
        lbName.setText(temp.name);
        lbNum.setText(Integer.toString(temp.getPhoneNumber()));
    }
    public void saveFriend(ActionEvent mouseEvent) throws IOException {
        ObservableList<friend> myList = friendList.getItems();
        for(friend f : myList){
            f.writeToFile();
        }
        friendList.getItems().clear();
    }

    public void deleteFriend(ActionEvent actionEvent) {
        friendList.getItems().remove(friendList.getSelectionModel().getSelectedIndex());

    }
    public void loadFriend(ActionEvent actionEvent) throws IOException {
        friendList.getItems().clear();
        ArrayList<friend> friends = CreateFriend.createAllFriends(groupName.getText()+".txt");
        for(friend f : friends){
            friendList.getItems().add(f);
        }
        friends.clear();
    }
}
