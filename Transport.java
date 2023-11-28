/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bicycle;

/**
 * Nama: Rachma Fadilah Kunianto
 * NIM: 22166019
 * Kelas: SISTEM INFORMASI
 * Semester: Tiga
 * Mata Kuliah: PBO1
 */


class Vehicle {
    protected String myBrand;
    protected String myModel;

    public Vehicle() {
        this.myBrand = "";
        this.myModel = "";
    }
    public String getBrand() {
        return myBrand;
    }
    public void setBrand(String brand) {
        this.myBrand = brand;
    }

    public String getModel() {
        return myModel;
    }
    public void setModel(String model) {
        this.myModel = model;
    }
}

class Bicycle extends Vehicle {
    private int myGearCount;

    public Bicycle() {
        super();
        this.myGearCount = 0;
    }

    public int getGearCount() {
        return myGearCount;
    }
    
    public void setGearCount(int gearCount) {
        this.myGearCount = gearCount;
    }
}

class Skateboard extends Vehicle {
    private double myBoardLength;

    public Skateboard() {
        super();
        this.myBoardLength = 0.0;
    }

    public double getBoardLength() {
        return myBoardLength;
    }

    public void setBoardLength(double boardLength) {
        this.myBoardLength = boardLength;
    }
}

public class Transport {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        
        System.out.println("Bicycle");
        bicycle.setBrand("Trek Bike");
        bicycle.setModel("7.4FX");
        bicycle.setGearCount(23);

        System.out.println("Brand: " + bicycle.getBrand());
        System.out.println("Model: " + bicycle.getModel());
        System.out.println("Jumlah Gear: " + bicycle.getGearCount());

        Skateboard skateboard = new Skateboard();
        
        System.out.print("Skateboard");
        skateboard.setBrand("Ally Skate");
        skateboard.setModel("Rocket");

        skateboard.setBoardLength(54.5);

        System.out.println("\nBrand: " + skateboard.getBrand());
        System.out.println("Model: " + skateboard.getModel());
        System.out.println("Panjangnya Board: " + skateboard.getBoardLength() + " ");
    }
}