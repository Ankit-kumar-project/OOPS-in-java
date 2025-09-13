<pre>
# Java OOP Practice Projects

This repository contains multiple mini-projects to practice Object-Oriented Programming in Java.

## Project 1
This project demonstrates core **OOP concepts** in Java:

- **Constructors** (overloaded)  
- **Access Modifiers** (private, protected, public)  
- **Method Overloading** (print with/without parameters)  
- **Inheritance** (`PeriodicSequence` extends `Sequence`)  
- **Method Overriding** (custom print in subclass)  

### Features
- Print a sequence in one line or in column format  
- Extend sequence behavior with periodic repetition  

### Usage
1. Compile and run the program  
2. `Sequence` prints:
   - flat  
   - with 3 columns  
   - with 4 columns  
3. `PeriodicSequence` prints:
   - default (periodic rows)  
   - with 3 columns

## Project 2
A simple Java program to demonstrate **basic OOP concepts**.  

## ✨ Features
- Four private attributes: `id`, `ISBN`, `category`, `name`  
- Static field `lastID` to auto-generate unique IDs  
- Methods:  
  - `getID()` → returns book ID  
  - `setName(String)` → updates book name  
  - `toString()` → nicely prints details  
  - `dumpString()` → exports data as `$$`-separated string  
  - `createBook(String)` → creates a `Book` from dump string 


...


Folder Structure : 

   OOPS-in-java
      |
      |--Project1
      |     |
      |     |--Question.pdf
      |     |--Sequence.java
      |     |--PeriodicSequence.java
      |     |--Output.png
      |
      |--Project2
            |
            |--Question.pdf
            |--Book.java
            |--Output.png
</pre>