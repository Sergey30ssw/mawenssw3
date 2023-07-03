package ru.netology.stats;

public class StatsService {
    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }

        }
        return minMonth;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int salesAmount(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;

        }
        return sum;

    }

    public int salesAverage(long[] sales) {
        if (sales.length > 0) {
            int sum = salesAmount(sales);
            return sum / sales.length;
        }
        return 0;

    }

    public int monthsBellowAverage(long[] sales) {

        int counter = 0;
        for (long sale : sales) {
            if (sale < salesAverage(sales)) {
                counter++;

            }

        }
        return counter;
    }

    public int monthsAboveAverage(long[] sales) {

        int counter = 0;
        for (long sale : sales) {
            if (sale > salesAverage(sales)) {
                counter++;

            }

        }
        return counter;
    }
}
