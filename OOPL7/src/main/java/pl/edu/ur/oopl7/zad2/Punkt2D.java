/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7.zad2;
import java.util.Random;

/**
 *
 * @author MICHAL
 */
public class Punkt2D {
    private int x;
    private int y;
       
    public Punkt2D(){
    this.x = 0;
    this.y = 0;
    }
    
    public Punkt2D(int x, int y){
    this.x = 0;
    this.y = 0;
    }
    
    public void Losowanie(){
    Random r = new Random();
    x = r.nextInt(21)-10;
    y = r.nextInt(21)-10;
    }
    
    @Override
    public String toString(){
    return "Punkt 2D ma współrzędne:("+x+","+y+")";
    }

}
