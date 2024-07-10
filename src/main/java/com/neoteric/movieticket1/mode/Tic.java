package com.neoteric.movieticket1.mode;

public class Tic {

    public String FullName;
    public String EmailId;
    public long PhoneNumber;
    public double price;




    public long  CardNO;
    public String  Expiryno;
    public byte CVV;

    @Override
    public String toString() {
        return "Tic{" +
                "FullName='" + FullName + '\'' +
                ", EmailId='" + EmailId + '\'' +
                ", PhoneNumber=" + PhoneNumber +
                ", price=" + price +
                ", CardNO=" + CardNO +
                ", Expiryno='" + Expiryno + '\'' +
                ", CVV=" + CVV +
                '}';
    }
}
