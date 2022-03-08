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
public class Cicak extends Hewan{
    @Override
    void makan(){
        super.makan();
        System.out.println("Cicak makan nyamuk");
        
    }
    @Override
    void berkembangbiak(){
        super.berkembangbiak();
        System.out.println("Cicak berkembangbiak dengan cara bertelur");
    }
}
