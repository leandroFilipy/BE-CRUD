package org.example.model;

public class Material {

    private String name;
    private String unit;
    private double quantity;


    public Material(String name, String unit, double quantity) {
        this.name = name;
        this.unit = unit;
        this.quantity = quantity;
    }
    public Material() {
        this.name = "";
        this.unit = "";
        this.quantity = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
