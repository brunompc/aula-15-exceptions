package com.company;

public class Main {

    static long somarPares(int a, int b) throws InvalidInputException {

        boolean aPar = a % 2 == 0;
        boolean bPar = b % 2 == 0;

        if(!aPar && !bPar) {
            throw new InvalidInputException("Os números são ambos impares");
        }
        else if(!aPar) {
            throw new InvalidInputException("Um dos números " + a + " não é par");
        }
        else if(!bPar) {
            throw new InvalidInputException("Um dos números " + b + " não é par");
        }

        return a + b;

    }

    public static void main(String[] args) {

        try {
            long r = somarPares(11, 13);
            System.out.println("Res: " + r);
        }
        catch(InvalidInputException ex) {
            System.out.println(ex.getMessage());
        }
            
    }
}
