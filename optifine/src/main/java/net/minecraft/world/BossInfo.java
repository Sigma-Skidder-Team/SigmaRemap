package net.minecraft.world;

import java.util.UUID;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;

public abstract class BossInfo
{
    private final UUID uniqueId;
    protected ITextComponent name;
    protected float percent;
    protected BossInfo.Color color;
    protected BossInfo.Overlay overlay;
    protected boolean darkenSky;
    protected boolean playEndBossMusic;
    protected boolean createFog;

    public BossInfo(UUID p_i1665_1_, ITextComponent p_i1665_2_, BossInfo.Color p_i1665_3_, BossInfo.Overlay p_i1665_4_)
    {
        this.uniqueId = p_i1665_1_;
        this.name = p_i1665_2_;
        this.color = p_i1665_3_;
        this.overlay = p_i1665_4_;
        this.percent = 1.0F;
    }

    public UUID getUniqueId()
    {
        return this.uniqueId;
    }

    public ITextComponent getName()
    {
        return this.name;
    }

    public void setName(ITextComponent nameIn)
    {
        this.name = nameIn;
    }

    public float getPercent()
    {
        return this.percent;
    }

    public void setPercent(float percentIn)
    {
        this.percent = percentIn;
    }

    public BossInfo.Color getColor()
    {
        return this.color;
    }

    public void setColor(BossInfo.Color colorIn)
    {
        this.color = colorIn;
    }

    public BossInfo.Overlay getOverlay()
    {
        return this.overlay;
    }

    public void setOverlay(BossInfo.Overlay overlayIn)
    {
        this.overlay = overlayIn;
    }

    public boolean shouldDarkenSky()
    {
        return this.darkenSky;
    }

    public BossInfo setDarkenSky(boolean darkenSkyIn)
    {
        this.darkenSky = darkenSkyIn;
        return this;
    }

    public boolean shouldPlayEndBossMusic()
    {
        return this.playEndBossMusic;
    }

    public BossInfo setPlayEndBossMusic(boolean playEndBossMusicIn)
    {
        this.playEndBossMusic = playEndBossMusicIn;
        return this;
    }

    public BossInfo setCreateFog(boolean createFogIn)
    {
        this.createFog = createFogIn;
        return this;
    }

    public boolean shouldCreateFog()
    {
        return this.createFog;
    }

    public static enum Color
    {
        PINK("pink", TextFormatting.RED),
        BLUE("blue", TextFormatting.BLUE),
        RED("red", TextFormatting.DARK_RED),
        GREEN("green", TextFormatting.GREEN),
        YELLOW("yellow", TextFormatting.YELLOW),
        PURPLE("purple", TextFormatting.DARK_BLUE),
        WHITE("white", TextFormatting.WHITE);

        private final String name;
        private final TextFormatting formatting;

        private Color(String p_i1707_3_, TextFormatting p_i1707_4_)
        {
            this.name = p_i1707_3_;
            this.formatting = p_i1707_4_;
        }

        public TextFormatting getFormatting()
        {
            return this.formatting;
        }

        public String getName()
        {
            return this.name;
        }

        public static BossInfo.Color byName(String p_201481_0_)
        {
            for (BossInfo.Color bossinfo$color : values())
            {
                if (bossinfo$color.name.equals(p_201481_0_))
                {
                    return bossinfo$color;
                }
            }

            return WHITE;
        }
    }

    public static enum Overlay
    {
        PROGRESS("progress"),
        NOTCHED_6("notched_6"),
        NOTCHED_10("notched_10"),
        NOTCHED_12("notched_12"),
        NOTCHED_20("notched_20");

        private final String name;

        private Overlay(String p_i565_3_)
        {
            this.name = p_i565_3_;
        }

        public String getName()
        {
            return this.name;
        }

        public static BossInfo.Overlay byName(String p_201485_0_)
        {
            for (BossInfo.Overlay bossinfo$overlay : values())
            {
                if (bossinfo$overlay.name.equals(p_201485_0_))
                {
                    return bossinfo$overlay;
                }
            }

            return PROGRESS;
        }
    }
}
