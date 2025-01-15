package net.minecraft.tileentity;

import com.google.common.collect.Iterables;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.properties.Property;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.server.management.PlayerProfileCache;
import net.minecraft.util.StringUtils;

public class SkullTileEntity extends TileEntity implements ITickableTileEntity
{
    private GameProfile playerProfile;
    private int dragonAnimatedTicks;
    private boolean dragonAnimated;
    private static PlayerProfileCache profileCache;
    private static MinecraftSessionService sessionService;

    public SkullTileEntity()
    {
        super(TileEntityType.SKULL);
    }

    public static void setProfileCache(PlayerProfileCache profileCacheIn)
    {
        profileCache = profileCacheIn;
    }

    public static void setSessionService(MinecraftSessionService sessionServiceIn)
    {
        sessionService = sessionServiceIn;
    }

    public CompoundNBT write(CompoundNBT compound)
    {
        super.write(compound);

        if (this.playerProfile != null)
        {
            CompoundNBT compoundnbt = new CompoundNBT();
            NBTUtil.writeGameProfile(compoundnbt, this.playerProfile);
            compound.put("Owner", compoundnbt);
        }

        return compound;
    }

    public void read(CompoundNBT compound)
    {
        super.read(compound);

        if (compound.contains("Owner", 10))
        {
            this.setPlayerProfile(NBTUtil.readGameProfile(compound.getCompound("Owner")));
        }
        else if (compound.contains("ExtraType", 8))
        {
            String s = compound.getString("ExtraType");

            if (!StringUtils.isNullOrEmpty(s))
            {
                this.setPlayerProfile(new GameProfile((UUID)null, s));
            }
        }
    }

    public void tick()
    {
        Block block = this.getBlockState().getBlock();

        if (block == Blocks.DRAGON_HEAD || block == Blocks.DRAGON_WALL_HEAD)
        {
            if (this.world.isBlockPowered(this.pos))
            {
                this.dragonAnimated = true;
                ++this.dragonAnimatedTicks;
            }
            else
            {
                this.dragonAnimated = false;
            }
        }
    }

    public float getAnimationProgress(float p_184295_1_)
    {
        return this.dragonAnimated ? (float)this.dragonAnimatedTicks + p_184295_1_ : (float)this.dragonAnimatedTicks;
    }

    @Nullable
    public GameProfile getPlayerProfile()
    {
        return this.playerProfile;
    }

    @Nullable
    public SUpdateTileEntityPacket getUpdatePacket()
    {
        return new SUpdateTileEntityPacket(this.pos, 4, this.getUpdateTag());
    }

    public CompoundNBT getUpdateTag()
    {
        return this.write(new CompoundNBT());
    }

    public void setPlayerProfile(@Nullable GameProfile p_195485_1_)
    {
        this.playerProfile = p_195485_1_;
        this.updatePlayerProfile();
    }

    private void updatePlayerProfile()
    {
        this.playerProfile = updateGameProfile(this.playerProfile);
        this.markDirty();
    }

    public static GameProfile updateGameProfile(GameProfile input)
    {
        if (input != null && !StringUtils.isNullOrEmpty(input.getName()))
        {
            if (input.isComplete() && input.getProperties().containsKey("textures"))
            {
                return input;
            }
            else if (profileCache != null && sessionService != null)
            {
                GameProfile gameprofile = profileCache.getGameProfileForUsername(input.getName());

                if (gameprofile == null)
                {
                    return input;
                }
                else
                {
                    Property property = Iterables.getFirst(gameprofile.getProperties().get("textures"), (Property)null);

                    if (property == null)
                    {
                        gameprofile = sessionService.fillProfileProperties(gameprofile, true);
                    }

                    return gameprofile;
                }
            }
            else
            {
                return input;
            }
        }
        else
        {
            return input;
        }
    }
}
