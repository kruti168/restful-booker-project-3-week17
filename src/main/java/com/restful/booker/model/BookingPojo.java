package com.restful.booker.model;

import java.util.HashMap;

public class BookingPojo {

     private String firstname;
     private String lastname;
     private int totalprice;
     private boolean depositpaid;

     public HashMap<Object, Object> getBookingdates() {
          return bookingdates;
     }

     public void setBookingdates(HashMap<Object, Object> bookingdates) {
          this.bookingdates = bookingdates;
     }

     private HashMap<Object,Object> bookingdates;
     private String checkin;
     private String checkout;
     private String additionalneeds;

     public String getFirstname() {
          return firstname;
     }

     public void setFirstname(String firstname) {
          this.firstname = firstname;
     }

     public String getLastname() {
          return lastname;
     }

     public void setLastname(String lastname) {
          this.lastname = lastname;
     }

     public int getTotalprice() {
          return totalprice;
     }

     public void setTotalprice(int totalprice) {
          this.totalprice = totalprice;
     }

     public boolean isDepositpaid() {
          return depositpaid;
     }

     public void setDepositpaid(boolean depositpaid) {
          this.depositpaid = depositpaid;
     }


     public String getCheckin() {
          return checkin;
     }

     public void setCheckin(String checkin) {
          this.checkin = checkin;
     }

     public String getCheckout() {
          return checkout;
     }

     public void setCheckout(String checkout) {
          this.checkout = checkout;
     }

     public String getAdditionalneeds() {
          return additionalneeds;
     }

     public void setAdditionalneeds(String additionalneeds) {
          this.additionalneeds = additionalneeds;
     }


}
