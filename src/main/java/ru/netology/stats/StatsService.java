package ru.netology.stats;

public class StatsService {
    //1 метод находим сумму всех продаж
    public long sumAllSale(long[] sales) {
        long sumSale = 0; //сумма равна 0
        // for (int i = 0; i < sales.length; i++)
        for (long sale : sales) {
            sumSale += sale;
        }
        return sumSale;
    }

    // 2 метод находим среднюю сумму продаж в месяц
    public long averageAmountMonth(long[] sales) {
        long averagSum = sumAllSale(sales) / sales.length;
        return averagSum;
    }

    // 3 метод Находим номер месяца, в котором был пик продаж
    public int numberMonPeakSales(int[] sales) {
        int peakSale = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[peakSale]) {
                peakSale = i; //запомним максимум
            }
        }
        return peakSale + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    // 4 метод Находим номер месяца, к котором был минимум продаж
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    // 5 метод Находим колличество месяцев продаж ниже среднего
    public int numMonSalesBelow(long[] sales) {
        int salBelow = 0;
        long average = averageAmountMonth(sales);
        for (int i = 0; i < sales.length; i++) {
       // for (long sale : sales) { можно так и
        // it (sale > average)
                        if (sales [i] > average) {

                salBelow++;
            }
        }
        return salBelow;
    }

    // 6 метод Находим колличество месяцев продаж выше среднего
    public int numMonSalesAbove(long[] sales) {
        int salAbove = 0;
        long average = averageAmountMonth(sales);
//long sale = 0;
       for (int i = 0; i < sales.length; i++){
       // for (long sale : sales) {
            if (sales [i] < average) {
                salAbove ++;
            }
        }
        return salAbove;

    }



}