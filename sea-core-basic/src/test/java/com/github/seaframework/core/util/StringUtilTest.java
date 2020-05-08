package com.github.seaframework.core.util;

import com.github.seaframework.core.BaseCoreTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;

/**
 * 模块
 *
 * @author spy
 * @version 1.0 2019-08-03
 * @since 1.0
 */
@Slf4j
public class StringUtilTest extends BaseCoreTest {
    @Test
    public void run16() throws Exception {

        Assert.assertEquals(StringUtil.toCamelCase("hello_world"), "helloWorld");


        Assert.assertEquals("1:s", StringUtil.uniqueKey(1, "s"));
        Assert.assertEquals("1-s", StringUtil.uniqueKey("-", 1, "s"));
    }

    @Test
    public void joinTest() throws Exception {
        Assert.assertEquals("1:s", StringUtil.join(":", "1", "s"));
        Assert.assertEquals("1:s", StringUtil.join(":", "1", "", "s"));
        Assert.assertEquals("1:s", StringUtil.join(":", "1", null, "s", null));

    }

    @Test
    public void splitTest() throws Exception {

        log.info("{}", StringUtil.splitToIterable("abc;;bac;hi", ';'));
        log.info("{}", StringUtil.splitToList("abc;;bac;hi", ';'));
        log.info("{}", StringUtil.splitToList(null, ';'));
    }

    @Test
    public void run36() throws Exception {
        Assert.assertEquals("", StringUtil.defaultIfBlank(null, ""));
    }

    @Test
    public void run41() throws Exception {
        Assert.assertEquals("a0a", StringUtil.replaceStart("00a0a", "0"));
    }


}
