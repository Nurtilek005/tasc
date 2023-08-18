import java.time.LocalDate;

public class Group {
    private String grupName;
    private LocalDate startDate;
    private String Mentor;

    public Group(String grupName, LocalDate startDate, String mentor) {
        this.grupName = grupName;
        this.startDate = startDate;
        Mentor = mentor;
    }

    public String getGrupName() {
        return grupName;
    }

    public void setGrupName(String grupName) {
        this.grupName = grupName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getMentor() {
        return Mentor;
    }

    public void setMentor(String mentor) {
        Mentor = mentor;
    }

    @Override
    public String toString() {
        return "Group{" +
                "grupName='" + grupName + '\'' +
                ", startDate=" + startDate +
                ", Mentor='" + Mentor + '\'' +
                '}';
    }
}
