# MCA Core Java Programming

Welcome to the Core Java repository for my Master of Computer Applications (MCA) class. This repository serves as a centralized log and collection of all lab work, assignments, and practice programs developed throughout the semester.

---

## 📂 Repository Directory Structure

```text
Pg_Java/
├── .gitignore
├── README.md
├── Assignment-1/
│   ├── README.md
│   ├── Q1IdentifierNaming.java
│   ├── Q2DataTypeConversion.java
│   ├── Q3ArithmeticOperations.java
│   ├── Q4VotingEligibility.java
│   ├── Q5SimpleCalculator.java
│   ├── Q6MultiplicationTable.java
│   ├── Q7SumOfEvenNumbers.java
│   ├── Q8StoreAndPrintMarks.java
│   ├── Q9FindMaximum.java
│   └── Q10AverageAndGrade.java
└── Assignment-2/
    ├── README.md
    ├── Q1University.java
    ├── Q2FlightBooking.java
    ├── Q3EmployeePayroll.java
    ├── Q4ShoppingCart.java
    ├── Q5HospitalManagement.java
    ├── Q6LibraryBookAuthor.java
    ├── Q7SportsLeague.java
    ├── Q8LoanManagement.java
    ├── Q9OnlineCourse.java
    ├── Q10SmartHome.java
    ├── Q11HostelAllocation.java
    ├── Q12VehicleRental.java
    ├── Q13HotelReservation.java
    ├── Q14BankingATM.java
    └── Q15PassportCitizen.java
```

---

## 📋 Assignment 1 Index: Core Java Basics

Folder: [`Assignment-1/`](Assignment-1/README.md)  
Focus: Fundamental syntax, variable declarations, data type conversions, conditional statements, loops, and 1D arrays.

| S.No. | Problem / File | Class & Symbols | Description | Concepts Demonstrated |
| :--- | :--- | :--- | :--- | :--- |
| 1 | 📄 [Q1IdentifierNaming.java](Assignment-1/Q1IdentifierNaming.java) | [Q1IdentifierNaming](Assignment-1/Q1IdentifierNaming.java#L3) | Hardcoded student record display (name, roll, marks). | Naming conventions, variables, console output. |
| 2 | 📄 [Q2DataTypeConversion.java](Assignment-1/Q2DataTypeConversion.java) | [Q2DataTypeConversion](Assignment-1/Q2DataTypeConversion.java#L2) | Temperature conversion from Celsius to Fahrenheit. | Arithmetic operations, type promotion, precision. |
| 3 | 📄 [Q3ArithmeticOperations.java](Assignment-1/Q3ArithmeticOperations.java) | [Q3ArithmeticOperations](Assignment-1/Q3ArithmeticOperations.java#L4) | Interactive basic arithmetic calculator (+, -, *, /). | `Scanner` input, arithmetic expressions. |
| 4 | 📄 [Q4VotingEligibility.java](Assignment-1/Q4VotingEligibility.java) | [Q4VotingEligibility](Assignment-1/Q4VotingEligibility.java#L3) | Voting eligibility check based on user's age (>= 18). | Conditional branching (`if-else`). |
| 5 | 📄 [Q5SimpleCalculator.java](Assignment-1/Q5SimpleCalculator.java) | [Q5SimpleCalculator](Assignment-1/Q5SimpleCalculator.java#L3) | Calculator taking two numbers and operator char (+, -, *, /). | Nested conditional checks, character parsing. |
| 6 | 📄 [Q6MultiplicationTable.java](Assignment-1/Q6MultiplicationTable.java) | [Q6MultiplicationTable](Assignment-1/Q6MultiplicationTable.java#L4) | Multiplication table generator (1 through 10) for input number. | Iteration (`for` loop), string formatting. |
| 7 | 📄 [Q7SumOfEvenNumbers.java](Assignment-1/Q7SumOfEvenNumbers.java) | [Q7SumOfEvenNumbers](Assignment-1/Q7SumOfEvenNumbers.java#L1) | Calculates sum of all even numbers between 1 and 50. | Loop control (`while` loop), modulo operator (`%`). |
| 8 | 📄 [Q8StoreAndPrintMarks.java](Assignment-1/Q8StoreAndPrintMarks.java) | [Q8StoreAndPrintMarks](Assignment-1/Q8StoreAndPrintMarks.java#L3) | Accepts and prints marks for 5 students using a 1D array. | 1D Arrays, array traversal, input processing. |
| 9 | 📄 [Q9FindMaximum.java](Assignment-1/Q9FindMaximum.java) | [Q9FindMaximum](Assignment-1/Q9FindMaximum.java#L3) | Finds the maximum integer in an array of 10 elements. | Array scanning, maximum finding algorithm. |
| 10 | 📄 [Q10AverageAndGrade.java](Assignment-1/Q10AverageAndGrade.java) | [Q10AverageAndGrade](Assignment-1/Q10AverageAndGrade.java#L1) | Program outline for computing average marks and grades. | Java class structure, grade evaluation logic. |

---

## 📋 Assignment 2 Index: Object-Oriented Programming (OOP)

Folder: [`Assignment-2/`](Assignment-2/README.md)  
Focus: Core OOP principles in Java (Encapsulation, Inheritance, Polymorphism, Abstraction, Interfaces, and Object Relationships).

| S.No. | Problem / File | Key Classes & Symbols | Description | OOP Concepts Demonstrated |
| :--- | :--- | :--- | :--- | :--- |
| 1 | 📄 [Q1University.java](Assignment-2/Q1University.java) | [Professor](Assignment-2/Q1University.java#L3)<br>[Department](Assignment-2/Q1University.java#L22)<br>[Q1University](Assignment-2/Q1University.java#L54) | University department modeling containing multiple professors. | Aggregation (`List<Professor>` in `Department`), custom `toString()`. |
| 2 | 📄 [Q2FlightBooking.java](Assignment-2/Q2FlightBooking.java) | [Flight](Assignment-2/Q2FlightBooking.java#L1)<br>[DomesticFlight](Assignment-2/Q2FlightBooking.java#L34)<br>[InternationalFlight](Assignment-2/Q2FlightBooking.java#L46)<br>[Q2FlightBooking](Assignment-2/Q2FlightBooking.java#L58) | Flight fare computation system with different flight categories. | Abstract classes, abstract methods (`calculateFare()`), runtime polymorphism. |
| 3 | 📄 [Q3EmployeePayroll.java](Assignment-2/Q3EmployeePayroll.java) | [Employee](Assignment-2/Q3EmployeePayroll.java#L1)<br>[Manager](Assignment-2/Q3EmployeePayroll.java#L27)<br>[Q3EmployeePayroll](Assignment-2/Q3EmployeePayroll.java#L48) | Employee payroll system with manager bonus calculations. | Single inheritance, constructor chaining (`super`), method overriding. |
| 4 | 📄 [Q4ShoppingCart.java](Assignment-2/Q4ShoppingCart.java) | [Product](Assignment-2/Q4ShoppingCart.java#L3)<br>[Order](Assignment-2/Q4ShoppingCart.java#L49)<br>[Q4ShoppingCart](Assignment-2/Q4ShoppingCart.java#L88) | E-commerce shopping order computing grand total. | Encapsulation (private fields, getters/setters), Aggregation (`List<Product>`). |
| 5 | 📄 [Q5HospitalManagement.java](Assignment-2/Q5HospitalManagement.java) | [Person](Assignment-2/Q5HospitalManagement.java#L1)<br>[Doctor](Assignment-2/Q5HospitalManagement.java#L11)<br>[Surgeon](Assignment-2/Q5HospitalManagement.java#L20)<br>[Q5HospitalManagement](Assignment-2/Q5HospitalManagement.java#L39) | Hospital staff hierarchy tracking surgeon and specialization details. | Multilevel inheritance (`Person` -> `Doctor` -> `Surgeon`), `super()` constructors. |
| 6 | 📄 [Q6LibraryBookAuthor.java](Assignment-2/Q6LibraryBookAuthor.java) | [Author](Assignment-2/Q6LibraryBookAuthor.java#L1)<br>[Book](Assignment-2/Q6LibraryBookAuthor.java#L31)<br>[Q6LibraryBookAuthor](Assignment-2/Q6LibraryBookAuthor.java#L50) | Library catalog system linking books to authors. | Association / Aggregation (`Author` object embedded in `Book`). |
| 7 | 📄 [Q7SportsLeague.java](Assignment-2/Q7SportsLeague.java) | [Team](Assignment-2/Q7SportsLeague.java#L1)<br>[CricketTeam](Assignment-2/Q7SportsLeague.java#L19)<br>[FootballTeam](Assignment-2/Q7SportsLeague.java#L38)<br>[Q7SportsLeague](Assignment-2/Q7SportsLeague.java#L57) | Sports league points calculation for cricket and football teams. | Hierarchical inheritance (`Team` -> `CricketTeam`, `FootballTeam`), method overriding. |
| 8 | 📄 [Q8LoanManagement.java](Assignment-2/Q8LoanManagement.java) | [Loan](Assignment-2/Q8LoanManagement.java#L1)<br>[HomeLoan](Assignment-2/Q8LoanManagement.java#L15)<br>[CarLoan](Assignment-2/Q8LoanManagement.java#L27)<br>[Q8LoanManagement](Assignment-2/Q8LoanManagement.java#L39) | Bank loan interest calculator for home and car loans. | Abstraction via abstract base class `Loan` and abstract `calculateInterest()`. |
| 9 | 📄 [Q9OnlineCourse.java](Assignment-2/Q9OnlineCourse.java) | [Course](Assignment-2/Q9OnlineCourse.java#L1)<br>[Student](Assignment-2/Q9OnlineCourse.java#L19)<br>[PremiumStudent](Assignment-2/Q9OnlineCourse.java#L37)<br>[Q9OnlineCourse](Assignment-2/Q9OnlineCourse.java#L57) | Online course enrollment with discount tier for premium students. | Association (`Course` in `Student`) coupled with Inheritance (`PremiumStudent`). |
| 10 | 📄 [Q10SmartHome.java](Assignment-2/Q10SmartHome.java) | [Device](Assignment-2/Q10SmartHome.java#L1)<br>[Fan](Assignment-2/Q10SmartHome.java#L6)<br>[Light](Assignment-2/Q10SmartHome.java#L19)<br>[Q10SmartHome](Assignment-2/Q10SmartHome.java#L32) | Smart home controller for connected appliances. | Interfaces (`Device` contract), interface implementation, runtime polymorphism. |
| 11 | 📄 [Q11HostelAllocation.java](Assignment-2/Q11HostelAllocation.java) | [Room](Assignment-2/Q11HostelAllocation.java#L1)<br>[Student](Assignment-2/Q11HostelAllocation.java#L43)<br>[Q11HostelAllocation](Assignment-2/Q11HostelAllocation.java#L64) | Student hostel room allocation records. | Encapsulation, object aggregation (`Room` linked to `Student`). |
| 12 | 📄 [Q12VehicleRental.java](Assignment-2/Q12VehicleRental.java) | [Vehicle](Assignment-2/Q12VehicleRental.java#L1)<br>[Car](Assignment-2/Q12VehicleRental.java#L17)<br>[Bike](Assignment-2/Q12VehicleRental.java#L36)<br>[Q12VehicleRental](Assignment-2/Q12VehicleRental.java#L55) | Vehicle rental system with custom multipliers for cars and bikes. | Inheritance, dynamic method overriding (`calculateRent()`), polymorphism. |
| 13 | 📄 [Q13HotelReservation.java](Assignment-2/Q13HotelReservation.java) | [Guest](Assignment-2/Q13HotelReservation.java#L3)<br>[Reservation](Assignment-2/Q13HotelReservation.java#L32)<br>[Q13HotelReservation](Assignment-2/Q13HotelReservation.java#L63) | Hotel booking records with multi-guest lists. | Aggregation (`List<Guest>` inside `Reservation`), formatted output. |
| 14 | 📄 [Q14BankingATM.java](Assignment-2/Q14BankingATM.java) | [Account](Assignment-2/Q14BankingATM.java#L1)<br>[Q14BankingATM](Assignment-2/Q14BankingATM.java#L31) | ATM account simulation with deposit, withdrawal, and balance check. | Data hiding and encapsulation (private fields with safe state mutators). |
| 15 | 📄 [Q15PassportCitizen.java](Assignment-2/Q15PassportCitizen.java) | [Passport](Assignment-2/Q15PassportCitizen.java#L1)<br>[Citizen](Assignment-2/Q15PassportCitizen.java#L34)<br>[Q15PassportCitizen](Assignment-2/Q15PassportCitizen.java#L58) | Citizen identity tracking with associated passport profile. | One-to-one Association / Composition (`Passport` embedded in `Citizen`). |

---

## 🛠️ How to Compile & Run

To run any of the assignment programs locally:

1. **Navigate to the target assignment directory**:
   ```bash
   # For Assignment 1
   cd Assignment-1

   # Or for Assignment 2
   cd Assignment-2
   ```

2. **Compile the Java file**:
   ```bash
   javac <FileName>.java
   # Example: javac Q1University.java
   ```

3. **Execute the compiled bytecode**:
   ```bash
   java <ClassName>
   # Example: java Q1University
   ```

---

## 📌 Repository Guidelines
- **Directory Structure**: Each assignment is isolated in its own dedicated directory (`Assignment-1/`, `Assignment-2/`, etc.).
- **Clean Git Tracking**: Bytecode (`*.class` files) and editor configuration files are automatically ignored via [.gitignore](.gitignore).
