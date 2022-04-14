package ua.lviv.iot.vsShop.manager;

import ua.lviv.iot.vsShop.model.Lingerie;

import java.util.List;

public interface IManager {

    void addLingerie(Lingerie lingerie);


    List<Lingerie> findLingerieByCollectionSortByPrice(String nameOfCollection);


    List<Lingerie> findLingerieByYearOfProdSortByPrice(int year);
}
