package cequens.client.api;

import cequens.client.ApiException;
import cequens.client.model.PasscodeStatusRes;
import cequens.client.model.VerifyPasscodeRes;
import cequens.client.model.VerifyPasscodeReq;
import cequens.client.model.VerifyNumberRes;
import cequens.client.model.VerifyNumberReq;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MessagingDestinationsVerificationApi
 */
public class MessagingDestinationsVerificationApiTest {

    private final MessagingDestinationsVerificationApi api = new MessagingDestinationsVerificationApi();

    
    /**
     * Track the verification request and its passcode status.
     *
     * Get verification pass code status.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPasscodeStatusTest() throws ApiException {
        String checkCode = null;
        // PasscodeStatusRes response = api.getPasscodeStatus(checkCode);

        // TODO: test validations
    }
    
    /**
     * Check and validate the recieved pass code.
     *
     * Verify passcode
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validatePasscodeTest() throws ApiException {
        VerifyPasscodeReq body = null;
        // VerifyPasscodeRes response = api.validatePasscode(body);

        // TODO: test validations
    }
    
    /**
     * Send a verification pass code to your number by SMS.
     *
     * Send a verification pass code to your number by SMS to verify your identity.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void verifyNumberTest() throws ApiException {
        VerifyNumberReq body = null;
        // VerifyNumberRes response = api.verifyNumber(body);

        // TODO: test validations
    }
    
}
