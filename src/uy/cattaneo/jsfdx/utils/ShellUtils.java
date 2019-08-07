package uy.cattaneo.jsfdx.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShellUtils {
    
    private static final String HOME_FOLDER = "user.home";
    public enum OS {WINDOWS, LINUX};
    public static final String WINDOWS_CMD = "cmd.exe /c %s";
    
    public static String execute(String command) throws IOException, InterruptedException {
        StringBuilder output = new StringBuilder();
        String cmd = command;
        OS runningOs = getRunningOs();
        Process process;
        BufferedReader inputReader;
        
        // For windows, we need to chain commands with cmd.exe
        if (runningOs == OS.WINDOWS)
            cmd = String.format(WINDOWS_CMD, command);
        
        // Run process redirecting stderr
        process = new ProcessBuilder().redirectErrorStream(true)
                .command(commandsToArray(cmd))
                .start();

        // Get stdout stream
        inputReader = new BufferedReader(
                new InputStreamReader(process.getInputStream()));

        // Read stdout
        String line;
        while ((line = inputReader.readLine()) != null) {
            output.append(line + "\n");
            // Due to sfdx bug: https://github.com/forcedotcom/sfdx-core/issues/162
            if (line.equals("}")) {
                return output.toString();
            }
        }

        return output.toString();
    }
    
    public static String getHomeFolder() {
        return System.getProperty(HOME_FOLDER);
    }
    
    // TODO: Get linux, macOs, other.
    public static OS getRunningOs() {
        return OS.WINDOWS;
    }
    
    public static String[] commandsToArray(String commands) {
        return commands.split(" ");
    }
}