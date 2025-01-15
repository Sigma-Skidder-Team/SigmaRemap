package net.minecraft.client.resources;

public class Language implements com.mojang.bridge.game.Language, Comparable<Language>
{
    private final String languageCode;
    private final String region;
    private final String name;
    private final boolean bidirectional;

    public Language(String mcServer, String p_i1501_2_, String p_i1501_3_, boolean p_i1501_4_)
    {
        this.languageCode = mcServer;
        this.region = p_i1501_2_;
        this.name = p_i1501_3_;
        this.bidirectional = p_i1501_4_;
    }

    public String getCode()
    {
        return this.languageCode;
    }

    public String getName()
    {
        return this.name;
    }

    public String getRegion()
    {
        return this.region;
    }

    public boolean isBidirectional()
    {
        return this.bidirectional;
    }

    public String toString()
    {
        return String.format("%s (%s)", this.name, this.region);
    }

    public boolean equals(Object p_equals_1_)
    {
        if (this == p_equals_1_)
        {
            return true;
        }
        else
        {
            return !(p_equals_1_ instanceof Language) ? false : this.languageCode.equals(((Language)p_equals_1_).languageCode);
        }
    }

    public int hashCode()
    {
        return this.languageCode.hashCode();
    }

    public int compareTo(Language p_compareTo_1_)
    {
        return this.languageCode.compareTo(p_compareTo_1_.languageCode);
    }
}
