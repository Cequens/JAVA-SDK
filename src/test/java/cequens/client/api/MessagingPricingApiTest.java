package cequens.client.api;

import cequens.client.ApiException;
import cequens.client.model.CountryPricingRes;
import cequens.client.model.CountryPricingByMobileNoRes;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MessagingPricingApi
 */
public class MessagingPricingApiTest {

    private final MessagingPricingApi api = new MessagingPricingApi();

    
    /**
     * Get the pricing schema of the networks.
     *
     * Get the pricing schema of the networks.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCountryPricingTest() throws ApiException {
        String mcc = null;
        String mnc = null;
        // CountryPricingRes response = api.getCountryPricing(mcc, mnc);

        // TODO: test validations
    }
    
    /**
     * Get the SMS price using mobile phone number.
     *
     * Get the SMS price using mobile phone number.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCountryPricingByMobileNoTest() throws ApiException {
        String phoneNumber = null;
        // CountryPricingByMobileNoRes response = api.getCountryPricingByMobileNo(phoneNumber);

        // TODO: test validations
    }
    
}
