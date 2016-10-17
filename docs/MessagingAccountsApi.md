# MessagingAccountsApi

All URIs are relative to *http://api.cequens.com/cequens/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccountBalance**](MessagingAccountsApi.md#getAccountBalance) | **GET** /accounts/balance | Know your current balance


<a name="getAccountBalance"></a>
# **getAccountBalance**
> AccbalanceRes getAccountBalance()

Know your current balance

Returns account balance. If account is master account and has subaccounts, the subaccounts balances details are returned as well.

### Example
```java
// Import classes:
//import cequens.client.ApiClient;
//import cequens.client.ApiException;
//import cequens.client.Configuration;
//import cequens.client.auth.*;
//import cequens.client.api.MessagingAccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: accessToken
OAuth accessToken = (OAuth) defaultClient.getAuthentication("accessToken");
accessToken.setAccessToken("YOUR ACCESS TOKEN");

MessagingAccountsApi apiInstance = new MessagingAccountsApi();
try {
    AccbalanceRes result = apiInstance.getAccountBalance();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingAccountsApi#getAccountBalance");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AccbalanceRes**](AccbalanceRes.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

