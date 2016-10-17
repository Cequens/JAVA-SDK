
# SendSMSReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messageText** | **String** |  | 
**senderName** | **String** |  | 
**messageType** | [**MessageTypeEnum**](#MessageTypeEnum) | Message type either text or unicode | 
**recipients** | **String** | in case of bulk , recipients are separated by comma. | 
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
**optimizeSMS** | **Integer** | Values[0/1], To Enable/Disable optimizing your SMS If you are MES Account. |  [optional]
**mergeSMS** | **Integer** | Values[0/1], To Enable/Disable merging campaigns to your SMS If you are MES Account. |  [optional]


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



