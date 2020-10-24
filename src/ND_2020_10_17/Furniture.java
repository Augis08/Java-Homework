package ND_2020_10_17;

public class Furniture<hight> {

    String Name;
    int width;
    int hight;
    int debth;

    public Furniture(String name, int w, int h, int d) {
        Name = name;
        width = w;
        hight = h;
        debth = d;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "Name='" + Name + '\'' +
                ", " + width +
                "x" + hight +
                "x" + debth +
                '}';
    }
}