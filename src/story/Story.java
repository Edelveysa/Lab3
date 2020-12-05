package story;

import enums.Location;
import events.EventLibrary;

import kids.*;

import java.util.Arrays;


public class Story {

    public void start(){
        Mechanic vintik = new Mechanic("Винтик", Location.FLOWERTOWN);
        Mechanic shpuntik = new Mechanic("Шпунтик", Location.FLOWERTOWN);
        Citizen citizen = new Citizen();
        Znayka znayka = new Znayka();
        Bublick bublick = new Bublick();
        Kid[] witnesses = {vintik, shpuntik, citizen, bublick, znayka};
        EventLibrary eventLibrary = new EventLibrary(witnesses);
        Balloon balloon = new Balloon();
        eventLibrary.addEvent(balloon.getRemembrance());
        vintik.setLocation(Location.GREENTOWN);
        shpuntik.setLocation(Location.GREENTOWN);
        Kid[] passengers = {vintik, shpuntik};
        bublick.driveWith(passengers, eventLibrary);
        znayka.find(citizen, eventLibrary);

    }

    public static int random(){
        return (int)(Math.round(Math.random()*100));
    }


}
