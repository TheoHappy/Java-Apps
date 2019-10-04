import  java.lang.System;

public class Phone {
    private String brand;
    private String cpu;
    private int memory;
    private String display;
    private String camera;
    private String operatingSystem;
    private boolean headphones;
    private String color;

    Phone (String brand, String cpu, int memory, String display, String camera, String operatingSystem, boolean headphones,  String color)
    {
        this.brand = brand;
        this.cpu = cpu;
        this.memory = memory;
        this.display = display + " inch";
        this.camera = camera + " MP";
        this.operatingSystem = operatingSystem;
        this.headphones = headphones;
        this.color = color;
    }
    public  String getBrand(){
        return this.brand;
    }
    public String getCpu(){
        return this.cpu;
    }
    public int getMemory() {
        return this.memory;
    }
    public String getDisplay() {
        return this.display;
    }
    public String getCamera() {
        return this.camera;
    }
    public String getoperatingSystem() {
        return this.operatingSystem;
    }
    public boolean getHeadphones() {
        return this.headphones;
    }
    public String getColor(){
        return this.color;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public void setMemory(int memory) {
        this.memory = memory;
    }
    public void setDisplay(String display) {
        this.display = display;
    }
    public void setCamera(String camera) {
        this.camera = camera;
    }
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    public void setHeadphones(boolean headphones) {
        this.headphones = headphones;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void show()
    {
        System.out.println("Brand :" + getBrand());
        System.out.println("Cpu: " + getCpu() );
        System.out.println("Memory: " + getMemory() );
        System.out.println("Display: " + getDisplay() );
        System.out.println("Camera: " + getCamera() );
        System.out.println("Operating system: " + getoperatingSystem() );
        System.out.println("The existence of Headphones : " + getHeadphones() );
        System.out.println("Color: " + getColor());
    }
};
