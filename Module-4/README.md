# Module 4 - Collections and GUI Programming

This folder contains the programming solutions for **Module 4** (Practical Home Assignment) of the MCA Core Java class, covering the Java Collections Framework (`ArrayList`, `HashSet`, `HashMap`, `LinkedHashSet`, `Iterator`) and Graphical User Interface (GUI) programming using **AWT** and **Swing** with event-driven architecture.

---

## 📂 File Index & Problem Mapping

The links below are relative, allowing anyone viewing this folder to directly open the source files:

| S.No. | File | Key Classes | Description | Concepts Covered |
| :--- | :--- | :--- | :--- | :--- |
| 1 | [Q1LibraryManagement.java](Q1LibraryManagement.java) | [Library](Q1LibraryManagement.java#L4), [Q1LibraryManagement](Q1LibraryManagement.java#L39) | Menu-driven library catalog allowing book addition, removal, and listing. | `ArrayList<String>` operations (`add`, `remove`, iteration). |
| 2 | [Q2AttendanceSystem.java](Q2AttendanceSystem.java) | [Attendance](Q2AttendanceSystem.java#L4), [Q2AttendanceSystem](Q2AttendanceSystem.java#L29) | Student classroom attendance recording preventing duplicate entries. | `HashSet<String>`, set uniqueness, element containment check. |
| 3 | [Q3BankDirectory.java](Q3BankDirectory.java) | [Q3BankDirectory](Q3BankDirectory.java#L5) | Bank customer lookup mapping account numbers to customer names. | `HashMap<Integer, String>`, key-value storage, lookup, key-based retrieval. |
| 4 | [Q4InventoryManagement.java](Q4InventoryManagement.java) | [Inventory](Q4InventoryManagement.java#L6), [Q4InventoryManagement](Q4InventoryManagement.java#L39) | Product inventory system mapping product IDs to stock, traversed via iterator. | `HashMap<Integer, Integer>`, `entrySet()`, `Iterator` traversal. |
| 5 | [Q5CourseEnrollment.java](Q5CourseEnrollment.java) | [Q5CourseEnrollment](Q5CourseEnrollment.java#L4) | Course enrollment list maintaining FIFO insertion order with duplicate suppression. | `LinkedHashSet<String>`, ordered uniqueness, hashing. |
| 6 | [Q6StudentRegistrationForm.java](Q6StudentRegistrationForm.java) | [Q6StudentRegistrationForm](Q6StudentRegistrationForm.java#L4) | Comprehensive student registration form with input validation and dialog popup. | Java AWT (`Frame`, `Label`, `TextField`, `Choice`, `Checkbox`, `Dialog`, `FlowLayout`, `GridLayout`), `ActionListener`. |
| 7 | [Q7CalculatorForm.java](Q7CalculatorForm.java) | [Q7CalculatorForm](Q7CalculatorForm.java#L5) | Interactive GUI calculator supporting addition, subtraction, multiplication, and division. | Java Swing (`JFrame`, `JTextField`, `JButton`, `BorderLayout`, `GridLayout`), event handling, `ActionListener`. |

---

## 🛠️ How to Compile & Run

```bash
# Compile any program
javac Q1LibraryManagement.java

# Run console programs
java Q1LibraryManagement

# Run GUI programs (ensure desktop display environment)
javac Q7CalculatorForm.java
java Q7CalculatorForm
```

---
*For repository-wide overview and guides, refer to the root [README.md](../README.md).*
