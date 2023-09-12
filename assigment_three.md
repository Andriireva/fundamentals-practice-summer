## Tasks
1. Add class "DateUtils". Add 2 static methods that
- Add amount of minutes to date. It should return Instant type.
- It should check is provided date is after then now
2. Your Employee class should include the following attributes:
- Employee ID: An integer that uniquely identifies each employee.
- Full Name: A string that represents the full name of the employee.
- Date of Birth: A date data type to store the employee's date of birth.
- Gender: An enum type called Gender with options like "Male," "Female," to represent the employee's gender.
- Department: A string that specifies the department in which the employee works (e.g., "Human Resources," "Engineering," "Sales").
- Salary: A double data type that represents the employee's monthly salary.

Your Employee class should also include methods for the following behaviors:
- Calculate Age: A method that calculates the age of the employee based on their date of birth.
- Promote: A method that increases the employee's salary as part of a promotion. The method should accept a percentage increase as a parameter and update the salary accordingly.
- ToString: Override the toString() method to provide a string representation of the employee, including all their attributes.
- compare: implement comparable interface that compare Employee based on salary and date of birth

## Useful links
* https://www.w3schools.com/java/java_date.asp
* https://www.w3schools.blog/java-8-instant-class
* https://www.w3schools.blog/comparator-interface-in-java
* https://www.w3schools.blog/comparable-interface-in-java
* https://www.w3schools.com/java/java_try_catch.asp
* https://www.w3schools.blog/generics-class-java
* https://www.w3schools.com/java/java_enums.asp