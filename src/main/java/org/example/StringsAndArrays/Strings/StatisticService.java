package org.example.StringsAndArrays.Strings;

public class StatisticService {

    public long sum(long[] sales) { //метод суммы всех продаж
        long sum = 0; //счётчик
        for (long sale : sales) {
            sum = sum + sale; //увеличение счётчика на 1 продажу
        }
        return sum;
    }

    public long average(long[] sales) { //метод средней суммы продаж в месяц

        return sum(sales) / 12;
    }

    public int minSales(long[] sales) { //метод месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {//продажа в месяце меньше или равна минимальным продажам в месяце
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) { // метод месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) { //продажа в месяце больше или равна максимальным продажам в месяце
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int avgLess(long[] sales) { //метод кол-ва месяцев, в которых продажи были ниже среднего
        long avg = average(sales);
        int count = 0;
        for (long sale : sales) { //продажа в месяце меньше средних продаж за 12 месяцев
            if (sale < avg) {
                count++;
            }
        }
        return count;
    }

    public int avgMore(long[] sales) { //метод кол-ва месяцев, в которых продажи были выше среднего
        long avg = average(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > avg) { //продажа в месяце больше средних продаж за 12 месяцев
                count++; //
            }
        }
        return count;
    }
}

