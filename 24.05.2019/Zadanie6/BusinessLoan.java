// Praca w parach: Damian Brzoskowski s18499, Łukasz Rachwał s19638

package Zadanie_06;

public class BusinessLoan extends Loan{

    BusinessLoan(String number, String lastName, double amountOfLoan, int term, double primeInterestRate){
        super(number, lastName, amountOfLoan, term);
        super.interestRate = 0.01 / (primeInterestRate / 100);
    }
}