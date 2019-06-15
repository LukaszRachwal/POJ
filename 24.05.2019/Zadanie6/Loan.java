// Praca w parach: Damian Brzoskowski s18499, Łukasz Rachwał s19638

package Zadanie_06;

public abstract class Loan implements LoanConstants {
    private String loanNumber;
    private String lastName;
    private double amountOfLoan;
    protected double interestRate;
    private int term;

    Loan(String loanNumber, String lastName, double loanAmount, int term) {
        this.loanNumber = loanNumber;
        this.lastName = lastName;

        try {
            if (loanAmount > MAX_LOAN_AMOUNT) {
                throw (new IllegalArgumentException ("Loan value it's bigger than 100,000$"));
            } else {
                this.amountOfLoan = loanAmount;
            }
        } catch (IllegalArgumentException x) {
            System.out.println(x.getMessage());
        }

        switch (term) {
            case MEDIUM_TERM:
            case LONG_TERM:
                this.term = term;
                break;

            case SHORT_TERM:
            default:
                this.term = 1;
                break;
        }
    }

    @Override
    public String toString() {
        return (
                this.loanNumber + " " + this.lastName + " " +
                this.amountOfLoan + " " + this.interestRate * 100 + " " +
                this.term + " " + this.amountOfLoan + " " + (this.amountOfLoan * this.interestRate)
        );
    }
}