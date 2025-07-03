package HW6_Midterm_Assessment;

import java.util.Objects;

public class Laptop {
    private int ram; // ОЗУ
    private int hdd; // Объем ЖД
    private String os; // Операционная система
    private String color; // Цвет

    public Laptop(int ram, int hdd, String os, String color) {
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "module6.Laptop{" +
                "RAM=" + ram + " GB" +
                ", HDD=" + hdd + " GB" +
                ", OS='" + os + '\'' +
                ", Color='" + color + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(ram, hdd, os, color);
    }
}
