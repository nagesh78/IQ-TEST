package org.nagesh.cache;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Created by naveena_nagesh on 6/4/2016.
 */
public class DailyPrice {

    private LocalDate date;

    private BigDecimal price;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}