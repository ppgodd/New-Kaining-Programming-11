package sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CreateFriend {
    private static String name;
    private static int phoneNumber;
    private static FileReader fr;
    private static BufferedReader br;
    private static ArrayList<friend> friends = new ArrayList<>();

    public static ArrayList createAllFriends(String fileName) throws IOException {
        fr = new FileReader(fileName);
        br = new BufferedReader(fr);
        String line;
        String friendString = "";
        while((line = br.readLine()) != null){
            if(!line.equals(";")){
                friendString += line;
            }else{
                parsefriend(friendString, fileName);
                friendString = "";

            }
        }
        return friends;
    }
    private static void parsefriend(String string, String a){
        int pos = 0;
        String name = "";
        int phoneNumber = 0;
        for(int i = 0 ; i <string.length() ; i ++){
            if(string.substring(i , i+1).equals(",")){
                pos = i;
                name = string.substring(0,pos);
                phoneNumber = Integer.parseInt(string.substring(pos+1));
            }
        }
        friends.add(new friend(name,phoneNumber,a));

    }
}
