// Praca w parach: Damian Brzoskowski s18499, Łukasz Rachwał s19638

package Zadanie_06;

public class PersonalLoan extends Loan {

    PersonalLoan(String number, String lastName, double amountOfLoan, int term, double primeInterestRate) {
        super(number, lastName, amountOfLoan, term);
        super.interestRate = 0.02 / (primeInterestRate / 100);
    }
}