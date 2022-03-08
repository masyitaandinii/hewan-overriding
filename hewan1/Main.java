/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hewan1;

/**
 *
 * @author MASTER 10
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Cicak");
        Cicak hewan = new Cicak();
        hewan.makan();
        hewan.berkembangbiak();

        System.out.println("\t");

        System.out.println("Sapi");
        Sapi hewan2 = new Sapi();
        hewan2.makan();
        hewan2.berkembangbiak();

    }
}
