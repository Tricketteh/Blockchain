public class TransactionInput {
    public String transactionOutputId;
    public TransactionOutput UTXO;

    public TransactionInput(String transactionOutputID) {
        this.transactionOutputId = transactionOutputID;
    }

}
