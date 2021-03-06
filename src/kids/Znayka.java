package kids;

import enums.Location;
import events.EventLibrary;
import interfaces.AbleToFind;
import java.util.Arrays;
import java.util.Objects;

public final class Znayka extends Kid implements AbleToFind {

    public Znayka() {
        super("Знайка", Location.FLOWERTOWN);
    }

    @Override
    public void find() {
        System.out.println(getName() + " решил найти своих улетевших товарищей");
        setLocation(Location.ZMEEVKA);
    }

    public void findResult(boolean[] memoryFind){
        int temp = 0;
        for (int i = 0; i<memoryFind.length; i++){
            if(memoryFind[i] == true){
                temp++;
            }
        }
        System.out.println(temp == 3 ? "Поиски закончились успехом!" : "...мы их не нашли...");
    }

    public void find(Citizen citizen, EventLibrary eventLibrary){
        find();
        boolean[] memoryFind = new boolean[3];
        int j = 0;
        for (int i = 0; i<citizen.getAllMemory().length; i++){
            if(citizen.getAllMemory()[i] != null && eventLibrary.checkInEvents(citizen.getAllMemory()[i])){
                memoryFind[j] = true;
                j++;
            }
        }


        findResult(memoryFind);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Znayka z = (Znayka) o;
        return getName().equals(z.getName()) &&
                getLocation() == z.getLocation();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLocation());
    }

    @Override
    public String toString() {
        return "Znayka{" +
                "name='" + getName() + '\'' +
                ", location=" + getLocation() +
                ", memory=" + Arrays.toString(getAllMemory()) +
                '}';
    }
}
