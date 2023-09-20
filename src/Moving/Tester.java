package Moving;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args){
        Flying something = new Duck();
        ArrayList<Flying> listOfFlyingThings= new ArrayList<>();
        listOfFlyingThings.add(something);

        for(Flying flyingThing : listOfFlyingThings){
            flyingThing.takeOff();
        }
    }
}
