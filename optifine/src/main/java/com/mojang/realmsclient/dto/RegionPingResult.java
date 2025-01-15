package com.mojang.realmsclient.dto;

import java.util.Locale;

public class RegionPingResult extends ValueObject
{
    private final String regionName;
    private final int ping;

    public RegionPingResult(String p_i696_1_, int p_i696_2_)
    {
        this.regionName = p_i696_1_;
        this.ping = p_i696_2_;
    }

    public int ping()
    {
        return this.ping;
    }

    public String toString()
    {
        return String.format(Locale.ROOT, "%s --> %.2f ms", this.regionName, (float)this.ping);
    }
}
