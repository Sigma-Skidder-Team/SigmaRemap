package net.minecraft.world.storage;

import net.minecraft.util.SharedConstants;
import net.minecraft.util.StringUtils;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.GameType;
import net.minecraft.world.WorldType;

public class WorldSummary implements Comparable<WorldSummary>
{
    private final String fileName;
    private final String displayName;
    private final long lastTimePlayed;
    private final long sizeOnDisk;
    private final boolean requiresConversion;
    private final GameType gameType;
    private final boolean hardcore;
    private final boolean cheatsEnabled;
    private final String versionName;
    private final int versionId;
    private final boolean versionSnapshot;
    private final WorldType terrainType;

    public WorldSummary(WorldInfo p_i1995_1_, String p_i1995_2_, String p_i1995_3_, long p_i1995_4_, boolean p_i1995_6_)
    {
        this.fileName = p_i1995_2_;
        this.displayName = p_i1995_3_;
        this.lastTimePlayed = p_i1995_1_.getLastTimePlayed();
        this.sizeOnDisk = p_i1995_4_;
        this.gameType = p_i1995_1_.getGameType();
        this.requiresConversion = p_i1995_6_;
        this.hardcore = p_i1995_1_.isHardcore();
        this.cheatsEnabled = p_i1995_1_.areCommandsAllowed();
        this.versionName = p_i1995_1_.getVersionName();
        this.versionId = p_i1995_1_.getVersionId();
        this.versionSnapshot = p_i1995_1_.isVersionSnapshot();
        this.terrainType = p_i1995_1_.getGenerator();
    }

    public String getFileName()
    {
        return this.fileName;
    }

    public String getDisplayName()
    {
        return this.displayName;
    }

    public long getSizeOnDisk()
    {
        return this.sizeOnDisk;
    }

    public boolean requiresConversion()
    {
        return this.requiresConversion;
    }

    public long getLastTimePlayed()
    {
        return this.lastTimePlayed;
    }

    public int compareTo(WorldSummary p_compareTo_1_)
    {
        if (this.lastTimePlayed < p_compareTo_1_.lastTimePlayed)
        {
            return 1;
        }
        else
        {
            return this.lastTimePlayed > p_compareTo_1_.lastTimePlayed ? -1 : this.fileName.compareTo(p_compareTo_1_.fileName);
        }
    }

    public GameType getEnumGameType()
    {
        return this.gameType;
    }

    public boolean isHardcoreModeEnabled()
    {
        return this.hardcore;
    }

    public boolean getCheatsEnabled()
    {
        return this.cheatsEnabled;
    }

    public ITextComponent getVersionName()
    {
        return (ITextComponent)(StringUtils.isNullOrEmpty(this.versionName) ? new TranslationTextComponent("selectWorld.versionUnknown") : new StringTextComponent(this.versionName));
    }

    public boolean markVersionInList()
    {
        return this.askToOpenWorld() || !SharedConstants.getVersion().isStable() && !this.versionSnapshot || this.func_197731_n() || this.func_202842_n();
    }

    public boolean askToOpenWorld()
    {
        return this.versionId > SharedConstants.getVersion().getWorldVersion();
    }

    public boolean func_202842_n()
    {
        return this.terrainType == WorldType.CUSTOMIZED && this.versionId < 1466;
    }

    public boolean func_197731_n()
    {
        return this.versionId < SharedConstants.getVersion().getWorldVersion();
    }
}
