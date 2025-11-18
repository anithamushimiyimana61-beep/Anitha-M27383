package _27383Procurement;

import java.util.regex.Pattern;

class Organization extends Entity {
    private String orgName;
    private String address;
    private String contactEmail;

    public Organization(int id, String orgName, String address, String contactEmail) {
        super(id);
        if (!isValidEmail(contactEmail)) throw new IllegalArgumentException("Invalid email");
        this.orgName = orgName;
        this.address = address;
        this.contactEmail = contactEmail;
    }

    private boolean isValidEmail(String email) {
        return Pattern.compile("^[\\w.-]+@[\\w.-]+\\.\\w+$").matcher(email).matches();
    }

    // getters
    public String getOrgName() { return orgName; }
    public String getAddress() { return address; }
    public String getContactEmail() { return contactEmail; }
}

