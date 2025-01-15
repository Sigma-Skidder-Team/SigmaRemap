package net.minecraft.client.network;

import net.minecraft.util.Util;

public class LanServerInfo
{
    private final String lanServerMotd;
    private final String lanServerIpPort;
    private long timeLastSeen;

    public LanServerInfo(String p_i1076_1_, String p_i1076_2_)
    {
        this.lanServerMotd = p_i1076_1_;
        this.lanServerIpPort = p_i1076_2_;
        this.timeLastSeen = Util.milliTime();
    }

    public String getServerMotd()
    {
        return this.lanServerMotd;
    }

    public String getServerIpPort()
    {
        return this.lanServerIpPort;
    }

    public void updateLastSeen()
    {
        this.timeLastSeen = Util.milliTime();
    }
}
