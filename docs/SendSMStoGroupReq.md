
# SendSMStoGroupReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messageText** | **String** |  | 
**senderName** | **String** |  | 
**messageType** | [**MessageTypeEnum**](#MessageTypeEnum) | Message type either text or unicode | 
**groups** | **String** | The name of the group of mobile phone numbers. in case of multiple groups, separate them by comma. | 
**clientMessageId** | **Integer** | Client Message Ref Id. |  [optional]
**acknowledgement** | **Integer** | Need Ack or not [0 or 1]. |  [optional]
**deliveryTime** | **String** | Default is 1440 |  [optional]
**validityPeriod** | **String** | Default is 1440 |  [optional]
**ip** | **String** | IP address. |  [optional]
**dlrUrl** | **String** | Default is empty string. |  [optional]
**dateStamp** | **String** | Default is current datetime. |  [optional]
**udh** | **String** | Default is empty string. |  [optional]
**dataCoding** | **String** | Default is empty string. |  [optional]
**flashing** | [**FlashingEnum**](#FlashingEnum) | To flash or not [0 or 1]. |  [optional]


<a name="MessageTypeEnum"></a>
## Enum: MessageTypeEnum
Name | Value
---- | -----
TEXT | &quot;text&quot;
UNICODE | &quot;unicode&quot;


<a name="FlashingEnum"></a>
## Enum: FlashingEnum
Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1



