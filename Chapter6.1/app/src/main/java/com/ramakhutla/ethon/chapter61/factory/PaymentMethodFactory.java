package com.ramakhutla.ethon.chapter61.factory;

import com.ramakhutla.ethon.chapter61.domain.PaymentMethodType;

/**
 * Created by Dillin on 4/19/2016.
 */
public class PaymentMethodFactory {

    public static PaymentMethodType getPaymentMethod(String PaymentType, double Price)
    {
        PaymentMethodType paymentMethodtype = new PaymentMethodType
                .Builder(PaymentType)
                .Price(Price)
                .build();
        return paymentMethodtype;
    }






    /*public static Settings getSettings(String email,String orgCode,String password){
        return new Settings.Builder()
                .username(email)
                .password(password)
                .code(orgCode)
                .build();

    }*/
}
