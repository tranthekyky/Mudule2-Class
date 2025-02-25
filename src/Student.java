import java.util.Arrays;

public class Student {
    private String name;
    private int age;
    private double [] score ;
    public Student(String name, int age, double [] score ) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double[] getScore() {
        return score;
    }
    public void setScore(double[] score) {
        this.score = score;
    }
    public double mediumScores() {
        double sum = 0.0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        return sum;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Score: " );
        System.out.println(Arrays.toString(score));
        System.out.println("Medium Scores: " + mediumScores());
    }


}
