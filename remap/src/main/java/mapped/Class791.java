// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.function.Predicate;

public class Class791 extends Class789
{
    private static final DataParameter<Integer> field4209;
    private static final DataParameter<Integer> field4210;
    private static final DataParameter<Integer> field4211;
    private static final DataParameter<Byte> field4212;
    private static final DataParameter<Byte> field4213;
    private static final DataParameter<Byte> field4214;
    private static final Class7843 field4215;
    private boolean field4216;
    private boolean field4217;
    public int field4218;
    private Vec3d field4219;
    private float field4220;
    private float field4221;
    private float field4222;
    private float field4223;
    private float field4224;
    private float field4225;
    private Class3630 field4226;
    private static final Predicate<Class427> field4227;
    
    public Class791(final EntityType<? extends Class791> class7499, final World class7500) {
        super(class7499, class7500);
        this.field4110 = new Class6572(this);
        if (!this.method2625()) {
            this.method4193(true);
        }
    }
    
    @Override
    public boolean method2779(final ItemStack class8321) {
        final Class2215 method4185 = Class759.method4185(class8321);
        return this.method2718(method4185).method27620() && method4185 == Class2215.field13600 && super.method2779(class8321);
    }
    
    public int method4371() {
        return this.dataManager.get(Class791.field4209);
    }
    
    public void method4372(final int i) {
        this.dataManager.set(Class791.field4209, i);
    }
    
    public boolean method4373() {
        return this.method4391(2);
    }
    
    public boolean method4374() {
        return this.method4391(8);
    }
    
    public void method4375(final boolean b) {
        this.method4392(8, b);
    }
    
    public boolean method4376() {
        return this.method4391(16);
    }
    
    public void method4377(final boolean b) {
        this.method4392(16, b);
    }
    
    public boolean method4378() {
        return this.dataManager.get(Class791.field4211) > 0;
    }
    
    public void method4379(final boolean i) {
        this.dataManager.set(Class791.field4211, i ? 1 : 0);
    }
    
    private int method4380() {
        return this.dataManager.get(Class791.field4211);
    }
    
    private void method4381(final int i) {
        this.dataManager.set(Class791.field4211, i);
    }
    
    public void method4382(final boolean b) {
        this.method4392(2, b);
        if (!b) {
            this.method4384(0);
        }
    }
    
    public int method4383() {
        return this.dataManager.get(Class791.field4210);
    }
    
    public void method4384(final int i) {
        this.dataManager.set(Class791.field4210, i);
    }
    
    public Class1965 method4385() {
        return Class1965.method7962(this.dataManager.get(Class791.field4212));
    }
    
    public void method4386(Class1965 method7964) {
        if (method7964.method7958() > 6) {
            method7964 = Class1965.method7964(this.rand);
        }
        this.dataManager.set(Class791.field4212, (byte)method7964.method7958());
    }
    
    public Class1965 method4387() {
        return Class1965.method7962(this.dataManager.get(Class791.field4213));
    }
    
    public void method4388(Class1965 method7964) {
        if (method7964.method7958() > 6) {
            method7964 = Class1965.method7964(this.rand);
        }
        this.dataManager.set(Class791.field4213, (byte)method7964.method7958());
    }
    
    public boolean method4389() {
        return this.method4391(4);
    }
    
    public void method4390(final boolean b) {
        this.method4392(4, b);
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.dataManager.register(Class791.field4209, 0);
        this.dataManager.register(Class791.field4210, 0);
        this.dataManager.register(Class791.field4212, (Byte)0);
        this.dataManager.register(Class791.field4213, (Byte)0);
        this.dataManager.register(Class791.field4214, (Byte)0);
        this.dataManager.register(Class791.field4211, 0);
    }
    
    private boolean method4391(final int n) {
        return (this.dataManager.get(Class791.field4214) & n) != 0x0;
    }
    
    private void method4392(final int n, final boolean b) {
        final byte byteValue = this.dataManager.get(Class791.field4214);
        if (!b) {
            this.dataManager.set(Class791.field4214, (byte)(byteValue & ~n));
        }
        else {
            this.dataManager.set(Class791.field4214, (byte)(byteValue | n));
        }
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        super.method1761(class51);
        class51.putString("MainGene", this.method4385().method7959());
        class51.putString("HiddenGene", this.method4387().method7959());
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        super.method1760(class51);
        this.method4386(Class1965.method7963(class51.getString("MainGene")));
        this.method4388(Class1965.method7963(class51.getString("HiddenGene")));
    }
    
    @Nullable
    @Override
    public Class788 method4349(final Class788 class788) {
        final Class791 class789 = EntityType.field29010.method23371(this.world);
        if (class788 instanceof Class791) {
            class789.method4409(this, (Class791)class788);
        }
        class789.method4411();
        return class789;
    }
    
    @Override
    public void method4142() {
        this.field4114.method22062(0, new Class3490(this));
        this.field4114.method22062(2, new Class3611(this, 2.0));
        this.field4114.method22062(2, new Class3589(this, this, 1.0));
        this.field4114.method22062(3, new Class3578(this, 1.2000000476837158, true));
        this.field4114.method22062(4, new Class3472(this, 1.0, Ingredient.method618(Blocks.BAMBOO.method11704()), false));
        this.field4114.method22062(6, new Class3450<Object>(this, PlayerEntity.class, 8.0f, 2.0, 2.0));
        this.field4114.method22062(6, new Class3450<Object>(this, Class763.class, 4.0f, 2.0, 2.0));
        this.field4114.method22062(7, new Class3524(this));
        this.field4114.method22062(8, new Class3541(this));
        this.field4114.method22062(8, new Class3613(this));
        this.field4226 = new Class3630(this, PlayerEntity.class, 6.0f);
        this.field4114.method22062(9, this.field4226);
        this.field4114.method22062(10, new Class3503(this));
        this.field4114.method22062(12, new Class3605(this));
        this.field4114.method22062(13, new Class3456(this, 1.25));
        this.field4114.method22062(14, new Class3517(this, 1.0));
        this.field4115.method22062(1, new Class3548(this, new Class[0]).method11100(new Class[0]));
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33408).method23941(0.15000000596046448);
        this.method2711().method20873(Class8107.field33410).method23941(6.0);
    }
    
    public Class1965 method4393() {
        return Class1965.method7966(this.method4385(), this.method4387());
    }
    
    public boolean method4394() {
        return this.method4393() == Class1965.field10724;
    }
    
    public boolean method4395() {
        return this.method4393() == Class1965.field10725;
    }
    
    public boolean method4396() {
        return this.method4393() == Class1965.field10726;
    }
    
    public boolean method4397() {
        return this.method4393() == Class1965.field10728;
    }
    
    @Override
    public boolean method4216() {
        return this.method4393() == Class1965.field10729;
    }
    
    @Override
    public boolean method4204(final PlayerEntity playerEntity) {
        return false;
    }
    
    @Override
    public boolean method2734(final Entity class399) {
        this.method1695(Class8520.field35419, 1.0f, 1.0f);
        if (!this.method4216()) {
            this.field4217 = true;
        }
        return super.method2734(class399);
    }
    
    @Override
    public void method1659() {
        super.method1659();
        if (this.method4395()) {
            if (this.world.method6770() && !this.method1706()) {
                this.method4375(true);
                this.method4379(false);
            }
            else if (!this.method4378()) {
                this.method4375(false);
            }
        }
        if (this.method4152() == null) {
            this.field4216 = false;
            this.field4217 = false;
        }
        if (this.method4371() > 0) {
            if (this.method4152() != null) {
                this.method4176(this.method4152(), 90.0f, 90.0f);
            }
            if (this.method4371() == 29 || this.method4371() == 14) {
                this.method1695(Class8520.field35415, 1.0f, 1.0f);
            }
            this.method4372(this.method4371() - 1);
        }
        if (this.method4373()) {
            this.method4384(this.method4383() + 1);
            if (this.method4383() <= 20) {
                if (this.method4383() == 1) {
                    this.method1695(Class8520.field35409, 1.0f, 1.0f);
                }
            }
            else {
                this.method4382(false);
                this.method4408();
            }
        }
        if (!this.method4389()) {
            this.field4218 = 0;
        }
        else {
            this.method4407();
        }
        if (this.method4374()) {
            this.rotationPitch = 0.0f;
        }
        this.method4401();
        this.method4399();
        this.method4402();
        this.method4403();
    }
    
    public boolean method4398() {
        return this.method4395() && this.world.method6770();
    }
    
    private void method4399() {
        Label_0101: {
            if (!this.method4378()) {
                if (this.method4374()) {
                    if (!this.method4398()) {
                        if (!this.method2718(Class2215.field13600).method27620()) {
                            if (this.rand.nextInt(80) == 1) {
                                this.method4379(true);
                                break Label_0101;
                            }
                        }
                    }
                }
            }
            if (this.method2718(Class2215.field13600).method27620() || !this.method4374()) {
                this.method4379(false);
            }
        }
        if (this.method4378()) {
            this.method4400();
            if (!this.world.isRemote) {
                if (this.method4380() > 80) {
                    if (this.rand.nextInt(20) == 1) {
                        if (this.method4380() > 100) {
                            if (this.method4413(this.method2718(Class2215.field13600))) {
                                if (!this.world.isRemote) {
                                    this.method1803(Class2215.field13600, ItemStack.EMPTY);
                                }
                                this.method4375(false);
                            }
                        }
                        this.method4379(false);
                        return;
                    }
                }
            }
            this.method4381(this.method4380() + 1);
        }
    }
    
    private void method4400() {
        if (this.method4380() % 5 == 0) {
            this.method1695(Class8520.field35413, 0.5f + 0.5f * this.rand.nextInt(2), (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f + 1.0f);
            for (int i = 0; i < 6; ++i) {
                final Vec3d method16755 = new Vec3d((this.rand.nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, (this.rand.nextFloat() - 0.5) * 0.1).rotatePitch(-this.rotationPitch * 0.017453292f).rotateYaw(-this.rotationYaw * 0.017453292f);
                final Vec3d method16756 = new Vec3d((this.rand.nextFloat() - 0.5) * 0.8, -this.rand.nextFloat() * 0.6 - 0.3, 1.0 + (this.rand.nextFloat() - 0.5) * 0.4).rotateYaw(-this.field2951 * 0.017453292f).add(this.getPosX(), this.method1944() + 1.0, this.getPosZ());
                this.world.addParticle(new Class6910(Class8432.field34629, this.method2718(Class2215.field13600)), method16756.x, method16756.y, method16756.z, method16755.x, method16755.y + 0.05, method16755.z);
            }
        }
    }
    
    private void method4401() {
        this.field4221 = this.field4220;
        if (!this.method4374()) {
            this.field4220 = Math.max(0.0f, this.field4220 - 0.19f);
        }
        else {
            this.field4220 = Math.min(1.0f, this.field4220 + 0.15f);
        }
    }
    
    private void method4402() {
        this.field4223 = this.field4222;
        if (!this.method4376()) {
            this.field4222 = Math.max(0.0f, this.field4222 - 0.19f);
        }
        else {
            this.field4222 = Math.min(1.0f, this.field4222 + 0.15f);
        }
    }
    
    private void method4403() {
        this.field4225 = this.field4224;
        if (!this.method4389()) {
            this.field4224 = Math.max(0.0f, this.field4224 - 0.19f);
        }
        else {
            this.field4224 = Math.min(1.0f, this.field4224 + 0.15f);
        }
    }
    
    public float method4404(final float n) {
        return MathHelper.method35700(n, this.field4221, this.field4220);
    }
    
    public float method4405(final float n) {
        return MathHelper.method35700(n, this.field4223, this.field4222);
    }
    
    public float method4406(final float n) {
        return MathHelper.method35700(n, this.field4225, this.field4224);
    }
    
    private void method4407() {
        ++this.field4218;
        if (this.field4218 <= 32) {
            if (!this.world.isRemote) {
                final Vec3d method1935 = this.getMotion();
                if (this.field4218 != 1) {
                    if (this.field4218 != 7.0f) {
                        if (this.field4218 != 15.0f) {
                            if (this.field4218 != 23.0f) {
                                this.setMotion(this.field4219.x, method1935.y, this.field4219.z);
                                return;
                            }
                        }
                    }
                    this.setMotion(0.0, this.onGround ? 0.27 : method1935.y, 0.0);
                }
                else {
                    final float n = this.rotationYaw * 0.017453292f;
                    final float n2 = this.method2625() ? 0.1f : 0.2f;
                    this.field4219 = new Vec3d(method1935.x + -MathHelper.sin(n) * n2, 0.0, method1935.z + MathHelper.cos(n) * n2);
                    this.method1936(this.field4219.add(0.0, 0.27, 0.0));
                }
            }
        }
        else {
            this.method4390(false);
        }
    }
    
    private void method4408() {
        final Vec3d method1935 = this.getMotion();
        this.world.addParticle(Class8432.field34640, this.getPosX() - (this.method1930() + 1.0f) * 0.5 * MathHelper.sin(this.field2951 * 0.017453292f), this.method1944() - 0.10000000149011612, this.getPosZ() + (this.method1930() + 1.0f) * 0.5 * MathHelper.cos(this.field2951 * 0.017453292f), method1935.x, 0.0, method1935.z);
        this.method1695(Class8520.field35410, 1.0f, 1.0f);
        for (final Class791 class791 : this.world.method7128((Class<? extends Class791>)Class791.class, this.getBoundingBox().intersect(10.0))) {
            if (class791.method2625()) {
                continue;
            }
            if (!class791.onGround) {
                continue;
            }
            if (class791.method1706()) {
                continue;
            }
            if (!class791.method4414()) {
                continue;
            }
            class791.method2725();
        }
        if (!this.world.isRemote()) {
            if (this.rand.nextInt(700) == 0) {
                if (this.world.method6765().method31216(Class8878.field37319)) {
                    this.method1764(Items.field31371);
                }
            }
        }
    }
    
    @Override
    public void method4165(final Class427 class427) {
        if (this.method2718(Class2215.field13600).method27620()) {
            if (Class791.field4227.test(class427)) {
                final ItemStack method2107 = class427.method2107();
                this.method1803(Class2215.field13600, method2107);
                this.field4119[Class2215.field13600.getIndex()] = 2.0f;
                this.method2746(class427, method2107.method27690());
                class427.method1652();
            }
        }
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource class7929, final float n) {
        this.method4375(false);
        return super.attackEntityFrom(class7929, n);
    }
    
    @Nullable
    @Override
    public ILivingEntityData method4188(final Class1851 class1851, final Class9592 class1852, final Class2101 class1853, ILivingEntityData class1854, final CompoundNBT class1855) {
        this.method4386(Class1965.method7964(this.rand));
        this.method4388(Class1965.method7964(this.rand));
        this.method4411();
        if (class1854 == null) {
            class1854 = new Class5497();
            ((Class5497)class1854).method16803(0.2f);
        }
        return super.method4188(class1851, class1852, class1853, class1854, class1855);
    }
    
    public void method4409(final Class791 class791, final Class791 class792) {
        if (class792 != null) {
            if (!this.rand.nextBoolean()) {
                this.method4386(class792.method4410());
                this.method4388(class791.method4410());
            }
            else {
                this.method4386(class791.method4410());
                this.method4388(class792.method4410());
            }
        }
        else if (!this.rand.nextBoolean()) {
            this.method4386(Class1965.method7964(this.rand));
            this.method4388(class791.method4410());
        }
        else {
            this.method4386(class791.method4410());
            this.method4388(Class1965.method7964(this.rand));
        }
        if (this.rand.nextInt(32) == 0) {
            this.method4386(Class1965.method7964(this.rand));
        }
        if (this.rand.nextInt(32) == 0) {
            this.method4388(Class1965.method7964(this.rand));
        }
    }
    
    private Class1965 method4410() {
        return this.rand.nextBoolean() ? this.method4385() : this.method4387();
    }
    
    public void method4411() {
        if (this.method4397()) {
            this.method2710(Class8107.field33405).method23941(10.0);
        }
        if (this.method4394()) {
            this.method2710(Class8107.field33408).method23941(0.07000000029802322);
        }
    }
    
    private void method4412() {
        if (!this.method1706()) {
            this.method4162(0.0f);
            this.method4150().method24733();
            this.method4375(true);
        }
    }
    
    @Override
    public boolean method4195(final PlayerEntity playerEntity, final Class316 class513) {
        final ItemStack method2715 = playerEntity.method2715(class513);
        if (method2715.getItem() instanceof Class3831) {
            return super.method4195(playerEntity, class513);
        }
        if (this.method4398()) {
            return false;
        }
        if (this.method4376()) {
            this.method4377(false);
            return true;
        }
        if (!this.method4357(method2715)) {
            return false;
        }
        if (this.method4152() != null) {
            this.field4216 = true;
        }
        Label_0281: {
            if (!this.method2625()) {
                if (!this.world.isRemote) {
                    if (this.method4351() == 0) {
                        if (this.method4359()) {
                            this.method4358(playerEntity, method2715);
                            this.method4360(playerEntity);
                            break Label_0281;
                        }
                    }
                }
                if (!this.world.isRemote) {
                    if (!this.method4374()) {
                        if (!this.method1706()) {
                            this.method4412();
                            this.method4379(true);
                            final ItemStack method2716 = this.method2718(Class2215.field13600);
                            if (!method2716.method27620()) {
                                if (!playerEntity.field3025.field27304) {
                                    this.method1766(method2716);
                                }
                            }
                            this.method1803(Class2215.field13600, new ItemStack(method2715.getItem(), 1));
                            this.method4358(playerEntity, method2715);
                            break Label_0281;
                        }
                    }
                }
                return false;
            }
            this.method4358(playerEntity, method2715);
            this.method4352((int)(-this.method4351() / 20 * 0.1f), true);
        }
        playerEntity.method2708(class513, true);
        return true;
    }
    
    @Nullable
    @Override
    public Class7795 method4160() {
        if (!this.method4216()) {
            return this.method4395() ? Class8520.field35417 : Class8520.field35411;
        }
        return Class8520.field35416;
    }
    
    @Override
    public void method1691(final BlockPos class354, final BlockState class355) {
        this.method1695(Class8520.field35414, 0.15f, 1.0f);
    }
    
    @Override
    public boolean method4357(final ItemStack class8321) {
        return class8321.getItem() == Blocks.BAMBOO.method11704();
    }
    
    private boolean method4413(final ItemStack class8321) {
        return this.method4357(class8321) || class8321.getItem() == Blocks.field29344.method11704();
    }
    
    @Nullable
    @Override
    public Class7795 method2684() {
        return Class8520.field35412;
    }
    
    @Nullable
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return Class8520.field35418;
    }
    
    public boolean method4414() {
        if (!this.method4376()) {
            if (!this.method4398()) {
                if (!this.method4378()) {
                    if (!this.method4389()) {
                        return !this.method4374();
                    }
                }
            }
        }
        return false;
    }
    
    static {
        field4209 = EntityDataManager.method33564(Class791.class, Class7709.field30654);
        field4210 = EntityDataManager.method33564(Class791.class, Class7709.field30654);
        field4211 = EntityDataManager.method33564(Class791.class, Class7709.field30654);
        field4212 = EntityDataManager.method33564(Class791.class, Class7709.field30653);
        field4213 = EntityDataManager.method33564(Class791.class, Class7709.field30653);
        field4214 = EntityDataManager.method33564(Class791.class, Class7709.field30653);
        field4215 = new Class7843().method25337(8.0).method25339().method25338();
        field4227 = (class427 -> {
            class427.method2107().getItem();
            final Item class428;
            final boolean b;
            if (class428 == Blocks.BAMBOO.method11704() || class428 == Blocks.field29344.method11704()) {
                if (class427.isAlive()) {
                    if (!class427.method2118()) {
                        return b;
                    }
                }
            }
            return b;
        });
    }
}
