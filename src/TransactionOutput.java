import java.security.PublicKey;

public class TransactionOutput {
    public String id;
    public PublicKey reciepient;
    public float value;
    public String parentTransactionId;

    public TransactionOutput(PublicKey res, float value, String pti) {
        this.reciepient = res;
        this.value = value;
        this.parentTransactionId = pti;
        this.id = StringUtil
                .applySha256(StringUtil.getStringFromKey(reciepient) + Float.toString(value) + parentTransactionId);
    }

    public boolean isMine(PublicKey publicKey) {
        return publicKey == reciepient;
    }
}
