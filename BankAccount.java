package fatimja;

import javax.swing.*;

/**
 * A class that manages a bank account and reads transactions from the user.
 */
public class BankAccount {
    private int balance; // Invariant: balance >= 0
    private String inputLine;

    /**
     * Constructor to initialize the account balance.
     *
     * @param amount Initial balance.
     */
    public BankAccount(int amount) {
        balance = Math.max(amount, 0);
    }

    /**
     * Deposits money into the account.
     *
     * @param amount Amount to deposit.
     * @return true if deposit is successful, false otherwise.
     */
    public boolean deposit(int amount) {
        if (amount < 0) {
            JOptionPane.showMessageDialog(null, "Error: Invalid deposit amount: " + amount);
            return false;
        }
        balance += amount;
        return true;
    }

    /**
     * Withdraws money from the account.
     *
     * @param amount Amount to withdraw.
     * @return true if withdrawal is successful, false otherwise.
     */
    public boolean withdraw(int amount) {
        if (amount < 0) {
            JOptionPane.showMessageDialog(null, "Error: Invalid withdrawal amount: " + amount);
            return false;
        }
        if (amount > balance) {
            JOptionPane.showMessageDialog(null, "Error: Withdrawal exceeds balance.");
            return false;
        }
        balance -= amount;
        return true;
    }

    /**
     * Returns the current balance.
     *
     * @return Current balance.
     */
    public int getBalance() {
        return balance;
    }

    /**
     * Reads a new command from the user.
     *
     * @param message Prompt for the user.
     * @return First character of the command.
     */
    public char readCommand(String message) {
        inputLine = JOptionPane.showInputDialog(message);
        if (inputLine == null || inputLine.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error: No input provided.");
            return ' '; // Default invalid command
        }
        inputLine = inputLine.trim().toUpperCase();
        return inputLine.charAt(0);
    }

    /**
     * Returns the numeric value from the command line.
     *
     * @return Converted value in cents.
     */
    public int readAmount() {
        if (inputLine.length() <= 1) {
            JOptionPane.showMessageDialog(null, "Error: No amount provided.");
            return 0;
        }

        String s = inputLine.substring(1).trim();
        try {
            double money = Double.parseDouble(s);
            return (int) (money * 100); // Convert to cents
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Invalid amount format.");
            return 0;
        }
    }
}

