package net.minecraft.potion;

import com.google.common.collect.ComparisonChain;
import javax.annotation.Nullable;
import net.minecraft.entity.LivingEntity;
import net.minecraft.nbt.CompoundNBT;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EffectInstance implements Comparable<EffectInstance>
{
    private static final Logger LOGGER = LogManager.getLogger();
    private final Effect potion;
    private int duration;
    private int amplifier;
    private boolean isSplashPotion;
    private boolean ambient;
    private boolean isPotionDurationMax;
    private boolean showParticles;
    private boolean showIcon;
    @Nullable
    private EffectInstance field_230115_j_;

    public EffectInstance(Effect p_i1766_1_)
    {
        this(p_i1766_1_, 0, 0);
    }

    public EffectInstance(Effect p_i1767_1_, int p_i1767_2_)
    {
        this(p_i1767_1_, p_i1767_2_, 0);
    }

    public EffectInstance(Effect worldIn, int x, int p_i1768_3_)
    {
        this(worldIn, x, p_i1768_3_, false, true);
    }

    public EffectInstance(Effect worldIn, int shooter, int accelX, boolean p_i1769_4_, boolean accelY)
    {
        this(worldIn, shooter, accelX, p_i1769_4_, accelY, accelY);
    }

    public EffectInstance(Effect p_i1770_1_, int p_i1770_2_, int p_i1770_3_, boolean p_i1770_4_, boolean p_i1770_5_, boolean p_i1770_6_)
    {
        this(p_i1770_1_, p_i1770_2_, p_i1770_3_, p_i1770_4_, p_i1770_5_, p_i1770_6_, (EffectInstance)null);
    }

    public EffectInstance(Effect worldIn, int shooter, int accelX, boolean p_i1771_4_, boolean accelY, boolean p_i1771_6_, @Nullable EffectInstance accelZ)
    {
        this.potion = worldIn;
        this.duration = shooter;
        this.amplifier = accelX;
        this.ambient = p_i1771_4_;
        this.showParticles = accelY;
        this.showIcon = p_i1771_6_;
        this.field_230115_j_ = accelZ;
    }

    public EffectInstance(EffectInstance worldIn)
    {
        this.potion = worldIn.potion;
        this.func_230117_a_(worldIn);
    }

    void func_230117_a_(EffectInstance p_230117_1_)
    {
        this.duration = p_230117_1_.duration;
        this.amplifier = p_230117_1_.amplifier;
        this.ambient = p_230117_1_.ambient;
        this.showParticles = p_230117_1_.showParticles;
        this.showIcon = p_230117_1_.showIcon;
    }

    public boolean combine(EffectInstance other)
    {
        if (this.potion != other.potion)
        {
            LOGGER.warn("This method should only be called for matching effects!");
        }

        boolean flag = false;

        if (other.amplifier > this.amplifier)
        {
            if (other.duration < this.duration)
            {
                EffectInstance effectinstance = this.field_230115_j_;
                this.field_230115_j_ = new EffectInstance(this);
                this.field_230115_j_.field_230115_j_ = effectinstance;
            }

            this.amplifier = other.amplifier;
            this.duration = other.duration;
            flag = true;
        }
        else if (other.duration > this.duration)
        {
            if (other.amplifier == this.amplifier)
            {
                this.duration = other.duration;
                flag = true;
            }
            else if (this.field_230115_j_ == null)
            {
                this.field_230115_j_ = new EffectInstance(other);
            }
            else
            {
                this.field_230115_j_.combine(other);
            }
        }

        if (!other.ambient && this.ambient || flag)
        {
            this.ambient = other.ambient;
            flag = true;
        }

        if (other.showParticles != this.showParticles)
        {
            this.showParticles = other.showParticles;
            flag = true;
        }

        if (other.showIcon != this.showIcon)
        {
            this.showIcon = other.showIcon;
            flag = true;
        }

        return flag;
    }

    public Effect getPotion()
    {
        return this.potion;
    }

    public int getDuration()
    {
        return this.duration;
    }

    public int getAmplifier()
    {
        return this.amplifier;
    }

    public boolean isAmbient()
    {
        return this.ambient;
    }

    public boolean doesShowParticles()
    {
        return this.showParticles;
    }

    public boolean isShowIcon()
    {
        return this.showIcon;
    }

    public boolean tick(LivingEntity entityIn, Runnable p_76455_2_)
    {
        if (this.duration > 0)
        {
            if (this.potion.isReady(this.duration, this.amplifier))
            {
                this.performEffect(entityIn);
            }

            this.deincrementDuration();

            if (this.duration == 0 && this.field_230115_j_ != null)
            {
                this.func_230117_a_(this.field_230115_j_);
                this.field_230115_j_ = this.field_230115_j_.field_230115_j_;
                p_76455_2_.run();
            }
        }

        return this.duration > 0;
    }

    private int deincrementDuration()
    {
        if (this.field_230115_j_ != null)
        {
            this.field_230115_j_.deincrementDuration();
        }

        return --this.duration;
    }

    public void performEffect(LivingEntity entityIn)
    {
        if (this.duration > 0)
        {
            this.potion.performEffect(entityIn, this.amplifier);
        }
    }

    public String getEffectName()
    {
        return this.potion.getName();
    }

    public String toString()
    {
        String s;

        if (this.amplifier > 0)
        {
            s = this.getEffectName() + " x " + (this.amplifier + 1) + ", Duration: " + this.duration;
        }
        else
        {
            s = this.getEffectName() + ", Duration: " + this.duration;
        }

        if (this.isSplashPotion)
        {
            s = s + ", Splash: true";
        }

        if (!this.showParticles)
        {
            s = s + ", Particles: false";
        }

        if (!this.showIcon)
        {
            s = s + ", Show Icon: false";
        }

        return s;
    }

    public boolean equals(Object p_equals_1_)
    {
        if (this == p_equals_1_)
        {
            return true;
        }
        else if (!(p_equals_1_ instanceof EffectInstance))
        {
            return false;
        }
        else
        {
            EffectInstance effectinstance = (EffectInstance)p_equals_1_;
            return this.duration == effectinstance.duration && this.amplifier == effectinstance.amplifier && this.isSplashPotion == effectinstance.isSplashPotion && this.ambient == effectinstance.ambient && this.potion.equals(effectinstance.potion);
        }
    }

    public int hashCode()
    {
        int i = this.potion.hashCode();
        i = 31 * i + this.duration;
        i = 31 * i + this.amplifier;
        i = 31 * i + (this.isSplashPotion ? 1 : 0);
        i = 31 * i + (this.ambient ? 1 : 0);
        return i;
    }

    public CompoundNBT write(CompoundNBT nbt)
    {
        nbt.putByte("Id", (byte)Effect.getId(this.getPotion()));
        this.func_230119_c_(nbt);
        return nbt;
    }

    private void func_230119_c_(CompoundNBT p_230119_1_)
    {
        p_230119_1_.putByte("Amplifier", (byte)this.getAmplifier());
        p_230119_1_.putInt("Duration", this.getDuration());
        p_230119_1_.putBoolean("Ambient", this.isAmbient());
        p_230119_1_.putBoolean("ShowParticles", this.doesShowParticles());
        p_230119_1_.putBoolean("ShowIcon", this.isShowIcon());

        if (this.field_230115_j_ != null)
        {
            CompoundNBT compoundnbt = new CompoundNBT();
            this.field_230115_j_.write(compoundnbt);
            p_230119_1_.put("HiddenEffect", compoundnbt);
        }
    }

    public static EffectInstance read(CompoundNBT nbt)
    {
        int i = nbt.getByte("Id");
        Effect effect = Effect.get(i);
        return effect == null ? null : func_230116_a_(effect, nbt);
    }

    private static EffectInstance func_230116_a_(Effect p_230116_0_, CompoundNBT p_230116_1_)
    {
        int i = p_230116_1_.getByte("Amplifier");
        int j = p_230116_1_.getInt("Duration");
        boolean flag = p_230116_1_.getBoolean("Ambient");
        boolean flag1 = true;

        if (p_230116_1_.contains("ShowParticles", 1))
        {
            flag1 = p_230116_1_.getBoolean("ShowParticles");
        }

        boolean flag2 = flag1;

        if (p_230116_1_.contains("ShowIcon", 1))
        {
            flag2 = p_230116_1_.getBoolean("ShowIcon");
        }

        EffectInstance effectinstance = null;

        if (p_230116_1_.contains("HiddenEffect", 10))
        {
            effectinstance = func_230116_a_(p_230116_0_, p_230116_1_.getCompound("HiddenEffect"));
        }

        return new EffectInstance(p_230116_0_, j, i < 0 ? 0 : i, flag, flag1, flag2, effectinstance);
    }

    public void setPotionDurationMax(boolean maxDuration)
    {
        this.isPotionDurationMax = maxDuration;
    }

    public boolean getIsPotionDurationMax()
    {
        return this.isPotionDurationMax;
    }

    public int compareTo(EffectInstance p_compareTo_1_)
    {
        int i = 32147;
        return (this.getDuration() <= 32147 || p_compareTo_1_.getDuration() <= 32147) && (!this.isAmbient() || !p_compareTo_1_.isAmbient()) ? ComparisonChain.start().compare(this.isAmbient(), p_compareTo_1_.isAmbient()).compare(this.getDuration(), p_compareTo_1_.getDuration()).compare(this.getPotion().getLiquidColor(), p_compareTo_1_.getPotion().getLiquidColor()).result() : ComparisonChain.start().compare(this.isAmbient(), p_compareTo_1_.isAmbient()).compare(this.getPotion().getLiquidColor(), p_compareTo_1_.getPotion().getLiquidColor()).result();
    }
}
