package Bookstore.users;

public class Customers {
    private String name;
    private String contactDetails;
    private String purchaseHistory;

    public Customers(String name, String contactDetails) {
        this.name = name;
        this.contactDetails = contactDetails;
        this.purchaseHistory = "";
    }

    // Getters and setters for Customer attributes

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }

    public String getPurchaseHistory() {
        return purchaseHistory;
    }

    public void addPurchaseToHistory(String purchaseDetails) {
        this.purchaseHistory += purchaseDetails + "\n";
    }
}