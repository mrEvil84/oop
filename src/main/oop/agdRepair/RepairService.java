package agdRepair;

import java.util.Date;

abstract public class RepairService {

    private String informations;

    private Notification notification;

    Double price;

    public RepairService() {
    }

    public RepairService(String informations, Notification notification) {
        this.informations = informations;
        this.notification = notification;
    }

    public abstract void collectInformations(String informations);

    public abstract void repair();

    public abstract void charge();

    public String getInformations() {
        return informations;
    }

    public Notification getNotification() {
        return notification;
    }

    public Double getPrice() {
        return price;
    }
}
