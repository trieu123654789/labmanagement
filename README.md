# Lab Management System (Java Swing)

## Overview
This is a **Lab Management System** project built with **Java Swing** (desktop application).  
The system manages information about **batch, feedback, lab, learning_report, schedule, students, technology**.

Main goal: support managing lab schedules, student batches, learning reports, and collecting feedback.

---

## Environment Requirements
* **Java JDK 11+** (tested with JDK 11 and JDK 19)  
* **SQL Server** 2019+ (or compatible versions)  
* IDE (IntelliJ IDEA / Eclipse / NetBeans) or run JAR directly if already built  
* (Optional) Apache Ant/Maven for automated builds  

---

## Database Setup
1. Create a new database in SQL Server, for example:
   ```sql
   CREATE DATABASE LabManagement;
   GO
   USE LabManagement;
   ```
2. Run the provided script [`labmanagement.sql`](labmanagement.sql) to create all tables, relationships, constraints, and insert default data.  
3. Update the project database connection configuration (file `config.properties`):
   ```
   db.url=jdbc:sqlserver://localhost:1433;databaseName=LabManagement;encrypt=false
   db.username=sa
   db.password=your_password
   ```
4. Ensure the SQL Server user has the necessary rights (CREATE/SELECT/INSERT/UPDATE/DELETE).  

---

## Build & Run

### Run from IDE
* Open the project in IntelliJ IDEA / Eclipse.  
* Configure the SDK (JDK 11+).  
* Run the main Swing class (e.g., `com.yourorg.lms.Main`).  


## Test Accounts
Default test accounts included in `labmanagement.sql`:

* **Admin**  
  * Username: `admin`  
  * Password: `admin1234`  

* **Student**  
  * Username: `cqt123`  
  * Password: `1234`  

---

## Key Features
* Manage **Technology** 
* Manage **Lab** 
* Manage **Batch** 
* Manage **Students** 
* Manage **Schedule** 
* Submit and manage **Learning Reports**  
* Collect **Feedback** 
* Role-based UI: **Admin** and **Student** (Admin has higher privileges)  

---

---

## Quick Smoke Test
1. Start SQL Server and the application.  
2. Log in using `admin` / `admin1234`.  
3. Create a new `Technology` (e.g., Java Core).  
4. Create a `Batch` linked to that technology.  
5. Create a `Student` with username `cqt123` and password `1234`.  
6. Create a `Schedule` for the batch, assign lab and date.  
7. Log in as `cqt123` and submit a `Learning Report` or provide `Feedback`.  

---

## Project Structure
* `src/` — Java source code  
* `resources/` — config files  
* `lib/` — external libraries (SQL Server JDBC driver if not using Maven)  
* `db/labmanagement.sql` — SQL Server schema + seed data  
* `README.md` — this file  

