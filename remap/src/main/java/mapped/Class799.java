// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.*;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.UUID;
import java.util.function.Predicate;

public class Class799 extends Class794
{
    private static final DataParameter<Boolean> field4276;
    private static final DataParameter<Integer> field4277;
    public static final Predicate<LivingEntity> field4278;
    private float field4279;
    private float field4280;
    private boolean field4281;
    private boolean field4282;
    private float field4283;
    private float field4284;
    
    public Class799(final EntityType<? extends Class799> class7499, final World class7500) {
        super(class7499, class7500);
        this.method4481(false);
    }
    
    @Override
    public void method4142() {
        this.field4245 = new Class3495(this);
        this.field4114.method22062(1, new Class3490(this));
        this.field4114.method22062(2, this.field4245);
        this.field4114.method22062(3, new Class3453<Object>(this, Class815.class, 24.0f, 1.5, 1.5));
        this.field4114.method22062(4, new Class3526(this, 0.4f));
        this.field4114.method22062(5, new Class3574(this, 1.0, true));
        this.field4114.method22062(6, new Class3528(this, 1.0, 10.0f, 2.0f, false));
        this.field4114.method22062(7, new Class3587(this, 1.0));
        this.field4114.method22062(8, new Class3517(this, 1.0));
        this.field4114.method22062(9, new Class3572(this, 8.0f));
        this.field4114.method22062(10, new Class3628(this, PlayerEntity.class, 8.0f));
        this.field4114.method22062(10, new Class3503(this));
        this.field4115.method22062(1, new Class3554(this));
        this.field4115.method22062(2, new Class3569(this));
        this.field4115.method22062(3, new Class3547(this, new Class[0]).method11100(new Class[0]));
        this.field4115.method22062(4, new Class3560<Object>(this, Class789.class, false, Class799.field4278));
        this.field4115.method22062(4, new Class3560<Object>(this, Class793.class, false, Class793.field4242));
        this.field4115.method22062(5, new Class3555<Object>(this, Class780.class, false));
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33408).method23941(0.30000001192092896);
        if (!this.method4480()) {
            this.method2710(Class8107.field33405).method23941(8.0);
        }
        else {
            this.method2710(Class8107.field33405).method23941(20.0);
        }
        this.method2711().method20873(Class8107.field33410).method23941(2.0);
    }
    
    @Override
    public void method4153(final LivingEntity class511) {
        super.method4153(class511);
        if (class511 != null) {
            if (!this.method4480()) {
                this.method4598(true);
            }
        }
        else {
            this.method4598(false);
        }
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.dataManager.register(Class799.field4276, false);
        this.dataManager.register(Class799.field4277, Class181.field551.method813());
    }
    
    @Override
    public void method1691(final BlockPos class354, final BlockState class355) {
        this.method1695(Class8520.field35736, 0.15f, 1.0f);
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        super.method1761(class51);
        class51.putBoolean("Angry", this.method4597());
        class51.putByte("CollarColor", (byte)this.method4599().method813());
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        super.method1760(class51);
        this.method4598(class51.getBoolean("Angry"));
        if (class51.contains("CollarColor", 99)) {
            this.method4600(Class181.method819(class51.getInt("CollarColor")));
        }
    }
    
    @Override
    public Class7795 method4160() {
        if (this.method4597()) {
            return Class8520.field35731;
        }
        if (this.rand.nextInt(3) != 0) {
            return Class8520.field35729;
        }
        return (this.method4480() && this.method2664() < 10.0f) ? Class8520.field35737 : Class8520.field35734;
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return Class8520.field35733;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35730;
    }
    
    @Override
    public float method2720() {
        return 0.4f;
    }
    
    @Override
    public void method2736() {
        super.method2736();
        if (!this.world.isRemote) {
            if (this.field4281) {
                if (!this.field4282) {
                    if (!this.method4346()) {
                        if (this.onGround) {
                            this.field4282 = true;
                            this.field4283 = 0.0f;
                            this.field4284 = 0.0f;
                            this.world.method6761(this, (byte)8);
                        }
                    }
                }
            }
        }
        if (!this.world.isRemote) {
            if (this.method4152() == null) {
                if (this.method4597()) {
                    this.method4598(false);
                }
            }
        }
    }
    
    @Override
    public void method1659() {
        super.method1659();
        if (this.isAlive()) {
            this.field4280 = this.field4279;
            if (!this.method4603()) {
                this.field4279 += (0.0f - this.field4279) * 0.4f;
            }
            else {
                this.field4279 += (1.0f - this.field4279) * 0.4f;
            }
            if (!this.method1710()) {
                if (this.field4281 || this.field4282) {
                    if (this.field4282) {
                        if (this.field4283 == 0.0f) {
                            this.method1695(Class8520.field35735, this.method2720(), (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f + 1.0f);
                        }
                        this.field4284 = this.field4283;
                        this.field4283 += 0.05f;
                        if (this.field4284 >= 2.0f) {
                            this.field4281 = false;
                            this.field4282 = false;
                            this.field4284 = 0.0f;
                            this.field4283 = 0.0f;
                        }
                        if (this.field4283 > 0.4f) {
                            final float n = (float)this.getPosY();
                            final int n2 = (int)(MathHelper.sin((this.field4283 - 0.4f) * 3.1415927f) * 7.0f);
                            final Vec3d method1935 = this.getMotion();
                            for (int i = 0; i < n2; ++i) {
                                this.world.method6709(Class8432.field34646, this.getPosX() + (this.rand.nextFloat() * 2.0f - 1.0f) * this.method1930() * 0.5f, n + 0.8f, this.getPosZ() + (this.rand.nextFloat() * 2.0f - 1.0f) * this.method1930() * 0.5f, method1935.x, method1935.y, method1935.z);
                            }
                        }
                    }
                }
            }
            else {
                this.field4281 = true;
                this.field4282 = false;
                this.field4283 = 0.0f;
                this.field4284 = 0.0f;
            }
        }
    }
    
    @Override
    public void method2673(final DamageSource class7929) {
        this.field4281 = false;
        this.field4282 = false;
        this.field4284 = 0.0f;
        this.field4283 = 0.0f;
        super.method2673(class7929);
    }
    
    public boolean method4592() {
        return this.field4281;
    }
    
    public float method4593(final float n) {
        return 0.75f + MathHelper.method35700(n, this.field4284, this.field4283) / 2.0f * 0.25f;
    }
    
    public float method4594(final float n, final float n2) {
        float n3 = (MathHelper.method35700(n, this.field4284, this.field4283) + n2) / 1.8f;
        if (n3 >= 0.0f) {
            if (n3 > 1.0f) {
                n3 = 1.0f;
            }
        }
        else {
            n3 = 0.0f;
        }
        return MathHelper.sin(n3 * 3.1415927f) * MathHelper.sin(n3 * 3.1415927f * 11.0f) * 0.15f * 3.1415927f;
    }
    
    public float method4595(final float n) {
        return MathHelper.method35700(n, this.field4280, this.field4279) * 0.15f * 3.1415927f;
    }
    
    @Override
    public float method2789(final Pose class290, final EntitySize class291) {
        return class291.field34098 * 0.8f;
    }
    
    @Override
    public int method4173() {
        return this.method4483() ? 20 : super.method4173();
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource class7929, float n) {
        if (!this.method1849(class7929)) {
            final Entity method25714 = class7929.method25714();
            if (this.field4245 != null) {
                this.field4245.method11058(false);
            }
            if (method25714 != null) {
                if (!(method25714 instanceof PlayerEntity)) {
                    if (!(method25714 instanceof Class402)) {
                        n = (n + 1.0f) / 2.0f;
                    }
                }
            }
            return super.attackEntityFrom(class7929, n);
        }
        return false;
    }
    
    @Override
    public boolean method2734(final Entity class399) {
        final boolean method1740 = class399.attackEntityFrom(DamageSource.method25693(this), (float)(int)this.method2710(Class8107.field33410).method23950());
        if (method1740) {
            this.method1900(this, class399);
        }
        return method1740;
    }
    
    @Override
    public void method4481(final boolean b) {
        super.method4481(b);
        if (!b) {
            this.method2710(Class8107.field33405).method23941(8.0);
        }
        else {
            this.method2710(Class8107.field33405).method23941(20.0);
            this.method2665(20.0f);
        }
        this.method2710(Class8107.field33410).method23941(4.0);
    }
    
    @Override
    public boolean method4195(final PlayerEntity playerEntity, final Class316 class513) {
        final ItemStack method2715 = playerEntity.method2715(class513);
        final Item method2716 = method2715.getItem();
        if (method2715.getItem() instanceof Class3831) {
            return super.method4195(playerEntity, class513);
        }
        if (!this.world.isRemote) {
            if (!this.method4480()) {
                if (method2716 == Items.field31405) {
                    if (!this.method4597()) {
                        if (!playerEntity.field3025.field27304) {
                            method2715.method27693(1);
                        }
                        if (this.rand.nextInt(3) != 0) {
                            this.world.method6761(this, (byte)6);
                        }
                        else {
                            this.method4487(playerEntity);
                            this.field4113.method24733();
                            this.method4153(null);
                            this.field4245.method11058(true);
                            this.world.method6761(this, (byte)7);
                        }
                        return true;
                    }
                }
            }
            else {
                if (method2716.method11743()) {
                    if (method2716.method11744().method32746()) {
                        if (this.method2664() < this.method2701()) {
                            if (!playerEntity.field3025.field27304) {
                                method2715.method27693(1);
                            }
                            this.method2663((float)method2716.method11744().method32744());
                            return true;
                        }
                    }
                }
                if (!(method2716 instanceof Class3829)) {
                    final boolean method2717 = super.method4195(playerEntity, class513);
                    if (!method2717 || this.method2625()) {
                        this.field4245.method11058(!this.method4483());
                    }
                    return method2717;
                }
                final Class181 method2718 = ((Class3829)method2716).method11767();
                if (method2718 != this.method4599()) {
                    this.method4600(method2718);
                    if (!playerEntity.field3025.field27304) {
                        method2715.method27693(1);
                    }
                    return true;
                }
                if (this.method4489(playerEntity)) {
                    if (!this.method4357(method2715)) {
                        this.field4245.method11058(!this.method4483());
                        this.field2967 = false;
                        this.field4113.method24733();
                        this.method4153(null);
                    }
                }
            }
            return super.method4195(playerEntity, class513);
        }
        return this.method4489(playerEntity) || (method2716 == Items.field31405 && !this.method4597());
    }
    
    @Override
    public void method1798(final byte b) {
        if (b != 8) {
            super.method1798(b);
        }
        else {
            this.field4282 = true;
            this.field4283 = 0.0f;
            this.field4284 = 0.0f;
        }
    }
    
    public float method4596() {
        if (!this.method4597()) {
            return this.method4480() ? ((0.55f - (this.method2701() - this.method2664()) * 0.02f) * 3.1415927f) : 0.62831855f;
        }
        return 1.5393804f;
    }
    
    @Override
    public boolean method4357(final ItemStack class8321) {
        final Item method27622 = class8321.getItem();
        return method27622.method11743() && method27622.method11744().method32746();
    }
    
    @Override
    public int method4181() {
        return 8;
    }
    
    public boolean method4597() {
        return (this.dataManager.get(Class799.field4243) & 0x2) != 0x0;
    }
    
    public void method4598(final boolean b) {
        final byte byteValue = this.dataManager.get(Class799.field4243);
        if (!b) {
            this.dataManager.set(Class799.field4243, (byte)(byteValue & 0xFFFFFFFD));
        }
        else {
            this.dataManager.set(Class799.field4243, (byte)(byteValue | 0x2));
        }
    }
    
    public Class181 method4599() {
        return Class181.method819(this.dataManager.get(Class799.field4277));
    }
    
    public void method4600(final Class181 class181) {
        this.dataManager.set(Class799.field4277, class181.method813());
    }
    
    public Class799 method4601(final Class788 class788) {
        final Class799 class789 = EntityType.field29051.method23371(this.world);
        final UUID method4485 = this.method4485();
        if (method4485 != null) {
            class789.method4486(method4485);
            class789.method4481(true);
        }
        return class789;
    }
    
    public void method4602(final boolean b) {
        this.dataManager.set(Class799.field4276, b);
    }
    
    @Override
    public boolean method4365(final Class789 class789) {
        if (class789 == this) {
            return false;
        }
        if (!this.method4480()) {
            return false;
        }
        if (class789 instanceof Class799) {
            final Class799 class790 = (Class799)class789;
            return class790.method4480() && !class790.method4483() && this.method4363() && class790.method4363();
        }
        return false;
    }
    
    public boolean method4603() {
        return this.dataManager.get(Class799.field4276);
    }
    
    @Override
    public boolean method4491(final LivingEntity class511, final LivingEntity class512) {
        if (class511 instanceof Class765 || class511 instanceof GhastEntity) {
            return false;
        }
        if (!(class511 instanceof Class799)) {
            if (class511 instanceof PlayerEntity) {
                if (class512 instanceof PlayerEntity) {
                    if (!((PlayerEntity)class512).method2826((PlayerEntity)class511)) {
                        return false;
                    }
                }
            }
            return (!(class511 instanceof Class806) || !((Class806)class511).method4715()) && (!(class511 instanceof Class794) || !((Class794)class511).method4480());
        }
        final Class799 class513 = (Class799)class511;
        return !class513.method4480() || class513.method4488() != class512;
    }
    
    @Override
    public boolean method4204(final PlayerEntity playerEntity) {
        return !this.method4597() && super.method4204(playerEntity);
    }
    
    static {
        field4276 = EntityDataManager.method33564(Class799.class, Class7709.field30661);
        field4277 = EntityDataManager.method33564(Class799.class, Class7709.field30654);
        field4278 = (class511 -> {
            class511.getType();
            final EntityType class512;
            final boolean b;
            if (class512 != EntityType.field29019) {
                if (class512 != EntityType.field29017) {
                    if (class512 != EntityType.field28985) {
                        return b;
                    }
                }
            }
            return b;
        });
    }
}
