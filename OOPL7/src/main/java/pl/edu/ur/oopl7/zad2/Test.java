/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7.zad2;
import java.util.Scanner;

/**
 *
 * @author MICHAL
 */
public class Test{
    private int x;
    private int y;
    private int z;
    
    private Punkt2D random2D;
    private Punkt2D nonrandom2D;
    private Punkt3D random3D;
    private Punkt3D nonrandom3D;
    
    private Punkt2D[] tablica2D = new Punkt2D[100];
    private Punkt3D[] tablica3D = new Punkt3D[100];
            
    public Test(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("x: ");
        x = scanner.nextInt();
        System.out.print("y: ");
        y = scanner.nextInt();
        System.out.print("z: ");
        z = scanner.nextInt();
        System.out.println();
        
        random2D = new Punkt2D();
        random2D.Losowanie();
        
        nonrandom2D = new Punkt2D(x,y);
        
        random3D = new Punkt3D();
        random3D.Losowanie();
        
        nonrandom3D = new Punkt3D(x,y,z);
    }
    
    public void test2D(){
        System.out.println("2D random");
        System.out.println("---------");
        System.out.println(random2D.toString());
        System.out.println();
        
        System.out.println("2D nonrandom");
        System.out.println("---------");
        System.out.println(nonrandom2D.toString());
        System.out.println();
    }
    
    public void test3D(){
        System.out.println("3D random");
        System.out.println("---------");
        System.out.println(random3D.toString());
        System.out.println();
     
        System.out.println("3D nonrandom");
        System.out.println("---------");
        System.out.println(nonrandom3D.toString());
        System.out.println();
    }
    
    public void array2D(){
        for(int i=0; i<100;i++){
            tablica2D[i] = new Punkt2D();
            tablica2D[i].Losowanie();
        }
    }
    
    public void array3D(){
        for(int i=0; i<100;i++){
            tablica3D[i] = new Punkt3D();
            tablica3D[i].Losowanie();
        }
    }
    
    public void test1(){
        for (int i=0; i<100; i++){
            for (int j=0; j<100; j++){
                if( (tablica2D[i].x == tablica3D[j].x) && (tablica2D[i].y == tablica3D[j].y) )
                    System.out.println(i+1 + " Współrzędne punktu 2D z " + (j+1) + ". punktem 3D (" + tablica2D[i].toString() + ")");
            }
        }
    }

    }
