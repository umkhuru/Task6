package com.ramakhutla.ethon.chapter61.factory;

import com.ramakhutla.ethon.chapter61.domain.RentalType;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Created by Dillin on 4/19/2016.
 */
public class RentalTest {

    @Test
    public void testCreateRenatal() throws Exception
    {
        RentalType rental = RentalFactory.getRental("01-04-2016", "28-04-2016", null);

        Assert.assertEquals("28-04-2016", rental.getReturnDate());
    }

    @Test
    public void testUpdateRental() throws Exception
    {
        RentalType rental = RentalFactory.getRental("01-04-2016", "28-04-2016", null);

        RentalType newRental = new RentalType.Builder(rental.getPickUpDate())
                .copy(rental)
                .returnDate("30-04-2016")
                .build();

        Assert.assertEquals("28-04-2016", rental.getReturnDate());
        Assert.assertEquals("30-04-2016", newRental.getReturnDate());
    }











    /*
    @Test
    public void testCreate() throws Exception {
        Settings settings = SettingsFactory.getSettings("test@test.com","USEM");
        Assert.assertEquals("test@test.com",settings.getUsername());

    }

    @Test
    public void testUpdate() throws Exception {
        Settings settings = SettingsFactory.getSettings("test@test.com","USEM");
        Settings newSettings = new Settings
                .Builder()
                .copy(settings)
                .username("test@t.com")
                .build();
        Assert.assertEquals("test@t.com",newSettings.getUsername());
        Assert.assertEquals("USEM",newSettings.getCode());

    }*/

}
