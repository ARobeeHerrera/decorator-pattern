package ConcreteDecorator;

import ComponentInterface.BankAccount;
import ConcreteComponent.SavingsAccount;
import DecoratorInterface.BankAccountDecorator;

public class UpSave implements BankAccountDecorator {
    private BankAccount bankAccount;

    public UpSave (SavingsAccount savingsAccount) {
        setBankAccount(savingsAccount);
    }

    @Override
    public void setBankAccount(BankAccount accountBank) {
        this.bankAccount = accountBank;
    }

    @Override
    public String showAccountType() {
        return "UpSave";
    }

    @Override
    public double getInterestRate() {
        return 0.04;
    }

    @Override
    public double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public String showBenefits() {
        return bankAccount.showBenefits() + ", With Insurance";
    }

    @Override
    public double computeBalanceWithInterest() {
        return bankAccount.getBalance() * (1 + getInterestRate());
    }

    @Override
    public String showInfo() {
        return bankAccount.showInfo();
    }

}