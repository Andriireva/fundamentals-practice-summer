package asigmentthee;

import java.time.Instant;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Employee implements Comparable<Employee> {
    private Long id;
    private String fullName;
    private final Instant birthDate;
    private Gender gender;
    private String department;
    private double salary;
    private int age;

    public Employee(Long id, String fullName, Instant birthDate, Gender gender, String department, double salary) {
        this.id = id;
        this.fullName = fullName;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
        this.birthDate = birthDate;
//        setAge(this.calculateAge());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Instant getBirthDate() {
        return birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    // 0.34
    public void promote(double percent) {
        this.salary = this.salary + this.salary * percent;
    }


    public int calculateAge() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter
                .ofPattern("yyyy");

        Instant now = Instant.now();
        String formattedYearsBirthDay = dateTimeFormatter.format(birthDate.atZone(ZoneId.systemDefault()));
        String formattedYearsNow = dateTimeFormatter.format(now.atZone(ZoneId.systemDefault()));

        System.out.println(formattedYearsBirthDay);
        System.out.println(formattedYearsNow);

        Integer value = Integer.valueOf(formattedYearsBirthDay);
        Integer value1 = Integer.valueOf(formattedYearsNow);

        return Period.between(birthDate.atZone(ZoneId.systemDefault()).toLocalDate(),
                now.atZone(ZoneId.systemDefault()).toLocalDate()).getYears();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", birthDate=" + birthDate +
                ", gender=" + gender +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Employee employee) {
        // Alex Bron  40  1979 - 10
        // Jon Snow   40  1991 - 10
        // Alex Bigone 20 1995 - 10

        // compare by name and surname result
        // Alex Bigone
        // Alex Bron
        // Jon Snow

        if (employee == null) {
            return 1;
        }

        int compareBySalaey = Double.compare(this.salary, employee.getSalary());
        if (compareBySalaey == 0) {
            return this.birthDate.compareTo(employee.getBirthDate());
        } else {
            return compareBySalaey;
        }
    }
}
