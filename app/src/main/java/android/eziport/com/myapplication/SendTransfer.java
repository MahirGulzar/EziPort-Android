package android.eziport.com.myapplication;


import java.util.ArrayList;

/**
 * Created by abenagood on 7.02.18.
 */

public class SendTransfer {
    private String weight, date, name, time, from, to,status;
    ArrayList<String> transferList = new ArrayList<String>();
    String transferData[];

    public SendTransfer(String from, String to, String date,String status, String name,String weight, String time, ArrayList<String> transferList) {
        this.weight = weight;
        this.date = date;
        this.name = name;
        this.time = time;
        this.transferList = transferList;
        this.from = from;
        this.to = to;
        this.status=status;

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public ArrayList<String> getTransferList() {
        return transferList;
    }

    public void setTransferList(ArrayList<String> transferList) {
        this.transferList = transferList;
    }

    public String[] getTransferData() {
        return transferData;
    }

    public void setTransferData(String[] transferData) {
        this.transferData = transferData;
    }
}