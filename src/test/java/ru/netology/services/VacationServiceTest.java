package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class VacationServiceTest {


    @ParameterizedTest
//    @CsvSource({
//            "3,10_000,3_000,20_000",
//            "2,100_000,60_000,150_000"
//    })
    @CsvFileSource(files = "src/test/resources/vacation.csv")

    public void CalcVacationPossibility(int expected, int income, int expenses, int threshold) {

        VacationService service = new VacationService();

//        int expected = 3;
//        int income = 10_000; // доход от работы
//        int expenses = 3_000; // обязательные месячные траты
//        int threshold = 20_000; // есть возможность отдохнуть
        int actual = service.calcVacationMonths(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }

//    @Test
//    public void CalcVacationPossibility2() {
//
//        VacationService service = new VacationService();
//
//        int expected = 2;
//        int income = 100_000;
//        int expenses = 60_000;
//        int threshold = 150_000;
//        int actual = service.calcVacationMonths(income, expenses, threshold);
//
//        Assertions.assertEquals(expected, actual);
//
//    }

}
