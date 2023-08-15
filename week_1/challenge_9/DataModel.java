package week_1.Challenge_9;

import java.time.LocalDate;

public class DataModel {
    private final Reason reason;
    private final Department department;
    private final LocalDate date;

    public DataModel(String firstName, String lastName, Reason reason, String department, LocalDate date) {
        this.reason = reason;
        this.department = Department.fromString(department);
        this.date = date;
    }

    public Reason getReason() {
        return reason;
    }

    public Department getDepartment() {
        return department;
    }

    public LocalDate getDate() {
        return date;
    }
}
