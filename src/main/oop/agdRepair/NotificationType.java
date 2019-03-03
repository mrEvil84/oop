package agdRepair;

public enum NotificationType {
    WASHER_FIX("washer-fix"),
    FREEDGE_FIX("freedge-fix"),
    UNKNOWN("unknown");

    private String type;

    NotificationType(String type) {
        this.type = type;
    }
}
