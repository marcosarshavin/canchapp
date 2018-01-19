package com.crowdynamics.canchapp.controller;

import com.crowdynamics.canchapp.model.Reservation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

/**
 * Created by marcos on 19/01/18.
 */
@Controller
@RequestMapping("/reservation")
public class ReservationController {

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody Reservation create(@RequestBody Reservation reservation)   {

        return reservation;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody Reservation find(@PathVariable("id") final Long id) {

        Reservation reservation = new Reservation();

        reservation.setId(id);
        reservation.setReservedBy("12121212");

        return reservation;
    }
}
