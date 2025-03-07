public class Conta {
    int storagedMoney;
    int limit;
    int accountNumber;
    String nome;

    public static void main(String[] args) {
    }

    public void withDraw(int amount) {
        if (amount > limit) {
            System.out.println("Withdrawal amount exceeds the limit");
        } else {
            storagedMoney -= amount;
        }
    }

    public void deposit(int amount) {
        storagedMoney += amount;
    }
}
