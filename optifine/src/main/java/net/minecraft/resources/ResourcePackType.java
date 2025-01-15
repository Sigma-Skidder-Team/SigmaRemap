package net.minecraft.resources;

public enum ResourcePackType
{
    CLIENT_RESOURCES("assets"),
    SERVER_DATA("data");

    private final String directoryName;

    private ResourcePackType(String p_i2319_3_)
    {
        this.directoryName = p_i2319_3_;
    }

    public String getDirectoryName()
    {
        return this.directoryName;
    }
}
