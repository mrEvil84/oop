package agdRepair;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Notification {

    private NotificationType notificationType;

    private Date notificationDate;

    public Notification() {
        this.notificationType = NotificationType.UNKNOWN;
        this.notificationDate = new Date();
    }

    public Notification(NotificationType notificationType, Date notificationDate) {
        this.notificationType = notificationType;
        this.notificationDate = notificationDate;
    }

    public NotificationType getNotificationType() {
        return notificationType;
    }

    public Date getNotificationDate() {
        return notificationDate;
    }

    public String getFormatedDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return dateFormat.format(this.notificationDate);
    }
}
