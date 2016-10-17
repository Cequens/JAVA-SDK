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

import cequens.client.model.AccbalanceRes;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessagingAccountsApi {
    private ApiClient apiClient;

    public MessagingAccountsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MessagingAccountsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getAccountBalance */
    private com.squareup.okhttp.Call getAccountBalanceCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/accounts/balance".replaceAll("\\{format\\}","json");

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
     * Know your current balance
     * Returns account balance. If account is master account and has subaccounts, the subaccounts balances details are returned as well.
     * @return AccbalanceRes
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AccbalanceRes getAccountBalance() throws ApiException {
        ApiResponse<AccbalanceRes> resp = getAccountBalanceWithHttpInfo();
        return resp.getData();
    }

    /**
     * Know your current balance
     * Returns account balance. If account is master account and has subaccounts, the subaccounts balances details are returned as well.
     * @return ApiResponse&lt;AccbalanceRes&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AccbalanceRes> getAccountBalanceWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getAccountBalanceCall(null, null);
        Type localVarReturnType = new TypeToken<AccbalanceRes>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Know your current balance (asynchronously)
     * Returns account balance. If account is master account and has subaccounts, the subaccounts balances details are returned as well.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAccountBalanceAsync(final ApiCallback<AccbalanceRes> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAccountBalanceCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AccbalanceRes>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
