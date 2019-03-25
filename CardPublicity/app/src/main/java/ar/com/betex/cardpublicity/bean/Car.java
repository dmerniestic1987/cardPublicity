package ar.com.betex.cardpublicity.bean;

public class Car {
    private String brand;
    private String model;
    private Integer year;
    private Integer drawableId;
    private String vin;
    private String patent;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getDrawableId() {
        return drawableId;
    }

    public void setDrawableId(Integer drawableId) {
        this.drawableId = drawableId;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getPatent() {
        return patent;
    }

    public void setPatent(String patent) {
        this.patent = patent;
    }
}
