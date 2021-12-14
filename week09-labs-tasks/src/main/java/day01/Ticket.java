package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ticket {
    private String artist;
    private LocalDateTime startDateAndTime;
    private int price;

    public Ticket(String artist, LocalDateTime startDateAndTime, int price) {
        this.artist = artist;
        this.startDateAndTime = startDateAndTime;
        this.price = price;
    }

    public LocalTime entryTime(){
        LocalTime entryTime=LocalTime.of(startDateAndTime.getHour()-1, startDateAndTime.getMinute() );
        return entryTime;
    }

    public String getArtist() {
        return artist;
    }

    public LocalDateTime getStartDateAndTime() {
        return startDateAndTime;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "artist='" + artist + '\'' +
                ", startDateAndTime=" + startDateAndTime +
                ", price=" + price +
                '}';
    }
}
