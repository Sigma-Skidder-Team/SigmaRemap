package net.minecraft.world;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.world.storage.WorldInfo;

public final class WorldSettings
{
    private final long seed;
    private final GameType gameType;
    private final boolean mapFeaturesEnabled;
    private final boolean hardcoreEnabled;
    private final WorldType terrainType;
    private boolean commandsAllowed;
    private boolean bonusChestEnabled;
    private JsonElement generatorOptions = new JsonObject();

    public WorldSettings(long p_i2670_1_, GameType p_i2670_3_, boolean p_i2670_4_, boolean p_i2670_5_, WorldType p_i2670_6_)
    {
        this.seed = p_i2670_1_;
        this.gameType = p_i2670_3_;
        this.mapFeaturesEnabled = p_i2670_4_;
        this.hardcoreEnabled = p_i2670_5_;
        this.terrainType = p_i2670_6_;
    }

    public WorldSettings(WorldInfo p_i2671_1_)
    {
        this(p_i2671_1_.getSeed(), p_i2671_1_.getGameType(), p_i2671_1_.isMapFeaturesEnabled(), p_i2671_1_.isHardcore(), p_i2671_1_.getGenerator());
    }

    public WorldSettings enableBonusChest()
    {
        this.bonusChestEnabled = true;
        return this;
    }

    public WorldSettings enableCommands()
    {
        this.commandsAllowed = true;
        return this;
    }

    public WorldSettings setGeneratorOptions(JsonElement p_205390_1_)
    {
        this.generatorOptions = p_205390_1_;
        return this;
    }

    public boolean isBonusChestEnabled()
    {
        return this.bonusChestEnabled;
    }

    public long getSeed()
    {
        return this.seed;
    }

    public GameType getGameType()
    {
        return this.gameType;
    }

    public boolean getHardcoreEnabled()
    {
        return this.hardcoreEnabled;
    }

    public boolean isMapFeaturesEnabled()
    {
        return this.mapFeaturesEnabled;
    }

    public WorldType getTerrainType()
    {
        return this.terrainType;
    }

    public boolean areCommandsAllowed()
    {
        return this.commandsAllowed;
    }

    public JsonElement getGeneratorOptions()
    {
        return this.generatorOptions;
    }
}
