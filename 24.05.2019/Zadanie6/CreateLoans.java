// Praca w parach: Damian Brzoskowski s18499, Łukasz Rachwał s19638

package Zadanie_06;

import java.util.*;

class CreateLoans {

    private Loan[] loanDetails = new Loan[5]; // array of five Loans

    public void showAllLoans(){
        for (int i = 0; i < loanDetails.length; i++){
            System.out.println(loanDetails[i].toString());
        }
    }

    public static Character getLoanType(){
        Scanner sc = new Scanner(System.in);
        Character loanType;

        do{
            System.out.print("BusinessLoan 1% rate or PersonalLoan 2% rate (B/P): ");
            loanType = sc.next().toUpperCase().charAt(0);

            if (!((loanType.equals('B')) || (loanType.equals('P'))))
                System.out.println("This step require chose between [B] or [P]. Try again");
        } while (!((loanType.equals('B')) || (loanType.equals('P'))));
        return loanType;
    }

    public static String getNumber(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Loan number: ");
        return sc.next();
    }

    public static String getLastName(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        return sc.next();
    }

    public static double getAmountOfLoan(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Loan amount: ");
        return sc.nextDouble();
    }

    public static double getPrimeInterestRate(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Interest rate (%): ");
        return sc.nextDouble();
    }

    public static int getTerm(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Loan term (1 year, 3 years, or 5 years): ");
        return sc.nextInt();
    }

    public void getLoanDetails(){
        Character loanType;
        String number;
        String lastName;
        double amountOfLoan;
        double primeInterestRate;
        int term;

        for (int i = 0; i < loanDetails.length; i++){
            System.out.println("Please enter data for customer number: " + (i + 1));

            loanType = getLoanType();
            number = getNumber();
            lastName = getLastName();
            amountOfLoan = getAmountOfLoan();
            primeInterestRate = getPrimeInterestRate();
            term = getTerm();

            System.out.println();

            if (loanType.equals('B')){
                loanDetails[i] = new BusinessLoan(number, lastName, amountOfLoan, term, primeInterestRate);
            } else if (loanType.equals('P')){
                loanDetails[i] = new PersonalLoan(number, lastName, amountOfLoan, term, primeInterestRate);
            }
        }
    }

    public static void main(String[] args){
        CreateLoans loan = new CreateLoans();

        loan.getLoanDetails();
        loan.showAllLoans();
    }
}