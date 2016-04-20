package com.ramakhutla.ethon.chapter61.factory;

import com.ramakhutla.ethon.chapter61.domain.EngineSizeEmbeddableType;

/**
 * Created by Dillin on 4/19/2016.
 */
public class EngineSizeFactory {


    public static EngineSizeEmbeddableType getEngineSizeEmbeddable(String EngineSerialNumber, String EngineSize, String FuelType)
    {
        EngineSizeEmbeddableType engineSizeEmbeddabletype = new EngineSizeEmbeddableType
                .Builder(EngineSerialNumber)
                .EngineSize(EngineSize)
                .FuelType(FuelType)
                .build();

        return engineSizeEmbeddabletype;
    }








    /*public static Settings getSettings(String email,String orgCode,String password){
        return new Settings.Builder()
                .username(email)
                .password(password)
                .code(orgCode)
                .build();

    }*/
}
