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
public class Wykladowca extends Osoba{
    private int nr_pokoju;
    private String tytul_naukowy;
    private String czy_nosi_okulary;
    private String poziom_umiejetnosci_obslugi_rzutnika;
    
    public Wykladowca(String imie, String nazwisko, int rok_urodzenia, String plec){
        super(imie, nazwisko, rok_urodzenia, plec);
    }

    public int getNr_pokoju() {
        return nr_pokoju;
    }

    public void setNr_pokoju(int nr_pokoju) {
        this.nr_pokoju = nr_pokoju;
    }

    public String getTytul_naukowy() {
        return tytul_naukowy;
    }

    public void setTytul_naukowy(String tytul_naukowy) {
        this.tytul_naukowy = tytul_naukowy;
    }

    public String getCzy_nosi_okulary() {
        return czy_nosi_okulary;
    }

    public void setCzy_nosi_okulary(String czy_nosi_okulary) {
        this.czy_nosi_okulary = czy_nosi_okulary;
    }

    public String getPoziom_umiejetnosci_obslugi_rzutnika() {
        return poziom_umiejetnosci_obslugi_rzutnika;
    }

    public void setPoziom_umiejetnosci_obslugi_rzutnika(String poziom_umiejetnosci_obslugi_rzutnika) {
        this.poziom_umiejetnosci_obslugi_rzutnika = poziom_umiejetnosci_obslugi_rzutnika;
    }

    public String toString() {
        return "Informacje o wykladowcy: " + "plec: " + getPlec() + ", imie: " + getImie() + ", nazwisko: " + getNazwisko() + ", rok urodzenia: " + getRok_urodzenia() + ", nr_pokoju: " + nr_pokoju + ", tytul_naukowy: " + tytul_naukowy + ", czy_nosi_okulary: " + czy_nosi_okulary + ", poziom umiejetnosci obslugi rzutnika: " + poziom_umiejetnosci_obslugi_rzutnika;
    }
    
    
}
