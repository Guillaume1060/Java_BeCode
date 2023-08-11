package week_1.challenge_9;

public enum Department {
    CARDIOLOGY, RADIOLOGY, PEDIATRICS, GERIATRICS, PULMONOLOGY, EMPTY;

    public static Department fromString(String value) {
        for (Department department : Department.values()) {
            if (department.name().equalsIgnoreCase(value)) {
                return department;
            }
        }
        return EMPTY;
    }
}
