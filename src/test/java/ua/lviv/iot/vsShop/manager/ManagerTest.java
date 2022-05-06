package ua.lviv.iot.vsShop.manager;


import org.junit.jupiter.api.Test;
import ua.lviv.iot.vsShop.model.Lingerie;
import ua.lviv.iot.vsShop.model.Bras;
import ua.lviv.iot.vsShop.model.Panties;
import ua.lviv.iot.vsShop.model.SleepWear;
import ua.lviv.iot.vsShop.model.SportWear;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    private final Manager manager = new Manager();
    private List<Lingerie> hangar = new LinkedList<>();

    Bras bra4 = new Bras("Bare Infinity Flex", 2020, true, 63, "Bra", "XS, S, M, XL", false);
    Panties panty4 = new Panties("Bluebella", 2021, true, 30, "Panties", "Brazilian", "Yes");
    SleepWear pij3 = new SleepWear("Dream Angels", 2020, true, 65, "Pyjamas", "97% Modal, 3% Elastane", "Yes", true);
    SportWear Short1 = new SportWear("Dream Angels", 2021, true, 51, "Shorts", "some", true);


    @Test
    public void sizeOfListWithNewElementAdded() {
        int sizeOfList = hangar.size();
        manager.addLingerie(hangar, bra4);
        assertEquals(sizeOfList + 1, hangar.size());
    }
    @Test
    public void findLingerieByCollectionSortByPrice() {
        hangar.add(bra4);
        hangar.add(panty4);
        hangar.add(pij3);
        hangar.add(Short1);
        hangar = manager.findLingerieByCollectionSortByPrice(hangar,"Dream Angels" );
        List<Lingerie> testList = Arrays.asList(pij3, Short1);
        assertEquals(testList, hangar);
    }
    @Test
    public void findLingerieByYearOfProdSortByPrice() {
        hangar.add(bra4);
        hangar.add(panty4);
        hangar.add(pij3);
        hangar.add(Short1);
        hangar = manager.findLingerieByYearOfProdSortByPrice(hangar, 2021);
        List<Lingerie> testList = Arrays.asList( Short1, panty4);
        assertEquals(testList, hangar);
    }


}