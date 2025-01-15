package net.minecraft.entity.item;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.server.SSpawnPaintingPacket;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;

public class PaintingEntity extends HangingEntity
{
    public PaintingType art;

    public PaintingEntity(EntityType <? extends PaintingEntity > p_i1700_1_, World p_i1700_2_)
    {
        super(p_i1700_1_, p_i1700_2_);
    }

    public PaintingEntity(World p_i1701_1_, BlockPos p_i1701_2_, Direction p_i1701_3_)
    {
        super(EntityType.PAINTING, p_i1701_1_, p_i1701_2_);
        List<PaintingType> list = Lists.newArrayList();
        int i = 0;

        for (PaintingType paintingtype : Registry.MOTIVE)
        {
            this.art = paintingtype;
            this.updateFacingWithBoundingBox(p_i1701_3_);

            if (this.onValidSurface())
            {
                list.add(paintingtype);
                int j = paintingtype.getWidth() * paintingtype.getHeight();

                if (j > i)
                {
                    i = j;
                }
            }
        }

        if (!list.isEmpty())
        {
            Iterator<PaintingType> iterator = list.iterator();

            while (iterator.hasNext())
            {
                PaintingType paintingtype1 = iterator.next();

                if (paintingtype1.getWidth() * paintingtype1.getHeight() < i)
                {
                    iterator.remove();
                }
            }

            this.art = list.get(this.rand.nextInt(list.size()));
        }

        this.updateFacingWithBoundingBox(p_i1701_3_);
    }

    public PaintingEntity(World p_i1702_1_, BlockPos p_i1702_2_, Direction p_i1702_3_, PaintingType p_i1702_4_)
    {
        this(p_i1702_1_, p_i1702_2_, p_i1702_3_);
        this.art = p_i1702_4_;
        this.updateFacingWithBoundingBox(p_i1702_3_);
    }

    public void writeAdditional(CompoundNBT compound)
    {
        compound.putString("Motive", Registry.MOTIVE.getKey(this.art).toString());
        super.writeAdditional(compound);
    }

    public void readAdditional(CompoundNBT compound)
    {
        this.art = Registry.MOTIVE.getOrDefault(ResourceLocation.tryCreate(compound.getString("Motive")));
        super.readAdditional(compound);
    }

    public int getWidthPixels()
    {
        return this.art == null ? 1 : this.art.getWidth();
    }

    public int getHeightPixels()
    {
        return this.art == null ? 1 : this.art.getHeight();
    }

    public void onBroken(@Nullable Entity brokenEntity)
    {
        if (this.world.getGameRules().getBoolean(GameRules.DO_ENTITY_DROPS))
        {
            this.playSound(SoundEvents.ENTITY_PAINTING_BREAK, 1.0F, 1.0F);

            if (brokenEntity instanceof PlayerEntity)
            {
                PlayerEntity playerentity = (PlayerEntity)brokenEntity;

                if (playerentity.abilities.isCreativeMode)
                {
                    return;
                }
            }

            this.entityDropItem(Items.PAINTING);
        }
    }

    public void playPlaceSound()
    {
        this.playSound(SoundEvents.ENTITY_PAINTING_PLACE, 1.0F, 1.0F);
    }

    public void setLocationAndAngles(double x, double y, double z, float yaw, float pitch)
    {
        this.setPosition(x, y, z);
    }

    public void setPositionAndRotationDirect(double x, double y, double z, float yaw, float pitch, int posRotationIncrements, boolean teleport)
    {
        BlockPos blockpos = this.hangingPosition.add(x - this.getPosX(), y - this.getPosY(), z - this.getPosZ());
        this.setPosition((double)blockpos.getX(), (double)blockpos.getY(), (double)blockpos.getZ());
    }

    public IPacket<?> createSpawnPacket()
    {
        return new SSpawnPaintingPacket(this);
    }
}
