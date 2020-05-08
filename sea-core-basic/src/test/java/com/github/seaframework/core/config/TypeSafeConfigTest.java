package com.github.seaframework.core.config;

import com.github.seaframework.core.BaseCoreTest;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import com.typesafe.config.ConfigValueFactory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * 模块
 *
 * @author spy
 * @version 1.0 2019-07-25
 * @since 1.0
 */
@Slf4j
public class TypeSafeConfigTest extends BaseCoreTest {

    @Before
    public void before() {
        System.setProperty("sea.config.env", "local");
    }


    @Test
    public void run17() throws Exception {
        Config config = ConfigFactory.load();

        config.hasPath("abc");


        // IMPORTANT config is IMMUTABLE
        config = config.withValue("abc", ConfigValueFactory.fromAnyRef("123"));

        String value = config.getString("abc");

        Assert.assertEquals(value, "123");
    }

    @Test
    public void run44() throws Exception {

    }
}
