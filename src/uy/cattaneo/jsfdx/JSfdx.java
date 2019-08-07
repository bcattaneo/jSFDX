package uy.cattaneo.jsfdx;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import uy.cattaneo.jsfdx.JSfdxConstants.*;
import uy.cattaneo.jsfdx.params.ForceOrgListParams;
import uy.cattaneo.jsfdx.types.ForceOrgList;
import uy.cattaneo.jsfdx.utils.ShellUtils;
import uy.cattaneo.jsfdx.types.ForceResponse;

public class JSfdx {
    private final Gson gson;

    public JSfdx() {
        this.gson = new GsonBuilder().create();
    }
    
    public ForceOrgList forceOrgList(ForceOrgListParams params) throws IOException, InterruptedException {
        String output = ShellUtils.execute(
                String.format(JSfdxConstants.FORCE_ORG_LIST, params));
        
        return this.gson.fromJson(output, ForceOrgList.class);
    }
    
    public ForceResponse forceOrgList() throws IOException, InterruptedException {
        return this.forceOrgList(new ForceOrgListParams.Builder().build());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        JSfdx jsfdx = new JSfdx();
        // Example force:org:list usage, all parms used.
        ForceOrgList forceOrgListCmd = jsfdx.forceOrgList(new ForceOrgListParams.Builder()
                .all()
                .clean()
                .logLevel(LogLevel.trace)
                .noPrompt()
                .verbose()
                .build()
                );
        // Access any of the type attributes:
        // Get access token of your first org
        System.out.println(forceOrgListCmd.getResult().getNonScratchOrgs()[0].getAccessToken());
        //System.out.println(forceOrgListCmd.getStatus());
    }
    
}
