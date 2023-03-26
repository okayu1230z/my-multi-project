package dev.okmt.subproject1;

import dev.okmt.shared.Shared;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is subproject1 Main func");
        Shared shared = new Shared();
        System.out.println(" " + shared.getValue());
    }
}
