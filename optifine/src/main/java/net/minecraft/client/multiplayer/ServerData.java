package net.minecraft.client.multiplayer;

import javax.annotation.Nullable;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.SharedConstants;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class ServerData
{
    public String serverName;
    public String serverIP;
    public String populationInfo;
    public String serverMOTD;
    public long pingToServer;
    public int version = SharedConstants.getVersion().getProtocolVersion();
    public String gameVersion = SharedConstants.getVersion().getName();
    public boolean pinged;
    public String playerList;
    private ServerData.ServerResourceMode resourceMode = ServerData.ServerResourceMode.PROMPT;
    private String serverIcon;
    private boolean lanServer;

    public ServerData(String p_i2406_1_, String p_i2406_2_, boolean p_i2406_3_)
    {
        this.serverName = p_i2406_1_;
        this.serverIP = p_i2406_2_;
        this.lanServer = p_i2406_3_;
    }

    public CompoundNBT getNBTCompound()
    {
        CompoundNBT compoundnbt = new CompoundNBT();
        compoundnbt.putString("name", this.serverName);
        compoundnbt.putString("ip", this.serverIP);

        if (this.serverIcon != null)
        {
            compoundnbt.putString("icon", this.serverIcon);
        }

        if (this.resourceMode == ServerData.ServerResourceMode.ENABLED)
        {
            compoundnbt.putBoolean("acceptTextures", true);
        }
        else if (this.resourceMode == ServerData.ServerResourceMode.DISABLED)
        {
            compoundnbt.putBoolean("acceptTextures", false);
        }

        return compoundnbt;
    }

    public ServerData.ServerResourceMode getResourceMode()
    {
        return this.resourceMode;
    }

    public void setResourceMode(ServerData.ServerResourceMode mode)
    {
        this.resourceMode = mode;
    }

    public static ServerData getServerDataFromNBTCompound(CompoundNBT nbtCompound)
    {
        ServerData serverdata = new ServerData(nbtCompound.getString("name"), nbtCompound.getString("ip"), false);

        if (nbtCompound.contains("icon", 8))
        {
            serverdata.setBase64EncodedIconData(nbtCompound.getString("icon"));
        }

        if (nbtCompound.contains("acceptTextures", 1))
        {
            if (nbtCompound.getBoolean("acceptTextures"))
            {
                serverdata.setResourceMode(ServerData.ServerResourceMode.ENABLED);
            }
            else
            {
                serverdata.setResourceMode(ServerData.ServerResourceMode.DISABLED);
            }
        }
        else
        {
            serverdata.setResourceMode(ServerData.ServerResourceMode.PROMPT);
        }

        return serverdata;
    }

    @Nullable
    public String getBase64EncodedIconData()
    {
        return this.serverIcon;
    }

    public void setBase64EncodedIconData(@Nullable String icon)
    {
        this.serverIcon = icon;
    }

    public boolean isOnLAN()
    {
        return this.lanServer;
    }

    public void copyFrom(ServerData serverDataIn)
    {
        this.serverIP = serverDataIn.serverIP;
        this.serverName = serverDataIn.serverName;
        this.setResourceMode(serverDataIn.getResourceMode());
        this.serverIcon = serverDataIn.serverIcon;
        this.lanServer = serverDataIn.lanServer;
    }

    public static enum ServerResourceMode
    {
        ENABLED("enabled"),
        DISABLED("disabled"),
        PROMPT("prompt");

        private final ITextComponent motd;

        private ServerResourceMode(String p_i320_3_)
        {
            this.motd = new TranslationTextComponent("addServer.resourcePack." + p_i320_3_);
        }

        public ITextComponent getMotd()
        {
            return this.motd;
        }
    }
}
