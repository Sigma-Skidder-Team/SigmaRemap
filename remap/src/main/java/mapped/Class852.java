// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import javax.annotation.Nullable;
import java.util.List;

import org.apache.logging.log4j.Logger;

public class Class852 extends Class759 implements Class762
{
    private static final Logger field2379;
    public static final DataParameter<Integer> field4530;
    private static final Class7843 field4531;
    public final double[][] field4532;
    public int field4533;
    private final Class859[] field4534;
    public final Class859 field4535;
    private final Class859 field4536;
    private final Class859 field4537;
    private final Class859 field4538;
    private final Class859 field4539;
    private final Class859 field4540;
    private final Class859 field4541;
    private final Class859 field4542;
    public float field4543;
    public float field4544;
    public boolean field4545;
    public int field4546;
    public float field4547;
    public Class858 field4548;
    private final Class8619 field4549;
    private final Class9215 field4550;
    private int field4551;
    private int field4552;
    private final Class6772[] field4553;
    private final int[] field4554;
    private final Class8380 field4555;
    
    public Class852(final EntityType<? extends Class852> class7499, final World class7500) {
        super(EntityType.field28976, class7500);
        this.field4532 = new double[64][3];
        this.field4533 = -1;
        this.field4551 = 100;
        this.field4553 = new Class6772[24];
        this.field4554 = new int[24];
        this.field4555 = new Class8380();
        this.field4535 = new Class859(this, "head", 1.0f, 1.0f);
        this.field4536 = new Class859(this, "neck", 3.0f, 3.0f);
        this.field4537 = new Class859(this, "body", 5.0f, 3.0f);
        this.field4538 = new Class859(this, "tail", 2.0f, 2.0f);
        this.field4539 = new Class859(this, "tail", 2.0f, 2.0f);
        this.field4540 = new Class859(this, "tail", 2.0f, 2.0f);
        this.field4541 = new Class859(this, "wing", 4.0f, 2.0f);
        this.field4542 = new Class859(this, "wing", 4.0f, 2.0f);
        this.field4534 = new Class859[] { this.field4535, this.field4536, this.field4537, this.field4538, this.field4539, this.field4540, this.field4541, this.field4542 };
        this.method2665(this.method2701());
        this.noClip = true;
        this.ignoreFrustumCheck = true;
        if (!class7500.isRemote && class7500.dimension instanceof Class6738) {
            this.field4549 = ((Class6738)class7500.dimension).method20509();
        }
        else {
            this.field4549 = null;
        }
        this.field4550 = new Class9215(this);
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33405).method23941(200.0);
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.method1650().register(Class852.field4530, Class7193.field27958.method22077());
    }
    
    public double[] method5108(final int n, float n2) {
        if (this.method2664() <= 0.0f) {
            n2 = 0.0f;
        }
        n2 = 1.0f - n2;
        final int n3 = this.field4533 - n & 0x3F;
        final int n4 = this.field4533 - n - 1 & 0x3F;
        final double[] array = new double[3];
        final double n5 = this.field4532[n3][0];
        array[0] = n5 + MathHelper.method35669(this.field4532[n4][0] - n5) * n2;
        final double n6 = this.field4532[n3][1];
        array[1] = n6 + (this.field4532[n4][1] - n6) * n2;
        array[2] = MathHelper.lerp(n2, this.field4532[n3][2], this.field4532[n4][2]);
        return array;
    }
    
    @Override
    public void method2736() {
        if (this.world.isRemote) {
            this.method2665(this.method2664());
            if (!this.method1696()) {
                final float method35639 = MathHelper.cos(this.field4544 * 6.2831855f);
                if (MathHelper.cos(this.field4543 * 6.2831855f) <= -0.3f) {
                    if (method35639 >= -0.3f) {
                        this.world.method6708(this.getPosX(), this.getPosY(), this.getPosZ(), Class8520.field35156, this.method1922(), 5.0f, 0.8f + this.rand.nextFloat() * 0.3f, false);
                    }
                }
                if (!this.field4550.method33697().method17245()) {
                    if (--this.field4551 < 0) {
                        this.world.method6708(this.getPosX(), this.getPosY(), this.getPosZ(), Class8520.field35157, this.method1922(), 2.5f, 0.8f + this.rand.nextFloat() * 0.3f, false);
                        this.field4551 = 200 + this.rand.nextInt(200);
                    }
                }
            }
        }
        this.field4543 = this.field4544;
        if (this.method2664() > 0.0f) {
            this.method5111();
            final Vec3d method35640 = this.getMotion();
            final float n = 0.2f / (MathHelper.sqrt(Entity.horizontalMag(method35640)) * 10.0f + 1.0f) * (float)Math.pow(2.0, method35640.y);
            if (!this.field4550.method33697().method17245()) {
                if (!this.field4545) {
                    this.field4544 += n;
                }
                else {
                    this.field4544 += n * 0.5f;
                }
            }
            else {
                this.field4544 += 0.1f;
            }
            this.rotationYaw = MathHelper.method35668(this.rotationYaw);
            if (!this.method4214()) {
                if (this.field4533 < 0) {
                    for (int i = 0; i < this.field4532.length; ++i) {
                        this.field4532[i][0] = this.rotationYaw;
                        this.field4532[i][1] = this.getPosY();
                    }
                }
                if (++this.field4533 == this.field4532.length) {
                    this.field4533 = 0;
                }
                this.field4532[this.field4533][0] = this.rotationYaw;
                this.field4532[this.field4533][1] = this.getPosY();
                if (!this.world.isRemote) {
                    Class5783 class5783 = this.field4550.method33697();
                    class5783.method17247();
                    if (this.field4550.method33697() != class5783) {
                        class5783 = this.field4550.method33697();
                        class5783.method17247();
                    }
                    final Vec3d method35641 = class5783.method17254();
                    if (method35641 != null) {
                        final double n2 = method35641.x - this.getPosX();
                        double method35642 = method35641.y - this.getPosY();
                        final double n3 = method35641.z - this.getPosZ();
                        final double n4 = n2 * n2 + method35642 * method35642 + n3 * n3;
                        final float method35643 = class5783.method17251();
                        final double n5 = MathHelper.sqrt(n2 * n2 + n3 * n3);
                        if (n5 > 0.0) {
                            method35642 = MathHelper.clamp(method35642 / n5, -method35643, method35643);
                        }
                        this.method1936(this.getMotion().add(0.0, method35642 * 0.01, 0.0));
                        this.rotationYaw = MathHelper.method35668(this.rotationYaw);
                        final double method35644 = MathHelper.clamp(MathHelper.method35669(180.0 - MathHelper.method35693(n2, n3) * 57.2957763671875 - this.rotationYaw), -50.0, 50.0);
                        final Vec3d method35645 = method35641.subtract(this.getPosX(), this.getPosY(), this.getPosZ()).normalize();
                        final Vec3d method35646 = new Vec3d(MathHelper.sin(this.rotationYaw * 0.017453292f), this.getMotion().y, -MathHelper.cos(this.rotationYaw * 0.017453292f)).normalize();
                        final float max = Math.max(((float)method35646.dotProduct(method35645) + 0.5f) / 1.5f, 0.0f);
                        this.field4547 *= 0.8f;
                        this.field4547 += (float)(method35644 * class5783.method17252());
                        this.rotationYaw += this.field4547 * 0.1f;
                        final float n6 = (float)(2.0 / (n4 + 1.0));
                        this.method1724(0.06f * (max * n6 + (1.0f - n6)), new Vec3d(0.0, 0.0, -1.0));
                        if (!this.field4545) {
                            this.method1671(Class2160.field12826, this.getMotion());
                        }
                        else {
                            this.method1671(Class2160.field12826, this.getMotion().scale(0.800000011920929));
                        }
                        final double n7 = 0.8 + 0.15 * (this.getMotion().normalize().dotProduct(method35646) + 1.0) / 2.0;
                        this.method1936(this.getMotion().mul(n7, 0.9100000262260437, n7));
                    }
                }
                else {
                    if (this.field2971 > 0) {
                        final double n8 = this.getPosX() + (this.field2972 - this.getPosX()) / this.field2971;
                        final double n9 = this.getPosY() + (this.field2973 - this.getPosY()) / this.field2971;
                        final double n10 = this.getPosZ() + (this.field2974 - this.getPosZ()) / this.field2971;
                        this.rotationYaw += (float)(MathHelper.method35669(this.field2975 - this.rotationYaw) / this.field2971);
                        this.rotationPitch += (float)((this.field2976 - this.rotationPitch) / this.field2971);
                        --this.field2971;
                        this.setPosition(n8, n9, n10);
                        this.method1655(this.rotationYaw, this.rotationPitch);
                    }
                    this.field4550.method33697().method17246();
                }
                this.field2951 = this.rotationYaw;
                final Vec3d[] array = new Vec3d[this.field4534.length];
                for (int j = 0; j < this.field4534.length; ++j) {
                    array[j] = new Vec3d(this.field4534[j].getPosX(), this.field4534[j].getPosY(), this.field4534[j].getPosZ());
                }
                final float n11 = (float)(this.method5108(5, 1.0f)[1] - this.method5108(10, 1.0f)[1]) * 10.0f * 0.017453292f;
                final float method35647 = MathHelper.cos(n11);
                final float method35648 = MathHelper.sin(n11);
                final float n12 = this.rotationYaw * 0.017453292f;
                final float method35649 = MathHelper.sin(n12);
                final float method35650 = MathHelper.cos(n12);
                this.method5109(this.field4537, method35649 * 0.5f, 0.0, -method35650 * 0.5f);
                this.method5109(this.field4541, method35650 * 4.5f, 2.0, method35649 * 4.5f);
                this.method5109(this.field4542, method35650 * -4.5f, 2.0, method35649 * -4.5f);
                if (!this.world.isRemote) {
                    if (this.field2938 == 0) {
                        this.method5112(this.world.method6737(this, this.field4541.getBoundingBox().grow(4.0, 2.0, 4.0).offset(0.0, -2.0, 0.0), Class9170.field38849));
                        this.method5112(this.world.method6737(this, this.field4542.getBoundingBox().grow(4.0, 2.0, 4.0).offset(0.0, -2.0, 0.0), Class9170.field38849));
                        this.method5113(this.world.method6737(this, this.field4535.getBoundingBox().intersect(1.0), Class9170.field38849));
                        this.method5113(this.world.method6737(this, this.field4536.getBoundingBox().intersect(1.0), Class9170.field38849));
                    }
                }
                final float method35651 = MathHelper.sin(this.rotationYaw * 0.017453292f - this.field4547 * 0.01f);
                final float method35652 = MathHelper.cos(this.rotationYaw * 0.017453292f - this.field4547 * 0.01f);
                final float method35653 = this.method5110();
                this.method5109(this.field4535, method35651 * 6.5f * method35647, method35653 + method35648 * 6.5f, -method35652 * 6.5f * method35647);
                this.method5109(this.field4536, method35651 * 5.5f * method35647, method35653 + method35648 * 5.5f, -method35652 * 5.5f * method35647);
                final double[] method35654 = this.method5108(5, 1.0f);
                for (int k = 0; k < 3; ++k) {
                    Class859 class5784 = null;
                    if (k == 0) {
                        class5784 = this.field4538;
                    }
                    if (k == 1) {
                        class5784 = this.field4539;
                    }
                    if (k == 2) {
                        class5784 = this.field4540;
                    }
                    final double[] method35655 = this.method5108(12 + k * 2, 1.0f);
                    final float n13 = this.rotationYaw * 0.017453292f + this.method5114(method35655[0] - method35654[0]) * 0.017453292f;
                    final float method35656 = MathHelper.sin(n13);
                    final float method35657 = MathHelper.cos(n13);
                    final float n14 = (k + 1) * 2.0f;
                    this.method5109(class5784, -(method35649 * 1.5f + method35656 * n14) * method35647, method35655[1] - method35654[1] - (n14 + 1.5f) * method35648 + 1.5, (method35650 * 1.5f + method35657 * n14) * method35647);
                }
                if (!this.world.isRemote) {
                    this.field4545 = (this.method5115(this.field4535.getBoundingBox()) | this.method5115(this.field4536.getBoundingBox()) | this.method5115(this.field4537.getBoundingBox()));
                    if (this.field4549 != null) {
                        this.field4549.method29249(this);
                    }
                }
                for (int l = 0; l < this.field4534.length; ++l) {
                    this.field4534[l].prevPosX = array[l].x;
                    this.field4534[l].prevPosY = array[l].y;
                    this.field4534[l].prevPosZ = array[l].z;
                    this.field4534[l].lastTickPosX = array[l].x;
                    this.field4534[l].lastTickPosY = array[l].y;
                    this.field4534[l].lastTickPosZ = array[l].z;
                }
            }
            else {
                this.field4544 = 0.5f;
            }
        }
        else {
            this.world.method6709(Class8432.field34619, this.getPosX() + (this.rand.nextFloat() - 0.5f) * 8.0f, this.getPosY() + 2.0 + (this.rand.nextFloat() - 0.5f) * 4.0f, this.getPosZ() + (this.rand.nextFloat() - 0.5f) * 8.0f, 0.0, 0.0, 0.0);
        }
    }
    
    private void method5109(final Class859 class859, final double n, final double n2, final double n3) {
        class859.setPosition(this.getPosX() + n, this.getPosY() + n2, this.getPosZ() + n3);
    }
    
    private float method5110() {
        if (!this.field4550.method33697().method17245()) {
            return (float)(this.method5108(5, 1.0f)[1] - this.method5108(0, 1.0f)[1]);
        }
        return -1.0f;
    }
    
    private void method5111() {
        if (this.field4548 != null) {
            if (!this.field4548.removed) {
                if (this.ticksExisted % 10 == 0) {
                    if (this.method2664() < this.method2701()) {
                        this.method2665(this.method2664() + 1.0f);
                    }
                }
            }
            else {
                this.field4548 = null;
            }
        }
        if (this.rand.nextInt(10) == 0) {
            final List<Class858> method7128 = this.world.method7128((Class<? extends Class858>)Class858.class, this.getBoundingBox().intersect(32.0));
            Class858 field4548 = null;
            double n = Double.MAX_VALUE;
            for (final Class858 class858 : method7128) {
                final double method7129 = class858.method1734(this);
                if (method7129 >= n) {
                    continue;
                }
                n = method7129;
                field4548 = class858;
            }
            this.field4548 = field4548;
        }
    }
    
    private void method5112(final List<Entity> list) {
        final double n = (this.field4537.getBoundingBox().minX + this.field4537.getBoundingBox().maxX) / 2.0;
        final double n2 = (this.field4537.getBoundingBox().minZ + this.field4537.getBoundingBox().maxZ) / 2.0;
        for (final Entity class399 : list) {
            if (!(class399 instanceof LivingEntity)) {
                continue;
            }
            final double n3 = class399.getPosX() - n;
            final double n4 = class399.getPosZ() - n2;
            final double n5 = n3 * n3 + n4 * n4;
            class399.method1738(n3 / n5 * 4.0, 0.20000000298023224, n4 / n5 * 4.0);
            if (this.field4550.method33697().method17245()) {
                continue;
            }
            if (((LivingEntity)class399).method2635() >= class399.ticksExisted - 2) {
                continue;
            }
            class399.attackEntityFrom(DamageSource.method25693(this), 5.0f);
            this.method1900(this, class399);
        }
    }
    
    private void method5113(final List<Entity> list) {
        for (final Entity class399 : list) {
            if (!(class399 instanceof LivingEntity)) {
                continue;
            }
            class399.attackEntityFrom(DamageSource.method25693(this), 10.0f);
            this.method1900(this, class399);
        }
    }
    
    private float method5114(final double n) {
        return (float) MathHelper.method35669(n);
    }
    
    private boolean method5115(final AxisAlignedBB class6221) {
        final int method35644 = MathHelper.floor(class6221.minX);
        final int method35645 = MathHelper.floor(class6221.minY);
        final int method35646 = MathHelper.floor(class6221.minZ);
        final int method35647 = MathHelper.floor(class6221.maxX);
        final int method35648 = MathHelper.floor(class6221.maxY);
        final int method35649 = MathHelper.floor(class6221.maxZ);
        boolean b = false;
        boolean b2 = false;
        for (int i = method35644; i <= method35647; ++i) {
            for (int j = method35645; j <= method35648; ++j) {
                for (int k = method35646; k <= method35649; ++k) {
                    final BlockPos class6222 = new BlockPos(i, j, k);
                    final BlockState method35650 = this.world.getBlockState(class6222);
                    final Block method35651 = method35650.getBlock();
                    if (!method35650.method21706()) {
                        if (method35650.getMaterial() != Material.FIRE) {
                            if (this.world.method6765().method31216(Class8878.field37316) && !Class7188.field27929.method25618(method35651)) {
                                b2 = (this.world.method6690(class6222, false) || b2);
                            }
                            else {
                                b = true;
                            }
                        }
                    }
                }
            }
        }
        if (b2) {
            this.world.method6955(2008, new BlockPos(method35644 + this.rand.nextInt(method35647 - method35644 + 1), method35645 + this.rand.nextInt(method35648 - method35645 + 1), method35646 + this.rand.nextInt(method35649 - method35646 + 1)), 0);
        }
        return b;
    }
    
    public boolean method5116(final Class859 class859, final DamageSource class860, float method17255) {
        if (this.field4550.method33697().method17253() == Class7193.field27957) {
            return false;
        }
        method17255 = this.field4550.method33697().method17255(class860, method17255);
        if (class859 != this.field4535) {
            method17255 = method17255 / 4.0f + Math.min(method17255, 1.0f);
        }
        if (method17255 >= 0.01f) {
            if (class860.method25714() instanceof PlayerEntity || class860.method25707()) {
                final float method17256 = this.method2664();
                this.method5117(class860, method17255);
                if (this.method2664() <= 0.0f) {
                    if (!this.field4550.method33697().method17245()) {
                        this.method2665(1.0f);
                        this.field4550.method33696(Class7193.field27957);
                    }
                }
                if (this.field4550.method33697().method17245()) {
                    this.field4552 += (int)(method17256 - this.method2664());
                    if (this.field4552 > 0.25f * this.method2701()) {
                        this.field4552 = 0;
                        this.field4550.method33696(Class7193.field27952);
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource class7929, final float n) {
        if (class7929 instanceof Class7930) {
            if (((Class7930)class7929).method25728()) {
                this.method5116(this.field4537, class7929, n);
            }
        }
        return false;
    }
    
    public boolean method5117(final DamageSource class7929, final float n) {
        return super.attackEntityFrom(class7929, n);
    }
    
    @Override
    public void method1648() {
        this.method1652();
        if (this.field4549 != null) {
            this.field4549.method29249(this);
            this.field4549.method29244(this);
        }
    }
    
    @Override
    public void method2627() {
        if (this.field4549 != null) {
            this.field4549.method29249(this);
        }
        ++this.field4546;
        if (this.field4546 >= 180) {
            if (this.field4546 <= 200) {
                this.world.method6709(Class8432.field34618, this.getPosX() + (this.rand.nextFloat() - 0.5f) * 8.0f, this.getPosY() + 2.0 + (this.rand.nextFloat() - 0.5f) * 4.0f, this.getPosZ() + (this.rand.nextFloat() - 0.5f) * 8.0f, 0.0, 0.0, 0.0);
            }
        }
        final boolean method31216 = this.world.method6765().method31216(Class8878.field37319);
        int n = 500;
        if (this.field4549 != null) {
            if (!this.field4549.method29252()) {
                n = 12000;
            }
        }
        if (!this.world.isRemote) {
            if (this.field4546 > 150) {
                if (this.field4546 % 5 == 0) {
                    if (method31216) {
                        this.method5118(MathHelper.method35642(n * 0.08f));
                    }
                }
            }
            if (this.field4546 == 1) {
                this.world.method6777(1028, new BlockPos(this), 0);
            }
        }
        this.method1671(Class2160.field12826, new Vec3d(0.0, 0.10000000149011612, 0.0));
        this.rotationYaw += 20.0f;
        this.field2951 = this.rotationYaw;
        if (this.field4546 == 200) {
            if (!this.world.isRemote) {
                if (method31216) {
                    this.method5118(MathHelper.method35642(n * 0.2f));
                }
                if (this.field4549 != null) {
                    this.field4549.method29244(this);
                }
                this.method1652();
            }
        }
    }
    
    private void method5118(int i) {
        while (i > 0) {
            final int method2609 = Class508.method2609(i);
            i -= method2609;
            this.world.method6886(new Class508(this.world, this.getPosX(), this.getPosY(), this.getPosZ(), method2609));
        }
    }
    
    public int method5119() {
        if (this.field4553[0] == null) {
            for (int i = 0; i < 24; ++i) {
                int n = 5;
                int n3;
                int n4;
                if (i >= 12) {
                    if (i >= 20) {
                        final int n2 = i - 20;
                        n3 = MathHelper.method35642(20.0f * MathHelper.cos(2.0f * (-3.1415927f + 0.7853982f * n2)));
                        n4 = MathHelper.method35642(20.0f * MathHelper.sin(2.0f * (-3.1415927f + 0.7853982f * n2)));
                    }
                    else {
                        final int n5 = i - 12;
                        n3 = MathHelper.method35642(40.0f * MathHelper.cos(2.0f * (-3.1415927f + 0.3926991f * n5)));
                        n4 = MathHelper.method35642(40.0f * MathHelper.sin(2.0f * (-3.1415927f + 0.3926991f * n5)));
                        n += 10;
                    }
                }
                else {
                    n3 = MathHelper.method35642(60.0f * MathHelper.cos(2.0f * (-3.1415927f + 0.2617994f * i)));
                    n4 = MathHelper.method35642(60.0f * MathHelper.sin(2.0f * (-3.1415927f + 0.2617994f * i)));
                }
                this.field4553[i] = new Class6772(n3, Math.max(this.world.method6743() + 10, this.world.method6958(HeightmapType.field11526, new BlockPos(n3, 0, n4)).getY() + n), n4);
            }
            this.field4554[0] = 6146;
            this.field4554[1] = 8197;
            this.field4554[2] = 8202;
            this.field4554[3] = 16404;
            this.field4554[4] = 32808;
            this.field4554[5] = 32848;
            this.field4554[6] = 65696;
            this.field4554[7] = 131392;
            this.field4554[8] = 131712;
            this.field4554[9] = 263424;
            this.field4554[10] = 526848;
            this.field4554[11] = 525313;
            this.field4554[12] = 1581057;
            this.field4554[13] = 3166214;
            this.field4554[14] = 2138120;
            this.field4554[15] = 6373424;
            this.field4554[16] = 4358208;
            this.field4554[17] = 12910976;
            this.field4554[18] = 9044480;
            this.field4554[19] = 9706496;
            this.field4554[20] = 15216640;
            this.field4554[21] = 13688832;
            this.field4554[22] = 11763712;
            this.field4554[23] = 8257536;
        }
        return this.method5120(this.getPosX(), this.getPosY(), this.getPosZ());
    }
    
    public int method5120(final double n, final double n2, final double n3) {
        float n4 = 10000.0f;
        int n5 = 0;
        final Class6772 class6772 = new Class6772(MathHelper.floor(n), MathHelper.floor(n2), MathHelper.floor(n3));
        int n6 = 0;
        if (this.field4549 == null || this.field4549.method29250() == 0) {
            n6 = 12;
        }
        for (int i = n6; i < 24; ++i) {
            if (this.field4553[i] != null) {
                final float method20668 = this.field4553[i].method20668(class6772);
                if (method20668 < n4) {
                    n4 = method20668;
                    n5 = i;
                }
            }
        }
        return n5;
    }
    
    @Nullable
    public Class9468 method5121(final int i, final int j, final Class6772 class6772) {
        for (int k = 0; k < 24; ++k) {
            final Class6772 class6773 = this.field4553[k];
            class6773.field26598 = false;
            class6773.field26596 = 0.0f;
            class6773.field26594 = 0.0f;
            class6773.field26595 = 0.0f;
            class6773.field26597 = null;
            class6773.field26593 = -1;
        }
        final Class6772 class6774 = this.field4553[i];
        Class6772 field26597 = this.field4553[j];
        class6774.field26594 = 0.0f;
        class6774.field26595 = class6774.method20667(field26597);
        class6774.field26596 = class6774.field26595;
        this.field4555.method27924();
        this.field4555.method27923(class6774);
        Class6772 field26598 = class6774;
        int n = 0;
        if (this.field4549 == null || this.field4549.method29250() == 0) {
            n = 12;
        }
        while (!this.field4555.method27929()) {
            final Class6772 method27925 = this.field4555.method27925();
            if (method27925.equals(field26597)) {
                if (class6772 != null) {
                    class6772.field26597 = field26597;
                    field26597 = class6772;
                }
                return this.method5122(class6774, field26597);
            }
            if (method27925.method20667(field26597) < field26598.method20667(field26597)) {
                field26598 = method27925;
            }
            method27925.field26598 = true;
            int n2 = 0;
            for (int l = 0; l < 24; ++l) {
                if (this.field4553[l] == method27925) {
                    n2 = l;
                    break;
                }
            }
            for (int n3 = n; n3 < 24; ++n3) {
                if ((this.field4554[n2] & 1 << n3) > 0) {
                    final Class6772 class6775 = this.field4553[n3];
                    if (!class6775.field26598) {
                        final float field26599 = method27925.field26594 + method27925.method20667(class6775);
                        if (!class6775.method20672() || field26599 < class6775.field26594) {
                            class6775.field26597 = method27925;
                            class6775.field26594 = field26599;
                            class6775.field26595 = class6775.method20667(field26597);
                            if (!class6775.method20672()) {
                                class6775.field26596 = class6775.field26594 + class6775.field26595;
                                this.field4555.method27923(class6775);
                            }
                            else {
                                this.field4555.method27926(class6775, class6775.field26594 + class6775.field26595);
                            }
                        }
                    }
                }
            }
        }
        if (field26598 != class6774) {
            Class852.field2379.debug("Failed to find path from {} to {}", (Object)i, (Object)j);
            if (class6772 != null) {
                class6772.field26597 = field26598;
                field26598 = class6772;
            }
            return this.method5122(class6774, field26598);
        }
        return null;
    }
    
    private Class9468 method5122(final Class6772 class6772, final Class6772 class6773) {
        final ArrayList arrayList = Lists.newArrayList();
        Class6772 field26597 = class6773;
        arrayList.add(0, class6773);
        while (field26597.field26597 != null) {
            field26597 = field26597.field26597;
            arrayList.add(0, field26597);
        }
        return new Class9468(arrayList, new BlockPos(class6773.field26589, class6773.field26590, class6773.field26591), true);
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        super.method1761(class51);
        class51.putInt("DragonPhase", this.field4550.method33697().method17253().method22077());
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        super.method1760(class51);
        if (class51.contains("DragonPhase")) {
            this.field4550.method33696(Class7193.method22078(class51.getInt("DragonPhase")));
        }
    }
    
    @Override
    public void method1949() {
    }
    
    public Class859[] method5123() {
        return this.field4534;
    }
    
    @Override
    public boolean method1749() {
        return false;
    }
    
    @Override
    public Class286 method1922() {
        return Class286.field1583;
    }
    
    @Override
    public Class7795 method4160() {
        return Class8520.field35153;
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return Class8520.field35158;
    }
    
    @Override
    public float method2720() {
        return 5.0f;
    }
    
    public float method5124(final int n, final double[] array, final double[] array2) {
        final Class5783 method33697 = this.field4550.method33697();
        final Class7193<? extends Class5783> method33698 = method33697.method17253();
        double n2;
        if (method33698 != Class7193.field27951 && method33698 != Class7193.field27952) {
            if (!method33697.method17245()) {
                if (n != 6) {
                    n2 = array2[1] - array[1];
                }
                else {
                    n2 = 0.0;
                }
            }
            else {
                n2 = n;
            }
        }
        else {
            n2 = n / Math.max(MathHelper.sqrt(this.world.method6958(HeightmapType.field11526, Class4551.field20031).distanceSq(this.method1934(), true)) / 4.0f, 1.0f);
        }
        return (float)n2;
    }
    
    public Vec3d method5125(final float n) {
        final Class5783 method33697 = this.field4550.method33697();
        final Class7193<? extends Class5783> method33698 = method33697.method17253();
        Vec3d class5487;
        if (method33698 != Class7193.field27951 && method33698 != Class7193.field27952) {
            if (!method33697.method17245()) {
                class5487 = this.method1741(n);
            }
            else {
                final float field2400 = this.rotationPitch;
                this.rotationPitch = -45.0f;
                class5487 = this.method1741(n);
                this.rotationPitch = field2400;
            }
        }
        else {
            final float n2 = 6.0f / Math.max(MathHelper.sqrt(this.world.method6958(HeightmapType.field11526, Class4551.field20031).distanceSq(this.method1934(), true)) / 4.0f, 1.0f);
            final float field2401 = this.rotationPitch;
            this.rotationPitch = -n2 * 1.5f * 5.0f;
            class5487 = this.method1741(n);
            this.rotationPitch = field2401;
        }
        return class5487;
    }
    
    public void method5126(final Class858 class858, final BlockPos class859, final DamageSource class860) {
        PlayerEntity method7137;
        if (!(class860.method25714() instanceof PlayerEntity)) {
            method7137 = this.world.method7137(Class852.field4531, class859.getX(), class859.getY(), class859.getZ());
        }
        else {
            method7137 = (PlayerEntity)class860.method25714();
        }
        if (class858 == this.field4548) {
            this.method5116(this.field4535, DamageSource.method25703(method7137), 10.0f);
        }
        this.field4550.method33697().method17248(class858, class859, class860, method7137);
    }
    
    @Override
    public void method1880(final DataParameter<?> class8810) {
        if (Class852.field4530.equals(class8810)) {
            if (this.world.isRemote) {
                this.field4550.method33696(Class7193.method22078(this.method1650().get(Class852.field4530)));
            }
        }
        super.method1880(class8810);
    }
    
    public Class9215 method5127() {
        return this.field4550;
    }
    
    @Nullable
    public Class8619 method5128() {
        return this.field4549;
    }
    
    @Override
    public boolean method2655(final Class1948 class1948) {
        return false;
    }
    
    @Override
    public boolean method1781(final Entity class399) {
        return false;
    }
    
    @Override
    public boolean method1855() {
        return false;
    }
    
    static {
        field2379 = LogManager.getLogger();
        field4530 = EntityDataManager.method33564(Class852.class, Class7709.field30654);
        field4531 = new Class7843().method25337(64.0);
    }
}
