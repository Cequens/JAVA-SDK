package cequens.client.api;

import cequens.client.ApiCallback;
import cequens.client.ApiClient;
import cequens.client.ApiException;
import cequens.client.ApiResponse;
import cequens.client.Configuration;
import cequens.client.Pair;
import cequens.client.ProgressRequestBody;
import cequens.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import cequens.client.model.MessageDetailsRes;
import cequens.client.model.MessagesCountRes;
import org.joda.time.DateTime;
import cequens.client.model.SendSMSRes;
import cequens.client.model.SendSMSReq;
import cequens.client.model.SendSMStoGroupReq;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessagingSMSApi {
    private ApiClient apiClient;

    public MessagingSMSApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MessagingSMSApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getMessageDetailsById */
    private com.squareup.okhttp.Call getMessageDetailsByIdCall(String messageId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'messageId' is set
        if (messageId == null) {
            throw new ApiException("Missing the required parameter 'messageId' when calling getMessageDetailsById(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/messaging/{message_id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "message_id" + "\\}", apiClient.escapeString(messageId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "accessToken" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Get message details by its ID.
     * Returns SMSs by Id
     * @param messageId ID of SMS to fetch (required)
     * @return MessageDetailsRes
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MessageDetailsRes getMessageDetailsById(String messageId) throws ApiException {
        ApiResponse<MessageDetailsRes> resp = getMessageDetailsByIdWithHttpInfo(messageId);
        return resp.getData();
    }

    /**
     * Get message details by its ID.
     * Returns SMSs by Id
     * @param messageId ID of SMS to fetch (required)
     * @return ApiResponse&lt;MessageDetailsRes&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MessageDetailsRes> getMessageDetailsByIdWithHttpInfo(String messageId) throws ApiException {
        com.squareup.okhttp.Call call = getMessageDetailsByIdCall(messageId, null, null);
        Type localVarReturnType = new TypeToken<MessageDetailsRes>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get message details by its ID. (asynchronously)
     * Returns SMSs by Id
     * @param messageId ID of SMS to fetch (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMessageDetailsByIdAsync(String messageId, final ApiCallback<MessageDetailsRes> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getMessageDetailsByIdCall(messageId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MessageDetailsRes>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getMessagesCountByDateRange */
    private com.squareup.okhttp.Call getMessagesCountByDateRangeCall(DateTime from, DateTime to, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new ApiException("Missing the required parameter 'from' when calling getMessagesCountByDateRange(Async)");
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            throw new ApiException("Missing the required parameter 'to' when calling getMessagesCountByDateRange(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/messaging/Count".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (from != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
        if (to != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "accessToken" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Inquire about your Messages counts
     * Returns count of sent SMSs in specific duration
     * @param from Interval start date, Supported date formats are[&#39;YYYY-MM-DD hh:mm:ss&#39;,&#39;MM-DD-YYYY hh:mm:ss&#39;,&#39;YYYY/MM/DD hh:mm:ss&#39;,&#39;MM/DD/YYYY hh:mm:ss&#39;,&#39;YYYY-M-D hh:mm:ss&#39;,&#39;M-D-YYYY hh:mm:ss&#39;,&#39;YYYY/M/D hh:mm:ss&#39;,&#39;M/D/YYYY hh:mm:ss&#39;] (required)
     * @param to Interval end date, Supported date formats are[&#39;YYYY-MM-DD hh:mm:ss&#39;,&#39;MM-DD-YYYY hh:mm:ss&#39;,&#39;YYYY/MM/DD hh:mm:ss&#39;,&#39;MM/DD/YYYY hh:mm:ss&#39;,&#39;YYYY-M-D hh:mm:ss&#39;,&#39;M-D-YYYY hh:mm:ss&#39;,&#39;YYYY/M/D hh:mm:ss&#39;,&#39;M/D/YYYY hh:mm:ss&#39;] (required)
     * @return MessagesCountRes
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MessagesCountRes getMessagesCountByDateRange(DateTime from, DateTime to) throws ApiException {
        ApiResponse<MessagesCountRes> resp = getMessagesCountByDateRangeWithHttpInfo(from, to);
        return resp.getData();
    }

    /**
     * Inquire about your Messages counts
     * Returns count of sent SMSs in specific duration
     * @param from Interval start date, Supported date formats are[&#39;YYYY-MM-DD hh:mm:ss&#39;,&#39;MM-DD-YYYY hh:mm:ss&#39;,&#39;YYYY/MM/DD hh:mm:ss&#39;,&#39;MM/DD/YYYY hh:mm:ss&#39;,&#39;YYYY-M-D hh:mm:ss&#39;,&#39;M-D-YYYY hh:mm:ss&#39;,&#39;YYYY/M/D hh:mm:ss&#39;,&#39;M/D/YYYY hh:mm:ss&#39;] (required)
     * @param to Interval end date, Supported date formats are[&#39;YYYY-MM-DD hh:mm:ss&#39;,&#39;MM-DD-YYYY hh:mm:ss&#39;,&#39;YYYY/MM/DD hh:mm:ss&#39;,&#39;MM/DD/YYYY hh:mm:ss&#39;,&#39;YYYY-M-D hh:mm:ss&#39;,&#39;M-D-YYYY hh:mm:ss&#39;,&#39;YYYY/M/D hh:mm:ss&#39;,&#39;M/D/YYYY hh:mm:ss&#39;] (required)
     * @return ApiResponse&lt;MessagesCountRes&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MessagesCountRes> getMessagesCountByDateRangeWithHttpInfo(DateTime from, DateTime to) throws ApiException {
        com.squareup.okhttp.Call call = getMessagesCountByDateRangeCall(from, to, null, null);
        Type localVarReturnType = new TypeToken<MessagesCountRes>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Inquire about your Messages counts (asynchronously)
     * Returns count of sent SMSs in specific duration
     * @param from Interval start date, Supported date formats are[&#39;YYYY-MM-DD hh:mm:ss&#39;,&#39;MM-DD-YYYY hh:mm:ss&#39;,&#39;YYYY/MM/DD hh:mm:ss&#39;,&#39;MM/DD/YYYY hh:mm:ss&#39;,&#39;YYYY-M-D hh:mm:ss&#39;,&#39;M-D-YYYY hh:mm:ss&#39;,&#39;YYYY/M/D hh:mm:ss&#39;,&#39;M/D/YYYY hh:mm:ss&#39;] (required)
     * @param to Interval end date, Supported date formats are[&#39;YYYY-MM-DD hh:mm:ss&#39;,&#39;MM-DD-YYYY hh:mm:ss&#39;,&#39;YYYY/MM/DD hh:mm:ss&#39;,&#39;MM/DD/YYYY hh:mm:ss&#39;,&#39;YYYY-M-D hh:mm:ss&#39;,&#39;M-D-YYYY hh:mm:ss&#39;,&#39;YYYY/M/D hh:mm:ss&#39;,&#39;M/D/YYYY hh:mm:ss&#39;] (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMessagesCountByDateRangeAsync(DateTime from, DateTime to, final ApiCallback<MessagesCountRes> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getMessagesCountByDateRangeCall(from, to, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MessagesCountRes>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getMessagesDetailsByDateRange */
    private com.squareup.okhttp.Call getMessagesDetailsByDateRangeCall(DateTime from, DateTime to, Integer pageIndex, Integer patchSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new ApiException("Missing the required parameter 'from' when calling getMessagesDetailsByDateRange(Async)");
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            throw new ApiException("Missing the required parameter 'to' when calling getMessagesDetailsByDateRange(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/messaging".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (from != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
        if (to != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));
        if (pageIndex != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageIndex", pageIndex));
        if (patchSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "patchSize", patchSize));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "accessToken" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Inquire about your messages within date ranges.
     * Returns all sent SMSs with details.
     * @param from Interval start date, Supported date formats are[&#39;YYYY-MM-DD hh:mm:ss&#39;,&#39;MM-DD-YYYY hh:mm:ss&#39;,&#39;YYYY/MM/DD hh:mm:ss&#39;,&#39;MM/DD/YYYY hh:mm:ss&#39;,&#39;YYYY-M-D hh:mm:ss&#39;,&#39;M-D-YYYY hh:mm:ss&#39;,&#39;YYYY/M/D hh:mm:ss&#39;,&#39;M/D/YYYY hh:mm:ss&#39;] (required)
     * @param to Interval end date, Supported date formats are[&#39;YYYY-MM-DD hh:mm:ss&#39;,&#39;MM-DD-YYYY hh:mm:ss&#39;,&#39;YYYY/MM/DD hh:mm:ss&#39;,&#39;MM/DD/YYYY hh:mm:ss&#39;,&#39;YYYY-M-D hh:mm:ss&#39;,&#39;M-D-YYYY hh:mm:ss&#39;,&#39;YYYY/M/D hh:mm:ss&#39;,&#39;M/D/YYYY hh:mm:ss&#39;] (required)
     * @param pageIndex Page index starts from 1:N for too many SMSs retrieved. (optional, default to 1)
     * @param patchSize Number of SMS per page. Max value is 1000. (optional, default to 1000)
     * @return MessageDetailsRes
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MessageDetailsRes getMessagesDetailsByDateRange(DateTime from, DateTime to, Integer pageIndex, Integer patchSize) throws ApiException {
        ApiResponse<MessageDetailsRes> resp = getMessagesDetailsByDateRangeWithHttpInfo(from, to, pageIndex, patchSize);
        return resp.getData();
    }

    /**
     * Inquire about your messages within date ranges.
     * Returns all sent SMSs with details.
     * @param from Interval start date, Supported date formats are[&#39;YYYY-MM-DD hh:mm:ss&#39;,&#39;MM-DD-YYYY hh:mm:ss&#39;,&#39;YYYY/MM/DD hh:mm:ss&#39;,&#39;MM/DD/YYYY hh:mm:ss&#39;,&#39;YYYY-M-D hh:mm:ss&#39;,&#39;M-D-YYYY hh:mm:ss&#39;,&#39;YYYY/M/D hh:mm:ss&#39;,&#39;M/D/YYYY hh:mm:ss&#39;] (required)
     * @param to Interval end date, Supported date formats are[&#39;YYYY-MM-DD hh:mm:ss&#39;,&#39;MM-DD-YYYY hh:mm:ss&#39;,&#39;YYYY/MM/DD hh:mm:ss&#39;,&#39;MM/DD/YYYY hh:mm:ss&#39;,&#39;YYYY-M-D hh:mm:ss&#39;,&#39;M-D-YYYY hh:mm:ss&#39;,&#39;YYYY/M/D hh:mm:ss&#39;,&#39;M/D/YYYY hh:mm:ss&#39;] (required)
     * @param pageIndex Page index starts from 1:N for too many SMSs retrieved. (optional, default to 1)
     * @param patchSize Number of SMS per page. Max value is 1000. (optional, default to 1000)
     * @return ApiResponse&lt;MessageDetailsRes&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MessageDetailsRes> getMessagesDetailsByDateRangeWithHttpInfo(DateTime from, DateTime to, Integer pageIndex, Integer patchSize) throws ApiException {
        com.squareup.okhttp.Call call = getMessagesDetailsByDateRangeCall(from, to, pageIndex, patchSize, null, null);
        Type localVarReturnType = new TypeToken<MessageDetailsRes>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Inquire about your messages within date ranges. (asynchronously)
     * Returns all sent SMSs with details.
     * @param from Interval start date, Supported date formats are[&#39;YYYY-MM-DD hh:mm:ss&#39;,&#39;MM-DD-YYYY hh:mm:ss&#39;,&#39;YYYY/MM/DD hh:mm:ss&#39;,&#39;MM/DD/YYYY hh:mm:ss&#39;,&#39;YYYY-M-D hh:mm:ss&#39;,&#39;M-D-YYYY hh:mm:ss&#39;,&#39;YYYY/M/D hh:mm:ss&#39;,&#39;M/D/YYYY hh:mm:ss&#39;] (required)
     * @param to Interval end date, Supported date formats are[&#39;YYYY-MM-DD hh:mm:ss&#39;,&#39;MM-DD-YYYY hh:mm:ss&#39;,&#39;YYYY/MM/DD hh:mm:ss&#39;,&#39;MM/DD/YYYY hh:mm:ss&#39;,&#39;YYYY-M-D hh:mm:ss&#39;,&#39;M-D-YYYY hh:mm:ss&#39;,&#39;YYYY/M/D hh:mm:ss&#39;,&#39;M/D/YYYY hh:mm:ss&#39;] (required)
     * @param pageIndex Page index starts from 1:N for too many SMSs retrieved. (optional, default to 1)
     * @param patchSize Number of SMS per page. Max value is 1000. (optional, default to 1000)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMessagesDetailsByDateRangeAsync(DateTime from, DateTime to, Integer pageIndex, Integer patchSize, final ApiCallback<MessageDetailsRes> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getMessagesDetailsByDateRangeCall(from, to, pageIndex, patchSize, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MessageDetailsRes>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for sendSMS */
    private com.squareup.okhttp.Call sendSMSCall(SendSMSReq body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling sendSMS(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/messaging".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "accessToken" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Send single SMS or bulk SMS.
     * Send single or bulk SMS.
     * @param body SMS object that needs to be sent (required)
     * @return SendSMSRes
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SendSMSRes sendSMS(SendSMSReq body) throws ApiException {
        ApiResponse<SendSMSRes> resp = sendSMSWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Send single SMS or bulk SMS.
     * Send single or bulk SMS.
     * @param body SMS object that needs to be sent (required)
     * @return ApiResponse&lt;SendSMSRes&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SendSMSRes> sendSMSWithHttpInfo(SendSMSReq body) throws ApiException {
        com.squareup.okhttp.Call call = sendSMSCall(body, null, null);
        Type localVarReturnType = new TypeToken<SendSMSRes>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Send single SMS or bulk SMS. (asynchronously)
     * Send single or bulk SMS.
     * @param body SMS object that needs to be sent (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call sendSMSAsync(SendSMSReq body, final ApiCallback<SendSMSRes> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = sendSMSCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SendSMSRes>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for sendSMStoGroup */
    private com.squareup.okhttp.Call sendSMStoGroupCall(SendSMStoGroupReq body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling sendSMStoGroup(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/messaging/groups".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "accessToken" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Send SMS to Group of contacts.
     * Send SMS to Group.
     * @param body SMS object that needs to be sent (required)
     * @return SendSMSRes
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SendSMSRes sendSMStoGroup(SendSMStoGroupReq body) throws ApiException {
        ApiResponse<SendSMSRes> resp = sendSMStoGroupWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Send SMS to Group of contacts.
     * Send SMS to Group.
     * @param body SMS object that needs to be sent (required)
     * @return ApiResponse&lt;SendSMSRes&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SendSMSRes> sendSMStoGroupWithHttpInfo(SendSMStoGroupReq body) throws ApiException {
        com.squareup.okhttp.Call call = sendSMStoGroupCall(body, null, null);
        Type localVarReturnType = new TypeToken<SendSMSRes>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Send SMS to Group of contacts. (asynchronously)
     * Send SMS to Group.
     * @param body SMS object that needs to be sent (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call sendSMStoGroupAsync(SendSMStoGroupReq body, final ApiCallback<SendSMSRes> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = sendSMStoGroupCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SendSMSRes>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
