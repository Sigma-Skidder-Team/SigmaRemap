package net.minecraft.network.rcon;

import net.minecraft.server.dedicated.ServerProperties;

public interface IServer
{
    ServerProperties getServerProperties();

    String getHostname();

    int getPort();

    String getMotd();

    String getMinecraftVersion();

    int getCurrentPlayerCount();

    int getMaxPlayers();

    String[] getOnlinePlayerNames();

    String getFolderName();

    String getPlugins();

    String handleRConCommand(String command);

    boolean isDebuggingEnabled();

    void logInfo(String msg);

    void logWarning(String msg);

    void logSevere(String msg);

    void logDebug(String msg);
}
