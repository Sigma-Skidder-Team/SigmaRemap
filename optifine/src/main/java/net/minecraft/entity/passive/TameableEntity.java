package net.minecraft.entity.passive;

import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.SitGoal;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.scoreboard.Team;
import net.minecraft.server.management.PreYggdrasilConverter;
import net.minecraft.util.DamageSource;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;

public abstract class TameableEntity extends AnimalEntity
{
    protected static final DataParameter<Byte> TAMED = EntityDataManager.createKey(TameableEntity.class, DataSerializers.BYTE);
    protected static final DataParameter<Optional<UUID>> OWNER_UNIQUE_ID = EntityDataManager.createKey(TameableEntity.class, DataSerializers.OPTIONAL_UNIQUE_ID);
    protected SitGoal sitGoal;

    protected TameableEntity(EntityType <? extends TameableEntity > p_i2768_1_, World p_i2768_2_)
    {
        super(p_i2768_1_, p_i2768_2_);
        this.setupTamedAI();
    }

    protected void registerData()
    {
        super.registerData();
        this.dataManager.register(TAMED, (byte)0);
        this.dataManager.register(OWNER_UNIQUE_ID, Optional.empty());
    }

    public void writeAdditional(CompoundNBT compound)
    {
        super.writeAdditional(compound);

        if (this.getOwnerId() == null)
        {
            compound.putString("OwnerUUID", "");
        }
        else
        {
            compound.putString("OwnerUUID", this.getOwnerId().toString());
        }

        compound.putBoolean("Sitting", this.isSitting());
    }

    public void readAdditional(CompoundNBT compound)
    {
        super.readAdditional(compound);
        String s;

        if (compound.contains("OwnerUUID", 8))
        {
            s = compound.getString("OwnerUUID");
        }
        else
        {
            String s1 = compound.getString("Owner");
            s = PreYggdrasilConverter.convertMobOwnerIfNeeded(this.getServer(), s1);
        }

        if (!s.isEmpty())
        {
            try
            {
                this.setOwnerId(UUID.fromString(s));
                this.setTamed(true);
            }
            catch (Throwable var4)
            {
                this.setTamed(false);
            }
        }

        if (this.sitGoal != null)
        {
            this.sitGoal.setSitting(compound.getBoolean("Sitting"));
        }

        this.setSitting(compound.getBoolean("Sitting"));
    }

    public boolean canBeLeashedTo(PlayerEntity player)
    {
        return !this.getLeashed();
    }

    protected void playTameEffect(boolean play)
    {
        IParticleData iparticledata = ParticleTypes.HEART;

        if (!play)
        {
            iparticledata = ParticleTypes.SMOKE;
        }

        for (int i = 0; i < 7; ++i)
        {
            double d0 = this.rand.nextGaussian() * 0.02D;
            double d1 = this.rand.nextGaussian() * 0.02D;
            double d2 = this.rand.nextGaussian() * 0.02D;
            this.world.addParticle(iparticledata, this.getPosXRandom(1.0D), this.getPosYRandom() + 0.5D, this.getPosZRandom(1.0D), d0, d1, d2);
        }
    }

    public void handleStatusUpdate(byte id)
    {
        if (id == 7)
        {
            this.playTameEffect(true);
        }
        else if (id == 6)
        {
            this.playTameEffect(false);
        }
        else
        {
            super.handleStatusUpdate(id);
        }
    }

    public boolean isTamed()
    {
        return (this.dataManager.get(TAMED) & 4) != 0;
    }

    public void setTamed(boolean tamed)
    {
        byte b0 = this.dataManager.get(TAMED);

        if (tamed)
        {
            this.dataManager.set(TAMED, (byte)(b0 | 4));
        }
        else
        {
            this.dataManager.set(TAMED, (byte)(b0 & -5));
        }

        this.setupTamedAI();
    }

    protected void setupTamedAI()
    {
    }

    public boolean isSitting()
    {
        return (this.dataManager.get(TAMED) & 1) != 0;
    }

    public void setSitting(boolean sitting)
    {
        byte b0 = this.dataManager.get(TAMED);

        if (sitting)
        {
            this.dataManager.set(TAMED, (byte)(b0 | 1));
        }
        else
        {
            this.dataManager.set(TAMED, (byte)(b0 & -2));
        }
    }

    @Nullable
    public UUID getOwnerId()
    {
        return this.dataManager.get(OWNER_UNIQUE_ID).orElse((UUID)null);
    }

    public void setOwnerId(@Nullable UUID p_184754_1_)
    {
        this.dataManager.set(OWNER_UNIQUE_ID, Optional.ofNullable(p_184754_1_));
    }

    public void setTamedBy(PlayerEntity player)
    {
        this.setTamed(true);
        this.setOwnerId(player.getUniqueID());

        if (player instanceof ServerPlayerEntity)
        {
            CriteriaTriggers.TAME_ANIMAL.trigger((ServerPlayerEntity)player, this);
        }
    }

    @Nullable
    public LivingEntity getOwner()
    {
        try
        {
            UUID uuid = this.getOwnerId();
            return uuid == null ? null : this.world.getPlayerByUuid(uuid);
        }
        catch (IllegalArgumentException var2)
        {
            return null;
        }
    }

    public boolean canAttack(LivingEntity target)
    {
        return this.isOwner(target) ? false : super.canAttack(target);
    }

    public boolean isOwner(LivingEntity entityIn)
    {
        return entityIn == this.getOwner();
    }

    public SitGoal getAISit()
    {
        return this.sitGoal;
    }

    public boolean shouldAttackEntity(LivingEntity target, LivingEntity owner)
    {
        return true;
    }

    public Team getTeam()
    {
        if (this.isTamed())
        {
            LivingEntity livingentity = this.getOwner();

            if (livingentity != null)
            {
                return livingentity.getTeam();
            }
        }

        return super.getTeam();
    }

    public boolean isOnSameTeam(Entity entityIn)
    {
        if (this.isTamed())
        {
            LivingEntity livingentity = this.getOwner();

            if (entityIn == livingentity)
            {
                return true;
            }

            if (livingentity != null)
            {
                return livingentity.isOnSameTeam(entityIn);
            }
        }

        return super.isOnSameTeam(entityIn);
    }

    public void onDeath(DamageSource cause)
    {
        if (!this.world.isRemote && this.world.getGameRules().getBoolean(GameRules.SHOW_DEATH_MESSAGES) && this.getOwner() instanceof ServerPlayerEntity)
        {
            this.getOwner().sendMessage(this.getCombatTracker().getDeathMessage());
        }

        super.onDeath(cause);
    }
}
