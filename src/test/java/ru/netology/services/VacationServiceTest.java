package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationServiceTest {


    @Test

    public void CalcVacationPossibility() {

        VacationService service = new VacationService();

        int expected = 3;
        int income = 10_000; // доход от работы
        int expenses = 3_000; // обязательные месячные траты
        int threshold = 20_000; // есть возможность отдохнуть
        int actual = service.calcVacationMonths(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void CalcVacationPossibility2() {

        VacationService service = new VacationService();

        int expected = 2;
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int actual = service.calcVacationMonths(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }

}
