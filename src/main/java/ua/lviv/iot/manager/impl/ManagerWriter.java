package ua.lviv.iot.manager.impl;

import ua.lviv.iot.manager.IManagerWriter;
import ua.lviv.iot.model.Lingerie;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class ManagerWriter implements IManagerWriter {

    @Override
    public void writeCSV(List<Lingerie> hangar) {
        var sep = File.separator;
        String writerResPath = String.format("%s%s%s%s%s", System.getProperty("user.dir"), sep, "src//main//resources", sep, "result.csv");
        try (FileWriter writer = new FileWriter(writerResPath)) {
            String lastClassName = "";
            for (var lingerie : hangar) {
                if (!lingerie.getClass().getSimpleName().equals(lastClassName)) {
                    writer.write(lingerie.getHeaders());
                    writer.write("\n");
                    lastClassName = lingerie.getClass().getSimpleName();
                }
                writer.write(lingerie.toCSV());
                writer.write("\n");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
