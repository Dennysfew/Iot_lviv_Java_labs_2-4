package ua.lviv.iot.vsShop.manager;

import ua.lviv.iot.vsShop.model.Lingerie;

import java.util.List;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Manager implements IManager {
    private final List<Lingerie> hangar = new LinkedList<>();

    @Override
    public void addLingerie(Lingerie lingerie) {

        hangar.add(lingerie);
    }

    @Override
    public List<Lingerie> findLingerieByCollectionSortByPrice(String nameOfCollection) {
        return hangar.stream()
                .filter(lingerie -> Objects.equals(lingerie.getNameOfCollection(),nameOfCollection))
                .sorted(Comparator.comparing(Lingerie::getLingeriePrice).reversed())
                .collect(Collectors.toList());
    }
    @Override
    public List<Lingerie> findLingerieByYearOfProdSortByPrice(int year) {
        return hangar.stream()
                .filter(lingerie -> Objects.equals(lingerie.getLingerieYear(),year))
                .sorted(Comparator.comparing(Lingerie::getLingeriePrice).reversed())
                .collect(Collectors.toList());
    }








}
