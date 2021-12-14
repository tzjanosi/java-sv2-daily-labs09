package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class FrontOfStageTicket extends Ticket {
    private String couponCode;

    public FrontOfStageTicket(String artist, LocalDateTime startDateAndTime, int price, String couponCode) {
        super(artist, startDateAndTime, price);
        this.couponCode = couponCode;
    }

    @Override
    public LocalTime entryTime() {
        LocalTime entryTime=LocalTime.of(getStartDateAndTime().getHour()-2, getStartDateAndTime().getMinute() );
        return entryTime;
    }

    @Override
    public String toString() {
        return "FrontOfStageTicket{" +super.toString()+
                " couponCode='" + couponCode + '\'' +
                '}';
    }
}
