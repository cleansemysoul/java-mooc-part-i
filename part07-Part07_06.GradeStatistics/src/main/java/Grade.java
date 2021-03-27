
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Grade {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> passing;

    public Grade() {
        this.grades = new ArrayList<>();
        this.passing = new ArrayList<>();
    }

    public void addGrade(int number) {
        if (number >= 0 && number <= 100) {
            this.grades.add(number);
            if (number > 49 && number <= 100) {
                this.passing.add(number);
            }
        }
    }

    public String average() {
        int i = 0;
        int sumOfAll = 0;
        for (int grade : this.grades) {
            sumOfAll += grade;
            i++;
        }
        return "Point average (all): " + (double) sumOfAll / i;
    }

    public String averageOfPassing() {
        int e = 0;
        int sumOfPassing = 0;
        for (int grade : this.passing) {
            sumOfPassing += grade;
            e++;
        }
        double result = (double) sumOfPassing / e;
        if (result > 0) {
            return "Point average (passing):" + result;
        }
        return "Point average (passing): -";
    }

    public String pass() {
        int pass = 0;
        for (int grade : grades) {
            if (grade > 49) {
                pass++;
            }
        }
        return "Pass percentage:" + (double) 100.0 * pass / grades.size();
    }

    public void gradeDistribution() {
        int[] gradeDistribution = new int[6];
        for (int grade : grades) {
            if (grade < 50) {
                gradeDistribution[5]++;
            } else if (grade >= 50 && grade < 60) {
                gradeDistribution[4]++;
            } else if (grade >= 60 && grade < 70) {
                gradeDistribution[3]++;
            } else if (grade >= 70 && grade < 80) {
                gradeDistribution[2]++;
            } else if (grade >= 80 && grade < 90) {
                gradeDistribution[1]++;
            } else if (grade >= 90) {
                gradeDistribution[0]++;
            }

        }
        System.out.println("Grade distribution:");
        int index = 5;
        for (int e : gradeDistribution) {
            System.out.print(index + ":");
            for (int i = 0; i < e; i++) {
                System.out.print("*");
            }
            System.out.print("\n");
            index--;
        }
    }
}
