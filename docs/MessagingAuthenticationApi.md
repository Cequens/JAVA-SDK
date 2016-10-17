# MessagingAuthenticationApi

All URIs are relative to *http://api.cequens.com/cequens/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**signIn**](MessagingAuthenticationApi.md#signIn) | **POST** /signin | Sign in to generate your access token.


<a name="signIn"></a>
# **signIn**
> SignInRes signIn(body)

Sign in to generate your access token.

using your APIKEY, you can generate your access token.

### Example
```java
// Import classes:
//import cequens.client.ApiException;
//import cequens.client.api.MessagingAuthenticationApi;


MessagingAuthenticationApi apiInstance = new MessagingAuthenticationApi();
SignInReq body = new SignInReq(); // SignInReq | The signin object.
try {
    SignInRes result = apiInstance.signIn(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingAuthenticationApi#signIn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SignInReq**](SignInReq.md)| The signin object. |

### Return type

[**SignInRes**](SignInRes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

