import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *  Parent class for all automation test classes
 * <br>
 * @author
 */
public class LoggerClass {
  //  protected LoggerClass ts = new LoggerClass();
	
    //Log4j provides logger to create log files
	protected static Logger logger = Logger.getLogger("Test");
    
    public static void main(String[] args) {
    	//setting level in the code will overwrite the level set in the log4j properties file
    	logger.setLevel(Level.INFO);
    	logger.info("This is a logger info message");
//    	logger.debug("This is debug message");
//    	logger.warn("This a warning message");
//    	logger.error("This is an error message");
//    	logger.fatal("This is a fatal message");
    }
}


