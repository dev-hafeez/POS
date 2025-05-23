
public class Sales {
    
    private long orderId;
    private String invoiceDate;
    private String partyName;
    private float totalQuantity;
    private float totalAmount;
    private float otherAmount;
    private float totalPaybleAmount;
    private float totalPaidAmount;
    private float totalDueAmount;
    private String currency;
    private float taux;

    public Sales() {}

    public Sales(long orderId, String invoiceDate, String partyName, String currency, float taux, float totalQuantity, float totalAmount, float otherAmount, float totalPaybleAmount, float totalPaidAmount, float totalDueAmount) {
        this.orderId = orderId;
        this.invoiceDate = invoiceDate;
        this.partyName = partyName;
        this.currency = currency;
        this.taux = taux;
        this.totalQuantity = totalQuantity;
        this.totalAmount = totalAmount;
        this.otherAmount = otherAmount;
        this.totalPaybleAmount = totalPaybleAmount;
        this.totalPaidAmount = totalPaidAmount;
        this.totalDueAmount = totalDueAmount;
    }

    public long getOrderId() {
        return orderId;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public String getPartyName() {
        return partyName;
    }

    public float getTotalQuantity() {
        return totalQuantity;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public float getOtherAmount() {
        return otherAmount;
    }

    public float getTotalPaybleAmount() {
        return totalPaybleAmount;
    }

    public float getTotalPaidAmount() {
        return totalPaidAmount;
    }

    public float getTotalDueAmount() {
        return totalDueAmount;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public void setTotalQuantity(float totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setOtherAmount(float otherAmount) {
        this.otherAmount = otherAmount;
    }

    public void setTotalPaybleAmount(float totalPaybleAmount) {
        this.totalPaybleAmount = totalPaybleAmount;
    }

    public void setTotalPaidAmount(float totalPaidAmount) {
        this.totalPaidAmount = totalPaidAmount;
    }

    public void setTotalDueAmount(float totalDueAmount) {
        this.totalDueAmount = totalDueAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public float getTaux() {
        return taux;
    }

    public void setTaux(float taux) {
        this.taux = taux;
    }
    
}
