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

import cequens.client.model.CountryPricingRes;
import cequens.client.model.CountryPricingByMobileNoRes;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessagingPricingApi {
    private ApiClient apiClient;

    public MessagingPricingApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MessagingPricingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getCountryPricing */
    private com.squareup.okhttp.Call getCountryPricingCall(String mcc, String mnc, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'mcc' is set
        if (mcc == null) {
            throw new ApiException("Missing the required parameter 'mcc' when calling getCountryPricing(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/pricing/policies".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (mcc != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "mcc", mcc));
        if (mnc != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "mnc", mnc));

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
     * Get the pricing schema of the networks.
     * Get the pricing schema of the networks.
     * @param mcc Valid international mobile Country Code. (required)
     * @param mnc Valid international mobile Network Code. (optional)
     * @return CountryPricingRes
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CountryPricingRes getCountryPricing(String mcc, String mnc) throws ApiException {
        ApiResponse<CountryPricingRes> resp = getCountryPricingWithHttpInfo(mcc, mnc);
        return resp.getData();
    }

    /**
     * Get the pricing schema of the networks.
     * Get the pricing schema of the networks.
     * @param mcc Valid international mobile Country Code. (required)
     * @param mnc Valid international mobile Network Code. (optional)
     * @return ApiResponse&lt;CountryPricingRes&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CountryPricingRes> getCountryPricingWithHttpInfo(String mcc, String mnc) throws ApiException {
        com.squareup.okhttp.Call call = getCountryPricingCall(mcc, mnc, null, null);
        Type localVarReturnType = new TypeToken<CountryPricingRes>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the pricing schema of the networks. (asynchronously)
     * Get the pricing schema of the networks.
     * @param mcc Valid international mobile Country Code. (required)
     * @param mnc Valid international mobile Network Code. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCountryPricingAsync(String mcc, String mnc, final ApiCallback<CountryPricingRes> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCountryPricingCall(mcc, mnc, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CountryPricingRes>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getCountryPricingByMobileNo */
    private com.squareup.okhttp.Call getCountryPricingByMobileNoCall(String phoneNumber, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'phoneNumber' is set
        if (phoneNumber == null) {
            throw new ApiException("Missing the required parameter 'phoneNumber' when calling getCountryPricingByMobileNo(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/pricing/destinations/{phone_number}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "phone_number" + "\\}", apiClient.escapeString(phoneNumber.toString()));

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
     * Get the SMS price using mobile phone number.
     * Get the SMS price using mobile phone number.
     * @param phoneNumber Valid international mobile phone number. (required)
     * @return CountryPricingByMobileNoRes
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CountryPricingByMobileNoRes getCountryPricingByMobileNo(String phoneNumber) throws ApiException {
        ApiResponse<CountryPricingByMobileNoRes> resp = getCountryPricingByMobileNoWithHttpInfo(phoneNumber);
        return resp.getData();
    }

    /**
     * Get the SMS price using mobile phone number.
     * Get the SMS price using mobile phone number.
     * @param phoneNumber Valid international mobile phone number. (required)
     * @return ApiResponse&lt;CountryPricingByMobileNoRes&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CountryPricingByMobileNoRes> getCountryPricingByMobileNoWithHttpInfo(String phoneNumber) throws ApiException {
        com.squareup.okhttp.Call call = getCountryPricingByMobileNoCall(phoneNumber, null, null);
        Type localVarReturnType = new TypeToken<CountryPricingByMobileNoRes>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the SMS price using mobile phone number. (asynchronously)
     * Get the SMS price using mobile phone number.
     * @param phoneNumber Valid international mobile phone number. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCountryPricingByMobileNoAsync(String phoneNumber, final ApiCallback<CountryPricingByMobileNoRes> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCountryPricingByMobileNoCall(phoneNumber, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CountryPricingByMobileNoRes>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
