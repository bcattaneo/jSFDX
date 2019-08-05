package uy.cattaneo.jsfdx;

public class JSfdxConstants {
    // CLI params
    public static final String JSON = "--json";
    public static final String LOG_LEVEL = "--loglevel";
    public static final String NO_PROMPT = "--noprompt";
    public static final String ALL = "--all";
    public static final String CLEAN = "--clean";
    public static final String VERBOSE = "--verbose";
    
    // General const
    public static final String PARAMS_SEPARATOR = " ";
    public static final String PARAMS_ASSIGN = "=";
    
    // SFDX commands
    public static final String FORCE_ORG_LIST = "sfdx force:org:list %s";
    
    public static enum LogLevel {
        trace("trace"),
        debug("debug"),
        infowarn("infowarn"),
        error("error"),
        fatal("fatal"),
        TRACE("TRACE"),
        DEBUG("DEBUG"),
        INFO("INFO"),
        WARN("WARN"),
        ERROR("ERROR"),
        FATAL("FATAL");
        
        private final String value;  
        
        private LogLevel(String s) {
            value = s;
        }
        @Override
        public String toString() {
            return this.value;
        }
    }
    
    /**
     * Private constructor
     */
    private JSfdxConstants() {}
}
