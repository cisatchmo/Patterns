package it.cisatchmo.FactoryPattern;

public class Forma {
    static Rettangolo getRettangolo() {
        return new Rettangolo();
    }

    static Quadrato getQuadrato() {
        return new Quadrato();
    }

    static Cerchio getCerchio() {
        return new Cerchio();
    }

    static Triangolo getTriangolo() {
        return new Triangolo();
    }
}
