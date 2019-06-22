package sombrero;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {

    private Logger logger = LoggerFactory.getLogger(SampleRunner.class);

    @Autowired
    SombreroProperties sombreroProperties;

    @Autowired
    private String hello;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        /*logger.info("=======================");
        logger.info(hello);
        logger.info(sombreroProperties.getName());
        logger.info(sombreroProperties.getFullName());
        logger.info("=======================");*/
        logger.debug("=======================");
        logger.debug(hello);
        logger.debug(sombreroProperties.getName());
        logger.debug(sombreroProperties.getFullName());
        logger.debug("=======================");
    }
}
