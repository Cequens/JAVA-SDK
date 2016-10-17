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

import cequens.client.model.PasscodeStatusRes;
import cequens.client.model.VerifyPasscodeRes;
import cequens.client.model.VerifyPasscodeReq;
import cequens.client.model.VerifyNumberRes;
import cequens.client.model.VerifyNumberReq;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessagingDestinationsVerificationApi {
    private ApiClient apiClient;

    public MessagingDestinationsVerificationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MessagingDestinationsVerificationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getPasscodeStatus */
    private com.squareup.okhttp.Call getPasscodeStatusCall(String checkCode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'checkCode' is set
        if (checkCode == null) {
            throw new ApiException("Missing the required parameter 'checkCode' when calling getPasscodeStatus(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/destinations/verification".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (checkCode != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "checkCode", checkCode));

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
     * Track the verification request and its passcode status.
     * Get verification pass code status.
     * @param checkCode Checkcode that references to passcode (required)
     * @return PasscodeStatusRes
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PasscodeStatusRes getPasscodeStatus(String checkCode) throws ApiException {
        ApiResponse<PasscodeStatusRes> resp = getPasscodeStatusWithHttpInfo(checkCode);
        return resp.getData();
    }

    /**
     * Track the verification request and its passcode status.
     * Get verification pass code status.
     * @param checkCode Checkcode that references to passcode (required)
     * @return ApiResponse&lt;PasscodeStatusRes&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PasscodeStatusRes> getPasscodeStatusWithHttpInfo(String checkCode) throws ApiException {
        com.squareup.okhttp.Call call = getPasscodeStatusCall(checkCode, null, null);
        Type localVarReturnType = new TypeToken<PasscodeStatusRes>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Track the verification request and its passcode status. (asynchronously)
     * Get verification pass code status.
     * @param checkCode Checkcode that references to passcode (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPasscodeStatusAsync(String checkCode, final ApiCallback<PasscodeStatusRes> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getPasscodeStatusCall(checkCode, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PasscodeStatusRes>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for validatePasscode */
    private com.squareup.okhttp.Call validatePasscodeCall(VerifyPasscodeReq body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling validatePasscode(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/destinations/verification".replaceAll("\\{format\\}","json");

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
     * Check and validate the recieved pass code.
     * Verify passcode
     * @param body All info to verify passcode. (required)
     * @return VerifyPasscodeRes
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VerifyPasscodeRes validatePasscode(VerifyPasscodeReq body) throws ApiException {
        ApiResponse<VerifyPasscodeRes> resp = validatePasscodeWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Check and validate the recieved pass code.
     * Verify passcode
     * @param body All info to verify passcode. (required)
     * @return ApiResponse&lt;VerifyPasscodeRes&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VerifyPasscodeRes> validatePasscodeWithHttpInfo(VerifyPasscodeReq body) throws ApiException {
        com.squareup.okhttp.Call call = validatePasscodeCall(body, null, null);
        Type localVarReturnType = new TypeToken<VerifyPasscodeRes>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Check and validate the recieved pass code. (asynchronously)
     * Verify passcode
     * @param body All info to verify passcode. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call validatePasscodeAsync(VerifyPasscodeReq body, final ApiCallback<VerifyPasscodeRes> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = validatePasscodeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VerifyPasscodeRes>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for verifyNumber */
    private com.squareup.okhttp.Call verifyNumberCall(VerifyNumberReq body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling verifyNumber(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/destinations/verification".replaceAll("\\{format\\}","json");

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
     * Send a verification pass code to your number by SMS.
     * Send a verification pass code to your number by SMS to verify your identity.
     * @param body All info to verify number. (required)
     * @return VerifyNumberRes
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VerifyNumberRes verifyNumber(VerifyNumberReq body) throws ApiException {
        ApiResponse<VerifyNumberRes> resp = verifyNumberWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Send a verification pass code to your number by SMS.
     * Send a verification pass code to your number by SMS to verify your identity.
     * @param body All info to verify number. (required)
     * @return ApiResponse&lt;VerifyNumberRes&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VerifyNumberRes> verifyNumberWithHttpInfo(VerifyNumberReq body) throws ApiException {
        com.squareup.okhttp.Call call = verifyNumberCall(body, null, null);
        Type localVarReturnType = new TypeToken<VerifyNumberRes>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Send a verification pass code to your number by SMS. (asynchronously)
     * Send a verification pass code to your number by SMS to verify your identity.
     * @param body All info to verify number. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call verifyNumberAsync(VerifyNumberReq body, final ApiCallback<VerifyNumberRes> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = verifyNumberCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VerifyNumberRes>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
