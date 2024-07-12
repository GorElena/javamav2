package org.example.javamav2.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationServiceTest {

    @Test
    public void testCalculateVacationMonth() {
        VacationService vacationService = new VacationService();
        int income = 10_000; // Доход
        int expenses = 3_000; // Расходы
        int threshold = 20_000; // Порог
        int expected = 3;

        Assertions.assertEquals(income, expenses, threshold);
    }

    @Test
    public void testCalculateVacationMonths() {
        VacationService vacationService = new VacationService();
        int income = 100_000; // Доход
        int expenses = 60_000; // Расходы
        int threshold = 150_000; // Порог
        int expected = 2;
        Assertions.assertEquals(income, expenses, threshold);
    }
}
