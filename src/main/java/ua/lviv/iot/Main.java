package ua.lviv.iot;

import ua.lviv.iot.manager.impl.Manager;
import ua.lviv.iot.manager.impl.ManagerWriter;
import ua.lviv.iot.manager.impl.Searcher;
import ua.lviv.iot.model.Bras;
import ua.lviv.iot.model.Lingerie;
import ua.lviv.iot.model.Panties;
import ua.lviv.iot.model.SleepWear;
import ua.lviv.iot.model.SportWear;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Manager lvivShop = new Manager();

        Bras bra1 = new Bras("Love Cloud", 2021, false, 40, "Bra", "S, M, L, XL", true);
        Bras bra2 = new Bras("Very sexy", 2019, false, 55, "Bra", "XS, S, M, L, XL", false);
        Bras bra3 = new Bras("Dream Angels", 2022, true, 78, "Bra", "S, M, L", true);

        Panties panty1 = new Panties("Dream Angels", 2022, true, 37, "Panties", "Bikini", "No");
        Panties panty2 = new Panties("Dream Angels", 2022, true, 19, "Panties", "V-String", "Yes");
        Panties panty3 = new Panties("For Love & Lemons", 2020, true, 30, "Panties", "Thong", "No");


        SleepWear pij1 = new SleepWear("Modal Terry", 2021, true, 98, "Pyjamas", "95% Modal, 5% Elastane", "Yes", false);
        SleepWear pij2 = new SleepWear("The Bridal-suite", 2022, true, 90, "Pyjamas", "92% Polyester, 8% Elastane", "No", false);


        SportWear legging1 = new SportWear("The Move-me", 2022, true, 35, "Leggings", "High rise", true);
        SportWear legging2 = new SportWear("The Love Cloud sport ", 2021, true, 50, "Leggings", "some", true);
        SportWear short1 = new SportWear("Flow On Point", 2020, true, 51, "Shorts", "some", true);


        List<Lingerie> hangar = new ArrayList<>();

        lvivShop.addLingerie(hangar, bra1);
        lvivShop.addLingerie(hangar, bra2);
        lvivShop.addLingerie(hangar, bra3);
        lvivShop.addLingerie(hangar, panty1);
        lvivShop.addLingerie(hangar, panty2);
        lvivShop.addLingerie(hangar, panty3);
        lvivShop.addLingerie(hangar, pij1);
        lvivShop.addLingerie(hangar, pij2);
        lvivShop.addLingerie(hangar, legging1);
        lvivShop.addLingerie(hangar, legging2);
        lvivShop.addLingerie(hangar, short1);


        System.out.println(lvivShop.findLingerieByCollectionSortByPrice(hangar, "Dream Angels"));
        System.out.println(lvivShop.findLingerieByYearOfProdSortByPrice(hangar, 2021));

        ManagerWriter table = new ManagerWriter();

        table.writeCSV(hangar);
        String txt = """
        Dont you were walking throw the garden yest? 
        Dont be mad yest. That just a case. 
        Is It? Fuck! No this is just you yest? 
        Yep.
        """;

        Searcher searcher = new Searcher();

        System.out.println(searcher.findQuestion(txt));
        System.out.println(searcher.findSetOfWordsOfExactNumberOfLetters(searcher.findQuestion(txt), 4));


    }
}
