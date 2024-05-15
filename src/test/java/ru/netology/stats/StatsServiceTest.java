package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    void calculationAllSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.sumAllSale(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void calculationAverageAmountMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 15;
        long actual = service.averageAmountMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calculationnumberMonPeakSales() {

        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.numberMonPeakSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calculationminSales() {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calculationnumMonSalesBelow() {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.numMonSalesBelow(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calculationnumMonSalesAbove() {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.numMonSalesAbove(sales);
        Assertions.assertEquals(expected, actual);
    }

}
