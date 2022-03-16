package com.company;

import java.util.Objects;

public class Car {
    private int id;
    private int nomerCar;

    public Car(int id, int nomerCar) {
        this.id = id;
        this.nomerCar = nomerCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", nomerCar=" + nomerCar +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNomerCar() {
        return nomerCar;
    }

    public void setNomerCar(int nomerCar) {
        this.nomerCar = nomerCar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && nomerCar == car.nomerCar;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomerCar);
    }
}
