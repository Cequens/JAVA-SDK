# cequens-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.cequens</groupId>
    <artifactId>cequens-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "cequens:cequens-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/cequens-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.cequens.client.*;
import io.cequens.client.auth.*;
import io.cequens.client.model.*;
import io.cequens.client.api.MessagingAccountsApi;

import java.io.File;
import java.util.*;

public class MessagingAccountsApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://api.cequens.com/cequens/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*MessagingAccountsApi* | [**getAccountBalance**](docs/MessagingAccountsApi.md#getAccountBalance) | **GET** /accounts/balance | Know your current balance
*MessagingAuthenticationApi* | [**signIn**](docs/MessagingAuthenticationApi.md#signIn) | **POST** /signin | Sign in to generate your access token.
*MessagingDestinationsDiscoveryApi* | [**discoverGroups**](docs/MessagingDestinationsDiscoveryApi.md#discoverGroups) | **GET** /destinations/discovery/groups | Discover more details [HLR] about mobile phone numbers in predefined group.
*MessagingDestinationsDiscoveryApi* | [**discoverNumber**](docs/MessagingDestinationsDiscoveryApi.md#discoverNumber) | **GET** /destinations/discovery | Discover more details [HLR] about any number.
*MessagingDestinationsGroupingApi* | [**createGroup**](docs/MessagingDestinationsGroupingApi.md#createGroup) | **POST** /destinations/grouping | Create a new Group of mobile phone numbers.
*MessagingDestinationsGroupingApi* | [**subscribeIntoGroup**](docs/MessagingDestinationsGroupingApi.md#subscribeIntoGroup) | **PUT** /destinations/grouping | Subscribe your contacts into an existing group.
*MessagingDestinationsGroupingApi* | [**unsubscribeFromGroup**](docs/MessagingDestinationsGroupingApi.md#unsubscribeFromGroup) | **DELETE** /destinations/grouping | Unsubscribe your contacts from an existing group.
*MessagingDestinationsVerificationApi* | [**getPasscodeStatus**](docs/MessagingDestinationsVerificationApi.md#getPasscodeStatus) | **GET** /destinations/verification | Track the verification request and its passcode status.
*MessagingDestinationsVerificationApi* | [**validatePasscode**](docs/MessagingDestinationsVerificationApi.md#validatePasscode) | **PUT** /destinations/verification | Check and validate the recieved pass code.
*MessagingDestinationsVerificationApi* | [**verifyNumber**](docs/MessagingDestinationsVerificationApi.md#verifyNumber) | **POST** /destinations/verification | Send a verification pass code to your number by SMS.
*MessagingPricingApi* | [**getCountryPricing**](docs/MessagingPricingApi.md#getCountryPricing) | **GET** /pricing/policies | Get the pricing schema of the networks.
*MessagingPricingApi* | [**getCountryPricingByMobileNo**](docs/MessagingPricingApi.md#getCountryPricingByMobileNo) | **GET** /pricing/destinations/{phone_number} | Get the SMS price using mobile phone number.
*MessagingSMSApi* | [**getMessageDetailsById**](docs/MessagingSMSApi.md#getMessageDetailsById) | **GET** /messaging/{message_id} | Get message details by its ID.
*MessagingSMSApi* | [**getMessagesCountByDateRange**](docs/MessagingSMSApi.md#getMessagesCountByDateRange) | **GET** /messaging/Count | Inquire about your Messages counts
*MessagingSMSApi* | [**getMessagesDetailsByDateRange**](docs/MessagingSMSApi.md#getMessagesDetailsByDateRange) | **GET** /messaging | Inquire about your messages within date ranges.
*MessagingSMSApi* | [**sendSMS**](docs/MessagingSMSApi.md#sendSMS) | **POST** /messaging | Send single SMS or bulk SMS.
*MessagingSMSApi* | [**sendSMStoGroup**](docs/MessagingSMSApi.md#sendSMStoGroup) | **POST** /messaging/groups | Send SMS to Group of contacts.


## Documentation for Models

 - [AccbalanceRes](docs/AccbalanceRes.md)
 - [AccbalanceResData](docs/AccbalanceResData.md)
 - [CountryPricingByMobileNoRes](docs/CountryPricingByMobileNoRes.md)
 - [CountryPricingByMobileNoResData](docs/CountryPricingByMobileNoResData.md)
 - [CountryPricingRes](docs/CountryPricingRes.md)
 - [CountryPricingResData](docs/CountryPricingResData.md)
 - [CreateGroupReq](docs/CreateGroupReq.md)
 - [Error](docs/Error.md)
 - [GroupSubscribtionRes](docs/GroupSubscribtionRes.md)
 - [GroupSubscribtionResData](docs/GroupSubscribtionResData.md)
 - [InternalError](docs/InternalError.md)
 - [MasterAcc](docs/MasterAcc.md)
 - [MessageDetails](docs/MessageDetails.md)
 - [MessageDetailsRes](docs/MessageDetailsRes.md)
 - [MessagesCountRes](docs/MessagesCountRes.md)
 - [MessagesCountResData](docs/MessagesCountResData.md)
 - [NetworkDetails](docs/NetworkDetails.md)
 - [NumberDiscoveryDetails](docs/NumberDiscoveryDetails.md)
 - [NumberDiscoveryRes](docs/NumberDiscoveryRes.md)
 - [PasscodeStatus](docs/PasscodeStatus.md)
 - [PasscodeStatusRes](docs/PasscodeStatusRes.md)
 - [PasscodeStatusResData](docs/PasscodeStatusResData.md)
 - [SendSMSIDs](docs/SendSMSIDs.md)
 - [SendSMSReq](docs/SendSMSReq.md)
 - [SendSMSRes](docs/SendSMSRes.md)
 - [SendSMSResData](docs/SendSMSResData.md)
 - [SendSMStoGroupReq](docs/SendSMStoGroupReq.md)
 - [SignInReq](docs/SignInReq.md)
 - [SignInRes](docs/SignInRes.md)
 - [SignInResData](docs/SignInResData.md)
 - [SubAcc](docs/SubAcc.md)
 - [SubscribeInGroupReq](docs/SubscribeInGroupReq.md)
 - [UnsubscribeFromGroupReq](docs/UnsubscribeFromGroupReq.md)
 - [VerifyNumberReq](docs/VerifyNumberReq.md)
 - [VerifyNumberRes](docs/VerifyNumberRes.md)
 - [VerifyNumberResData](docs/VerifyNumberResData.md)
 - [VerifyPasscodeReq](docs/VerifyPasscodeReq.md)
 - [VerifyPasscodeRes](docs/VerifyPasscodeRes.md)
 - [VerifyPasscodeResData](docs/VerifyPasscodeResData.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### accessToken

- **Type**: OAuth
- **Flow**: accessCode
- **Authorizatoin URL**: ignored
- **Scopes**: 
  - user: user


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



