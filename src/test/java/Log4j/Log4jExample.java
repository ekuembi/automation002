package Log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Log4jExample {

    private static final Logger logger =(Logger) LogManager.getLogger(Log4jExample.class);

    public static void main(String[] args) {
        logger.debug("debug the code here");
        logger.info("Here is some Message about the code in console/terminal/compiler");
        logger.warn("here is a warning that this dependency will depreciate");
        logger.error("here is an occurrence of error which is handled by exception",
                new RuntimeException());
    }
}
