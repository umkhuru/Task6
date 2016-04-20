package com.ramakhutla.ethon.chapter61.factory;

import com.ramakhutla.ethon.chapter61.domain.VehicleConditionEmbeddableType;

/**
 * Created by Dillin on 4/19/2016.
 */
public class VehicleConditionEmbeddableFactory {

    public static VehicleConditionEmbeddableType getVehicleConditionEmbeddable(String RefcounterReading, String Gas, String MotorCondition)
    {
        VehicleConditionEmbeddableType addressEmbeddabletype = new VehicleConditionEmbeddableType
                .Builder(RefcounterReading)
                .Gas(Gas)
                .MotorCondition(MotorCondition)
                .build();

        return addressEmbeddabletype;
    }








    /*public static Settings getSettings(String email,String orgCode,String password){
        return new Settings.Builder()
                .username(email)
                .password(password)
                .code(orgCode)
                .build();

    }*/
}
