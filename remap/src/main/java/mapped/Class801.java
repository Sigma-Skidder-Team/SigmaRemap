// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class Class801 extends Class789
{
    private static final DataParameter<Boolean> field4299;
    private static final DataParameter<Integer> field4300;
    private static final Class120 field4301;
    private boolean field4302;
    private int field4303;
    private int field4304;
    
    public Class801(final EntityType<? extends Class801> class7499, final World class7500) {
        super(class7499, class7500);
    }
    
    @Override
    public void method4142() {
        this.field4114.method22062(0, new Class3490(this));
        this.field4114.method22062(1, new Class3607(this, 1.25));
        this.field4114.method22062(3, new Class3587(this, 1.0));
        this.field4114.method22062(4, new Class3472(this, 1.2, Class120.method618(Items.field31529), false));
        this.field4114.method22062(4, new Class3472(this, 1.2, false, Class801.field4301));
        this.field4114.method22062(5, new Class3456(this, 1.1));
        this.field4114.method22062(6, new Class3517(this, 1.0));
        this.field4114.method22062(7, new Class3628(this, Class512.class, 6.0f));
        this.field4114.method22062(8, new Class3503(this));
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33405).method23941(10.0);
        this.method2710(Class8107.field33408).method23941(0.25);
    }
    
    @Nullable
    @Override
    public Entity method1907() {
        return this.method1908().isEmpty() ? null : this.method1908().get(0);
    }
    
    @Override
    public boolean method4189() {
        final Entity method1907 = this.method1907();
        if (method1907 instanceof Class512) {
            final Class512 class512 = (Class512)method1907;
            return class512.getHeldItemMainhand().getItem() == Items.field31529 || class512.method2714().getItem() == Items.field31529;
        }
        return false;
    }
    
    @Override
    public void method1880(final DataParameter<?> class8810) {
        if (Class801.field4300.equals(class8810)) {
            if (this.world.isRemote) {
                this.field4302 = true;
                this.field4303 = 0;
                this.field4304 = this.dataManager.get(Class801.field4300);
            }
        }
        super.method1880(class8810);
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.dataManager.register(Class801.field4299, false);
        this.dataManager.register(Class801.field4300, 0);
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        class51.method312("Saddle", this.method4625());
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
        this.method4626(class51.method329("Saddle"));
    }
    
    @Override
    public Class7795 method4160() {
        return Class8520.field35460;
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return Class8520.field35462;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35461;
    }
    
    @Override
    public void method1691(final BlockPos class354, final BlockState class355) {
        this.method1695(Class8520.field35464, 0.15f, 1.0f);
    }
    
    @Override
    public boolean method4195(final Class512 class512, final Class316 class513) {
        if (super.method4195(class512, class513)) {
            return true;
        }
        final ItemStack method2715 = class512.method2715(class513);
        if (method2715.getItem() == Items.field31552) {
            method2715.method27640(class512, this, class513);
            return true;
        }
        if (this.method4625() && !this.isBeingRidden()) {
            if (!this.world.isRemote) {
                class512.method1778(this);
            }
            return true;
        }
        return method2715.getItem() == Items.field31353 && method2715.method27640(class512, this, class513);
    }
    
    @Override
    public void method2676() {
        super.method2676();
        if (this.method4625()) {
            this.method1764(Items.field31353);
        }
    }
    
    public boolean method4625() {
        return this.dataManager.get(Class801.field4299);
    }
    
    public void method4626(final boolean b) {
        if (!b) {
            this.dataManager.set(Class801.field4299, false);
        }
        else {
            this.dataManager.set(Class801.field4299, true);
        }
    }
    
    @Override
    public void onStruckByLightning(final LightningBoltEntity class422) {
        final Class828 class423 = EntityType.field29014.method23371(this.world);
        class423.method1803(Class2215.field13600, new ItemStack(Items.field31302));
        class423.method1730(this.getPosX(), this.getPosY(), this.getPosZ(), this.rotationYaw, this.rotationPitch);
        class423.method4211(this.method4214());
        if (this.hasCustomName()) {
            class423.method1872(this.getCustomName());
            class423.method1875(this.method1876());
        }
        this.world.method6886(class423);
        this.method1652();
    }
    
    @Override
    public void method2729(final Vec3d class5487) {
        if (this.method1768()) {
            final Entity class5488 = this.method1908().isEmpty() ? null : this.method1908().get(0);
            if (this.isBeingRidden() && this.method4189()) {
                this.rotationYaw = class5488.rotationYaw;
                this.prevRotationYaw = this.rotationYaw;
                this.rotationPitch = class5488.rotationPitch * 0.5f;
                this.method1655(this.rotationYaw, this.rotationPitch);
                this.field2951 = this.rotationYaw;
                this.field2953 = this.rotationYaw;
                this.stepHeight = 1.0f;
                this.field2955 = this.method2732() * 0.1f;
                if (this.field4302) {
                    if (this.field4303++ > this.field4304) {
                        this.field4302 = false;
                    }
                }
                if (!this.method1919()) {
                    this.method1936(Vec3d.ZERO);
                }
                else {
                    float n = (float)this.method2710(Class8107.field33408).method23950() * 0.225f;
                    if (this.field4302) {
                        n += n * 1.15f * MathHelper.sin(this.field4303 / (float)this.field4304 * 3.1415927f);
                    }
                    this.method2733(n);
                    super.method2729(new Vec3d(0.0, 0.0, 1.0));
                    this.field2971 = 0;
                }
                this.field2945 = this.field2946;
                final double n2 = this.getPosX() - this.prevPosX;
                final double n3 = this.getPosZ() - this.prevPosZ;
                float n4 = MathHelper.sqrt(n2 * n2 + n3 * n3) * 4.0f;
                if (n4 > 1.0f) {
                    n4 = 1.0f;
                }
                this.field2946 += (n4 - this.field2946) * 0.4f;
                this.field2947 += this.field2946;
            }
            else {
                this.stepHeight = 0.5f;
                this.field2955 = 0.02f;
                super.method2729(class5487);
            }
        }
    }
    
    public boolean method4627() {
        if (!this.field4302) {
            this.field4302 = true;
            this.field4303 = 0;
            this.field4304 = this.method2633().nextInt(841) + 140;
            this.method1650().set(Class801.field4300, this.field4304);
            return true;
        }
        return false;
    }
    
    public Class801 method4628(final Class788 class788) {
        return EntityType.field29012.method23371(this.world);
    }
    
    @Override
    public boolean method4357(final ItemStack class8321) {
        return Class801.field4301.test(class8321);
    }
    
    static {
        field4299 = EntityDataManager.method33564(Class801.class, Class7709.field30661);
        field4300 = EntityDataManager.method33564(Class801.class, Class7709.field30654);
        field4301 = Class120.method618(Items.field31517, Items.field31518, Items.field31575);
    }
}
