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

import cequens.client.model.GroupSubscribtionRes;
import cequens.client.model.CreateGroupReq;
import cequens.client.model.SubscribeInGroupReq;
import cequens.client.model.UnsubscribeFromGroupReq;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessagingDestinationsGroupingApi {
    private ApiClient apiClient;

    public MessagingDestinationsGroupingApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MessagingDestinationsGroupingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for createGroup */
    private com.squareup.okhttp.Call createGroupCall(CreateGroupReq body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createGroup(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/destinations/grouping".replaceAll("\\{format\\}","json");

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
     * Create a new Group of mobile phone numbers.
     * Manage your contacts by adding them to group
     * @param body The group information to be created (required)
     * @return GroupSubscribtionRes
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GroupSubscribtionRes createGroup(CreateGroupReq body) throws ApiException {
        ApiResponse<GroupSubscribtionRes> resp = createGroupWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create a new Group of mobile phone numbers.
     * Manage your contacts by adding them to group
     * @param body The group information to be created (required)
     * @return ApiResponse&lt;GroupSubscribtionRes&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GroupSubscribtionRes> createGroupWithHttpInfo(CreateGroupReq body) throws ApiException {
        com.squareup.okhttp.Call call = createGroupCall(body, null, null);
        Type localVarReturnType = new TypeToken<GroupSubscribtionRes>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a new Group of mobile phone numbers. (asynchronously)
     * Manage your contacts by adding them to group
     * @param body The group information to be created (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createGroupAsync(CreateGroupReq body, final ApiCallback<GroupSubscribtionRes> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createGroupCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GroupSubscribtionRes>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for subscribeIntoGroup */
    private com.squareup.okhttp.Call subscribeIntoGroupCall(SubscribeInGroupReq body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling subscribeIntoGroup(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/destinations/grouping".replaceAll("\\{format\\}","json");

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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Subscribe your contacts into an existing group.
     * Subscribe your contacts to specific group.
     * @param body Number subscribtion request (required)
     * @return GroupSubscribtionRes
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GroupSubscribtionRes subscribeIntoGroup(SubscribeInGroupReq body) throws ApiException {
        ApiResponse<GroupSubscribtionRes> resp = subscribeIntoGroupWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Subscribe your contacts into an existing group.
     * Subscribe your contacts to specific group.
     * @param body Number subscribtion request (required)
     * @return ApiResponse&lt;GroupSubscribtionRes&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GroupSubscribtionRes> subscribeIntoGroupWithHttpInfo(SubscribeInGroupReq body) throws ApiException {
        com.squareup.okhttp.Call call = subscribeIntoGroupCall(body, null, null);
        Type localVarReturnType = new TypeToken<GroupSubscribtionRes>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Subscribe your contacts into an existing group. (asynchronously)
     * Subscribe your contacts to specific group.
     * @param body Number subscribtion request (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call subscribeIntoGroupAsync(SubscribeInGroupReq body, final ApiCallback<GroupSubscribtionRes> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = subscribeIntoGroupCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GroupSubscribtionRes>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for unsubscribeFromGroup */
    private com.squareup.okhttp.Call unsubscribeFromGroupCall(UnsubscribeFromGroupReq body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling unsubscribeFromGroup(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/destinations/grouping".replaceAll("\\{format\\}","json");

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Unsubscribe your contacts from an existing group.
     * Unsubscribe your contacts from specific group.
     * @param body Mobile phone numbers unsubscribtion request. (required)
     * @return GroupSubscribtionRes
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GroupSubscribtionRes unsubscribeFromGroup(UnsubscribeFromGroupReq body) throws ApiException {
        ApiResponse<GroupSubscribtionRes> resp = unsubscribeFromGroupWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Unsubscribe your contacts from an existing group.
     * Unsubscribe your contacts from specific group.
     * @param body Mobile phone numbers unsubscribtion request. (required)
     * @return ApiResponse&lt;GroupSubscribtionRes&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GroupSubscribtionRes> unsubscribeFromGroupWithHttpInfo(UnsubscribeFromGroupReq body) throws ApiException {
        com.squareup.okhttp.Call call = unsubscribeFromGroupCall(body, null, null);
        Type localVarReturnType = new TypeToken<GroupSubscribtionRes>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Unsubscribe your contacts from an existing group. (asynchronously)
     * Unsubscribe your contacts from specific group.
     * @param body Mobile phone numbers unsubscribtion request. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call unsubscribeFromGroupAsync(UnsubscribeFromGroupReq body, final ApiCallback<GroupSubscribtionRes> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = unsubscribeFromGroupCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GroupSubscribtionRes>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
