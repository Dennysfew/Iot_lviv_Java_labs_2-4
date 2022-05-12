package ua.lviv.iot.manager.impl;

import ua.lviv.iot.manager.IManager;
import ua.lviv.iot.model.Lingerie;

import java.util.List;
import java.util.Objects;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Manager implements IManager {


    @Override
    public void addLingerie(List<Lingerie> hangar, Lingerie lingerie) {
        hangar.add(lingerie);
    }

    @Override
    public List<Lingerie> findLingerieByCollectionSortByPrice(List<Lingerie> hangar, String nameOfCollection) {
        return hangar.stream()
                .filter(lingerie -> Objects.equals(lingerie.getNameOfCollection(),nameOfCollection))
                .sorted(Comparator.comparing(Lingerie::getLingeriePrice).reversed())
                .collect(Collectors.toList());
    }
    @Override
    public List<Lingerie> findLingerieByYearOfProdSortByPrice(List<Lingerie> hangar, int year) {
        return hangar.stream()
                .filter(lingerie -> Objects.equals(lingerie.getLingerieYear(),year))
                .sorted(Comparator.comparing(Lingerie::getLingeriePrice).reversed())
                .collect(Collectors.toList());
    }








}
