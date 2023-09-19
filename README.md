# Vending Machine Console Application

This is a simple console-based vending machine application that allows users to purchase three different beverages: Coke, Pepsi, and Soda. The application maintains stock levels and prices for each item, accepts coins as payment, and provides change if needed.

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [License](#license)

## Introduction

This vending machine application is implemented in Java and consists of several classes:

- **Stocks:** This class manages the stock levels and prices of the beverages (Coke, Pepsi, Soda).

- **Money:** This class handles money-related operations, including displaying available coin denominations, accepting payments, and giving change.

- **Operations:** This class extends the Money class and creates an instance of the Stocks class for transaction handling. It also includes methods for resetting the stock levels and displaying the menu.

- **VendingMachine:** The main class extends Operations and serves as the entry point of the application. It allows users to interact with the vending machine by selecting items and completing transactions.

## Features

- Select and purchase beverages (Coke, Pepsi, Soda) from the vending machine.
- View the menu with item availability and prices.
- Pay using various coin denominations (Penny, Nickel, Dime, Quarter).
- Receive change if overpaid.
- Reset the vending machine to its initial state.

## Installation

To run this application, you need Java installed on your system.

1. Clone or download the repository to your local machine.
2. Open a terminal or command prompt and navigate to the project directory.
3. Compile the Java source files using the following command:

   ```bash
   javac com/roshan/vendingMachine.java
   ```

4. Run the application using the following command:

   ```bash
   java com.roshan.vendingMachine
   ```

## Usage

1. Launch the application by running `java com.roshan.vendingMachine`.

2. Follow the on-screen prompts to select items (1 for Coke, 2 for Pepsi, 3 for Soda).

3. Insert coins based on the displayed coin denominations (e.g., "1,2,4" for Penny, Nickel, and Quarter).

4. If you overpay, the application will provide change (Nickels and Pennies).

5. Collect your item after a successful transaction.

6. You can reset the vending machine to its initial state by entering 'exit' or pressing any key.
