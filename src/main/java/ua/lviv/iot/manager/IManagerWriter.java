package ua.lviv.iot.manager;

import ua.lviv.iot.model.Lingerie;

import java.util.List;

public interface IManagerWriter {
    void writeCSV(List<Lingerie> hangar);

}
