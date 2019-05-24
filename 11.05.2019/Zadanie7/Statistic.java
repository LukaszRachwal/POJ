import  java.util.Scanner;

// Lukasz Rachwal S19638
// Maciej Rybacki S18553

public class Statistic {
    
    private final int MIN = 0;
    private final int MAX = 100;
    
    private int[] grades;
   
    public static void main(String[] args)
    {
        Statistic newStatistic = new Statistic();
       
        newStatistic.readGrades();
        System.out.printf("The average is %1$.2f\n", newStatistic.average());
        System.out.printf("The minimum is %1$d\n", newStatistic.min());
        System.out.printf("The maximum is %1$d\n", newStatistic.max());
        System.out.printf("The standard deviation is %1$.15f \n", newStatistic.stdDev());
    }
   
    private void readGrades()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberStudens = in.nextInt();
       
        grades = new int[numberStudens];
                
        int i = 0;
        while (i < numberStudens)
        {
            System.out.printf("Enter the grade for student %1$d: ", (i+1));
            int grade = in.nextInt();
            if (MIN <= grade && grade <= MAX)
            {
                grades[i] = grade;
                i++;
            }
            else {
                System.out.println("Error! Grade must be integer between 0 and 100!");
            }
        }
    } 
    
    private int min()
    {
        if (grades.length == 0) {
            return 0;
        }

        int min = grades[0];
        for (int i = 0; i < grades.length; i++) {
            min = (min > grades[i]) ? grades[i] : min;
        }
        return min;
    }
    
    private int max()
    {
        if (grades.length == 0) {
            return 0;
        }

        int max = grades[0];
        for (int i = 0; i < grades.length; i++) {
            max = (max < grades[i]) ? grades[i] : max;
        }
        return max;
    }

    private double average()
    {        
        if (grades.length == 0) {
            return 0.0;
        }
        
        double sum = 0.0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return (sum / grades.length);
    }
        
    private double stdDev()
    {
        if (grades.length == 0) {
            return 0f;
        }
        
        double avg = average();
        double sum = 0;
        for(int i = 0; i < grades.length; i++) {
            sum += grades[i] * grades[i] - avg * avg;
        }        
        return Math.sqrt(sum / grades.length);
    }
    
    
}

