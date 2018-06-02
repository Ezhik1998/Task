package ua.kpi.tef.model;
//import static ua.kpi.tef.view.TextConstant.FREE_MINUTES;


public class Tariff {

    private String name;
    private Integer freeMinutes;
    private Integer freeSMS;
    private Double freeInternet;
    private Double callAbroad;
    private Integer monthPrice;
    private long usersCount;


    public Tariff() {
    }

    public Tariff(String name, Integer freeMinutes, Integer freeSMS, Double freeInternet, Double callAbroad, Integer monthPrice, long usersCount) {
        this.name = name;
        this.freeMinutes = freeMinutes;
        this.freeSMS = freeSMS;
        this.freeInternet = freeInternet;
        this.callAbroad = callAbroad;
        this.monthPrice = monthPrice;
        this.usersCount = usersCount;
    }

    @Override
    public String toString() {
        return  "<h5>" +  name + ": " + "</h5>" + "<font size = \"3.0\">" + "Free minutes = " + freeMinutes + " minutes" +
                ", Free SMS =" + freeSMS + " sms" +
                ", Free Internet =" + freeInternet + " GB" +
                ", Call Abroad =" + callAbroad + " grn/min" +
                ", Month Price =" + monthPrice + " grn" +
                ", Users =" + usersCount + "</font>";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFreeMinutes() {
        return freeMinutes;
    }

    public void setFreeMinutes(Integer freeMinutes) {
        this.freeMinutes = freeMinutes;
    }

    public Integer getFreeSMS() {
        return freeSMS;
    }

    public void setFreeSMS(Integer freeSMS) {
        this.freeSMS = freeSMS;
    }

    public Double getFreeInternet() {
        return freeInternet;
    }

    public void setFreeInternet(Double freeInternet) {
        this.freeInternet = freeInternet;
    }

    public Double getCallAbroad() {
        return callAbroad;
    }

    public void setCallAbroad(Double callAbroad) {
        this.callAbroad = callAbroad;
    }

    public Integer getMonthPrice() {
        return monthPrice;
    }

    public void setMonthPrice(Integer monthPrice) {
        this.monthPrice = monthPrice;
    }

    public long getUsersCount() {
        return usersCount;
    }

    public void setUsersCount(long usersCount) {
        this.usersCount = usersCount;
    }
}


















