package com.ramakhutla.ethon.chapter61.factory;

import com.ramakhutla.ethon.chapter61.domain.CustomerType;
import com.ramakhutla.ethon.chapter61.domain.SalesPersonType;

import java.util.List;

/**
 * Created by Dillin on 4/19/2016.
 */
public class SalesPersonFactory {

    public static SalesPersonType getSalesPerson(String firstName, String lastName, int hours,
                                                    double rate, String username, String password, List<CustomerType> customertype)
    {
        SalesPersonType salesPersontype = new SalesPersonType
                .Builder(lastName)
                .firstName(firstName)
                .hours(hours)
                .rate(rate)
                .customertype(customertype)
                .build();
        return salesPersontype;
    }





    /*public static Settings getSettings(String email,String orgCode,String password){
        return new Settings.Builder()
                .username(email)
                .password(password)
                .code(orgCode)
                .build();

    }*/
}
