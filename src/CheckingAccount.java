
//Class fille
public class CheckingAccount extends BankAccount {
    private double limit;

    /**
     * Récupère la limite de découvert autorisée
     *
     * @return Le montant maximal de la limite
     */
    public double getLimit() {
        return limit;
    }
    /**
     * Definie la limite de découvert autorisée
     * @return Limite le montant maximal de la limite
     */
    public void setLimit(double limit) {
        this.limit = limit;
    }

}
