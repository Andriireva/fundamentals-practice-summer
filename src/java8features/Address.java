package java8features;

import java.util.Objects;

public class Address {
    private String cityName;
    private Integer zipCode;
    private String street;
    private Integer appNumber;

    public Address(String cityName, Integer zipCode, String street, Integer appNumber) {
        this.cityName = cityName;
        this.zipCode = zipCode;
        this.street = street;
        this.appNumber = appNumber;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getAppNumber() {
        return appNumber;
    }

    public void setAppNumber(Integer appNumber) {
        this.appNumber = appNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address address)) return false;
        return Objects.equals(getCityName(), address.getCityName()) && Objects.equals(getZipCode(), address.getZipCode()) && Objects.equals(getStreet(), address.getStreet()) && Objects.equals(getAppNumber(), address.getAppNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCityName(), getZipCode(), getStreet(), getAppNumber());
    }

    @Override
    public String toString() {
        return "Address{" +
                "cityName='" + cityName + '\'' +
                ", zipCode=" + zipCode +
                ", street='" + street + '\'' +
                ", appNumber=" + appNumber +
                '}';
    }
}
