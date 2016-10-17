# MessagingSMSApi

All URIs are relative to *http://api.cequens.com/cequens/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMessageDetailsById**](MessagingSMSApi.md#getMessageDetailsById) | **GET** /messaging/{message_id} | Get message details by its ID.
[**getMessagesCountByDateRange**](MessagingSMSApi.md#getMessagesCountByDateRange) | **GET** /messaging/Count | Inquire about your Messages counts
[**getMessagesDetailsByDateRange**](MessagingSMSApi.md#getMessagesDetailsByDateRange) | **GET** /messaging | Inquire about your messages within date ranges.
[**sendSMS**](MessagingSMSApi.md#sendSMS) | **POST** /messaging | Send single SMS or bulk SMS.
[**sendSMStoGroup**](MessagingSMSApi.md#sendSMStoGroup) | **POST** /messaging/groups | Send SMS to Group of contacts.


<a name="getMessageDetailsById"></a>
# **getMessageDetailsById**
> MessageDetailsRes getMessageDetailsById(messageId)

Get message details by its ID.

Returns SMSs by Id

### Example
```java
// Import classes:
//import cequens.client.ApiClient;
//import cequens.client.ApiException;
//import cequens.client.Configuration;
//import cequens.client.auth.*;
//import cequens.client.api.MessagingSMSApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: accessToken
OAuth accessToken = (OAuth) defaultClient.getAuthentication("accessToken");
accessToken.setAccessToken("YOUR ACCESS TOKEN");

MessagingSMSApi apiInstance = new MessagingSMSApi();
String messageId = "messageId_example"; // String | ID of SMS to fetch
try {
    MessageDetailsRes result = apiInstance.getMessageDetailsById(messageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingSMSApi#getMessageDetailsById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageId** | **String**| ID of SMS to fetch |

### Return type

[**MessageDetailsRes**](MessageDetailsRes.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMessagesCountByDateRange"></a>
# **getMessagesCountByDateRange**
> MessagesCountRes getMessagesCountByDateRange(from, to)

Inquire about your Messages counts

Returns count of sent SMSs in specific duration

### Example
```java
// Import classes:
//import cequens.client.ApiClient;
//import cequens.client.ApiException;
//import cequens.client.Configuration;
//import cequens.client.auth.*;
//import cequens.client.api.MessagingSMSApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: accessToken
OAuth accessToken = (OAuth) defaultClient.getAuthentication("accessToken");
accessToken.setAccessToken("YOUR ACCESS TOKEN");

MessagingSMSApi apiInstance = new MessagingSMSApi();
DateTime from = new DateTime(); // DateTime | Interval start date, Supported date formats are['YYYY-MM-DD hh:mm:ss','MM-DD-YYYY hh:mm:ss','YYYY/MM/DD hh:mm:ss','MM/DD/YYYY hh:mm:ss','YYYY-M-D hh:mm:ss','M-D-YYYY hh:mm:ss','YYYY/M/D hh:mm:ss','M/D/YYYY hh:mm:ss']
DateTime to = new DateTime(); // DateTime | Interval end date, Supported date formats are['YYYY-MM-DD hh:mm:ss','MM-DD-YYYY hh:mm:ss','YYYY/MM/DD hh:mm:ss','MM/DD/YYYY hh:mm:ss','YYYY-M-D hh:mm:ss','M-D-YYYY hh:mm:ss','YYYY/M/D hh:mm:ss','M/D/YYYY hh:mm:ss']
try {
    MessagesCountRes result = apiInstance.getMessagesCountByDateRange(from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingSMSApi#getMessagesCountByDateRange");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **DateTime**| Interval start date, Supported date formats are[&#39;YYYY-MM-DD hh:mm:ss&#39;,&#39;MM-DD-YYYY hh:mm:ss&#39;,&#39;YYYY/MM/DD hh:mm:ss&#39;,&#39;MM/DD/YYYY hh:mm:ss&#39;,&#39;YYYY-M-D hh:mm:ss&#39;,&#39;M-D-YYYY hh:mm:ss&#39;,&#39;YYYY/M/D hh:mm:ss&#39;,&#39;M/D/YYYY hh:mm:ss&#39;] |
 **to** | **DateTime**| Interval end date, Supported date formats are[&#39;YYYY-MM-DD hh:mm:ss&#39;,&#39;MM-DD-YYYY hh:mm:ss&#39;,&#39;YYYY/MM/DD hh:mm:ss&#39;,&#39;MM/DD/YYYY hh:mm:ss&#39;,&#39;YYYY-M-D hh:mm:ss&#39;,&#39;M-D-YYYY hh:mm:ss&#39;,&#39;YYYY/M/D hh:mm:ss&#39;,&#39;M/D/YYYY hh:mm:ss&#39;] |

### Return type

[**MessagesCountRes**](MessagesCountRes.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMessagesDetailsByDateRange"></a>
# **getMessagesDetailsByDateRange**
> MessageDetailsRes getMessagesDetailsByDateRange(from, to, pageIndex, patchSize)

Inquire about your messages within date ranges.

Returns all sent SMSs with details.

### Example
```java
// Import classes:
//import cequens.client.ApiClient;
//import cequens.client.ApiException;
//import cequens.client.Configuration;
//import cequens.client.auth.*;
//import cequens.client.api.MessagingSMSApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: accessToken
OAuth accessToken = (OAuth) defaultClient.getAuthentication("accessToken");
accessToken.setAccessToken("YOUR ACCESS TOKEN");

MessagingSMSApi apiInstance = new MessagingSMSApi();
DateTime from = new DateTime(); // DateTime | Interval start date, Supported date formats are['YYYY-MM-DD hh:mm:ss','MM-DD-YYYY hh:mm:ss','YYYY/MM/DD hh:mm:ss','MM/DD/YYYY hh:mm:ss','YYYY-M-D hh:mm:ss','M-D-YYYY hh:mm:ss','YYYY/M/D hh:mm:ss','M/D/YYYY hh:mm:ss']
DateTime to = new DateTime(); // DateTime | Interval end date, Supported date formats are['YYYY-MM-DD hh:mm:ss','MM-DD-YYYY hh:mm:ss','YYYY/MM/DD hh:mm:ss','MM/DD/YYYY hh:mm:ss','YYYY-M-D hh:mm:ss','M-D-YYYY hh:mm:ss','YYYY/M/D hh:mm:ss','M/D/YYYY hh:mm:ss']
Integer pageIndex = 1; // Integer | Page index starts from 1:N for too many SMSs retrieved.
Integer patchSize = 1000; // Integer | Number of SMS per page. Max value is 1000.
try {
    MessageDetailsRes result = apiInstance.getMessagesDetailsByDateRange(from, to, pageIndex, patchSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingSMSApi#getMessagesDetailsByDateRange");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **DateTime**| Interval start date, Supported date formats are[&#39;YYYY-MM-DD hh:mm:ss&#39;,&#39;MM-DD-YYYY hh:mm:ss&#39;,&#39;YYYY/MM/DD hh:mm:ss&#39;,&#39;MM/DD/YYYY hh:mm:ss&#39;,&#39;YYYY-M-D hh:mm:ss&#39;,&#39;M-D-YYYY hh:mm:ss&#39;,&#39;YYYY/M/D hh:mm:ss&#39;,&#39;M/D/YYYY hh:mm:ss&#39;] |
 **to** | **DateTime**| Interval end date, Supported date formats are[&#39;YYYY-MM-DD hh:mm:ss&#39;,&#39;MM-DD-YYYY hh:mm:ss&#39;,&#39;YYYY/MM/DD hh:mm:ss&#39;,&#39;MM/DD/YYYY hh:mm:ss&#39;,&#39;YYYY-M-D hh:mm:ss&#39;,&#39;M-D-YYYY hh:mm:ss&#39;,&#39;YYYY/M/D hh:mm:ss&#39;,&#39;M/D/YYYY hh:mm:ss&#39;] |
 **pageIndex** | **Integer**| Page index starts from 1:N for too many SMSs retrieved. | [optional] [default to 1]
 **patchSize** | **Integer**| Number of SMS per page. Max value is 1000. | [optional] [default to 1000]

### Return type

[**MessageDetailsRes**](MessageDetailsRes.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendSMS"></a>
# **sendSMS**
> SendSMSRes sendSMS(body)

Send single SMS or bulk SMS.

Send single or bulk SMS.

### Example
```java
// Import classes:
//import cequens.client.ApiClient;
//import cequens.client.ApiException;
//import cequens.client.Configuration;
//import cequens.client.auth.*;
//import cequens.client.api.MessagingSMSApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: accessToken
OAuth accessToken = (OAuth) defaultClient.getAuthentication("accessToken");
accessToken.setAccessToken("YOUR ACCESS TOKEN");

MessagingSMSApi apiInstance = new MessagingSMSApi();
SendSMSReq body = new SendSMSReq(); // SendSMSReq | SMS object that needs to be sent
try {
    SendSMSRes result = apiInstance.sendSMS(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingSMSApi#sendSMS");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SendSMSReq**](SendSMSReq.md)| SMS object that needs to be sent |

### Return type

[**SendSMSRes**](SendSMSRes.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendSMStoGroup"></a>
# **sendSMStoGroup**
> SendSMSRes sendSMStoGroup(body)

Send SMS to Group of contacts.

Send SMS to Group.

### Example
```java
// Import classes:
//import cequens.client.ApiClient;
//import cequens.client.ApiException;
//import cequens.client.Configuration;
//import cequens.client.auth.*;
//import cequens.client.api.MessagingSMSApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: accessToken
OAuth accessToken = (OAuth) defaultClient.getAuthentication("accessToken");
accessToken.setAccessToken("YOUR ACCESS TOKEN");

MessagingSMSApi apiInstance = new MessagingSMSApi();
SendSMStoGroupReq body = new SendSMStoGroupReq(); // SendSMStoGroupReq | SMS object that needs to be sent
try {
    SendSMSRes result = apiInstance.sendSMStoGroup(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingSMSApi#sendSMStoGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SendSMStoGroupReq**](SendSMStoGroupReq.md)| SMS object that needs to be sent |

### Return type

[**SendSMSRes**](SendSMSRes.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

