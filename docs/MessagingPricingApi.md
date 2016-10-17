# MessagingPricingApi

All URIs are relative to *http://api.cequens.com/cequens/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCountryPricing**](MessagingPricingApi.md#getCountryPricing) | **GET** /pricing/policies | Get the pricing schema of the networks.
[**getCountryPricingByMobileNo**](MessagingPricingApi.md#getCountryPricingByMobileNo) | **GET** /pricing/destinations/{phone_number} | Get the SMS price using mobile phone number.


<a name="getCountryPricing"></a>
# **getCountryPricing**
> CountryPricingRes getCountryPricing(mcc, mnc)

Get the pricing schema of the networks.

Get the pricing schema of the networks.

### Example
```java
// Import classes:
//import cequens.client.ApiClient;
//import cequens.client.ApiException;
//import cequens.client.Configuration;
//import cequens.client.auth.*;
//import cequens.client.api.MessagingPricingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: accessToken
OAuth accessToken = (OAuth) defaultClient.getAuthentication("accessToken");
accessToken.setAccessToken("YOUR ACCESS TOKEN");

MessagingPricingApi apiInstance = new MessagingPricingApi();
String mcc = "mcc_example"; // String | Valid international mobile Country Code.
String mnc = "mnc_example"; // String | Valid international mobile Network Code.
try {
    CountryPricingRes result = apiInstance.getCountryPricing(mcc, mnc);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingPricingApi#getCountryPricing");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mcc** | **String**| Valid international mobile Country Code. |
 **mnc** | **String**| Valid international mobile Network Code. | [optional]

### Return type

[**CountryPricingRes**](CountryPricingRes.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCountryPricingByMobileNo"></a>
# **getCountryPricingByMobileNo**
> CountryPricingByMobileNoRes getCountryPricingByMobileNo(phoneNumber)

Get the SMS price using mobile phone number.

Get the SMS price using mobile phone number.

### Example
```java
// Import classes:
//import cequens.client.ApiClient;
//import cequens.client.ApiException;
//import cequens.client.Configuration;
//import cequens.client.auth.*;
//import cequens.client.api.MessagingPricingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: accessToken
OAuth accessToken = (OAuth) defaultClient.getAuthentication("accessToken");
accessToken.setAccessToken("YOUR ACCESS TOKEN");

MessagingPricingApi apiInstance = new MessagingPricingApi();
String phoneNumber = "phoneNumber_example"; // String | Valid international mobile phone number.
try {
    CountryPricingByMobileNoRes result = apiInstance.getCountryPricingByMobileNo(phoneNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingPricingApi#getCountryPricingByMobileNo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **String**| Valid international mobile phone number. |

### Return type

[**CountryPricingByMobileNoRes**](CountryPricingByMobileNoRes.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

