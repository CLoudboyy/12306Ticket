package cn.edu.guet;

/**
 * @Author huangzhouyu
 * @Data 2023/5/8 21:24
 */
public class Ticket {
    private String trainNumber;
    private String fromStation;
    private String toStation;
    private String departureTime;
    private String arrivialTime;
    private String duration;

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getFromStation() {
        return fromStation;
    }

    public void setFromStation(String fromStation) {
        this.fromStation = fromStation;
    }

    public String getToStation() {
        return toStation;
    }

    public void setToStation(String toStation) {
        this.toStation = toStation;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivialTime() {
        return arrivialTime;
    }

    public void setArrivialTime(String arrivialTime) {
        this.arrivialTime = arrivialTime;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
