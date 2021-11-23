# Student Management System

## Overview

Student Management System is a simple app with functionality to create, edit or delete Student entries to and from a database.
Each entry has a first name, last name and an email. 

The app is build using Spring Boot and Thymeleaf. 
It communicates with a MySQL database. 

## Installation

### MySQL

MySQL database is specified to run on `port:3306` with username=`root` and password=`pass`.
Data is stored in `sms` database which is required to exist prior lunching app. 

Run the following query to create the required database:
```
CREATE DATABASE sms;
```

### Download app

Clone repository:
```
git clone https://github.com/albertkuc/student-management-system.git
```