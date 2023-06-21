package ru.geekbrains.lesson1;

public class ChocolateBar extends Product{
    private String size;
    private double energyValue;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getEnergyValue() {
        return energyValue;
    }

    public void setEnergyValue(double energyValue) {
        this.energyValue = energyValue;
    }

    public ChocolateBar(String brand, String name, double price, String size, double energyValue) {
        super(brand, name, price);
        this.size = size;
        this.energyValue = energyValue;
    }

    @Override
    public String displayInfo() {
        return String.format("[Батончик] %s - %s - %.2f - %s - [енергетическая ценность: %.2f ккал]", brand, name, price, size, energyValue);
    }
}
