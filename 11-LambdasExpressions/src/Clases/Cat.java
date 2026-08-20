package Clases;

import Interfaces.Printable;

public class Cat implements Printable {
    public String nombre;
    public int age;

    @Override
    public void print() {
        System.out.println("Miau");
    }
}
