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
public class Punkt3D extends Punkt2D{
    public int x;
    public int y;
    public int z; 
    
    public Punkt3D(int x, int y, int z){
    this.x = z;
    this.y = z;
    this.z = z;
    }
    
    public Punkt3D(){
    this.x = 0;
    this.y = 0;
    this.z = 0;
    }
    
    @Override
    public void Losowanie(){
    Random r = new Random();
    x = r.nextInt(21)-10;
    y = r.nextInt(21)-10;
    z = r.nextInt(21)-10;
    }
    
    @Override
    public String toString(){
    return "Punkt 3D ma współrzędne:("+x+","+y+","+z+")";
    }
    
}