package ru.mera.chumakova.task4;

public class Artist extends Person {

    private String style;

    public Artist(String name, String surname, String style) {
        super(name, surname);
        this.style = style;
    }

    public String getStyle() {
        return style;
    }
}
