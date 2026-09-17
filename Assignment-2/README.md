# Assignment 2 - Object-Oriented Programming (OOP) in Java

This folder contains the programming solutions for **Assignment 2** of the MCA Core Java class, covering core Object-Oriented Programming (OOP) principles including Encapsulation, Inheritance, Polymorphism, Abstraction, Interfaces, and Object Relationships (Association, Aggregation, Composition).

---

## 📂 File Index & Problem Mapping

The links below are relative, allowing anyone viewing this folder to directly open the source files:

| S.No. | File | Key Classes | Description | OOP Concepts Covered |
| :--- | :--- | :--- | :--- | :--- |
| 1 | [Q1University.java](Q1University.java) | [Professor](Q1University.java#L3), [Department](Q1University.java#L22), [Q1University](Q1University.java#L54) | Models university departments with professors. | Aggregation (`List<Professor>` in `Department`), `toString()` override. |
| 2 | [Q2FlightBooking.java](Q2FlightBooking.java) | [Flight](Q2FlightBooking.java#L1), [DomesticFlight](Q2FlightBooking.java#L34), [InternationalFlight](Q2FlightBooking.java#L46), [Q2FlightBooking](Q2FlightBooking.java#L58) | Flight fare computation system. | Abstract classes, abstract methods (`calculateFare()`), polymorphism. |
| 3 | [Q3EmployeePayroll.java](Q3EmployeePayroll.java) | [Employee](Q3EmployeePayroll.java#L1), [Manager](Q3EmployeePayroll.java#L27), [Q3EmployeePayroll](Q3EmployeePayroll.java#L48) | Payroll calculation with base salary and bonus. | Single inheritance, constructor chaining (`super`), method overriding. |
| 4 | [Q4ShoppingCart.java](Q4ShoppingCart.java) | [Product](Q4ShoppingCart.java#L3), [Order](Q4ShoppingCart.java#L49), [Q4ShoppingCart](Q4ShoppingCart.java#L88) | E-commerce shopping cart calculating order totals. | Encapsulation (private fields, getters/setters), Aggregation (`List<Product>`). |
| 5 | [Q5HospitalManagement.java](Q5HospitalManagement.java) | [Person](Q5HospitalManagement.java#L1), [Doctor](Q5HospitalManagement.java#L11), [Surgeon](Q5HospitalManagement.java#L20), [Q5HospitalManagement](Q5HospitalManagement.java#L39) | Hospital staff hierarchy tracking surgeon details. | Multilevel inheritance (`Person` -> `Doctor` -> `Surgeon`), `super()` constructors. |
| 6 | [Q6LibraryBookAuthor.java](Q6LibraryBookAuthor.java) | [Author](Q6LibraryBookAuthor.java#L1), [Book](Q6LibraryBookAuthor.java#L31), [Q6LibraryBookAuthor](Q6LibraryBookAuthor.java#L50) | Library book tracking with associated author details. | Association / Aggregation (`Author` referenced in `Book`), encapsulation. |
| 7 | [Q7SportsLeague.java](Q7SportsLeague.java) | [Team](Q7SportsLeague.java#L1), [CricketTeam](Q7SportsLeague.java#L19), [FootballTeam](Q7SportsLeague.java#L38), [Q7SportsLeague](Q7SportsLeague.java#L57) | Sports league points calculation for different sports. | Hierarchical inheritance (`Team` -> `CricketTeam`, `FootballTeam`), method overriding. |
| 8 | [Q8LoanManagement.java](Q8LoanManagement.java) | [Loan](Q8LoanManagement.java#L1), [HomeLoan](Q8LoanManagement.java#L15), [CarLoan](Q8LoanManagement.java#L27), [Q8LoanManagement](Q8LoanManagement.java#L39) | Loan interest calculations for home and car loans. | Abstraction via abstract class `Loan` and abstract method `calculateInterest()`. |
| 9 | [Q9OnlineCourse.java](Q9OnlineCourse.java) | [Course](Q9OnlineCourse.java#L1), [Student](Q9OnlineCourse.java#L19), [PremiumStudent](Q9OnlineCourse.java#L37), [Q9OnlineCourse](Q9OnlineCourse.java#L57) | Course enrollment with premium student discount tier. | Association (`Course` in `Student`) combined with Inheritance (`PremiumStudent`). |
| 10 | [Q10SmartHome.java](Q10SmartHome.java) | [Device](Q10SmartHome.java#L1), [Fan](Q10SmartHome.java#L6), [Light](Q10SmartHome.java#L19), [Q10SmartHome](Q10SmartHome.java#L32) | Smart home device controllers (Fan, Light). | Interfaces (`Device`), interface implementation, runtime polymorphism. |
| 11 | [Q11HostelAllocation.java](Q11HostelAllocation.java) | [Room](Q11HostelAllocation.java#L1), [Student](Q11HostelAllocation.java#L43), [Q11HostelAllocation](Q11HostelAllocation.java#L64) | Hostel room allocation management for students. | Encapsulation, object aggregation (`Room` linked to `Student`). |
| 12 | [Q12VehicleRental.java](Q12VehicleRental.java) | [Vehicle](Q12VehicleRental.java#L1), [Car](Q12VehicleRental.java#L17), [Bike](Q12VehicleRental.java#L36), [Q12VehicleRental](Q12VehicleRental.java#L55) | Vehicle rental system with custom rate multipliers. | Inheritance, method overriding (`calculateRent()`), polymorphism. |
| 13 | [Q13HotelReservation.java](Q13HotelReservation.java) | [Guest](Q13HotelReservation.java#L3), [Reservation](Q13HotelReservation.java#L32), [Q13HotelReservation](Q13HotelReservation.java#L63) | Hotel booking management with multiple guests. | Aggregation (`List<Guest>` inside `Reservation`), formatted reports. |
| 14 | [Q14BankingATM.java](Q14BankingATM.java) | [Account](Q14BankingATM.java#L1), [Q14BankingATM](Q14BankingATM.java#L31) | ATM account transactions (deposit, withdraw, balance check). | Data hiding and encapsulation (private fields with controlled mutators). |
| 15 | [Q15PassportCitizen.java](Q15PassportCitizen.java) | [Passport](Q15PassportCitizen.java#L1), [Citizen](Q15PassportCitizen.java#L34), [Q15PassportCitizen](Q15PassportCitizen.java#L58) | Citizen identity tracking with linked passport. | One-to-one Association / Composition (`Passport` embedded in `Citizen`). |

---

## 🛠️ How to Compile & Run

```bash
# Compile any program
javac Q1University.java

# Run the compiled bytecode
java Q1University
```

---
*For repository-wide overview and guides, refer to the root [README.md](../README.md).*
