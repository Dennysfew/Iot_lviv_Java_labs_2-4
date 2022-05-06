package ua.lviv.iot.vsShop.manager;

import ua.lviv.iot.vsShop.model.Lingerie;

import java.util.List;

public interface IManager {

    void addLingerie(List<Lingerie> hangar,Lingerie lingerie);


    List<Lingerie> findLingerieByCollectionSortByPrice(List<Lingerie> hangar,String nameOfCollection);


    List<Lingerie> findLingerieByYearOfProdSortByPrice(List<Lingerie> hangar,int year);
}
