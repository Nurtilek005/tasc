import java.util.Arrays;

public class Company {
    private String companyName;
    private String counyry;
    private int yearOfFoundation;
    private int Founder;
    public Group [] groups;

    public Company(String companyName, String counyry, int yearOfFoundation, int founder) {
        this.companyName = companyName;
        this.counyry = counyry;
        this.yearOfFoundation = yearOfFoundation;
        Founder = founder;
        this.groups = groups;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCounyry() {
        return counyry;
    }

    public void setCounyry(String counyry) {
        this.counyry = counyry;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    public int getFounder() {
        return Founder;
    }

    public void setFounder(int founder) {
        Founder = founder;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", counyry='" + counyry + '\'' +
                ", yearOfFoundation=" + yearOfFoundation +
                ", Founder=" + Founder +
                ", groups=" + Arrays.toString(groups) +
                '}';
    }
}

