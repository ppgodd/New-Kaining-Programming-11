package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class friend {

    public String name;
    private int phoneNumber;
    private String groupN;

    friend(String Tony, int num, String Name){

        name = Tony;
        phoneNumber = num;
        groupN = Name;
    }

    public void writeToFile() throws IOException{

        FileWriter fw = new FileWriter(groupN, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(name+",\r");
        bw.write(Integer.toString(phoneNumber) + "\r");
        bw.write(";\r");
        bw.close();
    }

    public String toString(){
        return "Name:" + name + "\tPhone Number:" + phoneNumber;
    }

    public int getPhoneNumber (){return phoneNumber;}


}
