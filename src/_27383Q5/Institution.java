package _27383Q5;
 public class Institution extends Entity {
    private String institutionName;
    private String code;
    private String address;

    public Institution(int id, String name, String code, String address) {
        super(id);
        if (code.length() < 3) throw new IllegalArgumentException("Code must be ≥ 3 chars");
        if (name.isEmpty() || address.isEmpty()) throw new IllegalArgumentException("Fields cannot be empty");
        this.institutionName = name;
        this.code = code;
        this.address = address;
    }

    // Getters and setters

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
