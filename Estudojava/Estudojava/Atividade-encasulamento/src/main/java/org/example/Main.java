package org.example;

public class Main {
    public static void main(String[] args) {
        cliente cliente1 = new cliente("juninho",12,
                new PET("sakura",5,"viralata","pequeno", "grilo"));

        cliente cliente2 = new cliente("erinaldo", 35,
                new PET("mamamia", 4, "wolksvagem","grande","costela de porco"));
    }
}