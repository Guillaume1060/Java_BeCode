package week_1.challenge_9;

import java.time.LocalDate;

public class DataModel {
    private String firstName;
    private String lastName;
    private Reason reason;
    private Department department;
    private LocalDate date;

    public DataModel(String firstName, String lastName, Reason reason, String department, LocalDate date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.reason = reason;
        this.department = Department.fromString(department);
        this.date = date;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Reason getReason() {
        return reason;
    }

    public void setReason(Reason reason) {
        this.reason = reason;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
