package net.minecraft.entity;

import javax.annotation.Nullable;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.Hand;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public abstract class AgeableEntity extends CreatureEntity
{
    private static final DataParameter<Boolean> BABY = EntityDataManager.createKey(AgeableEntity.class, DataSerializers.BOOLEAN);
    protected int growingAge;
    protected int forcedAge;
    protected int forcedAgeTimer;

    protected AgeableEntity(EntityType <? extends AgeableEntity > p_i3878_1_, World p_i3878_2_)
    {
        super(p_i3878_1_, p_i3878_2_);
    }

    public ILivingEntityData onInitialSpawn(IWorld worldIn, DifficultyInstance difficultyIn, SpawnReason reason, @Nullable ILivingEntityData spawnDataIn, @Nullable CompoundNBT dataTag)
    {
        if (spawnDataIn == null)
        {
            spawnDataIn = new AgeableEntity.AgeableData();
        }

        AgeableEntity.AgeableData ageableentity$ageabledata = (AgeableEntity.AgeableData)spawnDataIn;

        if (ageableentity$ageabledata.func_226261_c_() && ageableentity$ageabledata.func_226257_a_() > 0 && this.rand.nextFloat() <= ageableentity$ageabledata.func_226262_d_())
        {
            this.setGrowingAge(-24000);
        }

        ageableentity$ageabledata.func_226260_b_();
        return super.onInitialSpawn(worldIn, difficultyIn, reason, spawnDataIn, dataTag);
    }

    @Nullable
    public abstract AgeableEntity createChild(AgeableEntity ageable);

    protected void onChildSpawnFromEgg(PlayerEntity playerIn, AgeableEntity child)
    {
    }

    public boolean processInteract(PlayerEntity player, Hand hand)
    {
        ItemStack itemstack = player.getHeldItem(hand);
        Item item = itemstack.getItem();

        if (item instanceof SpawnEggItem && ((SpawnEggItem)item).hasType(itemstack.getTag(), this.getType()))
        {
            if (!this.world.isRemote)
            {
                AgeableEntity ageableentity = this.createChild(this);

                if (ageableentity != null)
                {
                    ageableentity.setGrowingAge(-24000);
                    ageableentity.setLocationAndAngles(this.getPosX(), this.getPosY(), this.getPosZ(), 0.0F, 0.0F);
                    this.world.addEntity(ageableentity);

                    if (itemstack.hasDisplayName())
                    {
                        ageableentity.setCustomName(itemstack.getDisplayName());
                    }

                    this.onChildSpawnFromEgg(player, ageableentity);

                    if (!player.abilities.isCreativeMode)
                    {
                        itemstack.shrink(1);
                    }
                }
            }

            return true;
        }
        else
        {
            return false;
        }
    }

    protected void registerData()
    {
        super.registerData();
        this.dataManager.register(BABY, false);
    }

    public int getGrowingAge()
    {
        if (this.world.isRemote)
        {
            return this.dataManager.get(BABY) ? -1 : 1;
        }
        else
        {
            return this.growingAge;
        }
    }

    public void ageUp(int growthSeconds, boolean updateForcedAge)
    {
        int i = this.getGrowingAge();
        i = i + growthSeconds * 20;

        if (i > 0)
        {
            i = 0;
        }

        int j = i - i;
        this.setGrowingAge(i);

        if (updateForcedAge)
        {
            this.forcedAge += j;

            if (this.forcedAgeTimer == 0)
            {
                this.forcedAgeTimer = 40;
            }
        }

        if (this.getGrowingAge() == 0)
        {
            this.setGrowingAge(this.forcedAge);
        }
    }

    public void addGrowth(int growth)
    {
        this.ageUp(growth, false);
    }

    public void setGrowingAge(int age)
    {
        int i = this.growingAge;
        this.growingAge = age;

        if (i < 0 && age >= 0 || i >= 0 && age < 0)
        {
            this.dataManager.set(BABY, age < 0);
            this.onGrowingAdult();
        }
    }

    public void writeAdditional(CompoundNBT compound)
    {
        super.writeAdditional(compound);
        compound.putInt("Age", this.getGrowingAge());
        compound.putInt("ForcedAge", this.forcedAge);
    }

    public void readAdditional(CompoundNBT compound)
    {
        super.readAdditional(compound);
        this.setGrowingAge(compound.getInt("Age"));
        this.forcedAge = compound.getInt("ForcedAge");
    }

    public void notifyDataManagerChange(DataParameter<?> key)
    {
        if (BABY.equals(key))
        {
            this.recalculateSize();
        }

        super.notifyDataManagerChange(key);
    }

    public void livingTick()
    {
        super.livingTick();

        if (this.world.isRemote)
        {
            if (this.forcedAgeTimer > 0)
            {
                if (this.forcedAgeTimer % 4 == 0)
                {
                    this.world.addParticle(ParticleTypes.HAPPY_VILLAGER, this.getPosXRandom(1.0D), this.getPosYRandom() + 0.5D, this.getPosZRandom(1.0D), 0.0D, 0.0D, 0.0D);
                }

                --this.forcedAgeTimer;
            }
        }
        else if (this.isAlive())
        {
            int i = this.getGrowingAge();

            if (i < 0)
            {
                ++i;
                this.setGrowingAge(i);
            }
            else if (i > 0)
            {
                --i;
                this.setGrowingAge(i);
            }
        }
    }

    protected void onGrowingAdult()
    {
    }

    public boolean isChild()
    {
        return this.getGrowingAge() < 0;
    }

    public static class AgeableData implements ILivingEntityData
    {
        private int field_226254_a_;
        private boolean field_226255_b_ = true;
        private float field_226256_c_ = 0.05F;

        public int func_226257_a_()
        {
            return this.field_226254_a_;
        }

        public void func_226260_b_()
        {
            ++this.field_226254_a_;
        }

        public boolean func_226261_c_()
        {
            return this.field_226255_b_;
        }

        public void func_226259_a_(boolean p_226259_1_)
        {
            this.field_226255_b_ = p_226259_1_;
        }

        public float func_226262_d_()
        {
            return this.field_226256_c_;
        }

        public void func_226258_a_(float p_226258_1_)
        {
            this.field_226256_c_ = p_226258_1_;
        }
    }
}
