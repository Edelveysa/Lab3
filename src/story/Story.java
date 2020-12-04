package story;

import enums.Location;
import kids.*;

public class Story {

    public void start(){
        Mechanic vintik = new Mechanic("Винтик", Location.FLOWERTOWN);
        Mechanic shpuntik = new Mechanic("Шпунтик", Location.FLOWERTOWN);
        Citizen citizen = new Citizen();
        Znayka znayka = new Znayka();
        Balloon balloon = new Balloon();
        citizen.addInMemory(balloon.getRemembrance());
        vintik.setLocation(Location.GREENTOWN);
        shpuntik.setLocation(Location.GREENTOWN);
        Bublick bublick = new Bublick();
        Kid[] passengers = {vintik, shpuntik};
        bublick.driveWith(passengers);
        citizen.addInMemory(vintik.getRemembrance());
        citizen.addInMemory(shpuntik.getRemembrance());
        String[] memoryForFind = {balloon.getRemembrance(), vintik.getRemembrance(), shpuntik.getRemembrance()};
        znayka.find(citizen, memoryForFind);

    }

    static public int random(){
        return (int)(Math.round(Math.random()*100));
    }




}
