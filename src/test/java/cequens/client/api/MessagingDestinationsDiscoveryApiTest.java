package cequens.client.api;

import cequens.client.ApiException;
import cequens.client.model.NumberDiscoveryRes;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MessagingDestinationsDiscoveryApi
 */
public class MessagingDestinationsDiscoveryApiTest {

    private final MessagingDestinationsDiscoveryApi api = new MessagingDestinationsDiscoveryApi();

    
    /**
     * Discover more details [HLR] about mobile phone numbers in predefined group.
     *
     * Know more [HLR] about mobile phone numbers in predefined group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void discoverGroupsTest() throws ApiException {
        String groups = null;
        // NumberDiscoveryRes response = api.discoverGroups(groups);

        // TODO: test validations
    }
    
    /**
     * Discover more details [HLR] about any number.
     *
     * Know more [HLR] about any number.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void discoverNumberTest() throws ApiException {
        String numbers = null;
        // NumberDiscoveryRes response = api.discoverNumber(numbers);

        // TODO: test validations
    }
    
}
