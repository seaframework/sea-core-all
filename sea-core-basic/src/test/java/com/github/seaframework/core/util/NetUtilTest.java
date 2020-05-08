package com.github.seaframework.core.util;

import com.github.seaframework.core.BaseCoreTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * 模块
 *
 * @author spy
 * @version 1.0 2019-07-30
 * @since 1.0
 */
@Slf4j
public class NetUtilTest extends BaseCoreTest {

    @Test
    public void run17() throws Exception {

        println("localAddress", NetUtil.getLocalAddress());

        println("ip", NetUtil.getLocalIp());
        println("localhost", NetUtil.getLocalHost());
    }


}
