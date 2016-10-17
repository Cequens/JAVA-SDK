package cequens.client.api;

import cequens.client.ApiException;
import cequens.client.model.AccbalanceRes;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MessagingAccountsApi
 */
public class MessagingAccountsApiTest {

    private final MessagingAccountsApi api = new MessagingAccountsApi();

    
    /**
     * Know your current balance
     *
     * Returns account balance. If account is master account and has subaccounts, the subaccounts balances details are returned as well.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountBalanceTest() throws ApiException {
        // AccbalanceRes response = api.getAccountBalance();

        // TODO: test validations
    }
    
}
