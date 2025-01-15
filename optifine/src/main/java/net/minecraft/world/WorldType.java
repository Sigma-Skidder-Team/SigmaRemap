package net.minecraft.world;

import javax.annotation.Nullable;

public class WorldType
{
    public static final WorldType[] WORLD_TYPES = new WorldType[16];
    public static final WorldType DEFAULT = (new WorldType(0, "default", 1)).setVersioned();
    public static final WorldType FLAT = (new WorldType(1, "flat")).setCustomOptions(true);
    public static final WorldType LARGE_BIOMES = new WorldType(2, "largeBiomes");
    public static final WorldType AMPLIFIED = (new WorldType(3, "amplified")).enableInfoNotice();
    public static final WorldType CUSTOMIZED = (new WorldType(4, "customized", "normal", 0)).setCustomOptions(true).setCanBeCreated(false);
    public static final WorldType BUFFET = (new WorldType(5, "buffet")).setCustomOptions(true);
    public static final WorldType DEBUG_ALL_BLOCK_STATES = new WorldType(6, "debug_all_block_states");
    public static final WorldType DEFAULT_1_1 = (new WorldType(8, "default_1_1", 0)).setCanBeCreated(false);
    private final int id;
    private final String name;
    private final String field_211890_l;
    private final int version;
    private boolean canBeCreated;
    private boolean versioned;
    private boolean hasInfoNotice;
    private boolean field_205395_p;

    private WorldType(int p_i2622_1_, String p_i2622_2_)
    {
        this(p_i2622_1_, p_i2622_2_, p_i2622_2_, 0);
    }

    private WorldType(int p_i2623_1_, String p_i2623_2_, int p_i2623_3_)
    {
        this(p_i2623_1_, p_i2623_2_, p_i2623_2_, p_i2623_3_);
    }

    private WorldType(int p_i2624_1_, String p_i2624_2_, String p_i2624_3_, int p_i2624_4_)
    {
        this.name = p_i2624_2_;
        this.field_211890_l = p_i2624_3_;
        this.version = p_i2624_4_;
        this.canBeCreated = true;
        this.id = p_i2624_1_;
        WORLD_TYPES[p_i2624_1_] = this;
    }

    public String getName()
    {
        return this.name;
    }

    public String getSerialization()
    {
        return this.field_211890_l;
    }

    public String getTranslationKey()
    {
        return "generator." + this.name;
    }

    public String getInfoTranslationKey()
    {
        return this.getTranslationKey() + ".info";
    }

    public int getVersion()
    {
        return this.version;
    }

    public WorldType getWorldTypeForGeneratorVersion(int version)
    {
        return this == DEFAULT && version == 0 ? DEFAULT_1_1 : this;
    }

    public boolean hasCustomOptions()
    {
        return this.field_205395_p;
    }

    public WorldType setCustomOptions(boolean p_205392_1_)
    {
        this.field_205395_p = p_205392_1_;
        return this;
    }

    private WorldType setCanBeCreated(boolean enable)
    {
        this.canBeCreated = enable;
        return this;
    }

    public boolean canBeCreated()
    {
        return this.canBeCreated;
    }

    private WorldType setVersioned()
    {
        this.versioned = true;
        return this;
    }

    public boolean isVersioned()
    {
        return this.versioned;
    }

    @Nullable
    public static WorldType byName(String type)
    {
        for (WorldType worldtype : WORLD_TYPES)
        {
            if (worldtype != null && worldtype.name.equalsIgnoreCase(type))
            {
                return worldtype;
            }
        }

        return null;
    }

    public int getId()
    {
        return this.id;
    }

    public boolean hasInfoNotice()
    {
        return this.hasInfoNotice;
    }

    private WorldType enableInfoNotice()
    {
        this.hasInfoNotice = true;
        return this;
    }
}
