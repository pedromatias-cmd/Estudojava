package org.example;

public class Main {
    public static void main(String[] args) {
        PET pet1 = new PET("bilu", 3, "chiuauá", "pequeno", "golden frango");
        PET pet2 = new PET("foquinha", 14, "koqueinspain", "médio", "de tudo");

        System.out.println("Dados do Pet 1: " + pet1.toString() + "\n");
        System.out.println("Dados do Pet 2 : " + pet2.toString() + "\n");
    }
}