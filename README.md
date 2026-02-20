
# NinjaV7

## Overview
NinjaV7 is a robust UI Automation Framework built using Java, Selenium WebDriver, TestNG, and Maven.  
It follows industry best practices such as the Page Object Model (POM) design pattern to ensure scalability, maintainability, and clean separation of concerns.

This framework simulates a real-world enterprise automation project designed for CI/CD integration and parallel execution.

---

## Key Highlights

- Built with Java + Selenium + TestNG
- Implements Page Object Model (POM)
- Supports parallel execution
- Uses explicit waits to reduce test flakiness
- Maven-managed dependencies
- CI/CD ready structure

---

## Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Maven
- WebDriverManager

---

## Framework Architecture

### Base Layer
Handles:
- WebDriver initialization
- Browser setup and teardown
- Common test configurations

### Page Layer (POM)
- Encapsulates web elements
- Contains reusable page actions
- Centralizes locator management

### Test Layer
- Organized by feature
- Uses TestNG annotations
- Clean separation from UI logic

### Utilities
- Wait utilities
- Config reader
- Screenshot handling
- Reusable helpers

---

## How to Execute

### Run All Tests
```
mvn clean test
```

### Run via TestNG XML
Execute `testng.xml` from your IDE.

---

## Reporting

Default TestNG reports generated under:
```
/test-output
```

---

## CI/CD Integration

Framework supports integration with:
- GitHub Actions
- Jenkins
- Other CI tools

---

## Author

QA Automation Engineer specializing in scalable Selenium automation frameworks.
