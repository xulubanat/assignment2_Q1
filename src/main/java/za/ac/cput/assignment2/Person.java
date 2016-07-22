package za.ac.cput.assignment2;

/**
 * Created by student on 2016/06/03.
 */
public class Person
{
    private String firstN;
    private String lastN;
    private int age;
    private float salary;
    private boolean married;

    public Person(String firstN, String lastN, int age, float salary, boolean married)
    {
        this.firstN = firstN;
        this.lastN = lastN;
        this.age = age;
        this.salary = salary;
        this.married = married;
    }

    public String getFirstN() {
        return firstN;
    }

    public String getLastN() {
        return lastN;
    }

    public int getAge() {
        return age;
    }

    public float getSalary() {
        return salary;
    }

    public boolean isMarried() {
        return married;
    }
}
