/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myperpus;


/**
 *
 * @author harun, reza, rizal, seli, teguh, wisnu
 */
//error Handling
class errorhandling{
    static void error() throws ClassNotFoundException{
        System.out.println("Mohon Isi Data Dengan Benar!");
        throw new ClassNotFoundException("Silahkan Input Data Dengan Benar !");
        }
    }
//child class dari class PinjamBuku
public class TampilMenu extends PinjamBuku{


    public static void main(String[] args) {
        //Main Method memanggil method MenuPerpus() untuk ditampilkan pertama
        MenuPerpus();
        try{
            errorhandling.error();
        }catch(ClassNotFoundException e){
            MenuPerpus();
        }
    }
}
