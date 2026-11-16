# Module 3 - Exception Handling, Interface and Thread in Java

This folder contains the programming solutions for **Module 3** (Practical Home Assignment) of the MCA Core Java class, covering robust Exception Handling (`throw`, `throws`, `try-catch-finally`, custom exceptions) and Multithreading (`Thread` class, `Runnable` interface, synchronization, thread priorities, and inter-thread coordination).

---

## 📂 File Index & Problem Mapping

The links below are relative, allowing anyone viewing this folder to directly open the source files:

| S.No. | File | Key Classes | Description | Concepts Covered |
| :--- | :--- | :--- | :--- | :--- |
| 1 | [Q1ATMWithdrawalSystem.java](Q1ATMWithdrawalSystem.java) | [ATM](Q1ATMWithdrawalSystem.java#L3), [Q1ATMWithdrawalSystem](Q1ATMWithdrawalSystem.java#L22) | ATM cash withdrawal validating sufficient balance. | Exception handling, `throw`, `try-catch`, `finally` block. |
| 2 | [Q2StudentAgeValidation.java](Q2StudentAgeValidation.java) | [InvalidAgeException](Q2StudentAgeValidation.java#L3), [Student](Q2StudentAgeValidation.java#L9), [Q2StudentAgeValidation](Q2StudentAgeValidation.java#L28) | Validates student registration eligibility (age > 17). | Custom / user-defined exception (`InvalidAgeException`). |
| 3 | [Q3ArrayDivision.java](Q3ArrayDivision.java) | [Q3ArrayDivision](Q3ArrayDivision.java#L4) | Divides array element by divisor with multiple exception catches. | Multiple `catch` blocks (`ArithmeticException`, `ArrayIndexOutOfBoundsException`). |
| 4 | [Q4StudentMarks.java](Q4StudentMarks.java) | [Q4StudentMarks](Q4StudentMarks.java#L3) | Validates marks range (0–100) and displays closing acknowledgement. | Input validation, custom exception trigger, `try-catch-finally`. |
| 5 | [Q5UniversityLogin.java](Q5UniversityLogin.java) | [Q5UniversityLogin](Q5UniversityLogin.java#L3) | Handles null username entries gracefully during authentication. | `NullPointerException` prevention and handling. |
| 6 | [Q6OnlineShopping.java](Q6OnlineShopping.java) | [MinimumAmountException](Q6OnlineShopping.java#L3), [Q6OnlineShopping](Q6OnlineShopping.java#L9) | Validates cart value against ₹500 minimum purchase requirement. | User-defined exception (`MinimumAmountException`), business rules. |
| 7 | [Q7TicketBooking.java](Q7TicketBooking.java) | [TicketBooking](Q7TicketBooking.java#L3), [User1](Q7TicketBooking.java#L21), [User2](Q7TicketBooking.java#L38), [Q7TicketBooking](Q7TicketBooking.java#L55) | Synchronized multi-user railway ticket reservation system. | Multithreading, `Thread` subclassing, `synchronized` methods, race condition prevention. |
| 8 | [Q8PrinterJob.java](Q8PrinterJob.java) | [PrinterJob](Q8PrinterJob.java#L3), [Q8PrinterJob](Q8PrinterJob.java#L20) | Concurrent student print job spooler using Runnable tasks. | `Runnable` interface, thread spawning, simulated execution via `Thread.sleep()`. |
| 9 | [Q9IoTSensorMonitoring.java](Q9IoTSensorMonitoring.java) | [SquareCalculator](Q9IoTSensorMonitoring.java#L4), [CubeCalculator](Q9IoTSensorMonitoring.java#L18), [RandomNumberGenerator](Q9IoTSensorMonitoring.java#L32), [Q9IoTSensorMonitoring](Q9IoTSensorMonitoring.java#L80) | Sensor generating numbers every second; processes squares (even) and cubes (odd) on separate threads. | Multi-threaded pipeline, thread delegation, timed execution (`Thread.sleep()`). |
| 10 | [Q10BankTransaction.java](Q10BankTransaction.java) | [BankTransactionItem](Q10BankTransaction.java#L3), [Q10BankTransaction](Q10BankTransaction.java#L18) | Schedules high-value and low-value banking transactions by thread priority. | Thread priorities (`MAX_PRIORITY`, `MIN_PRIORITY`), thread management. |

---

## 🛠️ How to Compile & Run

```bash
# Compile any program
javac Q1ATMWithdrawalSystem.java

# Run the compiled bytecode
java Q1ATMWithdrawalSystem
```

---
*For repository-wide overview and guides, refer to the root [README.md](../README.md).*
