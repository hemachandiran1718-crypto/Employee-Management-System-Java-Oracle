# 👨‍💼 Employee Management System (Java + Oracle)

## 📌 Overview
This project is a simple **Employee Management System** developed using:
- Java (Core Java)
- JDBC (Java Database Connectivity)
- Oracle Database

It performs basic **CRUD operations**:
- ➕ Add Employee
- 🔄 Update Employee
- 🔍 Fetch Single Employee
- 📋 Fetch All Employees
- ❌ Delete Employee

---

## 🛠️ Technologies Used
- Java
- JDBC
- Oracle Database (XE)
- Eclipse IDE

---

## 🗄️ Database Setup

### Create Table
```sql
CREATE TABLE employee2 (
    empid NUMBER PRIMARY KEY,
    empname VARCHAR2(50),
    designation VARCHAR2(50)
);
