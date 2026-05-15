### Hexlet tests and linter status:
[![Actions Status](https://github.com/bedrevpaul23/java-project-61/actions/workflows/hexlet-check.yml/badge.svg)](https://github.com/bedrevpaul23/java-project-61/actions)

### SonarQube status:
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=bedrevpaul23_java-project-61&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=bedrevpaul23_java-project-61)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=bedrevpaul23_java-project-61&metric=bugs)](https://sonarcloud.io/summary/new_code?id=bedrevpaul23_java-project-61)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=bedrevpaul23_java-project-61&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=bedrevpaul23_java-project-61)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=bedrevpaul23_java-project-61&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=bedrevpaul23_java-project-61)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=bedrevpaul23_java-project-61&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=bedrevpaul23_java-project-61)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=bedrevpaul23_java-project-61&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=bedrevpaul23_java-project-61)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=bedrevpaul23_java-project-61&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=bedrevpaul23_java-project-61)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=bedrevpaul23_java-project-61&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=bedrevpaul23_java-project-61)

## Описание / Description

Brain Games — набор консольных игр, написанный на Java

Brain Games is a set of console games built with Java

Приложение предлагает пользователю выбрать игру, ввести имя и ответить на три вопроса. Если пользователь отвечает правильно на все вопросы, игра завершается победой. Если пользователь ошибается, приложение показывает правильный ответ и завершает игру

The application asks the user to choose a game, enter a name, and answer three questions. If all answers are correct, the game ends with a victory. If the user gives a wrong answer, the application shows the correct answer and finishes

## Игры / Games

- Even — проверка числа на чётность / determine whether a number is even
- Calc — вычисление арифметического выражения / calculate the result of an expression
- GCD — поиск наибольшего общего делителя / find the greatest common divisor
- Progression — поиск пропущенного числа в арифметической прогрессии / find a missing number in an arithmetic progression
- Prime — проверка числа на простоту / determine whether a number is prime

## Требования / Requirements

- Java 21
- Gradle
- Make

## Сборка / Build

```bash
cd app
make build
```

## Запуск / Run

```bash
cd app
./gradlew installDist
make run-dist
```

## Демонстрация / Demo

### Even game demo

[Even asciinema demo](https://asciinema.org/a/up3XM8bOIU9Z034z)

### Calc game demo

[Calc asciinema demo](https://asciinema.org/a/i5b0995TCkhO5sZa)

### GCD game demo

[GCD asciinema demo](https://asciinema.org/a/KriHoKQSQ9Pq6Nv5)

### Progression game demo

[Progression asciinema demo](https://asciinema.org/a/rWU0cYxgI3e8PDQ0)

### Prime game demo

[Prime asciinema demo](https://asciinema.org/a/2KkwRRCKo8rLRUyi)