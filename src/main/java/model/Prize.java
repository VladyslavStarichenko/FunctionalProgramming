package model;

import java.util.List;

public class Prize {
    private int year;
    private String category;
    private int share;
    private String motivation;
    private String overallMotivation;
    private List<Affiliation> affiliations;

    @Override
    public String toString() {
        return "Prize{" +
                "year=" + year +
                ", category='" + category + '\'' +
                ", share=" + share +
                ", motivation='" + motivation + '\'' +
                ", overallMotivation='" + overallMotivation + '\'' +
                ", affiliations=" + affiliations +
                '}';
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getShare() {
        return share;
    }

    public void setShare(int share) {
        this.share = share;
    }

    public String getMotivation() {
        return motivation;
    }

    public void setMotivation(String motivation) {
        this.motivation = motivation;
    }

    public String getOverallMotivation() {
        return overallMotivation;
    }

    public void setOverallMotivation(String overallMotivation) {
        this.overallMotivation = overallMotivation;
    }

    public List<Affiliation> getAffiliations() {
        return affiliations;
    }

    public void setAffiliations(List<Affiliation> affiliations) {
        this.affiliations = affiliations;
    }
}
