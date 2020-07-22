package domain;

import domain.Product;

public class Smartphone extends Product {
    private String manufacturer;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Smartphone(int id, String name, int price, String manufacturer) {
        super(id, name, price);
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean matches(String search){
        if (super.matches(search)) {
            return true;
        }
        else if (manufacturer.equalsIgnoreCase(search)) {
            return true;
        }
        else return false;
    }
}


