package kids;

import enums.Location;
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

    public void find(Citizen citizen, String[] memory){
        find();
        boolean[] memoryFind = new boolean[3];
        for(int i = 0; i<memory.length; i++){
            memoryFind[i] = hasRemembrance(citizen.getAllMemory(), memory[i]);
        }
        findResult(memoryFind);
    }

    boolean hasRemembrance(String[] args, String s) {
        boolean tmp = false;
        for (int i = 0; i < args.length; i++) {
            if (args[i] == s) {
                 tmp = true;
                 break;
            } else {
                 tmp = false;
            }

        }
        return tmp;
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
