package singletone;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("Hello world");
        ProgramLogger.getProgramLogger().addLogInfo("string1");
        ProgramLogger.getProgramLogger().addLogInfo("string2");
        ProgramLogger.getProgramLogger().addLogInfo("string3");

        ProgramLogger.getProgramLogger().showLogFile();
    }
}
