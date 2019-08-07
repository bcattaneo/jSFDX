package uy.cattaneo.jsfdx.types;
import com.google.gson.annotations.SerializedName;

public class ForceResponse {
    @SerializedName("status")
    private int status;
    @SerializedName("name")
    private String name;
    @SerializedName("message")
    private String message;
    @SerializedName("exitCode")
    private int exitCode;
    @SerializedName("commandName")
    private String commandName;
    @SerializedName("stack")
    private String stack;
    @SerializedName("warnings")
    private String[] warnings; // TODO: What error type is this?. Add getter

    public int getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public int getExitCode() {
        return exitCode;
    }

    public String getCommandName() {
        return commandName;
    }

    public String getStack() {
        return stack;
    }
}
