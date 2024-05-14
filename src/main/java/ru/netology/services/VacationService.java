package ru.netology.services;

public class VacationService {
    public int calcVacationMonths(int income, int expenses, int threshold) {

        int money = 0;
        int vacationMonths = 0;
        for (int i = 0; i < 12; i++) {
            if (money < threshold) {
                money = money + income;
                money = money - expenses;
            } else {
                money = money - expenses;
                money = money / 3;
                vacationMonths++;
            }
        }
        return vacationMonths;

    }

}
