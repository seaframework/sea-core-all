package com.github.seaframework.core.util;

import com.github.seaframework.core.BaseCoreTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * module name
 *
 * @author spy
 * @version 1.0 2020/3/19
 * @since 1.0
 */
@Slf4j
public class HtmlUtilTest extends BaseCoreTest {

    @Test
    public void run17() throws Exception {

        log.info("{}", HtmlUtil.cleanHtmlTag("<a>a</a>"));
        log.info("{}", HtmlUtil.escape("<a>a</a>"));
        log.info("{}", HtmlUtil.unescape("&lt;a&gt;a&lt;/a&gt;"));
    }
}
