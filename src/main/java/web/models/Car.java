package web.models;

public class Car {
    private int id;
    private String brand;
    private String color;
    private int year;

    public Car() {
    }

    public Car(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
               "id=" + id +
               ", brand='" + brand + '\'' +
               ", color='" + color + '\'' +
               ", year=" + year +
               '}';
    }
}
