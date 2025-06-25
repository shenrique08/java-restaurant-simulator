# 🍽️ Java Restaurant Simulator

![Language](https://img.shields.io/badge/Language-Java-blue.svg)
![JDK](https://img.shields.io/badge/JDK-17-orange.svg)
![License](https://img.shields.io/badge/License-MIT-green.svg)

A command-line restaurant management simulator built with pure Java. This project demonstrates core Object-Oriented Programming (OOP) concepts to simulate the daily operations of a restaurant, including staff management, menu handling, and customer order processing.

---

## ✨ Core Features

This project is a practical application of software development principles using only standard Java libraries.

- **Object-Oriented Design**  
  Uses abstraction, inheritance, and polymorphism to model real-world entities:
  - `Funcionario` (abstract) → extended by:
    - `Garcom` (Waiter)
    - `Cozinheiro` (Chef)
  - `Item` (abstract) → extended by:
    - `Prato` (Dish)
      - `PratoPrincipal` (Main Course)
      - `Sobremesa` (Dessert)
    - `Bebidas` (Drinks)

- **Salary Calculations**  
  - **Garçom**: Fixed salary + 10% bonus if monthly order target exceeded.  
  - **Cozinheiro**: Salary based on the total value of dishes prepared.

- **Interactive CLI**  
  Console interface allows:
  - Customer registration  
  - Menu listing  
  - Order creation  
  - Staff assignment

- **Data Persistence with Serialization**  
  Application state (staff, items) is stored in `.ser` binary files via Java’s built-in serialization.

- **Custom Exceptions**  
  - `salarioNegativoException` prevents creation of staff with invalid salaries.

- **Input Validation**  
  Includes a method to validate CPF (Brazilian ID) format.

---

## 📂 Project Structure

```plaintext
src/
├── Bebidas.java                  # Drink item
├── Cliente.java                  # Customer
├── Cozinheiro.java               # Chef (inherits Funcionario)
├── Funcionario.java              # Abstract staff base class
├── Garcom.java                   # Waiter (inherits Funcionario)
├── Item.java                     # Abstract menu item base
├── Main.java                     # App entry point (CLI)
├── Pedido.java                   # Manages orders
├── Persistencia.java             # Serialization handler
├── Prato.java                    # Abstract dish class
├── PratoPrincipal.java           # Main course
├── Sobremesa.java                # Dessert
└── salarioNegativoException.java # Custom salary exception


## 💻 Example Usage

Once the application is running, it will prompt you for input in the console.

<<<<< Cadastro de Cliente >>>>>
Nome: Ash Ketchum
CPF: 12345678900

<<<<< MENU >>>>>
(1) LISTAR TODOS OS ITENS
(2) REALIZAR UM PEDIDO
(0) SAIR
ESCOLHA UMA OPÇÃO:

** Placing an Order:**
The system will guide you to select a waiter, choose items from different categories (drinks, main courses, desserts), and assign a chef to prepare the order.

** Final Report:**
After exiting the main loop, the application calculates and displays the final salaries for all staff members based on their performance.

<<<<< SALÁRIO DOS GARÇONS >>>>>
[Maria] não ganhou a gratificação!
Salário do [Maria]: R$1800,00

<<<<< SALÁRIO DOS COZINHEIROS >>>>>
Salário do [Paulo Bazooka]: R$15,00
