//Class parente
public class BankAccount {
    String account;
    double balance;


    /**
     * Récupère l'identifiant du compte
     * @return Le numéro du compte sous forme de chaîne de caractères
     */
    //getter pour la lecture et setter pour la définition de attributs
    public String getAccount() {
        return account;
    }

    /**
     * Définie le solde du compte
     * @return Le numéro du compte sous forme de chaîne de caractères
     */
    public void setAccount(String account) {
        this.account = account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
