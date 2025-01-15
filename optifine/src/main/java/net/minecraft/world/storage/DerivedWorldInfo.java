package net.minecraft.world.storage;

import javax.annotation.Nullable;
import net.minecraft.command.TimerCallbackManager;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;
import net.minecraft.world.GameRules;
import net.minecraft.world.GameType;
import net.minecraft.world.WorldType;
import net.minecraft.world.dimension.DimensionType;

public class DerivedWorldInfo extends WorldInfo
{
    private final WorldInfo delegate;

    public DerivedWorldInfo(WorldInfo p_i3510_1_)
    {
        this.delegate = p_i3510_1_;
    }

    public CompoundNBT cloneNBTCompound(@Nullable CompoundNBT nbt)
    {
        return this.delegate.cloneNBTCompound(nbt);
    }

    public long getSeed()
    {
        return this.delegate.getSeed();
    }

    public int getSpawnX()
    {
        return this.delegate.getSpawnX();
    }

    public int getSpawnY()
    {
        return this.delegate.getSpawnY();
    }

    public int getSpawnZ()
    {
        return this.delegate.getSpawnZ();
    }

    public long getGameTime()
    {
        return this.delegate.getGameTime();
    }

    public long getDayTime()
    {
        return this.delegate.getDayTime();
    }

    public CompoundNBT getPlayerNBTTagCompound()
    {
        return this.delegate.getPlayerNBTTagCompound();
    }

    public String getWorldName()
    {
        return this.delegate.getWorldName();
    }

    public int getSaveVersion()
    {
        return this.delegate.getSaveVersion();
    }

    public long getLastTimePlayed()
    {
        return this.delegate.getLastTimePlayed();
    }

    public boolean isThundering()
    {
        return this.delegate.isThundering();
    }

    public int getThunderTime()
    {
        return this.delegate.getThunderTime();
    }

    public boolean isRaining()
    {
        return this.delegate.isRaining();
    }

    public int getRainTime()
    {
        return this.delegate.getRainTime();
    }

    public GameType getGameType()
    {
        return this.delegate.getGameType();
    }

    public void setSpawnX(int x)
    {
    }

    public void setSpawnY(int y)
    {
    }

    public void setSpawnZ(int z)
    {
    }

    public void setGameTime(long time)
    {
    }

    public void setDayTime(long time)
    {
    }

    public void setSpawn(BlockPos spawnPoint)
    {
    }

    public void setWorldName(String worldName)
    {
    }

    public void setSaveVersion(int version)
    {
    }

    public void setThundering(boolean thunderingIn)
    {
    }

    public void setThunderTime(int time)
    {
    }

    public void setRaining(boolean isRaining)
    {
    }

    public void setRainTime(int time)
    {
    }

    public boolean isMapFeaturesEnabled()
    {
        return this.delegate.isMapFeaturesEnabled();
    }

    public boolean isHardcore()
    {
        return this.delegate.isHardcore();
    }

    public WorldType getGenerator()
    {
        return this.delegate.getGenerator();
    }

    public void setGenerator(WorldType type)
    {
    }

    public boolean areCommandsAllowed()
    {
        return this.delegate.areCommandsAllowed();
    }

    public void setAllowCommands(boolean allow)
    {
    }

    public boolean isInitialized()
    {
        return this.delegate.isInitialized();
    }

    public void setInitialized(boolean initializedIn)
    {
    }

    public GameRules getGameRulesInstance()
    {
        return this.delegate.getGameRulesInstance();
    }

    public Difficulty getDifficulty()
    {
        return this.delegate.getDifficulty();
    }

    public void setDifficulty(Difficulty newDifficulty)
    {
    }

    public boolean isDifficultyLocked()
    {
        return this.delegate.isDifficultyLocked();
    }

    public void setDifficultyLocked(boolean locked)
    {
    }

    public TimerCallbackManager<MinecraftServer> getScheduledEvents()
    {
        return this.delegate.getScheduledEvents();
    }

    public void setDimensionData(DimensionType dimensionIn, CompoundNBT compound)
    {
        this.delegate.setDimensionData(dimensionIn, compound);
    }

    public CompoundNBT getDimensionData(DimensionType dimensionIn)
    {
        return this.delegate.getDimensionData(dimensionIn);
    }

    public void addToCrashReport(CrashReportCategory category)
    {
        category.addDetail("Derived", true);
        this.delegate.addToCrashReport(category);
    }
}
