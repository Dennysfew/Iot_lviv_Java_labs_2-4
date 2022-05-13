package ua.lviv.iot.vsShop.manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

class ManagerWriterTest {

    @Test
    void writeCSV() {
        var sep = File.separator;
        String readerExPath = String.format("%s%s%s%s%s", System.getProperty("user.dir"), sep, "src//test//resources", sep, "example.csv");
        String readerResPath = String.format("%s%s%s%s%s", System.getProperty("user.dir"), sep, "src//main//resources", sep, "result.csv");
        try (BufferedReader readerEx = new BufferedReader(new FileReader(readerExPath));
             BufferedReader readerRes = new BufferedReader(new FileReader(readerResPath))) {
            assertNotEquals(readerRes.readLine(), null);
            assertNotEquals(readerEx.readLine(), null);
            assertEquals(readerEx.readLine(), readerRes.readLine());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}