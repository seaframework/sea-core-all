package com.github.seaframework.core.util;

import com.github.seaframework.core.BaseCoreTest;
import com.github.seaframework.core.config.Configuration;
import com.github.seaframework.core.config.ConfigurationFactory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * 模块
 *
 * @author spy
 * @version 1.0 2019-08-06
 * @since 1.0
 */
@Slf4j
public class JvmUtilTest extends BaseCoreTest {

    @Test
    public void getPidTest() throws Exception {
        log.info(JvmUtil.getPID());
    }

    @Test
    public void run30() throws Exception {
        JvmUtil.dumpStack();
    }

    @Test
    public void dumpStackTest() throws Exception {
        Configuration cfg = ConfigurationFactory.getInstance();

        cfg.getString("user.home");

        JvmUtil.dumpStack(getUserHome() + "/logs/jsdump.log");

        TimeUnit.MINUTES.sleep(2);
    }


    @Test
    public void run47() throws Exception {
        JvmUtil.dumpHeap();
        TimeUnit.MINUTES.sleep(1);
    }


}
