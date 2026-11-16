-- CSIT751 Core Java: Module VI Database Script
-- Database: company_db
-- Table: employees

CREATE DATABASE IF NOT EXISTS company_db;
USE company_db;

CREATE TABLE IF NOT EXISTS employees (
    emp_id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    department VARCHAR(50) NOT NULL,
    salary DECIMAL(10, 2) NOT NULL
);

-- Sample Data
INSERT INTO employees (emp_id, name, department, salary) VALUES
(101, 'Rahul Sharma', 'IT', 75000.00),
(102, 'Priya Verma', 'Human Resources', 62000.00),
(103, 'Amit Patel', 'Finance', 68000.00)
ON DUPLICATE KEY UPDATE name=VALUES(name);
