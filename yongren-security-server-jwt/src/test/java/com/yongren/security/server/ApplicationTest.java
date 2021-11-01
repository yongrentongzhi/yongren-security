package com.yongren.security.server;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
public class ApplicationTest {
    @Autowired
    DataSource dataSource;
    private static final Logger logger = LogManager.getLogger();
    private static final Logger syncLogger = LogManager.getLogger("sync." + ApplicationTest.class);

    @Test
    public void testConnection() throws Exception {
        System.out.println(dataSource.getConnection());
    }


    @Test
    public void log4j2PolicyTest_usingSyncLogger() {
        for (int i = 1; i < 100; i++) {
            syncLogger.debug("debug信息-同步日志");
            syncLogger.info("info信息-同步日志");
            try {
                int a = i / 0;
            } catch (Exception e) {
                syncLogger.error("error信息-同步日志", e);
            }


            System.out.println("do some thing");

        }

    }

    @Test
    public void log4j2PolicyTest_usingAsyncLogger() {
        for (int i = 1; i < 100; i++) {
            logger.debug("debug信息-异步日志");
            logger.info("info信息-异步日志");
            logger.error("error信息-异步日志");
            System.out.println("do some thing");
        }
    }
}
