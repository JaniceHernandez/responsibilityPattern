# ATM Dispense Program with Responsibility Pattern

## Problem Statement
We will design an ATM system for **BPI (Bank of the Philippine Islands)** that dispenses cash in denominations of **1000 pesos, 500 pesos, 200 pesos, 100 pesos, 50 pesos, and 20 pesos bills**.  
The system should follow the **Chain of Responsibility design pattern** to handle cash dispensing requests efficiently.

In this implementation:
- `ATMDispenseChain` class handles the dispensing logic for BPI's ATM system.
- `BPI_Atm` class allows users to adjust (hard-coded) an amount and initiates the dispensing process using the Chain of Responsibility pattern.

This design ensures that the ATM system dispenses cash in the specified denominations according to the requested amount.

---

## UML Class Diagram

## Components

### 1. Handler
- The handler objects are the concrete classes that implement the `CurrencyDispenser` abstract class.
- Handlers include:
  - `Peso1000Dispenser`
  - `Peso500Dispenser`
  - `Peso200Dispenser`
  - `Peso100Dispenser`
  - `Peso50Dispenser`
  - `Peso20Dispenser`
- Each handler is responsible for dispensing a specific denomination of currency.

---

### 2. Chain
- Represented by the `ATMDispenseChain` class.
- Sets up the sequence of handlers by linking them together using the `setNextChain()` method.
- Responsible for passing the request along the sequence of handlers until one of them handles it.

---

### 3. Request
- Represented by the `dispense()` method call made on the first handler in the chain.
- The request is to dispense a specific amount of currency.

---

### 4. Client
- The client is the `ATMDispenseChain` class.
- Creates and initializes the chain of handlers.
- Sends the request to the first handler in the chain by calling the `dispense()` method.

---

### 5. Context
- The context includes the `ATMDispenseChain` class.
- Manages the chain of handlers and ensures that the request is passed along the chain until it is handled.
