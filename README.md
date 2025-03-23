# bank-account
# A simple ATM 
## Bank account management system that allows users to deposit, withdraw, and check their balance using a graphical user interface (GUI) with JOptionPane dialogs.

### Features:                                                                  

Initialize an account with a starting balance.
Deposit money into the account.
Withdraw money from the account (with validation to prevent overdrafts).
Read user commands via GUI input prompts.
Convert monetary values to cents for accuracy.

### Technologies Used:

Java
Swing (JOptionPane)

### How to Use:

Compile and run the Java program.
Follow the on-screen prompts to:w $3000.
Invalid inputs will show an error message.

2. The final balance is displayed after transactions.

##Example Usage in My_bankaccount test class
Sample Input
```sh
D 5000
W 3000
W 20000  # This should fail if balance is insufficient.
```
Expected Output
```sh
You have 4950.0 dollars in your Bank Account
```
Installation & Running
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
   
