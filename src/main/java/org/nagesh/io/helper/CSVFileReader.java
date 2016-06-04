package org.nagesh.io.helper;

import org.nagesh.cache.DailyPriceCache;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.stream.Stream;

/**
 * Created by naveena_nagesh on 6/4/2016.
 */
public class CSVFileReader {

    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    private DailyPriceCache cache;

    public DailyPriceCache getCache() {
        return cache;
    }

    public void setCache(DailyPriceCache cache) {
        this.cache = cache;
    }

    public void readFile() {

        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            stream.forEach(s -> { cache.add(LocalDate.parse(s.split(",")[0]), new BigDecimal(s.split(",")[1])); });
/*
            String[] tokens = stream.toString().split(",");
            String date = tokens[0];
            String price = tokens[1];

            cache.add(LocalDate.parse(date), new BigDecimal(price));
*/

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
