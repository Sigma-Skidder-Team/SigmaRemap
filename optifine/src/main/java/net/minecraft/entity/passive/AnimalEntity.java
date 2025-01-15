package net.minecraft.entity.passive;

import java.util.Random;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.block.Blocks;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

public abstract class AnimalEntity extends AgeableEntity
{
    private int inLove;
    private UUID playerInLove;

    protected AnimalEntity(EntityType <? extends AnimalEntity > p_i3018_1_, World p_i3018_2_)
    {
        super(p_i3018_1_, p_i3018_2_);
    }

    protected void updateAITasks()
    {
        if (this.getGrowingAge() != 0)
        {
            this.inLove = 0;
        }

        super.updateAITasks();
    }

    public void livingTick()
    {
        super.livingTick();

        if (this.getGrowingAge() != 0)
        {
            this.inLove = 0;
        }

        if (this.inLove > 0)
        {
            --this.inLove;

            if (this.inLove % 10 == 0)
            {
                double d0 = this.rand.nextGaussian() * 0.02D;
                double d1 = this.rand.nextGaussian() * 0.02D;
                double d2 = this.rand.nextGaussian() * 0.02D;
                this.world.addParticle(ParticleTypes.HEART, this.getPosXRandom(1.0D), this.getPosYRandom() + 0.5D, this.getPosZRandom(1.0D), d0, d1, d2);
            }
        }
    }

    public boolean attackEntityFrom(DamageSource source, float amount)
    {
        if (this.isInvulnerableTo(source))
        {
            return false;
        }
        else
        {
            this.inLove = 0;
            return super.attackEntityFrom(source, amount);
        }
    }

    public float getBlockPathWeight(BlockPos pos, IWorldReader worldIn)
    {
        return worldIn.getBlockState(pos.down()).getBlock() == Blocks.GRASS_BLOCK ? 10.0F : worldIn.getBrightness(pos) - 0.5F;
    }

    public void writeAdditional(CompoundNBT compound)
    {
        super.writeAdditional(compound);
        compound.putInt("InLove", this.inLove);

        if (this.playerInLove != null)
        {
            compound.putUniqueId("LoveCause", this.playerInLove);
        }
    }

    public double getYOffset()
    {
        return 0.14D;
    }

    public void readAdditional(CompoundNBT compound)
    {
        super.readAdditional(compound);
        this.inLove = compound.getInt("InLove");
        this.playerInLove = compound.hasUniqueId("LoveCause") ? compound.getUniqueId("LoveCause") : null;
    }

    public static boolean canAnimalSpawn(EntityType <? extends AnimalEntity > animal, IWorld worldIn, SpawnReason reason, BlockPos pos, Random random)
    {
        return worldIn.getBlockState(pos.down()).getBlock() == Blocks.GRASS_BLOCK && worldIn.getLightSubtracted(pos, 0) > 8;
    }

    public int getTalkInterval()
    {
        return 120;
    }

    public boolean canDespawn(double distanceToClosestPlayer)
    {
        return false;
    }

    protected int getExperiencePoints(PlayerEntity player)
    {
        return 1 + this.world.rand.nextInt(3);
    }

    public boolean isBreedingItem(ItemStack stack)
    {
        return stack.getItem() == Items.WHEAT;
    }

    public boolean processInteract(PlayerEntity player, Hand hand)
    {
        ItemStack itemstack = player.getHeldItem(hand);

        if (this.isBreedingItem(itemstack))
        {
            if (!this.world.isRemote && this.getGrowingAge() == 0 && this.canBreed())
            {
                this.consumeItemFromStack(player, itemstack);
                this.setInLove(player);
                player.func_226292_a_(hand, true);
                return true;
            }

            if (this.isChild())
            {
                this.consumeItemFromStack(player, itemstack);
                this.ageUp((int)((float)(-this.getGrowingAge() / 20) * 0.1F), true);
                return true;
            }
        }

        return super.processInteract(player, hand);
    }

    protected void consumeItemFromStack(PlayerEntity player, ItemStack stack)
    {
        if (!player.abilities.isCreativeMode)
        {
            stack.shrink(1);
        }
    }

    public boolean canBreed()
    {
        return this.inLove <= 0;
    }

    public void setInLove(@Nullable PlayerEntity player)
    {
        this.inLove = 600;

        if (player != null)
        {
            this.playerInLove = player.getUniqueID();
        }

        this.world.setEntityState(this, (byte)18);
    }

    public void setInLove(int ticks)
    {
        this.inLove = ticks;
    }

    @Nullable
    public ServerPlayerEntity getLoveCause()
    {
        if (this.playerInLove == null)
        {
            return null;
        }
        else
        {
            PlayerEntity playerentity = this.world.getPlayerByUuid(this.playerInLove);
            return playerentity instanceof ServerPlayerEntity ? (ServerPlayerEntity)playerentity : null;
        }
    }

    public boolean isInLove()
    {
        return this.inLove > 0;
    }

    public void resetInLove()
    {
        this.inLove = 0;
    }

    public boolean canMateWith(AnimalEntity otherAnimal)
    {
        if (otherAnimal == this)
        {
            return false;
        }
        else if (otherAnimal.getClass() != this.getClass())
        {
            return false;
        }
        else
        {
            return this.isInLove() && otherAnimal.isInLove();
        }
    }

    public void handleStatusUpdate(byte id)
    {
        if (id == 18)
        {
            for (int i = 0; i < 7; ++i)
            {
                double d0 = this.rand.nextGaussian() * 0.02D;
                double d1 = this.rand.nextGaussian() * 0.02D;
                double d2 = this.rand.nextGaussian() * 0.02D;
                this.world.addParticle(ParticleTypes.HEART, this.getPosXRandom(1.0D), this.getPosYRandom() + 0.5D, this.getPosZRandom(1.0D), d0, d1, d2);
            }
        }
        else
        {
            super.handleStatusUpdate(id);
        }
    }
}
