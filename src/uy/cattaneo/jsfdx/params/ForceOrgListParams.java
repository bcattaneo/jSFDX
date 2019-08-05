package uy.cattaneo.jsfdx.params;
import static uy.cattaneo.jsfdx.JSfdxConstants.*;

public class ForceOrgListParams {
    /** Do not prompt for confirmation */
    private boolean noPrompt;
    private boolean all;
    private boolean clean;
    private boolean json; // not visible
    private LogLevel logLevel;
    private boolean verbose;

    /**
     * Do not prompt for confirmation
     * @return true if flag is set
     */
    public boolean isNoPrompt() {
        return noPrompt;
    }

    public boolean isAll() {
        return all;
    }

    public boolean isClean() {
        return clean;
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public boolean isVerbose() {
        return verbose;
    }

    public void setNoPrompt(boolean noPrompt) {
        this.noPrompt = noPrompt;
    }

    public void setAll(boolean all) {
        this.all = all;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public void setVerbose(boolean verbose) {
        this.verbose = verbose;
    }
    
    public static class Builder {
        private boolean noPrompt;
        private boolean all;
        private boolean clean;
        private boolean json; // not visible
        private LogLevel logLevel;
        private boolean verbose;
        
        public Builder() {
            this.json = true;
        }
        public Builder noPrompt(){
            this.noPrompt = true;
            return this;
        }
        public Builder all(){
            this.all = true;
            return this;
        }
        public Builder clean(){
            this.clean = true;
            return this;
        }
        public Builder logLevel(LogLevel logLevel){
            this.logLevel = logLevel;
            return this;
        }
        public Builder verbose(){
            this.verbose = true;
            return this;
        }
        public ForceOrgListParams build(){
            ForceOrgListParams params = new ForceOrgListParams();
            params.noPrompt = this.noPrompt;
            params.all = this.all;
            params.clean = this.clean;
            params.json = this.json;
            params.logLevel = this.logLevel;
            params.verbose = this.verbose;
            return params;
        }
    }
    private ForceOrgListParams() {}
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        StringBuilder params = new StringBuilder();
        
        if (this.noPrompt)
            params.append(NO_PROMPT)
                    .append(PARAMS_SEPARATOR);
        if (this.all)
            params.append(ALL)
                    .append(PARAMS_SEPARATOR);
        if (this.clean)
            params.append(CLEAN)
                    .append(PARAMS_SEPARATOR);
        if (this.json)
            params.append(JSON)
                    .append(PARAMS_SEPARATOR);
        if (this.logLevel != null)
            params.append(LOG_LEVEL)
                    .append(PARAMS_ASSIGN)
                    .append(this.logLevel)
                    .append(PARAMS_SEPARATOR);
        if (this.verbose)
            params.append(VERBOSE)
                    .append(PARAMS_SEPARATOR);
        
        return params.toString();
    }
}