
# NinjaV7

## Overview
NinjaV7 is a UI Automation Framework built with **Java**, **Selenium WebDriver**, **TestNG**, and **Maven**.  
It follows the **Page Object Model (POM)** design pattern to keep tests maintainable and scalable.

In addition to UI testing, the framework includes:
- **Extent Reports** (HTML reporting)
- **Log4j2** (logging)
- **Apache POI** (Excel/test data support)
- **Commons Email** (email utilities)

## Tech Stack
- Java
- Selenium WebDriver
- TestNG
- Maven
- Extent Reports
- Log4j2
- Apache POI (Excel)
- Commons Email

## Project Structure
Typical folders in this repo include:

- `src/` — framework source + tests
- `testng.xml` — TestNG suite runner
- `pom.xml` — Maven dependencies + build config
- `reports/` — generated Extent reports (HTML)
- `test-output/` — TestNG output folder
- `screenshots/` — screenshots captured during execution
- `logs/` — Log4j2 logs
- `testData/` — test data (often Excel files)

## Key Highlights
- Page Object Model (POM) for maintainability
- Explicit waits to reduce flaky failures
- Extent Reports integration for clear HTML reporting
- Screenshot capture to support debugging and reporting
- Log4j2 logging for execution traceability
- Excel-based test data support (Apache POI)
- Maven + TestNG execution (CI/CD friendly)

## Prerequisites
- Java (recommended: 11+)
- Maven
- A supported browser (ex: Chrome)

## How To Run

## Run all tests (Maven)
```bash
mvn clean test
```

## Run using TestNG suite
Run `testng.xml` from your IDE (Right-click -> Run).

## Reporting

## Extent Reports
Extent Reports generate an HTML execution report (location depends on implementation).  
Common output locations used in this repo:
- `reports/`
- `test-output/`

## TestNG Reports
TestNG default reports are generated under:
- `test-output/`

## Logging
Logging is handled using **Log4j2**. Logs are typically written under:
- `logs/`

## Test Data
Excel/data-driven support is provided using **Apache POI**. Test data is typically stored under:
- `testData/`

## Notes
- If you are running tests in parallel, ensure WebDriver handling is thread-safe (ex: ThreadLocal WebDriver).
- Screenshots may be captured on failure for faster debugging.

## Author
QA Automation Engineer
