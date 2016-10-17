# MessagingDestinationsVerificationApi

All URIs are relative to *http://api.cequens.com/cequens/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPasscodeStatus**](MessagingDestinationsVerificationApi.md#getPasscodeStatus) | **GET** /destinations/verification | Track the verification request and its passcode status.
[**validatePasscode**](MessagingDestinationsVerificationApi.md#validatePasscode) | **PUT** /destinations/verification | Check and validate the recieved pass code.
[**verifyNumber**](MessagingDestinationsVerificationApi.md#verifyNumber) | **POST** /destinations/verification | Send a verification pass code to your number by SMS.


<a name="getPasscodeStatus"></a>
# **getPasscodeStatus**
> PasscodeStatusRes getPasscodeStatus(checkCode)

Track the verification request and its passcode status.

Get verification pass code status.

### Example
```java
// Import classes:
//import cequens.client.ApiClient;
//import cequens.client.ApiException;
//import cequens.client.Configuration;
//import cequens.client.auth.*;
//import cequens.client.api.MessagingDestinationsVerificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: accessToken
OAuth accessToken = (OAuth) defaultClient.getAuthentication("accessToken");
accessToken.setAccessToken("YOUR ACCESS TOKEN");

MessagingDestinationsVerificationApi apiInstance = new MessagingDestinationsVerificationApi();
String checkCode = "checkCode_example"; // String | Checkcode that references to passcode
try {
    PasscodeStatusRes result = apiInstance.getPasscodeStatus(checkCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingDestinationsVerificationApi#getPasscodeStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkCode** | **String**| Checkcode that references to passcode |

### Return type

[**PasscodeStatusRes**](PasscodeStatusRes.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="validatePasscode"></a>
# **validatePasscode**
> VerifyPasscodeRes validatePasscode(body)

Check and validate the recieved pass code.

Verify passcode

### Example
```java
// Import classes:
//import cequens.client.ApiClient;
//import cequens.client.ApiException;
//import cequens.client.Configuration;
//import cequens.client.auth.*;
//import cequens.client.api.MessagingDestinationsVerificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: accessToken
OAuth accessToken = (OAuth) defaultClient.getAuthentication("accessToken");
accessToken.setAccessToken("YOUR ACCESS TOKEN");

MessagingDestinationsVerificationApi apiInstance = new MessagingDestinationsVerificationApi();
VerifyPasscodeReq body = new VerifyPasscodeReq(); // VerifyPasscodeReq | All info to verify passcode.
try {
    VerifyPasscodeRes result = apiInstance.validatePasscode(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingDestinationsVerificationApi#validatePasscode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VerifyPasscodeReq**](VerifyPasscodeReq.md)| All info to verify passcode. |

### Return type

[**VerifyPasscodeRes**](VerifyPasscodeRes.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="verifyNumber"></a>
# **verifyNumber**
> VerifyNumberRes verifyNumber(body)

Send a verification pass code to your number by SMS.

Send a verification pass code to your number by SMS to verify your identity.

### Example
```java
// Import classes:
//import cequens.client.ApiClient;
//import cequens.client.ApiException;
//import cequens.client.Configuration;
//import cequens.client.auth.*;
//import cequens.client.api.MessagingDestinationsVerificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: accessToken
OAuth accessToken = (OAuth) defaultClient.getAuthentication("accessToken");
accessToken.setAccessToken("YOUR ACCESS TOKEN");

MessagingDestinationsVerificationApi apiInstance = new MessagingDestinationsVerificationApi();
VerifyNumberReq body = new VerifyNumberReq(); // VerifyNumberReq | All info to verify number.
try {
    VerifyNumberRes result = apiInstance.verifyNumber(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingDestinationsVerificationApi#verifyNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VerifyNumberReq**](VerifyNumberReq.md)| All info to verify number. |

### Return type

[**VerifyNumberRes**](VerifyNumberRes.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

