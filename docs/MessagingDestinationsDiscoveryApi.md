# MessagingDestinationsDiscoveryApi

All URIs are relative to *http://api.cequens.com/cequens/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**discoverGroups**](MessagingDestinationsDiscoveryApi.md#discoverGroups) | **GET** /destinations/discovery/groups | Discover more details [HLR] about mobile phone numbers in predefined group.
[**discoverNumber**](MessagingDestinationsDiscoveryApi.md#discoverNumber) | **GET** /destinations/discovery | Discover more details [HLR] about any number.


<a name="discoverGroups"></a>
# **discoverGroups**
> NumberDiscoveryRes discoverGroups(groups)

Discover more details [HLR] about mobile phone numbers in predefined group.

Know more [HLR] about mobile phone numbers in predefined group.

### Example
```java
// Import classes:
//import cequens.client.ApiClient;
//import cequens.client.ApiException;
//import cequens.client.Configuration;
//import cequens.client.auth.*;
//import cequens.client.api.MessagingDestinationsDiscoveryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: accessToken
OAuth accessToken = (OAuth) defaultClient.getAuthentication("accessToken");
accessToken.setAccessToken("YOUR ACCESS TOKEN");

MessagingDestinationsDiscoveryApi apiInstance = new MessagingDestinationsDiscoveryApi();
String groups = "groups_example"; // String | The group/s names of recipients seperated by comma to be discovered.
try {
    NumberDiscoveryRes result = apiInstance.discoverGroups(groups);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingDestinationsDiscoveryApi#discoverGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groups** | **String**| The group/s names of recipients seperated by comma to be discovered. |

### Return type

[**NumberDiscoveryRes**](NumberDiscoveryRes.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="discoverNumber"></a>
# **discoverNumber**
> NumberDiscoveryRes discoverNumber(numbers)

Discover more details [HLR] about any number.

Know more [HLR] about any number.

### Example
```java
// Import classes:
//import cequens.client.ApiClient;
//import cequens.client.ApiException;
//import cequens.client.Configuration;
//import cequens.client.auth.*;
//import cequens.client.api.MessagingDestinationsDiscoveryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: accessToken
OAuth accessToken = (OAuth) defaultClient.getAuthentication("accessToken");
accessToken.setAccessToken("YOUR ACCESS TOKEN");

MessagingDestinationsDiscoveryApi apiInstance = new MessagingDestinationsDiscoveryApi();
String numbers = "numbers_example"; // String | Valid international mobile phone numbers to be discovered seperated by comma.
try {
    NumberDiscoveryRes result = apiInstance.discoverNumber(numbers);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingDestinationsDiscoveryApi#discoverNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **numbers** | **String**| Valid international mobile phone numbers to be discovered seperated by comma. |

### Return type

[**NumberDiscoveryRes**](NumberDiscoveryRes.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

