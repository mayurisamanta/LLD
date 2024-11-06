package service;

import entity.BorrowBookDetails;

import java.time.LocalDate;

public class DayWiseFineCalculator implements FineCalculator {

    private BorrowBookDetails borrowBookDetails;

    private double finePerDay;

    public DayWiseFineCalculator(BorrowBookDetails borrowBookDetails, double finePerDay) {
        this.borrowBookDetails = borrowBookDetails;
        this.finePerDay = finePerDay;
    }

    @Override
    public double calculateFine() {

        long days = LocalDate.now().toEpochDay() - borrowBookDetails.getDueDate().toEpochDay();

        if (days <= 0) {
            return 0;
        }

        return days * finePerDay;
    }

}
