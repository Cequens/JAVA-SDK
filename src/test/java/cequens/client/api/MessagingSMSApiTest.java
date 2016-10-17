package cequens.client.api;

import cequens.client.ApiException;
import cequens.client.model.MessageDetailsRes;
import cequens.client.model.MessagesCountRes;
import org.joda.time.DateTime;
import cequens.client.model.SendSMSRes;
import cequens.client.model.SendSMSReq;
import cequens.client.model.SendSMStoGroupReq;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MessagingSMSApi
 */
public class MessagingSMSApiTest {

    private final MessagingSMSApi api = new MessagingSMSApi();

    
    /**
     * Get message details by its ID.
     *
     * Returns SMSs by Id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMessageDetailsByIdTest() throws ApiException {
        String messageId = null;
        // MessageDetailsRes response = api.getMessageDetailsById(messageId);

        // TODO: test validations
    }
    
    /**
     * Inquire about your Messages counts
     *
     * Returns count of sent SMSs in specific duration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMessagesCountByDateRangeTest() throws ApiException {
        DateTime from = null;
        DateTime to = null;
        // MessagesCountRes response = api.getMessagesCountByDateRange(from, to);

        // TODO: test validations
    }
    
    /**
     * Inquire about your messages within date ranges.
     *
     * Returns all sent SMSs with details.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMessagesDetailsByDateRangeTest() throws ApiException {
        DateTime from = null;
        DateTime to = null;
        Integer pageIndex = null;
        Integer patchSize = null;
        // MessageDetailsRes response = api.getMessagesDetailsByDateRange(from, to, pageIndex, patchSize);

        // TODO: test validations
    }
    
    /**
     * Send single SMS or bulk SMS.
     *
     * Send single or bulk SMS.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendSMSTest() throws ApiException {
        SendSMSReq body = null;
        // SendSMSRes response = api.sendSMS(body);

        // TODO: test validations
    }
    
    /**
     * Send SMS to Group of contacts.
     *
     * Send SMS to Group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendSMStoGroupTest() throws ApiException {
        SendSMStoGroupReq body = null;
        // SendSMSRes response = api.sendSMStoGroup(body);

        // TODO: test validations
    }
    
}
