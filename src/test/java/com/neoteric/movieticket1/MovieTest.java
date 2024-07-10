package com.neoteric.movieticket1;

import com.neoteric.movieticket1.mode.MovieTic;
import com.neoteric.movieticket1.mode.Tic;
import com.neoteric.movieticket1.servi.MovieTicServi;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieTest {

@Test
public void test(){


    Tic customer1=new Tic();


    customer1.FullName="sanjay";
    customer1.EmailId="sanjay.konda24@gmail.com";
    customer1.PhoneNumber=9988776655l;
    customer1.price=500;



    customer1.CardNO=11223344556l;
    customer1.Expiryno="22-2-2022";
    customer1.CVV=122;


    MovieTicServi ticketService=new MovieTicServi();


    MovieTic movieTic =ticketService.getMovieTic(customer1);


    Assertions.assertEquals(500,customer1.price);
    Assertions.assertNotNull(movieTic);


}
}


