package sample;

public class friend {

    public String name;
    private int phoneNumber;

    friend(String Tony, int num){

        name = Tony;
        phoneNumber = num;
    }


    public void addPhoneNumber(int num) {
        phoneNumber = num;
    }
    public int getPhoneNumber (){return phoneNumber;}
    
    public String toString(){return name;}


}
