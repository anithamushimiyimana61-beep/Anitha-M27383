package _27383Q6;

import java.time.LocalDate;
import java.util.regex.Pattern;

class Organization extends Entity {
    private String orgName, orgCode, contactEmail;
    private String rssbNumber;

    public Organization(int id, LocalDate createdDate, LocalDate updatedDate,
                        String orgName, String orgCode, String rssbNumber, String contactEmail) {
        super(id, createdDate, updatedDate);
        if (orgCode.length() < 3) throw new IllegalArgumentException("Org code ≥ 3 chars");
        if (!rssbNumber.matches("\\d{8}")) throw new IllegalArgumentException("RSSB number must be 8 digits");
        if (!Pattern.compile("^(.+)@(.+)$").matcher(contactEmail).matches())
            throw new IllegalArgumentException("Invalid email");
        this.orgName = orgName;
        this.orgCode = orgCode;
        this.rssbNumber = rssbNumber;
        this.contactEmail = contactEmail;
    }

    public String getOrgName() { return orgName; }
    public String getOrgCode() { return orgCode; }
    public String getRssbNumber() { return rssbNumber; }
    public String getContactEmail() { return contactEmail; }
}
