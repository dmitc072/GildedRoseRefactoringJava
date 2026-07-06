# Gilded Rose Refactoring Kata
> SWE 6733 – Emerging Software Engineering Processes
> Kennesaw State University

## Team Name
Mob Masters

## Team Members

| Name | Role |
|------|------|
| Duane Mitchell | Driver / Developer |
| Jazmin Johnson | Navigator / Developer |
| Yamani Barnes | Navigator / Developer |

## Collaboration Tools

| Tool | Purpose | Rationale |
|------|---------|-----------|
| Discord | Voice chat and screen sharing | Allows real-time communication and screen sharing during remote mob programming sessions. |
| GitHub | Version control | Enables collaborative development, code reviews, and version history. |
| IntelliJ IDEA | Java development | Supports JUnit testing, debugging, refactoring, and code coverage. |

## Mob Programming Workflow

- We meet remotely using Discord.
- One member acts as the driver while the others act as navigators.
- We rotate the driver role during the session.
- Changes are committed to GitHub after team review.


## Assignment Deliverables

### Code Coverage
- Code coverage screenshot: `code-coverage.png`

### Unit Test Results
- Test results: `test-results.png`

### Mob Programming – Refactoring Session
Our team collaborated using mob programming to refactor the legacy Gilded Rose code while preserving its existing behavior through continuous unit testing. The refactoring focused on reducing code duplication, simplifying conditional logic, and improving readability while ensuring all tests continued to pass.

**Video:** https://youtu.be/ZmDU2nFe6rQ

### Mob Programming – TDD: Conjured Feature
Our team used Test-Driven Development (TDD) to implement the new Conjured inventory item. We first wrote failing unit tests, implemented the production code to make the tests pass, verified that Conjured items degrade twice as fast as ordinary items, and confirmed that the complete JUnit test suite passed successfully.

**Video:** https://youtu.be/2QhdJU2_eyA
# Gilded Rose starting position in Java

## Run the TextTest Fixture from Command-Line

```
./gradlew -q text
```

### Specify Number of Days

For e.g. 10 days:

```
./gradlew -q text --args 10
```

You should make sure the gradle commands shown above work when you execute them in a terminal before trying to use TextTest (see below).


## Run the TextTest approval test that comes with this project

There are instructions in the [TextTest Readme](../texttests/README.md) for setting up TextTest. What's unusual for the Java version is there are two executables listed in [config.gr](../texttests/config.gr) for Java. The first uses Gradle wrapped in a python script. Uncomment these lines to use it:

    executable:${TEXTTEST_HOME}/Java/texttest_rig.py
    interpreter:python

The other relies on your CLASSPATH being set correctly in [environment.gr](../texttests/environment.gr). Uncomment these lines to use it instead:

    executable:com.gildedrose.TexttestFixture
    interpreter:java
