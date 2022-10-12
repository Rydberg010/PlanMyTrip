package com.ohm.Nakul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    //movies is an immutable object..

    @Autowired
    BookingRepository bookingRepository;

    public List<Booking> getAllBookings() {

        ArrayList<Booking> allBookings = new ArrayList<>();
        bookingRepository.findAll().forEach(allBookings::add);

        return allBookings;
    }

    public Booking getBookings(Long id) {
        return bookingRepository.findById(id).orElse(null);
    }

    public void addBookings(Booking mov) {
        bookingRepository.save(mov);
    }


    public void deleteBookings(Long id) {
        bookingRepository.deleteById(id);
    }

    public void updateBookings(Booking updatedMov, Long id) {
          bookingRepository.save(updatedMov);
    }
}


