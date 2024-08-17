package dia5.car;

import java.text.NumberFormat;

public class Car {
    private String brand;
    private String model;
    private int year;
    private double value;

    Car(String brand, String model, int year, double value){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.value = value;
    }

    void saleValue(){
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        double newValue = value + (value * 0.10);
        System.out.println("The sale value is " + currencyFormat.format(newValue));
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public double getValue(){
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
