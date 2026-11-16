# Module 6 - Database Programming using JDBC

This folder contains the complete implementation for **Module 6** (Practical Home Assignment) of the MCA Core Java class: a desktop application named **EmployeeManagement** developed using **Java Swing** for the graphical user interface and **JDBC** to perform database operations on a MySQL database (`company_db`).

---

## 📂 Directory Structure

```text
Module-6/
├── README.md
└── EmployeeManagement/
    ├── run.bat                   # One-click compile & launch script
    ├── src/
    │   └── com/
    │       └── example/
    │           ├── EmployeeForm.java     (Swing frontend)
    │           └── EmployeeDAO.java      (JDBC logic & data model)
    ├── lib/
    │   └── mysql-connector-java.jar      (MySQL JDBC Driver)
    └── sql/
        └── company_db.sql                (Database and table creation script)
```

---

## 📋 Component Index & Implementation Details

| S.No. | Component / File | Key Classes | Description | Concepts Covered |
| :--- | :--- | :--- | :--- | :--- |
| 1 | [EmployeeForm.java](EmployeeManagement/src/com/example/EmployeeForm.java) | [EmployeeForm](EmployeeManagement/src/com/example/EmployeeForm.java#L11) | Desktop GUI containing employee input fields (ID, Name, Department, Salary), submission action, and tabular list display. | Java Swing (`JFrame`, `JTextField`, `JButton`, `JTable`, `DefaultTableModel`, `JScrollPane`), `ActionListener`. |
| 2 | [EmployeeDAO.java](EmployeeManagement/src/com/example/EmployeeDAO.java) | [EmployeeDAO](EmployeeManagement/src/com/example/EmployeeDAO.java#L11), [Employee](EmployeeManagement/src/com/example/EmployeeDAO.java#L69) | Manages database connectivity, record insertion with parameterized queries, and all-record retrieval. | JDBC API (`DriverManager`, `Connection`, `PreparedStatement`, `Statement`, `ResultSet`), DAO architectural pattern. |
| 3 | [company_db.sql](EmployeeManagement/sql/company_db.sql) | `company_db`, `employees` | Database initialization script defining `company_db` schema and `employees` table structure. | Relational Database Design, SQL DDL (`CREATE DATABASE`, `CREATE TABLE`), Primary Keys. |
| 4 | [mysql-connector-java.jar](EmployeeManagement/lib/mysql-connector-java.jar) | `com.mysql.cj.jdbc.Driver` | MySQL Connector/J driver archive for establishing JDBC socket communication. | External JAR dependency, classpath configuration. |

---

## 🗄️ Database Setup Instructions

1. Start your local **MySQL Server** (default port `3306`).
2. Run the provided script using the MySQL CLI or phpMyAdmin / MySQL Workbench:
   ```bash
   mysql -u root -p < EmployeeManagement/sql/company_db.sql
   ```
3. Alternatively, execute these statements directly:
   ```sql
   CREATE DATABASE IF NOT EXISTS company_db;
   USE company_db;

   CREATE TABLE IF NOT EXISTS employees (
       emp_id INT PRIMARY KEY,
       name VARCHAR(100) NOT NULL,
       department VARCHAR(50) NOT NULL,
       salary DECIMAL(10, 2) NOT NULL
   );
   ```

---

## 🛠️ How to Compile & Run

### Method 1: Using the Automated Run Script (Windows)
Double-click [run.bat](EmployeeManagement/run.bat) inside the `EmployeeManagement` directory to compile and launch the Swing GUI in one click.

### Method 2: Manual Terminal Commands
Navigate to `Module-6/EmployeeManagement`:
```bash
cd EmployeeManagement

# Compile source files against the bundled JDBC driver
javac -cp "lib/mysql-connector-java.jar" -d bin src/com/example/*.java

# Run the Swing application
java -cp "bin;lib/mysql-connector-java.jar" com.example.EmployeeForm
```
*(On macOS/Linux, replace the semicolon `;` in the classpath with a colon `:`)*

---
*For repository-wide overview and guides, refer to the root [README.md](../README.md).*
