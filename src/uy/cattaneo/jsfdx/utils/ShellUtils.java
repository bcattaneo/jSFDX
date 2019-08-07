package uy.cattaneo.jsfdx.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShellUtils {
    
    private static final String HOME_FOLDER = "user.home";
    public enum OS {WINDOWS, LINUX};
    public static final String WINDOWS_CMD = "cmd /c %s";
    
    public static String execute(String command) throws IOException, InterruptedException {
        StringBuilder output = new StringBuilder();
        String homeFolder = getHomeFolder();
        OS runningOs = getRunningOs();
        Process process;
        BufferedReader inputReader, errorReader;
        
        if (runningOs == OS.LINUX) {
            process = Runtime.getRuntime().exec(command);   
        } else {
            process = Runtime.getRuntime().exec(
                String.format(WINDOWS_CMD, command), null, new File(homeFolder));
        }

        inputReader = new BufferedReader(
                new InputStreamReader(process.getInputStream()));
          
        // TODO: Handle errors.
        //errorReader = new BufferedReader(
        //        new InputStreamReader(process.getErrorStream()));

        String line;
        while ((line = inputReader.readLine()) != null) {
            output.append(line + "\n");
        }
        // TODO: Handle errors.
        //while ((line = errorReader.readLine()) != null) {
        //    output.append(line + "\n");
        //    // sfdx bug: https://github.com/forcedotcom/sfdx-core/issues/162
        //    if (line.equals("}")) {
        //        return output.toString();
        //    }
        //}

        return output.toString();
    }
    
    public static String getHomeFolder() {
        return System.getProperty(HOME_FOLDER);
    }
    
    // TODO: Get linux, macOs, other.
    public static OS getRunningOs() {
        return OS.WINDOWS;
    }
}