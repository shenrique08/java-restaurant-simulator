# Restaurant Management System

A Java-based mini project for managing restaurant operations including customer orders, staff management, and menu items.

## Overview

This project simulates a restaurant management system with the following features:
- Customer order processing
- Staff management (waiters and chefs)
- Menu item management (drinks, main dishes, desserts)
- Order tracking and billing
- Salary calculation for staff based on performance

## Classes Structure

### Main Entities

1. **Item** (Abstract Class)
   - Base class for all menu items
   - Subclasses: `Bebidas`, `PratoPrincipal`, `Sobremesa`

2. **Staff**
   - `Funcionario` (Abstract Class)
     - `Garcom` (Waiters)
     - `Cozinheiro` (Chefs)

3. **Order Management**
   - `Pedido` (Order processing)
   - `Cliente` (Customer information)

4. **Persistence**
   - `Persistencia` (Serialization/Deserialization)

## Features

### Menu Items
- **Bebidas**: Drinks with size and packaging type
- **PratoPrincipal**: Main dishes with ingredients and preparation time
- **Sobremesa**: Desserts with ingredients and weight

### Staff Management
- **Garcom** (Waiters):
  - Fixed salary with bonus for exceeding order targets
  - Day off management
- **Cozinheiro** (Chefs):
  - Salary based on prepared dishes
  - Different values for main dishes and desserts

### Order Processing
- Customer registration
- Menu browsing
- Order creation with:
  - Item selection
  - Waiter assignment
  - Chef assignment
  - Payment processing

### Data Persistence
- Serialization of:
  - Menu items
  - Staff members
  - Orders

## How to Run

1. Compile all Java files:
   ```bash
   javac *.java
   java Main
