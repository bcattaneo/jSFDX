package uy.cattaneo.jsfdx.types;
import com.google.gson.annotations.SerializedName;

public class ForceOrgList extends ForceResponse {
    @SerializedName("result")
    private Result result;

    public Result getResult() {
        return result;
    }
    
    public class Result {
        @SerializedName("nonScratchOrgs")
        private NonScratchOrgs[] nonScratchOrgs;
        @SerializedName("scratchOrgs")
        private ScratchOrgs[] scratchOrgs;

        public NonScratchOrgs[] getNonScratchOrgs() {
            return nonScratchOrgs;
        }

        public ScratchOrgs[] getScratchOrgs() {
            return scratchOrgs;
        }
        
        public class NonScratchOrgs {
            @SerializedName("orgId")
            private String orgId;
            @SerializedName("accessToken")
            private String accessToken;
            @SerializedName("instanceUrl")
            private String instanceUrl;
            @SerializedName("loginUrl")
            private String loginUrl;
            @SerializedName("username")
            private String username;
            @SerializedName("clientId")
            private String clientId;
            @SerializedName("isDevHub")
            private boolean isDevHub;
            @SerializedName("connectedStatus")
            private String connectedStatus;
            @SerializedName("lastUsed")
            private String lastUsed;
            @SerializedName("alias")
            private String alias;

            public String getOrgId() {
                return orgId;
            }

            public String getAccessToken() {
                return accessToken;
            }

            public String getInstanceUrl() {
                return instanceUrl;
            }

            public String getLoginUrl() {
                return loginUrl;
            }

            public String getUsername() {
                return username;
            }

            public String getClientId() {
                return clientId;
            }

            public boolean isDevHub() {
                return isDevHub;
            }

            public String getConnectedStatus() {
                return connectedStatus;
            }

            public String getLastUsed() {
                return lastUsed;
            }

            public String getAlias() {
                return alias;
            }
        }

        public class ScratchOrgs {
            @SerializedName("orgId")
            private String orgId;
            @SerializedName("accessToken")
            private String accessToken;
            @SerializedName("instanceUrl")
            private String instanceUrl;
            @SerializedName("loginUrl")
            private String loginUrl;
            @SerializedName("username")
            private String username;
            @SerializedName("clientId")
            private String clientId;
            @SerializedName("isDevHub")
            private boolean isDevHub;
            @SerializedName("connectedStatus")
            private String connectedStatus;
            @SerializedName("lastUsed")
            private String lastUsed;
            @SerializedName("alias")
            private String alias;

            public String getOrgId() {
                return orgId;
            }

            public String getAccessToken() {
                return accessToken;
            }

            public String getInstanceUrl() {
                return instanceUrl;
            }

            public String getLoginUrl() {
                return loginUrl;
            }

            public String getUsername() {
                return username;
            }

            public String getClientId() {
                return clientId;
            }

            public boolean isDevHub() {
                return isDevHub;
            }

            public String getConnectedStatus() {
                return connectedStatus;
            }

            public String getLastUsed() {
                return lastUsed;
            }

            public String getAlias() {
                return alias;
            }
        }
    }
}