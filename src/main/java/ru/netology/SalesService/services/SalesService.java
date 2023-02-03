package ru.netology.SalesService.services;

import java.util.Arrays;

public class SalesService {
    public long getAmountMonths(long[] sales) {
        long amount = 0;
        for (long value : sales)
            amount += value;
        return amount;
    }

    public long getAverageAmountMonths(long[] sales) {
        long average = 0;
        if (sales.length > 0) {
            long amount = 0;
            for (long value : sales)
                amount += value;
            average = amount / sales.length;
        }
        return average;
    }

    public long maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public long minSales(long [] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public long getAmountMonthsUnderAverage(long[] sales) {
        long count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < getAverageAmountMonths(sales)) {
                count++;
            }
        }
        return count;
    }

    public long getAmountMonthsAboveAverage(long[] sales) {
        long count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > getAverageAmountMonths(sales)) {
                count++;
            }
        }
        return count;
    }
}

