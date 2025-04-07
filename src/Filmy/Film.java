package Filmy;

public class Film {
    String name;
    double length;
    int rating;
    int yearOfRelease;

    public Film() {

    }

    public Film(String name, int length, int rating, int yearOfRelease) { //AUTOMATICKY: ALT+INSERT
        this.name = name;
        this.length = length;
        this.rating = rating;
        this.yearOfRelease = yearOfRelease;
    }

    private String formatLength() {
        return "";
    }

    public void printInfo() {
        System.out.printf("%-20s%-10s%-15s%-16d\n", name, formatLength(), "★".repeat(rating), yearOfRelease);
    }
}