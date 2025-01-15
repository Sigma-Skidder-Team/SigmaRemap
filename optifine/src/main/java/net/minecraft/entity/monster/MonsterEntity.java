package net.minecraft.entity.monster;

import java.util.Random;
import java.util.function.Predicate;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ShootableItem;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.LightType;
import net.minecraft.world.World;

public abstract class MonsterEntity extends CreatureEntity implements IMob
{
    protected MonsterEntity(EntityType <? extends MonsterEntity > p_i2249_1_, World p_i2249_2_)
    {
        super(p_i2249_1_, p_i2249_2_);
        this.experienceValue = 5;
    }

    public SoundCategory getSoundCategory()
    {
        return SoundCategory.HOSTILE;
    }

    public void livingTick()
    {
        this.updateArmSwingProgress();
        this.func_213623_ec();
        super.livingTick();
    }

    protected void func_213623_ec()
    {
        float f = this.getBrightness();

        if (f > 0.5F)
        {
            this.idleTime += 2;
        }
    }

    protected boolean isDespawnPeaceful()
    {
        return true;
    }

    protected SoundEvent getSwimSound()
    {
        return SoundEvents.ENTITY_HOSTILE_SWIM;
    }

    protected SoundEvent getSplashSound()
    {
        return SoundEvents.ENTITY_HOSTILE_SPLASH;
    }

    public boolean attackEntityFrom(DamageSource source, float amount)
    {
        return this.isInvulnerableTo(source) ? false : super.attackEntityFrom(source, amount);
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn)
    {
        return SoundEvents.ENTITY_HOSTILE_HURT;
    }

    protected SoundEvent getDeathSound()
    {
        return SoundEvents.ENTITY_HOSTILE_DEATH;
    }

    protected SoundEvent getFallSound(int heightIn)
    {
        return heightIn > 4 ? SoundEvents.ENTITY_HOSTILE_BIG_FALL : SoundEvents.ENTITY_HOSTILE_SMALL_FALL;
    }

    public float getBlockPathWeight(BlockPos pos, IWorldReader worldIn)
    {
        return 0.5F - worldIn.getBrightness(pos);
    }

    public static boolean isValidLightLevel(IWorld worldIn, BlockPos pos, Random randomIn)
    {
        if (worldIn.getLightFor(LightType.SKY, pos) > randomIn.nextInt(32))
        {
            return false;
        }
        else
        {
            int i = worldIn.getWorld().isThundering() ? worldIn.getNeighborAwareLightSubtracted(pos, 10) : worldIn.getLight(pos);
            return i <= randomIn.nextInt(8);
        }
    }

    public static boolean canMonsterSpawnInLight(EntityType <? extends MonsterEntity > type, IWorld worldIn, SpawnReason reason, BlockPos pos, Random randomIn)
    {
        return worldIn.getDifficulty() != Difficulty.PEACEFUL && isValidLightLevel(worldIn, pos, randomIn) && canSpawnOn(type, worldIn, reason, pos, randomIn);
    }

    public static boolean canMonsterSpawn(EntityType <? extends MonsterEntity > type, IWorld worldIn, SpawnReason reason, BlockPos pos, Random randomIn)
    {
        return worldIn.getDifficulty() != Difficulty.PEACEFUL && canSpawnOn(type, worldIn, reason, pos, randomIn);
    }

    protected void registerAttributes()
    {
        super.registerAttributes();
        this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
    }

    protected boolean canDropLoot()
    {
        return true;
    }

    public boolean isPreventingPlayerRest(PlayerEntity playerIn)
    {
        return true;
    }

    public ItemStack findAmmo(ItemStack shootable)
    {
        if (shootable.getItem() instanceof ShootableItem)
        {
            Predicate<ItemStack> predicate = ((ShootableItem)shootable.getItem()).getAmmoPredicate();
            ItemStack itemstack = ShootableItem.getHeldAmmo(this, predicate);
            return itemstack.isEmpty() ? new ItemStack(Items.ARROW) : itemstack;
        }
        else
        {
            return ItemStack.EMPTY;
        }
    }
}
