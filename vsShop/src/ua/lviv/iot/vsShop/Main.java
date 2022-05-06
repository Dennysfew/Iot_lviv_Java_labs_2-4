package ua.lviv.iot.vsShop;


import ua.lviv.iot.vsShop.manager.Manager;
import ua.lviv.iot.vsShop.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Manager LvivShop = new Manager();

    Bras bra1 = new Bras("Love Cloud",2021, false,40, "Bra","S, M, L, XL", true) ;
    Bras bra2 = new Bras("Very sexy",2019, false,55, "Bra","XS, S, M, L, XL", false);
    Bras bra3 = new Bras("Dream Angels",2022, true,78,"Bra","S, M, L",true) ;

    Bras[] bras = {bra1,bra2,bra3};
    Panties panty1 = new Panties("Dream Angels",2022, true,37,"Panties","Bikini", "No");
    Panties panty2 = new Panties("Dream Angels",2022, true,19, "Panties","V-String", "Yes");
    Panties panty3 = new Panties("For Love & Lemons",2020, true,30, "Panties","Thong", "No");

    Panties[] panties = {panty1, panty2, panty3};
    SleepWear pij1 = new SleepWear("Modal Terry",2021, true,98, "Pyjamas","95% Modal, 5% Elastane", "Yes",false);
    SleepWear pij2 = new SleepWear("The Bridal-suite",2022, true,90, "Pyjamas","92% Polyester, 8% Elastane", "No",false);

    SleepWear[] sleepWears = {pij1, pij2};
    SportWear Legging1 = new SportWear("The Move-me",2022, true,35,"Leggings", "High rise", true);
    SportWear Legging2 = new SportWear("The Love Cloud sport ",2021, true,50, "Leggings","some", true);
    SportWear Short1 = new SportWear("Flow On Point",2020, true,51,"Shorts", "some", true);
    SportWear[] sportWears = {Legging1, Legging2, Short1};

        List<Lingerie> hangar = new ArrayList<>();

        for (Bras bra : bras)
        {
            System.out.println(bra);
            LvivShop.addLingerie(hangar, bra);
        }
        System.out.println();

        for (Panties panty : panties)
        {
            System.out.println(panty);
            LvivShop.addLingerie(hangar,panty);
        }
        System.out.println();

        for ( SleepWear pij :  sleepWears )
        {
            System.out.println(pij);
            LvivShop.addLingerie(hangar,pij);
        }
        System.out.println();

        for (SportWear sportWear : sportWears)
        {
            System.out.println(sportWear);
            LvivShop.addLingerie(hangar, sportWear);
        }
        System.out.println();

        System.out.println( LvivShop.findLingerieByCollectionSortByPrice(hangar,"Dream Angels"));
        System.out.println( LvivShop.findLingerieByYearOfProdSortByPrice(hangar,2021));



    }
}
