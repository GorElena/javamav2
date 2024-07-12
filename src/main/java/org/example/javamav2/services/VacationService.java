package org.example.javamav2.services;

public class VacationService {
    public int calculateVacationMonth(int income, int expenses, int threshold) {
        int balance = 0;
        int vacationMonth = 0;

        for (int month = 1; month <= 12; month++) {
            if (balance >= threshold) {
                balance -= expenses;
                vacationMonth++;
            } else {
                balance += income - expenses;
            }
        }
        return vacationMonth;
    }
}
