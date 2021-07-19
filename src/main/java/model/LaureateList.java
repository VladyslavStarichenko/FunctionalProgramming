package model;

import java.util.List;

public class LaureateList{
    private List<Laureate> laureates;

    public List<Laureate> getLaureates() {
        return laureates;
    }

    public void setLaureates(List<Laureate> laureates) {
        this.laureates = laureates;
    }

    @Override
    public String toString() {
        return "LaureateList{" +
                "laureates=" + laureates +
                '}';
    }
}
