package ConcreteDecorator;

import ComponentInterface.BankAccount;
import ConcreteComponent.SavingsAccount;
import DecoratorInterface.BankAccountDecorator;

public class GSave implements BankAccountDecorator {
    private BankAccount bankAccount;

    public GSave (SavingsAccount savingsAccount) {
        setBankAccount(savingsAccount);
    }


    @Override
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }


    @Override
    public String showAccountType() {
        return "GSave";
    }

    @Override
    public double getInterestRate() {
        return 0.25;
    }

    @Override
    public double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public String showBenefits() {
        return bankAccount.showBenefits() + ", GCash Transfer";
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