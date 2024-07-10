package com.neoteric.movieticket1.mode;

public class MovieTic {

    public String name;
    public double price;
    public int  Date;
    public String   Time;
    public byte NoofTickets;
    public byte SeatNo;
    public String SeatType;

    @Override
    public String toString() {
        return "MovieTic{" +
                "name='" + name + '\'' +
                ", Date=" + Date +
                ", Time='" + Time + '\'' +
                ", NoofTickets=" + NoofTickets +
                ", SeatNo=" + SeatNo +
                ", SeatType='" + SeatType + '\'' +
                '}';
    }
}
