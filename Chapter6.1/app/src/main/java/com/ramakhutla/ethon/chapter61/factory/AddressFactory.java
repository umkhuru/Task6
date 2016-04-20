package com.ramakhutla.ethon.chapter61.factory;

import com.ramakhutla.ethon.chapter61.domain.AddressEmbeddableType;

/**
 * Created by Dillin on 4/19/2016.
 */
public class AddressFactory {

    public static AddressEmbeddableType getAddressEmbeddableType(String Address, String City, String postalCode)
    {
        AddressEmbeddableType addressEmbeddabletype = new AddressEmbeddableType
                .Builder(Address)
                .City(City)
                .postalCode(postalCode)
                .build();

        return addressEmbeddabletype;
    }

}
