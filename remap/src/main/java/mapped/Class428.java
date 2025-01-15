// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;

import java.util.List;
import javax.annotation.Nullable;
import com.mojang.datafixers.util.Pair;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;

import java.util.Map;

public abstract class Class428 extends Entity
{
    private static final DataParameter<Integer> field2620;
    private static final DataParameter<Integer> field2621;
    private static final DataParameter<Float> field2622;
    private static final DataParameter<Integer> field2623;
    private static final DataParameter<Integer> field2624;
    private static final DataParameter<Boolean> field2625;
    private boolean field2626;
    private static final Map<Class104, Pair<Vec3i, Vec3i>> field2627;
    private int field2628;
    private double field2629;
    private double field2630;
    private double field2631;
    private double field2632;
    private double field2633;
    private double field2634;
    private double field2635;
    private double field2636;
    
    public Class428(final EntityType<?> class7499, final World class7500) {
        super(class7499, class7500);
        this.preventEntitySpawning = true;
    }
    
    public Class428(final EntityType<?> class7499, final World class7500, final double field2392, final double field2393, final double field2394) {
        this(class7499, class7500);
        this.setPosition(field2392, field2393, field2394);
        this.method1936(Vec3d.ZERO);
        this.prevPosX = field2392;
        this.prevPosY = field2393;
        this.prevPosZ = field2394;
    }
    
    public static Class428 method2122(final World class1847, final double n, final double n2, final double n3, final Class2080 class1848) {
        if (class1848 == Class2080.field12025) {
            return new Class505(class1847, n, n2, n3);
        }
        if (class1848 == Class2080.field12026) {
            return new Class506(class1847, n, n2, n3);
        }
        if (class1848 == Class2080.field12027) {
            return new Class432(class1847, n, n2, n3);
        }
        if (class1848 == Class2080.field12028) {
            return new Class431(class1847, n, n2, n3);
        }
        if (class1848 != Class2080.field12029) {
            return (class1848 != Class2080.field12030) ? new Class430(class1847, n, n2, n3) : new Class429(class1847, n, n2, n3);
        }
        return new Class454(class1847, n, n2, n3);
    }
    
    @Override
    public boolean method1700() {
        return false;
    }
    
    @Override
    public void method1649() {
        this.dataManager.register(Class428.field2620, 0);
        this.dataManager.register(Class428.field2621, 1);
        this.dataManager.register(Class428.field2622, 0.0f);
        this.dataManager.register(Class428.field2623, Class3833.method11774(Class7521.field29147.method11878()));
        this.dataManager.register(Class428.field2624, 6);
        this.dataManager.register(Class428.field2625, false);
    }
    
    @Nullable
    @Override
    public AxisAlignedBB method1771(final Entity class399) {
        return class399.method1750() ? class399.method1886() : null;
    }
    
    @Override
    public boolean method1750() {
        return true;
    }
    
    @Override
    public double method1777() {
        return 0.0;
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource class7929, final float n) {
        if (this.world.field10067 || this.removed) {
            return true;
        }
        if (!this.method1849(class7929)) {
            this.method2137(-this.method2138());
            this.method2135(10);
            this.method1739();
            this.method2133(this.method2134() + n * 10.0f);
            final boolean b = class7929.method25714() instanceof Class512 && ((Class512)class7929.method25714()).field3025.field27304;
            if (b || this.method2134() > 40.0f) {
                this.removePassengers();
                if (b && !this.hasCustomName()) {
                    this.method1652();
                }
                else {
                    this.method2123(class7929);
                }
            }
            return true;
        }
        return false;
    }
    
    public void method2123(final DamageSource class7929) {
        this.method1652();
        if (this.world.method6765().method31216(Class8878.field37321)) {
            final ItemStack class7930 = new ItemStack(Class7739.field31352);
            if (this.hasCustomName()) {
                class7930.method27665(this.getCustomName());
            }
            this.method1766(class7930);
        }
    }
    
    @Override
    public void method1799() {
        this.method2137(-this.method2138());
        this.method2135(10);
        this.method2133(this.method2134() + this.method2134() * 10.0f);
    }
    
    @Override
    public boolean method1749() {
        return !this.removed;
    }
    
    private static Pair<Vec3i, Vec3i> method2124(final Class104 class104) {
        return Class428.field2627.get(class104);
    }
    
    @Override
    public Direction method1883() {
        return this.field2626 ? this.method1882().getOpposite().rotateY() : this.method1882().rotateY();
    }
    
    @Override
    public void method1659() {
        if (this.method2136() > 0) {
            this.method2135(this.method2136() - 1);
        }
        if (this.method2134() > 0.0f) {
            this.method2133(this.method2134() - 1.0f);
        }
        if (this.getPosY() < -64.0) {
            this.method1668();
        }
        this.method1795();
        if (!this.world.field10067) {
            if (!this.method1698()) {
                this.method1936(this.getMotion().add(0.0, -0.04, 0.0));
            }
            final int method35644 = MathHelper.floor(this.getPosX());
            int method35645 = MathHelper.floor(this.getPosY());
            final int method35646 = MathHelper.floor(this.getPosZ());
            if (this.world.method6701(new BlockPos(method35644, method35645 - 1, method35646)).method21755(Class7188.field27906)) {
                --method35645;
            }
            final BlockPos class354 = new BlockPos(method35644, method35645, method35646);
            final Class7096 method35647 = this.world.method6701(class354);
            if (!method35647.method21755(Class7188.field27906)) {
                this.method2127();
            }
            else {
                this.method2128(class354, method35647);
                if (method35647.method21696() == Class7521.field29480) {
                    this.method2126(method35644, method35645, method35646, method35647.method21772((Class7111<Boolean>)Class4019.field18101));
                }
            }
            this.method1689();
            this.rotationPitch = 0.0f;
            final double n = this.prevPosX - this.getPosX();
            final double n2 = this.prevPosZ - this.getPosZ();
            if (n * n + n2 * n2 > 0.001) {
                this.rotationYaw = (float)(MathHelper.method35693(n2, n) * 180.0 / 3.141592653589793);
                if (this.field2626) {
                    this.rotationYaw += 180.0f;
                }
            }
            final double n3 = MathHelper.method35668(this.rotationYaw - this.prevRotationYaw);
            if (n3 < -170.0 || n3 >= 170.0) {
                this.rotationYaw += 180.0f;
                this.field2626 = !this.field2626;
            }
            this.method1655(this.rotationYaw, this.rotationPitch);
            if (this.method2139() == Class2080.field12024 && Entity.method1680(this.getMotion()) > 0.01) {
                final List<Entity> method35648 = this.world.method6737(this, this.method1886().method18495(0.20000000298023224, 0.0, 0.20000000298023224), Class9170.method33474(this));
                if (!method35648.isEmpty()) {
                    for (int i = 0; i < method35648.size(); ++i) {
                        final Entity class355 = method35648.get(i);
                        if (!(class355 instanceof Class512)) {
                            if (!(class355 instanceof Class786)) {
                                if (!(class355 instanceof Class428)) {
                                    if (!this.isBeingRidden()) {
                                        if (!class355.isPassenger()) {
                                            class355.method1778(this);
                                            continue;
                                        }
                                    }
                                }
                            }
                        }
                        class355.method1737(this);
                    }
                }
            }
            else {
                for (final Entity class356 : this.world.method7127(this, this.method1886().method18495(0.20000000298023224, 0.0, 0.20000000298023224))) {
                    if (this.method1909(class356)) {
                        continue;
                    }
                    if (!class356.method1750()) {
                        continue;
                    }
                    if (!(class356 instanceof Class428)) {
                        continue;
                    }
                    class356.method1737(this);
                }
            }
            this.method1715();
        }
        else if (this.field2628 <= 0) {
            this.method1657();
            this.method1655(this.rotationYaw, this.rotationPitch);
        }
        else {
            final double n4 = this.getPosX() + (this.field2629 - this.getPosX()) / this.field2628;
            final double n5 = this.getPosY() + (this.field2630 - this.getPosY()) / this.field2628;
            final double n6 = this.getPosZ() + (this.field2631 - this.getPosZ()) / this.field2628;
            this.rotationYaw += (float)(MathHelper.method35669(this.field2632 - this.rotationYaw) / this.field2628);
            this.rotationPitch += (float)((this.field2633 - this.rotationPitch) / this.field2628);
            --this.field2628;
            this.setPosition(n4, n5, n6);
            this.method1655(this.rotationYaw, this.rotationPitch);
        }
    }
    
    public double method2125() {
        return 0.4;
    }
    
    public void method2126(final int n, final int n2, final int n3, final boolean b) {
    }
    
    public void method2127() {
        final double method2125 = this.method2125();
        final Vec3d method2126 = this.getMotion();
        this.setMotion(MathHelper.method35654(method2126.x, -method2125, method2125), method2126.y, MathHelper.method35654(method2126.z, -method2125, method2125));
        if (this.onGround) {
            this.method1936(this.getMotion().scale(0.5));
        }
        this.method1671(Class2160.field12826, this.getMotion());
        if (!this.onGround) {
            this.method1936(this.getMotion().scale(0.95));
        }
    }
    
    public void method2128(final BlockPos class354, final Class7096 class355) {
        this.fallDistance = 0.0f;
        final double method1938 = this.getPosX();
        final double method1939 = this.getPosY();
        final double method1940 = this.getPosZ();
        final Vec3d method1941 = this.method2132(method1938, method1939, method1940);
        double n = class354.getY();
        boolean booleanValue = false;
        int n2 = 0;
        final Class4017 class356 = (Class4017)class355.method21696();
        if (class356 == Class7521.field29237) {
            booleanValue = class355.method21772((Class7111<Boolean>)Class4019.field18101);
            n2 = (booleanValue ? 0 : 1);
        }
        final Vec3d method1942 = this.getMotion();
        final Class104 class357 = class355.method21772(class356.method12205());
        switch (Class7650.field30382[class357.ordinal()]) {
            case 1: {
                this.method1936(method1942.add(-0.0078125, 0.0, 0.0));
                ++n;
                break;
            }
            case 2: {
                this.method1936(method1942.add(0.0078125, 0.0, 0.0));
                ++n;
                break;
            }
            case 3: {
                this.method1936(method1942.add(0.0, 0.0, 0.0078125));
                ++n;
                break;
            }
            case 4: {
                this.method1936(method1942.add(0.0, 0.0, -0.0078125));
                ++n;
                break;
            }
        }
        final Vec3d method1943 = this.getMotion();
        final Pair<Vec3i, Vec3i> method1944 = method2124(class357);
        final Vec3i class358 = (Vec3i)method1944.getFirst();
        final Vec3i class359 = (Vec3i)method1944.getSecond();
        double n3 = class359.getX() - class358.getX();
        double n4 = class359.getZ() - class358.getZ();
        final double sqrt = Math.sqrt(n3 * n3 + n4 * n4);
        if (method1943.x * n3 + method1943.z * n4 < 0.0) {
            n3 = -n3;
            n4 = -n4;
        }
        final double min = Math.min(2.0, Math.sqrt(Entity.method1680(method1943)));
        this.method1936(new Vec3d(min * n3 / sqrt, method1943.y, min * n4 / sqrt));
        final Entity class360 = this.method1908().isEmpty() ? null : this.method1908().get(0);
        if (class360 instanceof Class512) {
            final Vec3d method1945 = class360.getMotion();
            final double method1946 = Entity.method1680(method1945);
            final double method1947 = Entity.method1680(this.getMotion());
            if (method1946 > 1.0E-4 && method1947 < 0.01) {
                this.method1936(this.getMotion().add(method1945.x * 0.1, 0.0, method1945.z * 0.1));
                n2 = 0;
            }
        }
        if (n2 != 0) {
            if (Math.sqrt(Entity.method1680(this.getMotion())) < 0.03) {
                this.method1936(Vec3d.ZERO);
            }
            else {
                this.method1936(this.getMotion().mul(0.5, 0.0, 0.5));
            }
        }
        final double n5 = class354.getX() + 0.5 + class358.getX() * 0.5;
        final double n6 = class354.getZ() + 0.5 + class358.getZ() * 0.5;
        final double n7 = class354.getX() + 0.5 + class359.getX() * 0.5;
        final double n8 = class354.getZ() + 0.5 + class359.getZ() * 0.5;
        final double n9 = n7 - n5;
        final double n10 = n8 - n6;
        double n11;
        if (n9 == 0.0) {
            n11 = method1940 - class354.getZ();
        }
        else if (n10 == 0.0) {
            n11 = method1938 - class354.getX();
        }
        else {
            n11 = ((method1938 - n5) * n9 + (method1940 - n6) * n10) * 2.0;
        }
        this.setPosition(n5 + n9 * n11, n, n6 + n10 * n11);
        final double n12 = this.isBeingRidden() ? 0.75 : 1.0;
        final double method1948 = this.method2125();
        final Vec3d method1949 = this.getMotion();
        this.method1671(Class2160.field12826, new Vec3d(MathHelper.method35654(n12 * method1949.x, -method1948, method1948), 0.0, MathHelper.method35654(n12 * method1949.z, -method1948, method1948)));
        if (class358.getY() != 0 && MathHelper.floor(this.getPosX()) - class354.getX() == class358.getX() && MathHelper.floor(this.getPosZ()) - class354.getZ() == class358.getZ()) {
            this.setPosition(this.getPosX(), this.getPosY() + class358.getY(), this.getPosZ());
        }
        else if (class359.getY() != 0 && MathHelper.floor(this.getPosX()) - class354.getX() == class359.getX() && MathHelper.floor(this.getPosZ()) - class354.getZ() == class359.getZ()) {
            this.setPosition(this.getPosX(), this.getPosY() + class359.getY(), this.getPosZ());
        }
        this.method2130();
        final Vec3d method1950 = this.method2132(this.getPosX(), this.getPosY(), this.getPosZ());
        if (method1950 != null && method1941 != null) {
            final double n13 = (method1941.y - method1950.y) * 0.05;
            final Vec3d method1951 = this.getMotion();
            final double sqrt2 = Math.sqrt(Entity.method1680(method1951));
            if (sqrt2 > 0.0) {
                this.method1936(method1951.mul((sqrt2 + n13) / sqrt2, 1.0, (sqrt2 + n13) / sqrt2));
            }
            this.setPosition(this.getPosX(), method1950.y, this.getPosZ());
        }
        final int method1952 = MathHelper.floor(this.getPosX());
        final int method1953 = MathHelper.floor(this.getPosZ());
        if (method1952 != class354.getX() || method1953 != class354.getZ()) {
            final Vec3d method1954 = this.getMotion();
            final double sqrt3 = Math.sqrt(Entity.method1680(method1954));
            this.setMotion(sqrt3 * (method1952 - class354.getX()), method1954.y, sqrt3 * (method1953 - class354.getZ()));
        }
        if (booleanValue) {
            final Vec3d method1955 = this.getMotion();
            final double sqrt4 = Math.sqrt(Entity.method1680(method1955));
            if (sqrt4 > 0.01) {
                this.method1936(method1955.add(method1955.x / sqrt4 * 0.06, 0.0, method1955.z / sqrt4 * 0.06));
            }
            else {
                final Vec3d method1956 = this.getMotion();
                double field22770 = method1956.x;
                double field22771 = method1956.z;
                if (class357 == Class104.field312) {
                    if (this.method2129(class354.method1145())) {
                        field22770 = 0.02;
                    }
                    else if (this.method2129(class354.method1147())) {
                        field22770 = -0.02;
                    }
                }
                else {
                    if (class357 != Class104.field311) {
                        return;
                    }
                    if (this.method2129(class354.method1141())) {
                        field22771 = 0.02;
                    }
                    else if (this.method2129(class354.method1143())) {
                        field22771 = -0.02;
                    }
                }
                this.setMotion(field22770, method1956.y, field22771);
            }
        }
    }
    
    private boolean method2129(final BlockPos class354) {
        return this.world.method6701(class354).method21713(this.world, class354);
    }
    
    public void method2130() {
        final double n = this.isBeingRidden() ? 0.997 : 0.96;
        this.method1936(this.getMotion().mul(n, 0.0, n));
    }
    
    @Nullable
    public Vec3d method2131(double n, double n2, double n3, final double n4) {
        final int method35644 = MathHelper.floor(n);
        int method35645 = MathHelper.floor(n2);
        final int method35646 = MathHelper.floor(n3);
        if (this.world.method6701(new BlockPos(method35644, method35645 - 1, method35646)).method21755(Class7188.field27906)) {
            --method35645;
        }
        final Class7096 method35647 = this.world.method6701(new BlockPos(method35644, method35645, method35646));
        if (!method35647.method21755(Class7188.field27906)) {
            return null;
        }
        final Class104 class104 = method35647.method21772(((Class4017)method35647.method21696()).method12205());
        n2 = method35645;
        if (class104.method597()) {
            n2 = method35645 + 1;
        }
        final Pair<Vec3i, Vec3i> method35648 = method2124(class104);
        final Vec3i class105 = (Vec3i)method35648.getFirst();
        final Vec3i class106 = (Vec3i)method35648.getSecond();
        final double n5 = class106.getX() - class105.getX();
        final double n6 = class106.getZ() - class105.getZ();
        final double sqrt = Math.sqrt(n5 * n5 + n6 * n6);
        final double n7 = n5 / sqrt;
        final double n8 = n6 / sqrt;
        n += n7 * n4;
        n3 += n8 * n4;
        if (class105.getY() != 0) {
            if (MathHelper.floor(n) - method35644 == class105.getX()) {
                if (MathHelper.floor(n3) - method35646 == class105.getZ()) {
                    n2 += class105.getY();
                    return this.method2132(n, n2, n3);
                }
            }
        }
        if (class106.getY() != 0) {
            if (MathHelper.floor(n) - method35644 == class106.getX()) {
                if (MathHelper.floor(n3) - method35646 == class106.getZ()) {
                    n2 += class106.getY();
                }
            }
        }
        return this.method2132(n, n2, n3);
    }
    
    @Nullable
    public Vec3d method2132(double n, double n2, double n3) {
        final int method35644 = MathHelper.floor(n);
        int method35645 = MathHelper.floor(n2);
        final int method35646 = MathHelper.floor(n3);
        if (this.world.method6701(new BlockPos(method35644, method35645 - 1, method35646)).method21755(Class7188.field27906)) {
            --method35645;
        }
        final Class7096 method35647 = this.world.method6701(new BlockPos(method35644, method35645, method35646));
        if (!method35647.method21755(Class7188.field27906)) {
            return null;
        }
        final Pair<Vec3i, Vec3i> method35648 = method2124(method35647.method21772(((Class4017)method35647.method21696()).method12205()));
        final Vec3i class352 = (Vec3i)method35648.getFirst();
        final Vec3i class353 = (Vec3i)method35648.getSecond();
        final double n4 = method35644 + 0.5 + class352.getX() * 0.5;
        final double n5 = method35645 + 0.0625 + class352.getY() * 0.5;
        final double n6 = method35646 + 0.5 + class352.getZ() * 0.5;
        final double n7 = method35644 + 0.5 + class353.getX() * 0.5;
        final double n8 = method35645 + 0.0625 + class353.getY() * 0.5;
        final double n9 = method35646 + 0.5 + class353.getZ() * 0.5;
        final double n10 = n7 - n4;
        final double n11 = (n8 - n5) * 2.0;
        final double n12 = n9 - n6;
        double n13;
        if (n10 != 0.0) {
            if (n12 != 0.0) {
                n13 = ((n - n4) * n10 + (n3 - n6) * n12) * 2.0;
            }
            else {
                n13 = n - method35644;
            }
        }
        else {
            n13 = n3 - method35646;
        }
        n = n4 + n10 * n13;
        n2 = n5 + n11 * n13;
        n3 = n6 + n12 * n13;
        if (n11 >= 0.0) {
            if (n11 > 0.0) {
                n2 += 0.5;
            }
        }
        else {
            ++n2;
        }
        return new Vec3d(n, n2, n3);
    }
    
    @Override
    public AxisAlignedBB method1887() {
        final AxisAlignedBB method1886 = this.method1886();
        return this.method2146() ? method1886.method18496(Math.abs(this.method2142()) / 16.0) : method1886;
    }
    
    @Override
    public void method1760(final Class51 class51) {
        if (class51.method329("CustomDisplayTile")) {
            this.method2144(Class9346.method34647(class51.method327("DisplayState")));
            this.method2145(class51.method319("DisplayOffset"));
        }
    }
    
    @Override
    public void method1761(final Class51 class51) {
        if (this.method2146()) {
            class51.method312("CustomDisplayTile", true);
            class51.method295("DisplayState", Class9346.method34649(this.method2140()));
            class51.method298("DisplayOffset", this.method2142());
        }
    }
    
    @Override
    public void method1737(final Entity class399) {
        if (!this.world.field10067) {
            if (!class399.noClip) {
                if (!this.noClip) {
                    if (!this.method1909(class399)) {
                        final double n = class399.getPosX() - this.getPosX();
                        final double n2 = class399.getPosZ() - this.getPosZ();
                        final double n3 = n * n + n2 * n2;
                        if (n3 >= 9.999999747378752E-5) {
                            final double n4 = MathHelper.sqrt(n3);
                            final double n5 = n / n4;
                            final double n6 = n2 / n4;
                            double n7 = 1.0 / n4;
                            if (n7 > 1.0) {
                                n7 = 1.0;
                            }
                            final double n8 = n5 * n7;
                            final double n9 = n6 * n7;
                            final double n10 = n8 * 0.10000000149011612;
                            final double n11 = n9 * 0.10000000149011612;
                            final double n12 = n10 * (1.0f - this.entityCollisionReduction);
                            final double n13 = n11 * (1.0f - this.entityCollisionReduction);
                            final double n14 = n12 * 0.5;
                            final double n15 = n13 * 0.5;
                            if (!(class399 instanceof Class428)) {
                                this.method1738(-n14, 0.0, -n15);
                                class399.method1738(n14 / 4.0, 0.0, n15 / 4.0);
                            }
                            else {
                                if (Math.abs(new Vec3d(class399.getPosX() - this.getPosX(), 0.0, class399.getPosZ() - this.getPosZ()).normalize().dotProduct(new Vec3d(MathHelper.cos(this.rotationYaw * 0.017453292f), 0.0, MathHelper.sin(this.rotationYaw * 0.017453292f)).normalize())) < 0.800000011920929) {
                                    return;
                                }
                                final Vec3d method1935 = this.getMotion();
                                final Vec3d method1936 = class399.getMotion();
                                if (((Class428)class399).method2139() == Class2080.field12026 && this.method2139() != Class2080.field12026) {
                                    this.method1936(method1935.mul(0.2, 1.0, 0.2));
                                    this.method1738(method1936.x - n14, 0.0, method1936.z - n15);
                                    class399.method1936(method1936.mul(0.95, 1.0, 0.95));
                                }
                                else if (((Class428)class399).method2139() != Class2080.field12026 && this.method2139() == Class2080.field12026) {
                                    class399.method1936(method1936.mul(0.2, 1.0, 0.2));
                                    class399.method1738(method1935.x + n14, 0.0, method1935.z + n15);
                                    this.method1936(method1935.mul(0.95, 1.0, 0.95));
                                }
                                else {
                                    final double n16 = (method1936.x + method1935.x) / 2.0;
                                    final double n17 = (method1936.z + method1935.z) / 2.0;
                                    this.method1936(method1935.mul(0.2, 1.0, 0.2));
                                    this.method1738(n16 - n14, 0.0, n17 - n15);
                                    class399.method1936(method1936.mul(0.2, 1.0, 0.2));
                                    class399.method1738(n16 + n14, 0.0, n17 + n15);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public void method1788(final double field2629, final double field2630, final double field2631, final float n, final float n2, final int n3, final boolean b) {
        this.field2629 = field2629;
        this.field2630 = field2630;
        this.field2631 = field2631;
        this.field2632 = n;
        this.field2633 = n2;
        this.field2628 = n3 + 2;
        this.setMotion(this.field2634, this.field2635, this.field2636);
    }
    
    @Override
    public void method1797(final double field2634, final double field2635, final double field2636) {
        this.field2634 = field2634;
        this.field2635 = field2635;
        this.field2636 = field2636;
        this.setMotion(this.field2634, this.field2635, this.field2636);
    }
    
    public void method2133(final float f) {
        this.dataManager.set(Class428.field2622, f);
    }
    
    public float method2134() {
        return this.dataManager.get(Class428.field2622);
    }
    
    public void method2135(final int i) {
        this.dataManager.set(Class428.field2620, i);
    }
    
    public int method2136() {
        return this.dataManager.get(Class428.field2620);
    }
    
    public void method2137(final int i) {
        this.dataManager.set(Class428.field2621, i);
    }
    
    public int method2138() {
        return this.dataManager.get(Class428.field2621);
    }
    
    public abstract Class2080 method2139();
    
    public Class7096 method2140() {
        return this.method2146() ? Class3833.method11775(this.method1650().get(Class428.field2623)) : this.method2141();
    }
    
    public Class7096 method2141() {
        return Class7521.field29147.method11878();
    }
    
    public int method2142() {
        return this.method2146() ? this.method1650().get(Class428.field2624) : this.method2143();
    }
    
    public int method2143() {
        return 6;
    }
    
    public void method2144(final Class7096 class7096) {
        this.method1650().set(Class428.field2623, Class3833.method11774(class7096));
        this.method2147(true);
    }
    
    public void method2145(final int i) {
        this.method1650().set(Class428.field2624, i);
        this.method2147(true);
    }
    
    public boolean method2146() {
        return this.method1650().get(Class428.field2625);
    }
    
    public void method2147(final boolean b) {
        this.method1650().set(Class428.field2625, b);
    }
    
    @Override
    public IPacket<?> method1932() {
        return new Class4339(this);
    }
    
    static {
        field2620 = EntityDataManager.method33564(Class428.class, Class7709.field30654);
        field2621 = EntityDataManager.method33564(Class428.class, Class7709.field30654);
        field2622 = EntityDataManager.method33564(Class428.class, Class7709.field30655);
        field2623 = EntityDataManager.method33564(Class428.class, Class7709.field30654);
        field2624 = EntityDataManager.method33564(Class428.class, Class7709.field30654);
        field2625 = EntityDataManager.method33564(Class428.class, Class7709.field30661);
        field2627 = Class8349.method27851(Maps.newEnumMap((Class)Class104.class), enumMap -> {
            Direction.WEST.getDirectionVec();
            Direction.EAST.getDirectionVec();
            Direction.NORTH.getDirectionVec();
            Direction.SOUTH.getDirectionVec();
            final Vec3i class352;
            class352.down();
            final Vec3i class353;
            class353.down();
            final Vec3i class354;
            class354.down();
            final Vec3i class355;
            class355.down();
            enumMap.put(Class104.field311, Pair.of((Object)class354, (Object)class355));
            enumMap.put(Class104.field312, Pair.of((Object)class352, (Object)class353));
            final Vec3i class356;
            enumMap.put(Class104.field313, Pair.of((Object)class356, (Object)class353));
            final Vec3i class357;
            enumMap.put(Class104.field314, Pair.of((Object)class352, (Object)class357));
            final Vec3i class358;
            enumMap.put(Class104.field315, Pair.of((Object)class354, (Object)class358));
            final Vec3i class359;
            enumMap.put(Class104.field316, Pair.of((Object)class359, (Object)class355));
            enumMap.put(Class104.field317, Pair.of((Object)class355, (Object)class353));
            enumMap.put(Class104.field318, Pair.of((Object)class355, (Object)class352));
            enumMap.put(Class104.field319, Pair.of((Object)class354, (Object)class352));
            enumMap.put(Class104.field320, Pair.of((Object)class354, (Object)class353));
        });
    }
}
