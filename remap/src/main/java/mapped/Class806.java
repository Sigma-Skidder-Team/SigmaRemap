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

import java.util.Iterator;
import javax.annotation.Nullable;
import java.util.UUID;
import java.util.Optional;
import java.util.function.Predicate;

public abstract class Class806 extends Class789 implements Class807, Class810
{
    private static final Predicate<LivingEntity> field4331;
    private static final Class7843 field4332;
    public static final Class8725 field4333;
    private static final DataParameter<Byte> field4334;
    private static final DataParameter<Optional<UUID>> field4335;
    private int field4336;
    private int field4337;
    private int field4338;
    public int field4339;
    public int field4340;
    public boolean field4341;
    public Class443 field4342;
    public int field4343;
    public float field4344;
    private boolean field4345;
    private float field4346;
    private float field4347;
    private float field4348;
    private float field4349;
    private float field4350;
    private float field4351;
    public boolean field4352;
    public int field4353;
    
    public Class806(final EntityType<? extends Class806> class7499, final World class7500) {
        super(class7499, class7500);
        this.field4352 = true;
        this.stepHeight = 1.0f;
        this.method4731();
    }
    
    @Override
    public void method4142() {
        this.field4114.method22062(1, new Class3607(this, 1.2));
        this.field4114.method22062(1, new Class3625(this, 1.2));
        this.field4114.method22062(2, new Class3587(this, 1.0, Class806.class));
        this.field4114.method22062(4, new Class3456(this, 1.0));
        this.field4114.method22062(6, new Class3517(this, 0.7));
        this.field4114.method22062(7, new Class3628(this, PlayerEntity.class, 6.0f));
        this.field4114.method22062(8, new Class3503(this));
        this.method4712();
    }
    
    public void method4712() {
        this.field4114.method22062(0, new Class3490(this));
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.dataManager.register(Class806.field4334, (Byte)0);
        this.dataManager.register(Class806.field4335, Optional.empty());
    }
    
    public boolean method4713(final int n) {
        return (this.dataManager.get(Class806.field4334) & n) != 0x0;
    }
    
    public void method4714(final int n, final boolean b) {
        final byte byteValue = this.dataManager.get(Class806.field4334);
        if (!b) {
            this.dataManager.set(Class806.field4334, (byte)(byteValue & ~n));
        }
        else {
            this.dataManager.set(Class806.field4334, (byte)(byteValue | n));
        }
    }
    
    public boolean method4715() {
        return this.method4713(2);
    }
    
    @Nullable
    public UUID method4716() {
        return this.dataManager.get(Class806.field4335).orElse(null);
    }
    
    public void method4717(final UUID value) {
        this.dataManager.set(Class806.field4335, Optional.ofNullable(value));
    }
    
    public boolean method4718() {
        return this.field4341;
    }
    
    public void method4719(final boolean b) {
        this.method4714(2, b);
    }
    
    public void method4720(final boolean field4341) {
        this.field4341 = field4341;
    }
    
    @Override
    public boolean method4204(final PlayerEntity playerEntity) {
        return super.method4204(playerEntity) && this.method2712() != Class6363.field25461;
    }
    
    @Override
    public void method4348(final float n) {
        if (n > 6.0f) {
            if (this.method4721()) {
                this.method4747(false);
            }
        }
    }
    
    public boolean method4721() {
        return this.method4713(16);
    }
    
    public boolean method4722() {
        return this.method4713(32);
    }
    
    public boolean method4723() {
        return this.method4713(8);
    }
    
    public void method4724(final boolean b) {
        this.method4714(8, b);
    }
    
    public void method4725(final boolean b) {
        this.method4714(4, b);
    }
    
    public int method4726() {
        return this.field4343;
    }
    
    public void method4727(final int field4343) {
        this.field4343 = field4343;
    }
    
    public int method4728(final int n) {
        final int method35651 = MathHelper.method35651(this.method4726() + n, 0, this.method4739());
        this.method4727(method35651);
        return method35651;
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource class7929, final float n) {
        final Entity method25714 = class7929.method25714();
        if (this.isBeingRidden()) {
            if (method25714 != null) {
                if (this.method1917(method25714)) {
                    return false;
                }
            }
        }
        return super.attackEntityFrom(class7929, n);
    }
    
    @Override
    public boolean method1750() {
        return !this.isBeingRidden();
    }
    
    private void method4729() {
        this.method4746();
        if (!this.method1696()) {
            this.world.method6706(null, this.getPosX(), this.getPosY(), this.getPosZ(), Class8520.field35277, this.method1922(), 1.0f, 1.0f + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f);
        }
    }
    
    @Override
    public boolean method1705(final float n, final float n2) {
        if (n > 1.0f) {
            this.method1695(Class8520.field35281, 0.4f, 1.0f);
        }
        final int method2691 = this.method2691(n, n2);
        if (method2691 > 0) {
            this.attackEntityFrom(DamageSource.field32572, (float)method2691);
            if (this.isBeingRidden()) {
                final Iterator<Entity> iterator = this.method1911().iterator();
                while (iterator.hasNext()) {
                    iterator.next().attackEntityFrom(DamageSource.field32572, (float)method2691);
                }
            }
            this.method2692();
            return true;
        }
        return false;
    }
    
    @Override
    public int method2691(final float n, final float n2) {
        return MathHelper.ceil((n * 0.5f - 3.0f) * n2);
    }
    
    public int method4730() {
        return 2;
    }
    
    public void method4731() {
        final Class443 field4342 = this.field4342;
        this.field4342 = new Class443(this.method4730());
        if (field4342 != null) {
            field4342.method2256(this);
            for (int min = Math.min(field4342.method2239(), this.field4342.method2239()), i = 0; i < min; ++i) {
                final ItemStack method2157 = field4342.method2157(i);
                if (!method2157.method27620()) {
                    this.field4342.method2160(i, method2157.method27641());
                }
            }
        }
        this.field4342.method2255(this);
        this.method4732();
    }
    
    public void method4732() {
        if (!this.world.isRemote) {
            this.method4725(!this.field4342.method2157(0).method27620() && this.method4735());
        }
    }
    
    @Override
    public void method4733(final Class446 class446) {
        final boolean method4736 = this.method4736();
        this.method4732();
        if (this.ticksExisted > 20) {
            if (!method4736) {
                if (this.method4736()) {
                    this.method1695(Class8520.field35282, 0.5f, 1.0f);
                }
            }
        }
    }
    
    public double method4734() {
        return this.method2710(Class806.field4333).method23950();
    }
    
    @Nullable
    @Override
    public Class7795 method2684() {
        return null;
    }
    
    @Nullable
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        if (this.rand.nextInt(3) == 0) {
            this.method4749();
        }
        return null;
    }
    
    @Nullable
    @Override
    public Class7795 method4160() {
        if (this.rand.nextInt(10) == 0) {
            if (!this.method2722()) {
                this.method4749();
            }
        }
        return null;
    }
    
    public boolean method4735() {
        return true;
    }
    
    public boolean method4736() {
        return this.method4713(4);
    }
    
    @Nullable
    public Class7795 method4737() {
        this.method4749();
        return null;
    }
    
    @Override
    public void method1691(final BlockPos class354, final BlockState class355) {
        if (!class355.getMaterial().method26438()) {
            final BlockState method6701 = this.world.getBlockState(class354.method1137());
            SoundType class356 = class355.getSoundType();
            if (method6701.getBlock() == Class7521.field29329) {
                class356 = method6701.getSoundType();
            }
            if (this.isBeingRidden() && this.field4352) {
                ++this.field4353;
                if (this.field4353 > 5 && this.field4353 % 3 == 0) {
                    this.method4738(class356);
                }
                else if (this.field4353 <= 5) {
                    this.method1695(Class8520.field35284, class356.method24477() * 0.15f, class356.method24478());
                }
            }
            else if (class356 != SoundType.field30567) {
                this.method1695(Class8520.field35283, class356.method24477() * 0.15f, class356.method24478());
            }
            else {
                this.method1695(Class8520.field35284, class356.method24477() * 0.15f, class356.method24478());
            }
        }
    }
    
    public void method4738(final SoundType class7696) {
        this.method1695(Class8520.field35278, class7696.method24477() * 0.15f, class7696.method24478());
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2711().method20873(Class806.field4333);
        this.method2710(Class8107.field33405).method23941(53.0);
        this.method2710(Class8107.field33408).method23941(0.22499999403953552);
    }
    
    @Override
    public int method4181() {
        return 6;
    }
    
    public int method4739() {
        return 100;
    }
    
    @Override
    public float method2720() {
        return 0.8f;
    }
    
    @Override
    public int method4155() {
        return 400;
    }
    
    public void method4740(final PlayerEntity playerEntity) {
        if (!this.world.isRemote) {
            if (!this.isBeingRidden() || this.method1909(playerEntity)) {
                if (this.method4715()) {
                    playerEntity.method2832(this, this.field4342);
                }
            }
        }
    }
    
    public boolean method4741(final PlayerEntity playerEntity, final ItemStack class513) {
        boolean b = false;
        float n = 0.0f;
        int n2 = 0;
        int n3 = 0;
        final Item method27622 = class513.getItem();
        if (method27622 != Items.field31315) {
            if (method27622 != Items.field31406) {
                if (method27622 != Class7521.field29529.method11704()) {
                    if (method27622 != Items.field31278) {
                        if (method27622 != Items.field31522) {
                            if (method27622 == Items.field31341 || method27622 == Items.field31342) {
                                n = 10.0f;
                                n2 = 240;
                                n3 = 10;
                                if (this.method4715()) {
                                    if (this.method4351() == 0) {
                                        if (!this.method4363()) {
                                            b = true;
                                            this.method4360(playerEntity);
                                        }
                                    }
                                }
                            }
                        }
                        else {
                            n = 4.0f;
                            n2 = 60;
                            n3 = 5;
                            if (this.method4715()) {
                                if (this.method4351() == 0) {
                                    if (!this.method4363()) {
                                        b = true;
                                        this.method4360(playerEntity);
                                    }
                                }
                            }
                        }
                    }
                    else {
                        n = 3.0f;
                        n2 = 60;
                        n3 = 3;
                    }
                }
                else {
                    n = 20.0f;
                    n2 = 180;
                }
            }
            else {
                n = 1.0f;
                n2 = 30;
                n3 = 3;
            }
        }
        else {
            n = 2.0f;
            n2 = 20;
            n3 = 3;
        }
        if (this.method2664() < this.method2701()) {
            if (n > 0.0f) {
                this.method2663(n);
                b = true;
            }
        }
        if (this.method2625()) {
            if (n2 > 0) {
                this.world.method6709(Class8432.field34625, this.method1940(1.0), this.method1943() + 0.5, this.method1947(1.0), 0.0, 0.0, 0.0);
                if (!this.world.isRemote) {
                    this.method4353(n2);
                }
                b = true;
            }
        }
        if (n3 > 0) {
            if (b || !this.method4715()) {
                if (this.method4726() < this.method4739()) {
                    b = true;
                    if (!this.world.isRemote) {
                        this.method4728(n3);
                    }
                }
            }
        }
        if (b) {
            this.method4729();
        }
        return b;
    }
    
    public void method4742(final PlayerEntity playerEntity) {
        this.method4747(false);
        this.method4748(false);
        if (!this.world.isRemote) {
            playerEntity.rotationYaw = this.rotationYaw;
            playerEntity.rotationPitch = this.rotationPitch;
            playerEntity.method1778(this);
        }
    }
    
    @Override
    public boolean method2722() {
        if (super.method2722()) {
            if (this.isBeingRidden()) {
                if (this.method4736()) {
                    return true;
                }
            }
        }
        if (!this.method4721()) {
            if (!this.method4722()) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public boolean method4357(final ItemStack class8321) {
        return false;
    }
    
    private void method4743() {
        this.field4339 = 1;
    }
    
    @Override
    public void method2676() {
        super.method2676();
        if (this.field4342 != null) {
            for (int i = 0; i < this.field4342.method2239(); ++i) {
                final ItemStack method2157 = this.field4342.method2157(i);
                if (!method2157.method27620()) {
                    if (!Class8742.method30218(method2157)) {
                        this.method1766(method2157);
                    }
                }
            }
        }
    }
    
    @Override
    public void method2736() {
        if (this.rand.nextInt(200) == 0) {
            this.method4743();
        }
        super.method2736();
        if (!this.world.isRemote) {
            if (this.method1768()) {
                if (this.rand.nextInt(900) == 0) {
                    if (this.field2941 == 0) {
                        this.method2663(1.0f);
                    }
                }
                if (this.method4745()) {
                    if (!this.method4721()) {
                        if (!this.isBeingRidden()) {
                            if (this.rand.nextInt(300) == 0) {
                                if (this.world.getBlockState(new BlockPos(this).method1139()).method21696() == Class7521.field29155) {
                                    this.method4747(true);
                                }
                            }
                        }
                    }
                    if (this.method4721()) {
                        if (++this.field4336 > 50) {
                            this.field4336 = 0;
                            this.method4747(false);
                        }
                    }
                }
                this.method4744();
            }
        }
    }
    
    public void method4744() {
        if (this.method4723()) {
            if (this.method2625()) {
                if (!this.method4721()) {
                    final LivingEntity method7138 = this.world.method7138((Class<? extends LivingEntity>)Class806.class, Class806.field4332, (LivingEntity)this, this.getPosX(), this.getPosY(), this.getPosZ(), this.getBoundingBox().intersect(16.0));
                    if (method7138 != null) {
                        if (this.method1734(method7138) > 4.0) {
                            this.field4113.method24722(method7138, 0);
                        }
                    }
                }
            }
        }
    }
    
    public boolean method4745() {
        return true;
    }
    
    @Override
    public void method1659() {
        super.method1659();
        if (this.field4337 > 0) {
            if (++this.field4337 > 30) {
                this.field4337 = 0;
                this.method4714(64, false);
            }
        }
        if (this.method1919() || this.method2749()) {
            if (this.field4338 > 0) {
                if (++this.field4338 > 20) {
                    this.field4338 = 0;
                    this.method4748(false);
                }
            }
        }
        if (this.field4339 > 0) {
            if (++this.field4339 > 8) {
                this.field4339 = 0;
            }
        }
        if (this.field4340 > 0) {
            ++this.field4340;
            if (this.field4340 > 300) {
                this.field4340 = 0;
            }
        }
        this.field4347 = this.field4346;
        if (!this.method4721()) {
            this.field4346 += (0.0f - this.field4346) * 0.4f - 0.05f;
            if (this.field4346 < 0.0f) {
                this.field4346 = 0.0f;
            }
        }
        else {
            this.field4346 += (1.0f - this.field4346) * 0.4f + 0.05f;
            if (this.field4346 > 1.0f) {
                this.field4346 = 1.0f;
            }
        }
        this.field4349 = this.field4348;
        if (!this.method4722()) {
            this.field4345 = false;
            this.field4348 += (0.8f * this.field4348 * this.field4348 * this.field4348 - this.field4348) * 0.6f - 0.05f;
            if (this.field4348 < 0.0f) {
                this.field4348 = 0.0f;
            }
        }
        else {
            this.field4346 = 0.0f;
            this.field4347 = this.field4346;
            this.field4348 += (1.0f - this.field4348) * 0.4f + 0.05f;
            if (this.field4348 > 1.0f) {
                this.field4348 = 1.0f;
            }
        }
        this.field4351 = this.field4350;
        if (!this.method4713(64)) {
            this.field4350 += (0.0f - this.field4350) * 0.7f - 0.05f;
            if (this.field4350 < 0.0f) {
                this.field4350 = 0.0f;
            }
        }
        else {
            this.field4350 += (1.0f - this.field4350) * 0.7f + 0.05f;
            if (this.field4350 > 1.0f) {
                this.field4350 = 1.0f;
            }
        }
    }
    
    private void method4746() {
        if (!this.world.isRemote) {
            this.field4337 = 1;
            this.method4714(64, true);
        }
    }
    
    public void method4747(final boolean b) {
        this.method4714(16, b);
    }
    
    public void method4748(final boolean b) {
        if (b) {
            this.method4747(false);
        }
        this.method4714(32, b);
    }
    
    private void method4749() {
        if (this.method1919() || this.method2749()) {
            this.field4338 = 1;
            this.method4748(true);
        }
    }
    
    public void method4750() {
        this.method4749();
        final Class7795 method4737 = this.method4737();
        if (method4737 != null) {
            this.method1695(method4737, this.method2720(), this.method2721());
        }
    }
    
    public boolean method4751(final PlayerEntity playerEntity) {
        this.method4717(playerEntity.method1865());
        this.method4719(true);
        if (playerEntity instanceof Class513) {
            Class7770.field31798.method13773((Class513) playerEntity, this);
        }
        this.world.method6761(this, (byte)7);
        return true;
    }
    
    @Override
    public void method2729(final Vec3d class5487) {
        if (this.method1768()) {
            if (this.isBeingRidden()) {
                if (this.method4189()) {
                    if (this.method4736()) {
                        final LivingEntity class5488 = (LivingEntity)this.method1907();
                        this.rotationYaw = class5488.rotationYaw;
                        this.prevRotationYaw = this.rotationYaw;
                        this.rotationPitch = class5488.rotationPitch * 0.5f;
                        this.method1655(this.rotationYaw, this.rotationPitch);
                        this.field2951 = this.rotationYaw;
                        this.field2953 = this.field2951;
                        float n = class5488.field2968 * 0.5f;
                        float field2970 = class5488.field2970;
                        if (field2970 <= 0.0f) {
                            field2970 *= 0.25f;
                            this.field4353 = 0;
                        }
                        if (this.onGround) {
                            if (this.field4344 == 0.0f) {
                                if (this.method4722()) {
                                    if (!this.field4345) {
                                        n = 0.0f;
                                        field2970 = 0.0f;
                                    }
                                }
                            }
                        }
                        if (this.field4344 > 0.0f) {
                            if (!this.method4718()) {
                                if (this.onGround) {
                                    final double n2 = this.method4734() * this.field4344 * this.method1673();
                                    double n3;
                                    if (!this.method2653(Class9439.field40481)) {
                                        n3 = n2;
                                    }
                                    else {
                                        n3 = n2 + (this.method2654(Class9439.field40481).method7908() + 1) * 0.1f;
                                    }
                                    final Vec3d method1935 = this.getMotion();
                                    this.setMotion(method1935.x, n3, method1935.z);
                                    this.method4720(true);
                                    this.isAirBorne = true;
                                    if (field2970 > 0.0f) {
                                        this.method1936(this.getMotion().add(-0.4f * MathHelper.sin(this.rotationYaw * 0.017453292f) * this.field4344, 0.0, 0.4f * MathHelper.cos(this.rotationYaw * 0.017453292f) * this.field4344));
                                        this.method4752();
                                    }
                                    this.field4344 = 0.0f;
                                }
                            }
                        }
                        this.field2955 = this.method2732() * 0.1f;
                        if (!this.method1919()) {
                            if (class5488 instanceof PlayerEntity) {
                                this.method1936(Vec3d.ZERO);
                            }
                        }
                        else {
                            this.method2733((float)this.method2710(Class8107.field33408).method23950());
                            super.method2729(new Vec3d(n, class5487.y, field2970));
                        }
                        if (this.onGround) {
                            this.field4344 = 0.0f;
                            this.method4720(false);
                        }
                        this.field2945 = this.field2946;
                        final double n4 = this.getPosX() - this.prevPosX;
                        final double n5 = this.getPosZ() - this.prevPosZ;
                        float n6 = MathHelper.sqrt(n4 * n4 + n5 * n5) * 4.0f;
                        if (n6 > 1.0f) {
                            n6 = 1.0f;
                        }
                        this.field2946 += (n6 - this.field2946) * 0.4f;
                        this.field2947 += this.field2946;
                        return;
                    }
                }
            }
            this.field2955 = 0.02f;
            super.method2729(class5487);
        }
    }
    
    public void method4752() {
        this.method1695(Class8520.field35280, 0.4f, 1.0f);
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        super.method1761(class51);
        class51.putBoolean("EatingHaystack", this.method4721());
        class51.putBoolean("Bred", this.method4723());
        class51.putInt("Temper", this.method4726());
        class51.putBoolean("Tame", this.method4715());
        if (this.method4716() != null) {
            class51.putString("OwnerUUID", this.method4716().toString());
        }
        if (!this.field4342.method2157(0).method27620()) {
            class51.put("SaddleItem", this.field4342.method2157(0).method27627(new CompoundNBT()));
        }
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        super.method1760(class51);
        this.method4747(class51.getBoolean("EatingHaystack"));
        this.method4724(class51.getBoolean("Bred"));
        this.method4727(class51.getInt("Temper"));
        this.method4719(class51.getBoolean("Tame"));
        String name;
        if (!class51.contains("OwnerUUID", 8)) {
            name = Class7450.method22924(this.method1897(), class51.getString("Owner"));
        }
        else {
            name = class51.getString("OwnerUUID");
        }
        if (!name.isEmpty()) {
            this.method4717(UUID.fromString(name));
        }
        final Class7619 method20878 = this.method2711().method20878("Speed");
        if (method20878 != null) {
            this.method2710(Class8107.field33408).method23941(method20878.method23940() * 0.25);
        }
        if (class51.contains("SaddleItem", 10)) {
            final ItemStack method20879 = ItemStack.method27619(class51.getCompound("SaddleItem"));
            if (method20879.getItem() == Items.field31353) {
                this.field4342.method2160(0, method20879);
            }
        }
        this.method4732();
    }
    
    @Override
    public boolean method4365(final Class789 class789) {
        return false;
    }
    
    public boolean method4753() {
        if (!this.isBeingRidden()) {
            if (!this.isPassenger()) {
                if (this.method4715()) {
                    if (!this.method2625()) {
                        if (this.method2664() >= this.method2701()) {
                            if (this.method4363()) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Nullable
    @Override
    public Class788 method4349(final Class788 class788) {
        return null;
    }
    
    public void method4754(final Class788 class788, final Class806 class789) {
        class789.method2710(Class8107.field33405).method23941((this.method2710(Class8107.field33405).method23940() + class788.method2710(Class8107.field33405).method23940() + this.method4763()) / 3.0);
        class789.method2710(Class806.field4333).method23941((this.method2710(Class806.field4333).method23940() + class788.method2710(Class806.field4333).method23940() + this.method4764()) / 3.0);
        class789.method2710(Class8107.field33408).method23941((this.method2710(Class8107.field33408).method23940() + class788.method2710(Class8107.field33408).method23940() + this.method4765()) / 3.0);
    }
    
    @Override
    public boolean method4189() {
        return this.method1907() instanceof LivingEntity;
    }
    
    public float method4755(final float n) {
        return MathHelper.method35700(n, this.field4347, this.field4346);
    }
    
    public float method4756(final float n) {
        return MathHelper.method35700(n, this.field4349, this.field4348);
    }
    
    public float method4757(final float n) {
        return MathHelper.method35700(n, this.field4351, this.field4350);
    }
    
    @Override
    public void method4758(int n) {
        if (this.method4736()) {
            if (n >= 0) {
                this.field4345 = true;
                this.method4749();
            }
            else {
                n = 0;
            }
            if (n < 90) {
                this.field4344 = 0.4f + 0.4f * n / 90.0f;
            }
            else {
                this.field4344 = 1.0f;
            }
        }
    }
    
    @Override
    public boolean method4759() {
        return this.method4736();
    }
    
    @Override
    public void method4760(final int n) {
        this.field4345 = true;
        this.method4749();
    }
    
    @Override
    public void method4761() {
    }
    
    public void method4762(final boolean b) {
        final Class6908 class6908 = b ? Class8432.field34627 : Class8432.field34639;
        for (int i = 0; i < 7; ++i) {
            this.world.method6709(class6908, this.method1940(1.0), this.method1943() + 0.5, this.method1947(1.0), this.rand.nextGaussian() * 0.02, this.rand.nextGaussian() * 0.02, this.rand.nextGaussian() * 0.02);
        }
    }
    
    @Override
    public void method1798(final byte b) {
        if (b != 7) {
            if (b != 6) {
                super.method1798(b);
            }
            else {
                this.method4762(false);
            }
        }
        else {
            this.method4762(true);
        }
    }
    
    @Override
    public void method1773(final Entity class399) {
        super.method1773(class399);
        if (class399 instanceof Class759) {
            this.field2951 = ((Class759)class399).field2951;
        }
        if (this.field4349 > 0.0f) {
            final float method35638 = MathHelper.sin(this.field2951 * 0.017453292f);
            final float method35639 = MathHelper.cos(this.field2951 * 0.017453292f);
            final float n = 0.7f * this.field4349;
            class399.setPosition(this.getPosX() + n * method35638, this.getPosY() + this.method1777() + class399.method1776() + 0.15f * this.field4349, this.getPosZ() - n * method35639);
            if (class399 instanceof LivingEntity) {
                ((LivingEntity)class399).field2951 = this.field2951;
            }
        }
    }
    
    public float method4763() {
        return 15.0f + this.rand.nextInt(8) + this.rand.nextInt(9);
    }
    
    public double method4764() {
        return 0.4000000059604645 + this.rand.nextDouble() * 0.2 + this.rand.nextDouble() * 0.2 + this.rand.nextDouble() * 0.2;
    }
    
    public double method4765() {
        return (0.44999998807907104 + this.rand.nextDouble() * 0.3 + this.rand.nextDouble() * 0.3 + this.rand.nextDouble() * 0.3) * 0.25;
    }
    
    @Override
    public boolean method2688() {
        return false;
    }
    
    @Override
    public float method2789(final Pose class290, final EntitySize class291) {
        return class291.field34098 * 0.95f;
    }
    
    public boolean method4766() {
        return false;
    }
    
    public boolean method4767(final ItemStack class8321) {
        return false;
    }
    
    @Override
    public boolean method1893(final int n, final ItemStack class8321) {
        final int n2 = n - 400;
        if (n2 >= 0) {
            if (n2 < 2) {
                if (n2 < this.field4342.method2239()) {
                    if (n2 == 0 && class8321.getItem() != Items.field31353) {
                        return false;
                    }
                    if (n2 == 1 && (this.method4766() && this.method4767(class8321))) {
                        return false;
                    }
                    this.field4342.method2160(n2, class8321);
                    this.method4732();
                    return true;
                }
            }
        }
        final int n3 = n - 500 + 2;
        if (n3 >= 2 && n3 < this.field4342.method2239()) {
            this.field4342.method2160(n3, class8321);
            return true;
        }
        return false;
    }
    
    @Nullable
    @Override
    public Entity method1907() {
        return this.method1908().isEmpty() ? null : this.method1908().get(0);
    }
    
    @Nullable
    @Override
    public Class5496 method4188(final Class1851 class1851, final Class9592 class1852, final Class2101 class1853, Class5496 class1854, final CompoundNBT class1855) {
        if (class1854 == null) {
            class1854 = new Class5497();
            ((Class5497)class1854).method16803(0.2f);
        }
        return super.method4188(class1851, class1852, class1853, class1854, class1855);
    }
    
    static {
        field4331 = (class511 -> class511 instanceof Class806 && ((Class806)class511).method4723());
        field4332 = new Class7843().method25337(16.0).method25338().method25339().method25340().method25343(Class806.field4331);
        field4333 = new Class8723(null, "horse.jumpStrength", 0.7, 0.0, 2.0).method29975("Jump Strength").method29981(true);
        field4334 = EntityDataManager.method33564(Class806.class, Class7709.field30653);
        field4335 = EntityDataManager.method33564(Class806.class, Class7709.field30667);
    }
}
