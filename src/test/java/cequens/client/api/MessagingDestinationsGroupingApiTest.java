package cequens.client.api;

import cequens.client.ApiException;
import cequens.client.model.GroupSubscribtionRes;
import cequens.client.model.CreateGroupReq;
import cequens.client.model.SubscribeInGroupReq;
import cequens.client.model.UnsubscribeFromGroupReq;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MessagingDestinationsGroupingApi
 */
public class MessagingDestinationsGroupingApiTest {

    private final MessagingDestinationsGroupingApi api = new MessagingDestinationsGroupingApi();

    
    /**
     * Create a new Group of mobile phone numbers.
     *
     * Manage your contacts by adding them to group
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createGroupTest() throws ApiException {
        CreateGroupReq body = null;
        // GroupSubscribtionRes response = api.createGroup(body);

        // TODO: test validations
    }
    
    /**
     * Subscribe your contacts into an existing group.
     *
     * Subscribe your contacts to specific group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void subscribeIntoGroupTest() throws ApiException {
        SubscribeInGroupReq body = null;
        // GroupSubscribtionRes response = api.subscribeIntoGroup(body);

        // TODO: test validations
    }
    
    /**
     * Unsubscribe your contacts from an existing group.
     *
     * Unsubscribe your contacts from specific group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void unsubscribeFromGroupTest() throws ApiException {
        UnsubscribeFromGroupReq body = null;
        // GroupSubscribtionRes response = api.unsubscribeFromGroup(body);

        // TODO: test validations
    }
    
}
