package com.github.seaframework.core.http;

import com.github.seaframework.core.BaseCoreTest;
import com.github.seaframework.core.http.okhttp.OkHttpClientUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * module name
 *
 * @author spy
 * @version 1.0 2019-08-11
 * @since 1.0
 */
@Slf4j
public class OkHttpClientUtilTest extends BaseCoreTest {

    @Test
    public void run17() throws Exception {
        String result = OkHttpClientUtil.get(IP_URL);
        log.info("result={}", result);
    }

    @Test
    public void run25() throws Exception {
        OkHttpClientUtil.getAsync(IP_URL);

        TimeUnit.SECONDS.sleep(20);
    }
}
