public class BankManager {

    public static void main(String[] args) {
        //Création des instances des 3 classes enfants
        CheckingAccount checking = new CheckingAccount();
        SavingsAccount savings = new SavingsAccount();
        COD cod = new COD();

        //Vérification de l'accès aux attributs hérités(set)
        checking.setAccount("YY-111204");
        checking.setBalance(1500.50);
        checking.setLimit(500.00);

        savings.setAccount("CE-67890");
        savings.setBalance(5000.00);

        cod.setAccount("COD-5555");
        cod.setBalance(10000.00);

        // Vérification de l'accès aux attributs (get)
        System.out.println("Compte Courant : " + checking.getAccount() + "  Solde : " + checking.getBalance() + "  Limite : " + checking.getLimit());
        System.out.println("Compte Épargne : " + savings.getAccount() + "  Solde : " + savings.getBalance());
        System.out.println("Certificat de Dépôt : " + cod.getAccount() + "  Solde : " + cod.getBalance());
    }
}
