package org.nagesh.price;

import org.nagesh.cache.DailyPriceCache;

import java.time.LocalDate;

/**
 * Created by naveena_nagesh on 6/4/2016.
 */
public class PrintPrice {
    private DailyPriceCache cache;

    public DailyPriceCache getCache() {
        return cache;
    }

    public void setCache(DailyPriceCache cache) {
        this.cache = cache;
    }

    public void printPrice() {
        for (LocalDate date : cache.getAllDays()) {
            System.out.println(" Date : " + date + " ::: Price : " + cache.getPrice(date) + "\n");
        }
    }
}
