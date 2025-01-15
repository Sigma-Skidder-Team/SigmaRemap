package net.minecraft.util;

import javax.annotation.Nullable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class EntityDamageSource extends DamageSource
{
    @Nullable
    protected final Entity damageSourceEntity;
    private boolean isThornsDamage;

    public EntityDamageSource(String p_i4243_1_, @Nullable Entity p_i4243_2_)
    {
        super(p_i4243_1_);
        this.damageSourceEntity = p_i4243_2_;
    }

    public EntityDamageSource setIsThornsDamage()
    {
        this.isThornsDamage = true;
        return this;
    }

    public boolean getIsThornsDamage()
    {
        return this.isThornsDamage;
    }

    @Nullable
    public Entity getTrueSource()
    {
        return this.damageSourceEntity;
    }

    public ITextComponent getDeathMessage(LivingEntity entityLivingBaseIn)
    {
        ItemStack itemstack = this.damageSourceEntity instanceof LivingEntity ? ((LivingEntity)this.damageSourceEntity).getHeldItemMainhand() : ItemStack.EMPTY;
        String s = "death.attack." + this.damageType;
        return !itemstack.isEmpty() && itemstack.hasDisplayName() ? new TranslationTextComponent(s + ".item", entityLivingBaseIn.getDisplayName(), this.damageSourceEntity.getDisplayName(), itemstack.getTextComponent()) : new TranslationTextComponent(s, entityLivingBaseIn.getDisplayName(), this.damageSourceEntity.getDisplayName());
    }

    public boolean isDifficultyScaled()
    {
        return this.damageSourceEntity != null && this.damageSourceEntity instanceof LivingEntity && !(this.damageSourceEntity instanceof PlayerEntity);
    }

    @Nullable
    public Vec3d getDamageLocation()
    {
        return this.damageSourceEntity != null ? this.damageSourceEntity.getPositionVec() : null;
    }
}
