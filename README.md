# MCA Core Java Programming

Welcome to the Core Java repository for my Master of Computer Applications (MCA) class. This repository serves as a centralized log and collection of all lab work, assignments, and practice programs developed throughout the semester.

---

## 📂 Repository Directory Structure

```text
Pg_Java/
├── .gitignore
├── README.md
└── Assignment-1/
    ├── Main.java
    ├── problem1.java
    ├── problem2.java
    ├── problem3.java
    ├── problem4.java
    ├── problem5.java
    └── problem6.java
```

---

## 📋 Assignment 1 Index & Mapping

Below is the detailed mapping of all files and problems for **Assignment 1**. The links below are relative, allowing you or any visitor (such as classmates or instructors on GitHub/GitLab) to directly open the source files by clicking on them:

| Problem / File | Description | Class & Key Symbols | Concepts Demonstrated |
| :--- | :--- | :--- | :--- |
| 📄 [Main.java](Assignment-1/Main.java) | Demonstration of custom classes and scanner inputs for student info. | - Class [Main](Assignment-1/Main.java#L4)<br>- Class [Studentclass](Assignment-1/Main.java#L12) | Standard console output, custom helper methods, Scanner inputs. |
| 📄 [problem1.java](Assignment-1/problem1.java) | Displaying hardcoded student details (name, roll, marks of maths, science, physics). | - Class [problem1](Assignment-1/problem1.java#L3) | Variable initialization, console standard output, data types. |
| 📄 [problem2.java](Assignment-1/problem2.java) | Program to convert temperature from Celsius to Fahrenheit. | - Class [problem2](Assignment-1/problem2.java#L2) | Arithmetic operators, type conversion, precision handling. |
| 📄 [problem3.java](Assignment-1/problem3.java) | Basic calculator taking two integers as input to perform addition, subtraction, multiplication, and division. | - Class [problem3](Assignment-1/problem3.java#L4) | Interactive input using `java.util.Scanner`, arithmetic operations. |
| 📄 [problem4.java](Assignment-1/problem4.java) | Program to check voting eligibility by evaluating if age is greater than or equal to 18. | - Class [problem4](Assignment-1/problem4.java#L3) | Conditional checking (`if-else` statement). |
| 📄 [problem5.java](Assignment-1/problem5.java) | Calculator program that accepts two numbers and an operator (`+`, `-`, `*`, `/`) and computes the result. | - Class [problem5](Assignment-1/problem5.java#L3) | Nested conditional checks, character input handling using `sc.next().charAt(0)`. |
| 📄 [problem6.java](Assignment-1/problem6.java) | Multiplication table generator for a given number. | - Class [problem6](Assignment-1/problem6.java#L4) | Looping constructs (`for` loop), standard string concatenation. |

---

## 🛠️ How to Compile & Run

To run any of the assignment programs:

1. Navigate to the assignment folder:
   ```bash
   cd Assignment-1
   ```
2. Compile the Java file (e.g., `problem6.java`):
   ```bash
   javac problem6.java
   ```
3. Run the compiled class file:
   ```bash
   java problem6
   ```

---

## 📌 Contribution / Organization Guidelines
When adding new lab exercises or assignments:
1. **Directory Structure**: Put assignment programs in their respective folders (e.g., `Assignment-2/`, `Assignment-3/`).
2. **Naming Conventions**: Use `CamelCase` for all class/file names where possible.
3. **Git Cleanliness**: Ensure compiled `.class` files are ignored (managed by the root [.gitignore](.gitignore)).
