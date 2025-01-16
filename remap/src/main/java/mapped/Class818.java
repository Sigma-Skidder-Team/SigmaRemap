// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.*;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class Class818 extends Class789
{
    private static final Ingredient field4380;
    public float field4381;
    public float field4382;
    public float field4383;
    public float field4384;
    public float field4385;
    public int field4386;
    public boolean field4387;
    
    public Class818(final EntityType<? extends Class818> class7499, final World class7500) {
        super(class7499, class7500);
        this.field4385 = 1.0f;
        this.field4386 = this.rand.nextInt(6000) + 6000;
        this.method4145(Class257.field1211, 0.0f);
    }
    
    @Override
    public void method4142() {
        this.field4114.method22062(0, new Class3490(this));
        this.field4114.method22062(1, new Class3607(this, 1.4));
        this.field4114.method22062(2, new Class3587(this, 1.0));
        this.field4114.method22062(3, new Class3472(this, 1.0, false, Class818.field4380));
        this.field4114.method22062(4, new Class3456(this, 1.1));
        this.field4114.method22062(5, new Class3517(this, 1.0));
        this.field4114.method22062(6, new Class3628(this, PlayerEntity.class, 6.0f));
        this.field4114.method22062(7, new Class3503(this));
    }
    
    @Override
    public float method2789(final Pose class290, final EntitySize class291) {
        return this.method2625() ? (class291.field34098 * 0.85f) : (class291.field34098 * 0.92f);
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33405).method23941(4.0);
        this.method2710(Class8107.field33408).method23941(0.25);
    }
    
    @Override
    public void method2736() {
        super.method2736();
        this.field4384 = this.field4381;
        this.field4383 = this.field4382;
        this.field4382 += (float)((this.onGround ? -1 : 4) * 0.3);
        this.field4382 = MathHelper.clamp(this.field4382, 0.0f, 1.0f);
        if (!this.onGround) {
            if (this.field4385 < 1.0f) {
                this.field4385 = 1.0f;
            }
        }
        this.field4385 *= (float)0.9;
        final Vec3d method1935 = this.getMotion();
        if (!this.onGround) {
            if (method1935.y < 0.0) {
                this.method1936(method1935.mul(1.0, 0.6, 1.0));
            }
        }
        this.field4381 += this.field4385 * 2.0f;
        if (!this.world.isRemote) {
            if (this.method1768()) {
                if (!this.method2625()) {
                    if (!this.method4817()) {
                        if (--this.field4386 <= 0) {
                            this.method1695(Class8520.field35070, 1.0f, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f + 1.0f);
                            this.method1764(Items.field31374);
                            this.field4386 = this.rand.nextInt(6000) + 6000;
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public boolean method1705(final float n, final float n2) {
        return false;
    }
    
    @Override
    public Class7795 method4160() {
        return Class8520.field35068;
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return Class8520.field35071;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35069;
    }
    
    @Override
    public void method1691(final BlockPos class354, final BlockState class355) {
        this.method1695(Class8520.field35072, 0.15f, 1.0f);
    }
    
    public Class818 method4816(final Class788 class788) {
        return EntityType.field28966.method23371(this.world);
    }
    
    @Override
    public boolean method4357(final ItemStack class8321) {
        return Class818.field4380.test(class8321);
    }
    
    @Override
    public int method2631(final PlayerEntity playerEntity) {
        return this.method4817() ? 10 : super.method2631(playerEntity);
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        super.method1760(class51);
        this.field4387 = class51.getBoolean("IsChickenJockey");
        if (class51.contains("EggLayTime")) {
            this.field4386 = class51.getInt("EggLayTime");
        }
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        super.method1761(class51);
        class51.putBoolean("IsChickenJockey", this.field4387);
        class51.putInt("EggLayTime", this.field4386);
    }
    
    @Override
    public boolean method4168(final double n) {
        return this.method4817() && !this.isBeingRidden();
    }
    
    @Override
    public void method1773(final Entity class399) {
        super.method1773(class399);
        class399.setPosition(this.getPosX() + 0.1f * MathHelper.sin(this.field2951 * 0.017453292f), this.method1942(0.5) + class399.method1776() + 0.0, this.getPosZ() - 0.1f * MathHelper.cos(this.field2951 * 0.017453292f));
        if (class399 instanceof LivingEntity) {
            ((LivingEntity)class399).field2951 = this.field2951;
        }
    }
    
    public boolean method4817() {
        return this.field4387;
    }
    
    public void method4818(final boolean field4387) {
        this.field4387 = field4387;
    }
    
    static {
        field4380 = Ingredient.method618(Items.field31314, Items.field31430, Items.field31429, Items.field31576);
    }
}
