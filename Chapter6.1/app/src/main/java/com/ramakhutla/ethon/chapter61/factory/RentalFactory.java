package com.ramakhutla.ethon.chapter61.factory;

import com.ramakhutla.ethon.chapter61.domain.PaymentMethodType;
import com.ramakhutla.ethon.chapter61.domain.RentalType;

import java.util.List;

/**
 * Created by Dillin on 4/19/2016.
 */
public class RentalFactory {

    public static RentalType getRental(String pickUpdate, String returnDate, List<PaymentMethodType> paymentMethodtype)
    {
        RentalType rentalstype = new RentalType
                .Builder(pickUpdate)
                .returnDate(returnDate)
                .paymentMethod(paymentMethodtype)
                .build();
        return rentalstype;
    }









    /*public static Settings getSettings(String email,String orgCode,String password){
        return new Settings.Builder()
                .username(email)
                .password(password)
                .code(orgCode)
                .build();

    }*/
}
