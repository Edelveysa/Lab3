package story;

import enums.Location;

import java.util.Objects;

public class Balloon {
    private String remembrance;

    public Balloon() {
        this.remembrance = "Шар разбился в " + Location.GREENTOWN.getLocation();
        System.out.println(remembrance);
    }


    public String getRemembrance(){
        return remembrance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Balloon balloon = (Balloon) o;
        return Objects.equals(remembrance, balloon.remembrance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(remembrance);
    }

    @Override
    public String toString() {
        return "Balloon{" +
                "remembrance='" + remembrance + '\'' +
                '}';
    }
}
