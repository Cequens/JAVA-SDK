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

import cequens.client.model.NumberDiscoveryRes;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessagingDestinationsDiscoveryApi {
    private ApiClient apiClient;

    public MessagingDestinationsDiscoveryApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MessagingDestinationsDiscoveryApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for discoverGroups */
    private com.squareup.okhttp.Call discoverGroupsCall(String groups, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'groups' is set
        if (groups == null) {
            throw new ApiException("Missing the required parameter 'groups' when calling discoverGroups(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/destinations/discovery/groups".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (groups != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "groups", groups));

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
     * Discover more details [HLR] about mobile phone numbers in predefined group.
     * Know more [HLR] about mobile phone numbers in predefined group.
     * @param groups The group/s names of recipients seperated by comma to be discovered. (required)
     * @return NumberDiscoveryRes
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public NumberDiscoveryRes discoverGroups(String groups) throws ApiException {
        ApiResponse<NumberDiscoveryRes> resp = discoverGroupsWithHttpInfo(groups);
        return resp.getData();
    }

    /**
     * Discover more details [HLR] about mobile phone numbers in predefined group.
     * Know more [HLR] about mobile phone numbers in predefined group.
     * @param groups The group/s names of recipients seperated by comma to be discovered. (required)
     * @return ApiResponse&lt;NumberDiscoveryRes&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<NumberDiscoveryRes> discoverGroupsWithHttpInfo(String groups) throws ApiException {
        com.squareup.okhttp.Call call = discoverGroupsCall(groups, null, null);
        Type localVarReturnType = new TypeToken<NumberDiscoveryRes>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Discover more details [HLR] about mobile phone numbers in predefined group. (asynchronously)
     * Know more [HLR] about mobile phone numbers in predefined group.
     * @param groups The group/s names of recipients seperated by comma to be discovered. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call discoverGroupsAsync(String groups, final ApiCallback<NumberDiscoveryRes> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = discoverGroupsCall(groups, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<NumberDiscoveryRes>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for discoverNumber */
    private com.squareup.okhttp.Call discoverNumberCall(String numbers, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'numbers' is set
        if (numbers == null) {
            throw new ApiException("Missing the required parameter 'numbers' when calling discoverNumber(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/destinations/discovery".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (numbers != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "numbers", numbers));

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
     * Discover more details [HLR] about any number.
     * Know more [HLR] about any number.
     * @param numbers Valid international mobile phone numbers to be discovered seperated by comma. (required)
     * @return NumberDiscoveryRes
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public NumberDiscoveryRes discoverNumber(String numbers) throws ApiException {
        ApiResponse<NumberDiscoveryRes> resp = discoverNumberWithHttpInfo(numbers);
        return resp.getData();
    }

    /**
     * Discover more details [HLR] about any number.
     * Know more [HLR] about any number.
     * @param numbers Valid international mobile phone numbers to be discovered seperated by comma. (required)
     * @return ApiResponse&lt;NumberDiscoveryRes&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<NumberDiscoveryRes> discoverNumberWithHttpInfo(String numbers) throws ApiException {
        com.squareup.okhttp.Call call = discoverNumberCall(numbers, null, null);
        Type localVarReturnType = new TypeToken<NumberDiscoveryRes>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Discover more details [HLR] about any number. (asynchronously)
     * Know more [HLR] about any number.
     * @param numbers Valid international mobile phone numbers to be discovered seperated by comma. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call discoverNumberAsync(String numbers, final ApiCallback<NumberDiscoveryRes> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = discoverNumberCall(numbers, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<NumberDiscoveryRes>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
