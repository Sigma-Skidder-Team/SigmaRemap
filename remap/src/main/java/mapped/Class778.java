// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Pose;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class Class778 extends Class776 implements Class768
{
    private static final UUID field4179;
    private static final Class7919 field4180;
    private static final DataParameter<Boolean> field4181;
    private int field4182;
    private Class3567<Class776> field4183;
    private Class3562<PlayerEntity> field4184;
    
    public Class778(final EntityType<? extends Class778> class7499, final World class7500) {
        super(class7499, class7500);
    }
    
    @Override
    public void method4142() {
        super.method4142();
        this.field4183 = new Class3567<Class776>(this, Class776.class, true, class511 -> {
            final boolean b;
            if (class511 != null) {
                if (this.method4293()) {
                    if (class511.getType() != EntityType.field29047) {
                        return b;
                    }
                }
            }
            return b;
        });
        this.field4184 = new Class3562<PlayerEntity>(this, PlayerEntity.class, 10, true, false, null);
        this.field4114.method22062(1, new Class3490(this));
        this.field4114.method22062(2, new Class3507(this, 1.0, 60, 10.0f));
        this.field4114.method22062(2, new Class3517(this, 1.0));
        this.field4114.method22062(3, new Class3628(this, PlayerEntity.class, 8.0f));
        this.field4114.method22062(3, new Class3503(this));
        this.field4115.method22062(1, new Class3547(this, new Class[] { Class776.class }));
        this.field4115.method22062(2, this.field4183);
        this.field4115.method22062(3, this.field4184);
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.method1650().register(Class778.field4181, false);
    }
    
    @Override
    public Class7795 method4160() {
        return Class8520.field35713;
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return Class8520.field35717;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35715;
    }
    
    public void method4318(final boolean b) {
        this.method1650().set(Class778.field4181, b);
    }
    
    public boolean method4319() {
        return this.method1650().get(Class778.field4181);
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33405).method23941(26.0);
        this.method2710(Class8107.field33408).method23941(0.25);
    }
    
    @Override
    public void method2736() {
        if (!this.world.isRemote) {
            if (this.isAlive()) {
                this.field4183.method11111();
                this.field4184.method11107(this.field4183.method11110() <= 0);
                if (!this.method4319()) {
                    Class8061 class8061 = null;
                    Label_0125: {
                        if (this.rand.nextFloat() < 0.15f) {
                            if (this.method1720(Class7324.field28319)) {
                                if (!this.method2653(Class9439.field40486)) {
                                    class8061 = Class8644.field36273;
                                    break Label_0125;
                                }
                            }
                        }
                        Label_0099: {
                            if (this.rand.nextFloat() < 0.15f) {
                                if (!this.method1804()) {
                                    if (this.method2669() == null) {
                                        break Label_0099;
                                    }
                                    if (!this.method2669().method25719()) {
                                        break Label_0099;
                                    }
                                }
                                if (!this.method2653(Class9439.field40485)) {
                                    class8061 = Class8644.field36262;
                                    break Label_0125;
                                }
                            }
                        }
                        if (this.rand.nextFloat() < 0.05f && this.method2664() < this.method2701()) {
                            class8061 = Class8644.field36275;
                        }
                        else if (this.rand.nextFloat() < 0.5f) {
                            if (this.method4152() != null) {
                                if (!this.method2653(Class9439.field40474)) {
                                    if (this.method4152().method1734(this) > 121.0) {
                                        class8061 = Class8644.field36264;
                                    }
                                }
                            }
                        }
                    }
                    if (class8061 != null) {
                        this.method1803(Class2215.field13600, Class5333.method16476(new ItemStack(Items.field31441), class8061));
                        this.field4182 = this.getHeldItemMainhand().method27652();
                        this.method4318(true);
                        this.world.method6706(null, this.getPosX(), this.getPosY(), this.getPosZ(), Class8520.field35716, this.method1922(), 1.0f, 0.8f + this.rand.nextFloat() * 0.4f);
                        final Class7619 method2710 = this.method2710(Class8107.field33408);
                        method2710.method23947(Class778.field4180);
                        method2710.method23946(Class778.field4180);
                    }
                }
                else if (this.field4182-- <= 0) {
                    this.method4318(false);
                    final ItemStack method2711 = this.getHeldItemMainhand();
                    this.method1803(Class2215.field13600, ItemStack.EMPTY);
                    if (method2711.getItem() == Items.field31441) {
                        final List<Class1948> method2712 = Class5333.method16465(method2711);
                        if (method2712 != null) {
                            final Iterator<Class1948> iterator = method2712.iterator();
                            while (iterator.hasNext()) {
                                this.method2655(new Class1948(iterator.next()));
                            }
                        }
                    }
                    this.method2710(Class8107.field33408).method23947(Class778.field4180);
                }
                if (this.rand.nextFloat() < 7.5E-4f) {
                    this.world.method6761(this, (byte)15);
                }
            }
        }
        super.method2736();
    }
    
    @Override
    public Class7795 method4260() {
        return Class8520.field35714;
    }
    
    @Override
    public void method1798(final byte b) {
        if (b != 15) {
            super.method1798(b);
        }
        else {
            for (int i = 0; i < this.rand.nextInt(35) + 10; ++i) {
                this.world.addParticle(Class8432.field34647, this.getPosX() + this.rand.nextGaussian() * 0.12999999523162842, this.getBoundingBox().maxY + 0.5 + this.rand.nextGaussian() * 0.12999999523162842, this.getPosZ() + this.rand.nextGaussian() * 0.12999999523162842, 0.0, 0.0, 0.0);
            }
        }
    }
    
    @Override
    public float method2697(final DamageSource class7929, float method2697) {
        method2697 = super.method2697(class7929, method2697);
        if (class7929.method25714() == this) {
            method2697 = 0.0f;
        }
        if (class7929.method25723()) {
            method2697 *= (float)0.15;
        }
        return method2697;
    }
    
    @Override
    public void method4252(final LivingEntity class511, final float n) {
        if (!this.method4319()) {
            final Vec3d method1935 = class511.getMotion();
            final double n2 = class511.getPosX() + method1935.x - this.getPosX();
            final double n3 = class511.method1944() - 1.100000023841858 - this.getPosY();
            final double n4 = class511.getPosZ() + method1935.z - this.getPosZ();
            final float method1936 = MathHelper.sqrt(n2 * n2 + n4 * n4);
            Class8061 class512 = Class8644.field36277;
            if (!(class511 instanceof Class776)) {
                if (method1936 >= 8.0f && !class511.method2653(Class9439.field40475)) {
                    class512 = Class8644.field36267;
                }
                else if (class511.method2664() >= 8.0f && !class511.method2653(Class9439.field40492)) {
                    class512 = Class8644.field36279;
                }
                else if (method1936 <= 3.0f) {
                    if (!class511.method2653(Class9439.field40491)) {
                        if (this.rand.nextFloat() < 0.25f) {
                            class512 = Class8644.field36288;
                        }
                    }
                }
            }
            else {
                if (class511.method2664() > 4.0f) {
                    class512 = Class8644.field36282;
                }
                else {
                    class512 = Class8644.field36275;
                }
                this.method4153(null);
            }
            final Class415 class513 = new Class415(this.world, this);
            class513.method2022(Class5333.method16476(new ItemStack(Items.field31579), class512));
            final Class415 class514 = class513;
            class514.rotationPitch += 20.0f;
            class513.method1958(n2, n3 + method1936 * 0.2f, n4, 0.75f, 8.0f);
            this.world.method6706(null, this.getPosX(), this.getPosY(), this.getPosZ(), Class8520.field35718, this.method1922(), 1.0f, 0.8f + this.rand.nextFloat() * 0.4f);
            this.world.method6886(class513);
        }
    }
    
    @Override
    public float method2789(final Pose class290, final EntitySize class291) {
        return 1.62f;
    }
    
    @Override
    public void method4263(final int n, final boolean b) {
    }
    
    @Override
    public boolean method4308() {
        return false;
    }
    
    static {
        field4179 = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
        field4180 = new Class7919(Class778.field4179, "Drinking speed penalty", -0.25, Class2157.field12809).method25640(false);
        field4181 = EntityDataManager.method33564(Class778.class, Class7709.field30661);
    }
}
