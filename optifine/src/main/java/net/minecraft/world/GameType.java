package net.minecraft.world;

import net.minecraft.entity.player.PlayerAbilities;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public enum GameType
{
    NOT_SET(-1, ""),
    SURVIVAL(0, "survival"),
    CREATIVE(1, "creative"),
    ADVENTURE(2, "adventure"),
    SPECTATOR(3, "spectator");

    private final int id;
    private final String name;

    private GameType(int p_i3829_3_, String p_i3829_4_)
    {
        this.id = p_i3829_3_;
        this.name = p_i3829_4_;
    }

    public int getID()
    {
        return this.id;
    }

    public String getName()
    {
        return this.name;
    }

    public ITextComponent getDisplayName()
    {
        return new TranslationTextComponent("gameMode." + this.name);
    }

    public void configurePlayerCapabilities(PlayerAbilities capabilities)
    {
        if (this == CREATIVE)
        {
            capabilities.allowFlying = true;
            capabilities.isCreativeMode = true;
            capabilities.disableDamage = true;
        }
        else if (this == SPECTATOR)
        {
            capabilities.allowFlying = true;
            capabilities.isCreativeMode = false;
            capabilities.disableDamage = true;
            capabilities.isFlying = true;
        }
        else
        {
            capabilities.allowFlying = false;
            capabilities.isCreativeMode = false;
            capabilities.disableDamage = false;
            capabilities.isFlying = false;
        }

        capabilities.allowEdit = !this.hasLimitedInteractions();
    }

    public boolean hasLimitedInteractions()
    {
        return this == ADVENTURE || this == SPECTATOR;
    }

    public boolean isCreative()
    {
        return this == CREATIVE;
    }

    public boolean isSurvivalOrAdventure()
    {
        return this == SURVIVAL || this == ADVENTURE;
    }

    public static GameType getByID(int idIn)
    {
        return parseGameTypeWithDefault(idIn, SURVIVAL);
    }

    public static GameType parseGameTypeWithDefault(int targetId, GameType fallback)
    {
        for (GameType gametype : values())
        {
            if (gametype.id == targetId)
            {
                return gametype;
            }
        }

        return fallback;
    }

    public static GameType getByName(String gamemodeName)
    {
        return parseGameTypeWithDefault(gamemodeName, SURVIVAL);
    }

    public static GameType parseGameTypeWithDefault(String targetName, GameType fallback)
    {
        for (GameType gametype : values())
        {
            if (gametype.name.equals(targetName))
            {
                return gametype;
            }
        }

        return fallback;
    }
}
