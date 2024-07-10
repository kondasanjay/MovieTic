package com.neoteric.movieticket1.servi;

import com.neoteric.movieticket1.mode.MovieTic;
import com.neoteric.movieticket1.mode.Tic;


public class MovieTicServi {

    public MovieTic getMovieTic(Tic customer1 ) {


        MovieTic movieTic = null;

        if (customer1.price == 500) {


            movieTic = new MovieTic();


            movieTic.name = "kalki";
            movieTic.Date = 22 - 2 - 2022;
            movieTic.Time = "3:30";
            movieTic.NoofTickets = 2;
            movieTic.SeatType = "cRow";
            movieTic.SeatNo = 22;


        }
        return movieTic;


    }

}
