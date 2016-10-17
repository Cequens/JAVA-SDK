package cequens.client.api;

import cequens.client.ApiException;
import cequens.client.model.SignInRes;
import cequens.client.model.SignInReq;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MessagingAuthenticationApi
 */
public class MessagingAuthenticationApiTest {

    private final MessagingAuthenticationApi api = new MessagingAuthenticationApi();

    
    /**
     * Sign in to generate your access token.
     *
     * using your APIKEY, you can generate your access token.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void signInTest() throws ApiException {
        SignInReq body = null;
        // SignInRes response = api.signIn(body);

        // TODO: test validations
    }
    
}
