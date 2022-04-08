package ua.lviv.iot.vsShop;


import ua.lviv.iot.vsShop.model.Bras;
import ua.lviv.iot.vsShop.model.Panties;
import ua.lviv.iot.vsShop.model.SleepWear;
import ua.lviv.iot.vsShop.model.SportWear;

public class Main {
    public static void main(String[] args) {

    Bras bra1 = new Bras("Love Cloud",2021, false,40, "S, M, L, XL", true) ;
    Bras bra2 = new Bras("Very sexy",2019, false,55, "XS, S, M, L, XL", false);
    Bras bra3 = new Bras("Dream Angels",2022, true,78, "S, M, L",true) ;
    Bras bra4 = new Bras("Bare Infinity Flex", 2020,true,63, "XS, S, M, XL", false);
    Bras[] bras = {bra1,bra2,bra3,bra4};
    Panties panty1 = new Panties("Dream Angels",2022, true,37, "Bikini", "No");
    Panties panty2 = new Panties("Dream Angels",2022, true,19, "V-String", "Yes");
    Panties panty3 = new Panties("For Love & Lemons",2020, true,30, "Thong", "No");
    Panties panty4 = new Panties("Bluebella",2021, true,30, "Brazilian", "Yes");
    Panties[] panties = {panty1, panty2, panty3, panty4};
    SleepWear pij1 = new SleepWear("Modal Terry",2021, true,98, "95% Modal, 5% Elastane", "Yes",false);
    SleepWear pij2 = new SleepWear("The Bridal-suite",2022, true,90, "92% Polyester, 8% Elastane", "No",false);
    SleepWear pij3 = new SleepWear("Modal Terry",2020, true,65, "97% Modal, 3% Elastane", "Yes",true);
    SleepWear[] sleepWears = {pij1, pij2, pij3};
    SportWear Legging1 = new SportWear("The Move-me",2022, true,35, "High rise", true);
    SportWear Legging2 = new SportWear("The Love Cloud sport ",2021, true,50, "some", true);
    SportWear Short1 = new SportWear("Flow On Point",2020, true,51, "some", true);
    SportWear[] sportWears = {Legging1, Legging2, Short1};

        for (Bras bra : bras)
        {
            System.out.println(bra);
        }
        System.out.println();

        for (Panties panty : panties)
        {
            System.out.println(panty);
        }
        System.out.println();

        for ( SleepWear pij :  sleepWears )
        {
            System.out.println( pij);
        }
        System.out.println();

        for (SportWear sportWear : sportWears)
        {
            System.out.println(sportWear);
        }
        System.out.println();





    }
}
