package algorithms.lessonElevenHash;

import java.util.Objects;

public class House {
    private String address;
    private double square;
    private String index;

    public House() {
    }

    public House(String address, double square, String index) {
        this.address = address;
        this.square = square;
        this.index = index;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", square=" + square +
                ", index='" + index + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        if (this.address != house.address || this.index != house.index || this.square != house.square) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = address == null ? 0 : address.hashCode();
        result = index == null ? result : result + index.hashCode();
        result += (int) Math.round(this.square) * 31;
        return result;
    }
}
