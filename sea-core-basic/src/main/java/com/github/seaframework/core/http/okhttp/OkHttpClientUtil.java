package com.github.seaframework.core.http.okhttp;

import com.alibaba.fastjson.JSON;
import com.github.seaframework.core.http.common.HttpHeaderConst;
import com.github.seaframework.core.http.okhttp.callback.EmptyCallback;
import lombok.extern.slf4j.Slf4j;
import okhttp3.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * OK Http client util
 *
 * @author spy
 * @version 1.0 2019-08-11
 * @since 1.0
 */
@Slf4j
public class OkHttpClientUtil {

    /**
     * 连接超时时间10秒
     */
    public static int CONNECTION_TIMEOUT = 10;

    /**
     * 请求连接超时时间20秒
     */
    public static int READ_TIMEOUT = 20;

    /**
     * 最大并发数
     */
    public static int MAX_REQUESTS = 500;

    public static int MAX_REQUESTS_PER_HOST = 50;


    private static OkHttpClient client;


    private static OkHttpClient init() {
        if (client == null) {
            synchronized (OkHttpClientUtil.class) {
                if (client == null) {
                    Dispatcher dispatcher = new Dispatcher();
                    dispatcher.setMaxRequests(MAX_REQUESTS);
                    dispatcher.setMaxRequestsPerHost(MAX_REQUESTS_PER_HOST);

                    client = new OkHttpClient.Builder()
                            .connectTimeout(CONNECTION_TIMEOUT, TimeUnit.SECONDS)
                            .readTimeout(READ_TIMEOUT, TimeUnit.SECONDS)
                            .dispatcher(dispatcher)
                            .build();
                }
            }
        }

        return client;
    }

    /**
     * get
     *
     * @param url
     * @return
     */
    public static String get(final String url) {
        init();
        log.info("okhttp get url={}", url);
        Request request = new Request.Builder()
                .url(url)
                .get()
                .header(HttpHeaderConst.USER_AGENT, HttpHeaderConst.DEFAULT_USER_AGENT)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        } catch (IOException e) {
            log.error("okhttp get io exception", e);
        }
        return null;
    }

    /**
     * get async
     *
     * @param url
     */
    public static void getAsync(final String url) {
        init();
        log.info("okhttp get url={}", url);
        Request request = new Request.Builder()
                .url(url)
                .get()
                .header(HttpHeaderConst.USER_AGENT, HttpHeaderConst.DEFAULT_USER_AGENT)
                .build();

        Call call = client.newCall(request);

        call.enqueue(new EmptyCallback());
    }

    /**
     * post
     *
     * @param url
     * @param params
     * @return
     */
    public static String post(final String url, Map<String, Object> params) {
        init();
        log.info("okhttp post url={}", url);
        if (params == null) {
            params = new HashMap<>(0);
        }

        FormBody.Builder formBodyBuilder = new FormBody.Builder();
        Iterator iterator = params.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> elem = (Map.Entry) iterator.next();
            formBodyBuilder.add(elem.getKey(), elem.getValue());
        }

        Request request = new Request.Builder()
                .url(url)
                .post(formBodyBuilder.build())
                .header(HttpHeaderConst.USER_AGENT, HttpHeaderConst.DEFAULT_USER_AGENT)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        } catch (IOException e) {
            log.error("okhttp get io exception", e);
        }
        return null;
    }

    /**
     * post JSON
     *
     * @param url
     * @param obj
     * @return
     */
    public static String postJSON(final String url, Object obj) {
        init();
        log.info("okhttp post url={}", url);

        MediaType mediaType = MediaType.parse("application/json; charset=utf-8");
        RequestBody requestBody = RequestBody.create(mediaType, JSON.toJSONString(obj));

        Request request = new Request.Builder()
                .url(url)
                .post(requestBody)
                .header(HttpHeaderConst.USER_AGENT, HttpHeaderConst.DEFAULT_USER_AGENT)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        } catch (IOException e) {
            log.error("okhttp get io exception", e);
        }
        return null;
    }


}