package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test

    public void viewMonthsWithMinSales() {

        StatsService service = new StatsService();
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        int actualMonth = service.minSales(arr);
        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test

    public void viewMonthsWithMaxSales() {

        StatsService service = new StatsService();
        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMonth = 8;
        long actualMonth = service.maxSales(arr);
        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test

    public void totalSalesForAllMonths() {

        StatsService service = new StatsService();
        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.salesAmount(arr);
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void averageSalesForAllMonths() {

        StatsService service = new StatsService();
        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180 / 12;
        long actual = service.salesAverage(arr);
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testMonthsBellowAverage() {

        StatsService service = new StatsService();
        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.monthsBellowAverage(arr);
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testMonthsAboveAverage() {

        StatsService service = new StatsService();
        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.monthsAboveAverage(arr);
        Assertions.assertEquals(expected, actual);
    }
}