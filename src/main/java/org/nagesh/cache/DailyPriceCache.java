package org.nagesh.cache;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Map;
import java.util.Set;

/**
 * Created by naveena_nagesh on 6/4/2016.
 */
public class DailyPriceCache {

    private Map<LocalDate, BigDecimal> priceMap;

    public Map<LocalDate, BigDecimal> getPriceMap() {
        return priceMap;
    }

    public void setPriceMap(Map<LocalDate, BigDecimal> priceMap) {
        this.priceMap = priceMap;
    }

    public void add(LocalDate date, BigDecimal price) {
        this.priceMap.put(date, price);
    }

    public BigDecimal getPrice(LocalDate date) {
        return this.priceMap.get(date);
    }

    public Set<LocalDate> getAllDays() {
        return this.priceMap.keySet();
    }
}
