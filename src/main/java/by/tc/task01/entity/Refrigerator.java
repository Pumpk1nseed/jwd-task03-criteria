package by.tc.task01.entity;

import java.io.Serializable;
import java.util.Objects;

public class Refrigerator extends Appliance implements Serializable {
    int powerConsumption;
    int weight;
    int freezerCapacity;
    double overalCapacity;
    double height;
    double width;

    public Refrigerator() {

    }

    public Refrigerator(String manufacturer, int powerConsumption, int weight, int freezerCapacity, double overalCapacity,
                        double height, double width, double price) {
        super(manufacturer, price);
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overalCapacity = overalCapacity;
        this.height = height;
        this.width = width;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFreezerCapacity(int freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public void setOveralCapacity(double overalCapacity) {
        this.overalCapacity = overalCapacity;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public int getWeight() {
        return weight;
    }

    public int getFreezerCapacity() {
        return freezerCapacity;
    }

    public double getOveralCapacity() {
        return overalCapacity;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "manufacturer='" + getManufacturer() + '\'' +
                ", powerConsumption='" + powerConsumption + '\'' +
                ", weight='" + weight + '\'' +
                ", freezerCapacity='" + freezerCapacity + '\'' +
                ", overalCapacity='" + overalCapacity + '\'' +
                ", height='" + height + '\'' +
                ", width='" + width + '\'' +
                ", price=" + getPrice() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Refrigerator that = (Refrigerator) o;
        return powerConsumption == that.powerConsumption && weight == that.weight && freezerCapacity == that.freezerCapacity && Double.compare(that.overalCapacity, overalCapacity) == 0 && Double.compare(that.height, height) == 0 && Double.compare(that.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, weight, freezerCapacity, overalCapacity, height, width);
    }
}
