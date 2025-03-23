# bank-account
# Bank Account Management System

A simple ATM application that allows users to manage their bank accounts through a graphical user interface (GUI) using JOptionPane dialogs.

## Features:
- Initialize an account with a starting balance.
- Deposit money into the account.
- Withdraw money from the account (with validation to prevent overdrafts).
- Read user commands via GUI input prompts.
- Convert monetary values to cents for accuracy.

## Technologies Used:
- Java
- Swing (JOptionPane)

## How to Use:
1. Compile and run the Java program.
2. Follow the on-screen prompts to deposit or withdraw money.
3. Invalid inputs will show an error message.
4. The final balance is displayed after transactions.

## Example Usage:
### Sample Input
```sh
D 5000
W 3000
W 20000  # This should fail if the balance is insufficient.
```
Expected Output
```sh
You have 4950.0 dollars in your Bank Account
```
## Installation & Running :
1. Clone the repository:
```sh
git clone https://github.com/Jeta-Krasniqi1/bank-account.git
cd bank-account
```
2. Compile the Java program:
```sh
javac BankAccount.java
```
3. Run the program:
```sh
java BankAccount
```
## Contribution:
### Contributions are welcome! Please open an issue or submit a pull request for any improvements or features you would like to add.

## License:
### This project is licensed under the MIT License. See the LICENSE file for details.
