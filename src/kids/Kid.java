package kids;

import enums.Location;
import interfaces.MemoryManage;

import java.util.Arrays;
import java.util.Objects;

public abstract class Kid implements MemoryManage {
    private String name;
    private Location location;
    private String[] memory;
    private String remembrance;

    public Kid(String name, Location location){
        this.name = name;
        this.location = location;
        this.memory = new String[MEMORY_SIZE];
    }

    public String getName() {
        return name;
    }
    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
        System.out.println(getName() + " оказался в " + location.getLocation());
    }

    public void setRemembrance(String remembrance) {
        this.remembrance = remembrance;
    }

    public String getRemembrance() {
        return remembrance;
    }

    @Override
    public String[] getAllMemory() {
        return memory;
    }

    @Override
    public void addInMemory(String remembrance)  {
        boolean addIn = false;
        for(int i = 0; i<MEMORY_SIZE; i++) {
            if (memory[i] == null) {
                memory[i] = remembrance;
                addIn = true;
                System.out.println("Добавлено новое воспоминание: " + remembrance);
                break;
            }
        }
        if (addIn = false){
            System.out.println("Память заполнена");
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kid kid = (Kid) o;
        return name.equals(kid.name) && location == kid.location && Arrays.equals(memory, kid.memory) && remembrance.equals(kid.remembrance);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, location, remembrance);
        result = 31 * result + Arrays.hashCode(memory);
        return result;
    }

    @Override
    public String toString() {
        return "Kid{" +
                "name='" + name + '\'' +
                ", location=" + location +
                ", memory=" + Arrays.toString(memory) +
                '}';
    }
}
