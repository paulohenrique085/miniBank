import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) {

        // instanciando uma conta

        Account accounExample = new Account();
        accounExample.name = "Paulo Henrique Silva dos Santos";
        accounExample.account = "22334455";
        accounExample.agency = "1234";
        accounExample.balance = 2500.00;

        Scanner toRead = new Scanner(System.in);

        int controller = 1;

        while (controller == 1) {
            System.out
                    .println(
                            "\n\n\n-----[ Paulin Bank ]-----\n\nDigite uma opção:\n\n1-Consultar saldo\n2-Realizar depósito\n3-Transferir valor\n4-Sair");
            int selectedOption = toRead.nextInt();

            if (selectedOption == 4) {
                System.out.println("PaulinBank agradece, Volte sempre!");
                controller = controller + 1;

            }

            if (selectedOption == 1) {
                BankAccount.getAccountBalance(accounExample);

            }
            if (selectedOption == 2) {
                System.out
                        .println("Digite o valor no qual deseja depositar:");
                Double depositAmount = toRead.nextDouble();
                BankAccount.deposit(accounExample, depositAmount);

            }
            if (selectedOption == 3) {
                System.out
                        .println("Digite o valor no qual deseja transferir:");
                Double transferValue = toRead.nextDouble();
                BankAccount.transfer(accounExample, transferValue);

            }

        }

    }

    public static void getAccountBalance(Account accounExample) {
        System.out.printf("\n\n=> Seu saldo atual é: R$ %.2f %n", accounExample.balance);
    }

    public static void deposit(Account accounExample, Double depositAmount) {
        accounExample.balance = accounExample.balance + depositAmount;
        System.out.printf("\n\nDepósito realizado com sucesso! seu saldo atual é: R$ %.2f %n", accounExample.balance);

    }

    public static void transfer(Account accounExample, Double transferValue) {
        if (transferValue > accounExample.balance) {
            System.out.printf("\n\né impossível realizar essa transação pois seu saldo atual é apenas: R$ %.2f %n",
                    accounExample.balance);
            return;
        }
        accounExample.balance = accounExample.balance - transferValue;
        System.out.printf("\n\nTransferência realizada com sucesso! seu saldo atual é: R$ %.2f %n",
                accounExample.balance);

    }

}

