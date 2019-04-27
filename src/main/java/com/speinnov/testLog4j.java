package com.speinnov;
//import org.apache.log4j.Logger;
//import org.apache.log4j.LogManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class testLog4j {

    //private static Logger logger = Logger.getLogger(testLog4j.class);   com.speinnov.testLog4j
    //private org.apache.logging.log4j.core.config.Configurator="";
    //-Dlog4j2.configurationFile=file:/home/atul/log4j2.properties

    //LoggerContext.getContext().setConfigLocation(java.net.URI);
    private static final Logger logger = LogManager.getLogger(testLog4j.class.getName());

    public static void main(String[] args) {

    /*ConfigurationSource source = new ConfigurationSource(new FileInputStream(log4j file Path));
    XmlConfiguration xmlConfig = new XmlConfiguration(source);
    Logger logger = (Logger) LogManager.getLogger();
    logger.getContext().start(xmlConfig);

    File f = new File(this.logConfigFile);
    URI fc = f.toURI();
    */

    //   BasicConfigurator.configure();
    	//DefaultConfiguration.
    	
    	
    	
        logger.debug("msg de debogage");
        logger.info("msg d'information");
        logger.warn("msg d'avertissement");
        logger.error("msg d'erreur");
        logger.fatal("msg d'erreur fatale");
        logger.error("Error Message Logged !!!", new NullPointerException("NullError"));
        logger.error("");

    /*System.out.println("Loading logging config file: " + fc);
    Logger l = (Logger) LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
    l.getContext().setConfigLocation(fc);
    */
        
        /**
         * 
         * Log4j will inspect the "log4j.configurationFile" system property and, if set, will attempt to load the configuration using the ConfigurationFactory that matches the file extension.
If no system property is set the properties ConfigurationFactory will look for log4j2-test.properties in the classpath.
If no such file is found the YAML ConfigurationFactory will look for log4j2-test.yaml or log4j2-test.yml in the classpath.
If no such file is found the JSON ConfigurationFactory will look for log4j2-test.json or log4j2-test.jsn in the classpath.
If no such file is found the XML ConfigurationFactory will look for log4j2-test.xml in the classpath.
If a test file cannot be located the properties ConfigurationFactory will look for log4j2.properties on the classpath.
If a properties file cannot be located the YAML ConfigurationFactory will look for log4j2.yaml or log4j2.yml on the classpath.
If a YAML file cannot be located the JSON ConfigurationFactory will look for log4j2.json or log4j2.jsn on the classpath.
If a JSON file cannot be located the XML ConfigurationFactory will try to locate log4j2.xml on the classpath.
If no configuration file could be located the DefaultConfiguration will be used. This will cause logging output to go to the console.
         **/
    }
}
