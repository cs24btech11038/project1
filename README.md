# Arbitrary Precision Arithmetic Library

This is a Java-based library that performs arithmetic operations on integers and floating-point numbers with **arbitrary precision** using `BigInteger` and `BigDecimal`. It supports both **library mode** (for developers) and **command-line mode** (for users).

## Features

- Supports arbitrarily large integers (`AInteger`)
- Supports floating-point numbers with high precision (`AFloat`)
- Operations: Addition, Subtraction, Multiplication, Division
- Clean CLI interface
- Modular, object-oriented design

## Project Structure

arbitraryarithmetic/
│
├── AInteger.java # Arbitrary-precision integer class
├── AFloat.java # Arbitrary-precision float class
├── Arithmetic.java # Generic interface for arithmetic operations
├── MyInfArith.java # Command-line interface entry point
├── build.py # Python script to compile and run
└── README.md # Project documentation

## How to Compile and Run

You can use the provided `build.py` script for easier compilation and execution.

### Prerequisites

- Java (JDK 17+ recommended)
- Python 3 (for build script)

### Steps

```bash
# Clone the repository
git clone git@github.com:cs24btech11038/project1.git
cd project1

# Run using build script
python3 build.py

