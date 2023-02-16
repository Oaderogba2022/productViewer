package ie.atu.productv6;

import ie.atu.productv6.Product;

public class TV extends Product {
    private String screenSize;
    private String manufacturer;

    public TV() {
        super();
        manufacturer = "";
        screenSize = "";
        count++;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {return super.toString() +"\nScreen size is" + screenSize;
    }
}
