package com.github.seaframework.core.util;

import com.github.seaframework.core.BaseCoreTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * module name
 *
 * @author spy
 * @version 1.0 2020/4/21
 * @since 1.0
 */
@Slf4j
public class ListUtilTest extends BaseCoreTest {

    @Test
    public void run17() throws Exception {
        String[] array = new String[]{"1", "s"};

        log.info("{}", ListUtil.toList(array));

    }

}
