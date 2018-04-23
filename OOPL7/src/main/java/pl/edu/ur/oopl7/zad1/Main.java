/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7.zad1;
import java.util.Scanner;
/**
 *
 * @author MICHAL
 */
public class Main {
    public static void main(String[] args ){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Wybierz opcje ");
    System.out.println("------------------------------");
    System.out.println("1. Wprowadz i wyswietl dane studenta");
    System.out.println("2. Wprowadz i wyswietl dane wykladowcy");
    System.out.println("------------------------------");
    int liczba = scanner.nextInt();
    switch(liczba){
        case 1:
        Scanner liczby = new Scanner(System.in);
        Scanner tekst = new Scanner(System.in);
        System.out.println("Wprowadzasz dane dotyczace studenta");
        Student student = new Student("","",1,"");
        System.out.println("Podaj plec: ");
        String plec = tekst.next();
        student.setPlec(plec);
        System.out.println("Podaj imie: ");
        String imie = tekst.next();
        student.setImie(imie);
        System.out.println("Podaj nazwisko: ");
        String nazwisko = tekst.next();
        student.setNazwisko(nazwisko);
        System.out.println("Podaj rok urodzenia: ");
        int rok_urodzenia = liczby.nextInt();
        student.setRok_urodzenia(rok_urodzenia);
        System.out.println("Podaj numer indeksu: ");
        int nr_indeksu = liczby.nextInt();
        student.setNr_indeksu(nr_indeksu);
        System.out.println("Podaj typ studiow(stacjonarne/niestacjonarne): ");
        String typ_studiow = tekst.next();
        student.setTyp_studiow(typ_studiow);
        System.out.println("Podaj kierunek studiow: ");
        String kierunek = scanner.next();
        student.setKierunek(kierunek);
        System.out.println("Podaj rok studiow: ");
        int rok_studiow = liczby.nextInt();
        student.setRok_studiow(rok_studiow);
        System.out.println(student.toString());
            break;
        case 2:
        Scanner liczby2 = new Scanner(System.in);
        Scanner tekst2 = new Scanner(System.in);
        System.out.println("Wprowadzasz dane dotyczace wykladowcy");
        Wykladowca wykladowca = new Wykladowca("","",1,"");
        System.out.println("Podaj plec: ");
        String plec2 = tekst2.next();
        wykladowca.setPlec(plec2);
        System.out.println("Podaj imie: ");
        String imie2 = tekst2.next();
        wykladowca.setImie(imie2);
        System.out.println("Podaj nazwisko: ");
        String nazwisko2 = tekst2.next();
        wykladowca.setNazwisko(nazwisko2);
        System.out.println("Podaj rok urodzenia: ");
        int rok_urodzenia2 = liczby2.nextInt();
        wykladowca.setRok_urodzenia(rok_urodzenia2);
        System.out.println("Podaj nr pokoju: ");
        int nr_pokoju = liczby2.nextInt();
        wykladowca.setNr_pokoju(nr_pokoju);
        System.out.println("Podaj tytul naukowy: (wpisz ciagiem, bez pauz) ");
        String tytul_naukowy = tekst2.next();
        wykladowca.setTytul_naukowy(tytul_naukowy);
        System.out.println("Czy nosi okulary? (tak/nie) ");
        String czy_nosi_okulary = tekst2.next();
        wykladowca.setCzy_nosi_okulary(czy_nosi_okulary);
        System.out.println("Wpisz poziom umiejetnosci obslugi rzutnika wykladowcy : ");
        String poziom_umiejetnosci_obslugi_rzutnika = tekst2.next();
        wykladowca.setPoziom_umiejetnosci_obslugi_rzutnika(poziom_umiejetnosci_obslugi_rzutnika);
        System.out.println(wykladowca.toString());
            break;
        default:
            System.out.println("Wprowadzono niewlasciwa liczbe");
            break;
    }
    
    }
    
}
