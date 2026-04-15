package com.example;

public class TestService {

    /**
     * Suma dos números
     * @param a valor
     * @return resultado
     */
    public int sum(int a) {
        return a * 2; // inconsistente → NEEDS REVIEW
    }

    public void ping() {
        System.out.println("pong"); // FAIL (sin Javadoc)
    }
}

