/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7.zad1;
/**
 *
 * @author MICHAL
 */
public class Osoba {
    private String imie;
    private String nazwisko;
    private int rok_urodzenia;
    private String plec;
    
    public Osoba(String imie, String nazwisko, int rok_urodzenia, String plec){
    this.imie = imie;
    this.nazwisko = nazwisko;
    this.rok_urodzenia = rok_urodzenia;
    this.plec = plec;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getRok_urodzenia() {
        return rok_urodzenia;
    }

    public void setRok_urodzenia(int rok_urodzenia) {
        this.rok_urodzenia = rok_urodzenia;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    public String toString() {
        return "Osoba: " + "plec: " + getPlec() + ", imie: " + getImie() + ", nazwisko: " + getNazwisko() + ", rok urodzenia: " + getRok_urodzenia();
    }
    
    
    
}
