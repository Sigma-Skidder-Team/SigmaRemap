// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.entity;

import java.util.AbstractList;

import mapped.*;
import net.minecraft.command.ICommandSource;
import net.minecraft.util.Direction;
import net.minecraft.util.INameable;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;
import org.apache.logging.log4j.LogManager;
import java.util.function.Function;
import java.util.HashSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;

import com.google.common.collect.Iterables;
import java.util.Iterator;
import javax.annotation.Nullable;
import java.util.stream.Stream;
import com.google.common.collect.ImmutableSet;
import java.util.Arrays;
import com.google.common.collect.Sets;
import com.google.common.collect.Lists;
import java.util.Set;
import java.util.UUID;
import java.util.Optional;
import java.util.Random;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.Logger;

public abstract class Entity implements INameable, ICommandSource
{
    public static final Logger LOGGER;
    private static final AtomicInteger NEXT_ENTITY_ID;
    private static final List<ItemStack> EMPTY_EQUIPMENT;
    private static final AxisAlignedBB ZERO_AABB;
    private static double renderDistanceWeight;
    private final EntityType<?> type;
    private int entityId;
    public boolean preventEntitySpawning;
    private final List<Entity> passengers;
    public int rideCooldown;
    private Entity field2389;
    public boolean field2390;
    public Class1847 field2391;
    public double field2392;
    public double field2393;
    public double field2394;
    public double field2395;
    public double field2396;
    public double field2397;
    private Vec3d field2398;
    public float field2399;
    public float field2400;
    public float field2401;
    public float field2402;
    public AxisAlignedBB field2403;
    public boolean field2404;
    public boolean field2405;
    public boolean field2406;
    public boolean field2407;
    public boolean field2408;
    public Vec3d field2409;
    public boolean field2410;
    public float field2411;
    public float field2412;
    public float field2413;
    public float field2414;
    private float field2415;
    private float field2416;
    public double field2417;
    public double field2418;
    public double field2419;
    public float field2420;
    public boolean field2421;
    public float field2422;
    public final Random field2423;
    public int field2424;
    private int field2425;
    public boolean field2426;
    public double field2427;
    public boolean field2428;
    public boolean field2429;
    public int field2430;
    public boolean field2431;
    public final Class9184 field2432;
    public static final Class8810<Byte> field2433;
    private static final Class8810<Integer> field2434;
    private static final Class8810<Optional<ITextComponent>> field2435;
    public static final Class8810<Boolean> field2436;
    private static final Class8810<Boolean> field2437;
    private static final Class8810<Boolean> field2438;
    public static final Class8810<Class290> field2439;
    public boolean field2440;
    public int field2441;
    public int field2442;
    public int field2443;
    public long field2444;
    public long field2445;
    public long field2446;
    public boolean field2447;
    public boolean field2448;
    public int field2449;
    public boolean field2450;
    public int field2451;
    public Class383 field2452;
    public BlockPos field2453;
    public Vec3d field2454;
    public Direction field2455;
    private boolean field2456;
    public UUID field2457;
    public String field2458;
    public boolean field2459;
    private final Set<String> field2460;
    private boolean field2461;
    private final double[] field2462;
    private long field2463;
    private Class8295 field2464;
    public float field2465;
    
    public Entity(final EntityType<?> field2384, final Class1847 field2385) {
        this.entityId = Entity.NEXT_ENTITY_ID.incrementAndGet();
        this.passengers = Lists.newArrayList();
        this.field2398 = Vec3d.ZERO;
        this.field2403 = Entity.ZERO_AABB;
        this.field2409 = Vec3d.ZERO;
        this.field2415 = 1.0f;
        this.field2416 = 1.0f;
        this.field2423 = new Random();
        this.field2425 = -this.method1923();
        this.field2431 = true;
        this.field2457 = MathHelper.method35690(this.field2423);
        this.field2458 = this.field2457.toString();
        this.field2460 = Sets.newHashSet();
        this.field2462 = new double[] { 0.0, 0.0, 0.0 };
        this.type = field2384;
        this.field2391 = field2385;
        this.field2464 = field2384.method23376();
        this.method1656(0.0, 0.0, 0.0);
        if (field2385 != null) {
            this.field2452 = field2385.field10063.method20487();
        }
        (this.field2432 = new Class9184(this)).method33565(Entity.field2433, (Byte)0);
        this.field2432.method33565(Entity.field2434, this.method1831());
        this.field2432.method33565(Entity.field2436, false);
        this.field2432.method33565(Entity.field2435, Optional.empty());
        this.field2432.method33565(Entity.field2437, false);
        this.field2432.method33565(Entity.field2438, false);
        this.field2432.method33565(Entity.field2439, Class290.field1663);
        this.method1649();
        this.field2465 = this.method1890(Class290.field1663, this.field2464);
    }
    
    public int method1638() {
        final Class6750 method1825 = this.method1825();
        return (method1825 != null && method1825.method20563().method8256() != null) ? method1825.method20563().method8256() : 16777215;
    }
    
    public boolean method1639() {
        return false;
    }
    
    public final void method1640() {
        if (this.method1806()) {
            this.method1783();
        }
        if (this.method1805()) {
            this.method1784();
        }
    }
    
    public void method1641(final double n, final double n2, final double n3) {
        this.field2444 = Class4370.method13140(n);
        this.field2445 = Class4370.method13140(n2);
        this.field2446 = Class4370.method13140(n3);
    }
    
    public EntityType<?> method1642() {
        return this.type;
    }
    
    public int method1643() {
        return this.entityId;
    }
    
    public void method1644(final int field2385) {
        this.entityId = field2385;
    }
    
    public Set<String> method1645() {
        return this.field2460;
    }
    
    public boolean method1646(final String s) {
        return this.field2460.size() < 1024 && this.field2460.add(s);
    }
    
    public boolean method1647(final String s) {
        return this.field2460.remove(s);
    }
    
    public void method1648() {
        this.method1652();
    }
    
    public abstract void method1649();
    
    public Class9184 method1650() {
        return this.field2432;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof Entity && ((Entity)o).entityId == this.entityId;
    }
    
    @Override
    public int hashCode() {
        return this.entityId;
    }
    
    public void method1651() {
        if (this.field2391 != null) {
            for (double method1941 = this.getPosY(); method1941 > 0.0; ++method1941) {
                if (method1941 >= 256.0) {
                    break;
                }
                this.method1656(this.getPosX(), method1941, this.getPosZ());
                if (this.field2391.method6977(this)) {
                    break;
                }
            }
            this.method1936(Vec3d.ZERO);
            this.field2400 = 0.0f;
        }
    }
    
    public void method1652() {
        this.field2410 = true;
    }
    
    public void method1653(final Class290 class290) {
        this.field2432.method33569(Entity.field2439, class290);
    }
    
    public Class290 method1654() {
        return this.field2432.method33568(Entity.field2439);
    }
    
    public void method1655(final float n, final float n2) {
        this.field2399 = n % 360.0f;
        this.field2400 = n2 % 360.0f;
    }
    
    public void method1656(final double n, final double n2, final double n3) {
        this.method1948(n, n2, n3);
        final float n4 = this.field2464.field34097 / 2.0f;
        this.method1889(new AxisAlignedBB(n - n4, n2, n3 - n4, n + n4, n2 + this.field2464.field34098, n3 + n4));
    }
    
    public void method1657() {
        this.method1656(this.field2395, this.field2396, this.field2397);
    }
    
    public void method1658(final double n, final double n2) {
        final double n3 = n2 * 0.15;
        final double n4 = n * 0.15;
        this.field2400 += (float)n3;
        this.field2399 += (float)n4;
        this.field2400 = MathHelper.clamp(this.field2400, -90.0f, 90.0f);
        this.field2402 += (float)n3;
        this.field2401 += (float)n4;
        this.field2402 = MathHelper.clamp(this.field2402, -90.0f, 90.0f);
        if (this.field2389 != null) {
            this.field2389.method1775(this);
        }
    }
    
    public void method1659() {
        if (!this.field2391.field10067) {
            this.method1830(6, this.method1821());
        }
        this.method1660();
    }
    
    public void method1660() {
        this.field2391.method6796().method15297("entityBaseTick");
        if (this.method1805()) {
            if (this.method1920().field2410) {
                this.method1784();
            }
        }
        if (this.rideCooldown > 0) {
            --this.rideCooldown;
        }
        this.field2411 = this.field2412;
        this.field2402 = this.field2400;
        this.field2401 = this.field2399;
        this.method1795();
        this.method1718();
        this.method1713();
        if (!this.field2391.field10067) {
            if (this.field2425 > 0) {
                if (!this.method1704()) {
                    if (this.field2425 % 20 == 0) {
                        this.method1740(Class7929.field32564, 1.0f);
                    }
                    --this.field2425;
                }
                else {
                    this.field2425 -= 4;
                    if (this.field2425 < 0) {
                        this.method1667();
                    }
                }
            }
        }
        else {
            this.method1667();
        }
        if (this.method1723()) {
            this.method1663();
            this.field2414 *= 0.5f;
        }
        if (this.getPosY() < -64.0) {
            this.method1668();
        }
        if (!this.field2391.field10067) {
            this.method1830(0, this.field2425 > 0);
        }
        this.field2431 = false;
        this.field2391.method6796().method15299();
    }
    
    public void method1661() {
        if (this.field2449 > 0) {
            --this.field2449;
        }
    }
    
    public int method1662() {
        return 1;
    }
    
    public void method1663() {
        if (!this.method1704()) {
            this.method1664(15);
            this.method1740(Class7929.field32565, 4.0f);
        }
    }
    
    public void method1664(final int n) {
        int method18607 = n * 20;
        if (this instanceof Class511) {
            method18607 = Class6269.method18607((Class511)this, method18607);
        }
        if (this.field2425 < method18607) {
            this.field2425 = method18607;
        }
    }
    
    public void method1665(final int field2425) {
        this.field2425 = field2425;
    }
    
    public int method1666() {
        return this.field2425;
    }
    
    public void method1667() {
        this.field2425 = 0;
    }
    
    public void method1668() {
        this.method1652();
    }
    
    public boolean method1669(final double n, final double n2, final double n3) {
        return this.method1670(this.method1886().method18499(n, n2, n3));
    }
    
    private boolean method1670(final AxisAlignedBB class6221) {
        return this.field2391.method6978(this, class6221) && !this.field2391.method6968(class6221);
    }
    
    public void method1671(final Class2160 class2160, Vec3d class2161) {
        if (Class869.method5277().field4684 != null && Class869.method5277().field4684.method1920() != null && Class869.method5277().field4684.method1920().method1643() == this.method1643()) {
            final Class5718 class2162 = new Class5718(class2161.x, class2161.y, class2161.z);
            Class9463.method35173().method35188().method21097(class2162);
            if (class2162.method16962()) {
                return;
            }
            class2161 = new Vec3d(class2162.method16980(), class2162.method16982(), class2162.method16984());
        }
        if (this.field2421) {
            this.method1889(this.method1886().method18501(class2161));
            this.method1685();
        }
        else {
            if (class2160 == Class2160.field12828) {
                class2161 = this.method1677(class2161);
                if (class2161.equals(Vec3d.ZERO)) {
                    return;
                }
            }
            this.field2391.method6796().method15297("move");
            if (this.field2409.lengthSquared() > 1.0E-7) {
                class2161 = class2161.mul(this.field2409);
                this.field2409 = Vec3d.ZERO;
                this.method1936(Vec3d.ZERO);
            }
            class2161 = this.method1676(class2161, class2160);
            final Vec3d method1679 = this.method1679(class2161);
            if (method1679.lengthSquared() > 1.0E-7) {
                this.method1889(this.method1886().method18501(method1679));
                this.method1685();
            }
            this.field2391.method6796().method15299();
            this.field2391.method6796().method15297("rest");
            this.field2405 = (!MathHelper.method35663(class2161.x, method1679.x) || !MathHelper.method35663(class2161.z, method1679.z));
            this.field2406 = (class2161.y != method1679.y);
            this.field2404 = (this.field2406 && class2161.y < 0.0);
            this.field2407 = (this.field2405 || this.field2406);
            final BlockPos method1680 = this.method1672();
            final Class7096 method1681 = this.field2391.method6701(method1680);
            this.method1701(method1679.y, this.field2404, method1681, method1680);
            final Vec3d method1682 = this.method1935();
            if (class2161.x != method1679.x) {
                this.method1937(0.0, method1682.y, method1682.z);
            }
            if (class2161.z != method1679.z) {
                this.method1937(method1682.x, method1682.y, 0.0);
            }
            final Class3833 method1683 = method1681.method21696();
            if (class2161.y != method1679.y) {
                method1683.method11861(this.field2391, this);
            }
            if (this.field2404 && !this.method1810()) {
                method1683.method11845(this.field2391, method1680, this);
            }
            if (this.method1700() && !this.method1805()) {
                final double field22770 = method1679.x;
                double field22771 = method1679.y;
                final double field22772 = method1679.z;
                if (method1683 != Class7521.field29307 && method1683 != Class7521.field29805) {
                    field22771 = 0.0;
                }
                this.field2412 += (float)(MathHelper.sqrt(method1680(method1679)) * 0.6);
                this.field2413 += (float)(MathHelper.sqrt(field22770 * field22770 + field22771 * field22771 + field22772 * field22772) * 0.6);
                if (this.field2413 > this.field2415 && !method1681.method21706()) {
                    this.field2415 = this.method1684();
                    if (this.method1706()) {
                        final Entity class2163 = (this.method1806() && this.method1907() != null) ? this.method1907() : this;
                        final float n = (class2163 == this) ? 0.35f : 0.4f;
                        final Vec3d method1684 = class2163.method1935();
                        float n2 = MathHelper.sqrt(method1684.x * method1684.x * 0.20000000298023224 + method1684.y * method1684.y + method1684.z * method1684.z * 0.20000000298023224) * n;
                        if (n2 > 1.0f) {
                            n2 = 1.0f;
                        }
                        this.method1692(n2);
                    }
                    else {
                        this.method1691(method1680, method1681);
                    }
                }
                else if (this.field2413 > this.field2416 && this.method1694() && method1681.method21706()) {
                    this.field2416 = this.method1693(this.field2413);
                }
            }
            try {
                this.field2429 = false;
                this.method1689();
            }
            catch (final Throwable t) {
                final Class7689 method1685 = Class7689.method24421(t, "Checking entity block collision");
                this.method1862(method1685.method24418("Entity being checked for collision"));
                throw new Class2365(method1685);
            }
            this.method1936(this.method1935().mul(this.method1674(), 1.0, this.method1674()));
            final boolean method1686 = this.method1710();
            if (this.field2391.method6719(this.method1886().method18511(0.001))) {
                if (!method1686) {
                    ++this.field2425;
                    if (this.field2425 == 0) {
                        this.method1664(8);
                    }
                }
                this.method1703(1);
            }
            else if (this.field2425 <= 0) {
                this.field2425 = -this.method1923();
            }
            if (method1686 && this.method1804()) {
                this.method1695(Class8520.field35219, 0.7f, 1.6f + (this.field2423.nextFloat() - this.field2423.nextFloat()) * 0.4f);
                this.field2425 = -this.method1923();
            }
            this.field2391.method6796().method15299();
        }
    }
    
    public BlockPos method1672() {
        final BlockPos class354 = new BlockPos(MathHelper.floor(this.field2395), MathHelper.floor(this.field2396 - 0.20000000298023224), MathHelper.floor(this.field2397));
        if (this.field2391.method6701(class354).method21706()) {
            final BlockPos method1139 = class354.method1139();
            final Class3833 method1140 = this.field2391.method6701(method1139).method21696();
            if (!method1140.method11785(Class7188.field27911)) {
                if (!method1140.method11785(Class7188.field27904)) {
                    if (!(method1140 instanceof Class3898)) {
                        return class354;
                    }
                }
            }
            return method1139;
        }
        return class354;
    }
    
    public float method1673() {
        final float method11867 = this.field2391.method6701(new BlockPos(this)).method21696().method11867();
        final float method11868 = this.field2391.method6701(this.method1675()).method21696().method11867();
        return (method11867 != 1.0) ? method11867 : method11868;
    }
    
    public float method1674() {
        final Class3833 method21696 = this.field2391.method6701(new BlockPos(this)).method21696();
        final float method21697 = method21696.method11866();
        if (method21696 != Class7521.field29173 && method21696 != Class7521.field29765) {
            return (method21697 != 1.0) ? method21697 : this.field2391.method6701(this.method1675()).method21696().method11866();
        }
        return method21697;
    }
    
    public BlockPos method1675() {
        return new BlockPos(this.field2395, this.method1886().field25074 - 0.5000001, this.field2397);
    }
    
    public Vec3d method1676(final Vec3d class5487, final Class2160 class5488) {
        return class5487;
    }
    
    public Vec3d method1677(final Vec3d class5487) {
        if (class5487.lengthSquared() <= 1.0E-7) {
            return class5487;
        }
        final long method6754 = this.field2391.method6754();
        if (method6754 != this.field2463) {
            Arrays.fill(this.field2462, 0.0);
            this.field2463 = method6754;
        }
        if (class5487.x != 0.0) {
            final double method6755 = this.method1678(Axis.X, class5487.x);
            return (Math.abs(method6755) > 9.999999747378752E-6) ? new Vec3d(method6755, 0.0, 0.0) : Vec3d.ZERO;
        }
        if (class5487.y != 0.0) {
            final double method6756 = this.method1678(Axis.Y, class5487.y);
            return (Math.abs(method6756) > 9.999999747378752E-6) ? new Vec3d(0.0, method6756, 0.0) : Vec3d.ZERO;
        }
        if (class5487.z == 0.0) {
            return Vec3d.ZERO;
        }
        final double method6757 = this.method1678(Axis.Z, class5487.z);
        return (Math.abs(method6757) > 9.999999747378752E-6) ? new Vec3d(0.0, 0.0, method6757) : Vec3d.ZERO;
    }
    
    private double method1678(final Axis class111, double n) {
        final int ordinal = class111.ordinal();
        final double method35654 = MathHelper.method35654(n + this.field2462[ordinal], -0.51, 0.51);
        n = method35654 - this.field2462[ordinal];
        this.field2462[ordinal] = method35654;
        return n;
    }
    
    public Vec3d method1679(final Vec3d class5487) {
        final AxisAlignedBB method1886 = this.method1886();
        final Class7543 method1887 = Class7543.method23630(this);
        final Class7702 method1888 = this.field2391.method6787().method34783();
        final Class8120 class5488 = new Class8120<Class7702>(Stream.concat((Stream<?>)this.field2391.method6956(this, method1886.method18493(class5487), (Set<Entity>)ImmutableSet.of()), (Stream<?>)(Class7698.method24496(method1888, Class7698.method24489(method1886.method18511(1.0E-7)), Class9306.field39924) ? Stream.empty() : Stream.of(method1888))));
        final Vec3d class5489 = (class5487.lengthSquared() != 0.0) ? method1681(this, class5487, method1886, this.field2391, method1887, (Class8120<Class7702>)class5488) : class5487;
        final boolean b = class5487.x != class5489.x;
        final boolean b2 = class5487.y != class5489.y;
        final boolean b3 = class5487.z != class5489.z;
        final boolean b4 = this.field2404 || (b2 && class5487.y < 0.0);
        if (this.field2420 > 0.0f) {
            if (b4) {
                if (b || b3) {
                    Vec3d method1889 = method1681(this, new Vec3d(class5487.x, this.field2420, class5487.z), method1886, this.field2391, method1887, (Class8120<Class7702>)class5488);
                    final Vec3d method1890 = method1681(this, new Vec3d(0.0, this.field2420, 0.0), method1886.method18494(class5487.x, 0.0, class5487.z), this.field2391, method1887, (Class8120<Class7702>)class5488);
                    if (method1890.y < this.field2420) {
                        final Vec3d method1891 = method1681(this, new Vec3d(class5487.x, 0.0, class5487.z), method1886.method18501(method1890), this.field2391, method1887, (Class8120<Class7702>)class5488).add(method1890);
                        if (method1680(method1891) > method1680(method1889)) {
                            method1889 = method1891;
                        }
                    }
                    if (method1680(method1889) > method1680(class5489)) {
                        Vec3d class5490 = method1889.add(method1681(this, new Vec3d(0.0, -method1889.y + class5487.y, 0.0), method1886.method18501(method1889), this.field2391, method1887, (Class8120<Class7702>)class5488));
                        if (class5490.y > 0.0 && this instanceof Class756) {
                            final Class5745 class5491 = new Class5745(class5490.y, class5489);
                            Class9463.method35173().method35188().method21097(class5491);
                            if (class5491.method16962()) {
                                class5490 = class5491.method17052();
                            }
                        }
                        else if (class5490.y > 0.0) {
                            if (Class869.method5277().field4684 != null) {
                                if (Class869.method5277().field4684.method1920() != null) {
                                    if (Class869.method5277().field4684.method1920().method1643() == this.method1643()) {
                                        Class9463.method35173().method35188().method21097(new Class5731(class5490.y));
                                    }
                                }
                            }
                        }
                        return class5490;
                    }
                }
            }
        }
        return class5489;
    }
    
    public static double method1680(final Vec3d class5487) {
        return class5487.x * class5487.x + class5487.z * class5487.z;
    }
    
    public static Vec3d method1681(final Entity class399, final Vec3d class400, final AxisAlignedBB class401, final Class1847 class402, final Class7543 class403, final Class8120<Class7702> class404) {
        final boolean b = class400.x == 0.0;
        final boolean b2 = class400.y == 0.0;
        final boolean b3 = class400.z == 0.0;
        if (!b || !b2) {
            if (!b || !b3) {
                if (!b2 || !b3) {
                    return method1682(class400, class401, new Class8120<Class7702>(Stream.concat((Stream<? extends Class7702>)class404.method26730(), (Stream<? extends Class7702>)class402.method6981(class399, class401.method18493(class400)))));
                }
            }
        }
        return method1683(class400, class401, class402, class403, class404, class399 != null && class399 instanceof Class756);
    }
    
    public static Vec3d method1682(final Vec3d class5487, AxisAlignedBB class5488, final Class8120<Class7702> class5489) {
        double a = class5487.x;
        double n = class5487.y;
        double a2 = class5487.z;
        if (n != 0.0) {
            n = Class7698.method24498(Axis.Y, class5488, class5489.method26730(), n);
            if (n != 0.0) {
                class5488 = class5488.method18499(0.0, n, 0.0);
            }
        }
        final boolean b = Math.abs(a) < Math.abs(a2);
        if (b) {
            if (a2 != 0.0) {
                a2 = Class7698.method24498(Axis.Z, class5488, class5489.method26730(), a2);
                if (a2 != 0.0) {
                    class5488 = class5488.method18499(0.0, 0.0, a2);
                }
            }
        }
        if (a != 0.0) {
            a = Class7698.method24498(Axis.X, class5488, class5489.method26730(), a);
            if (!b) {
                if (a != 0.0) {
                    class5488 = class5488.method18499(a, 0.0, 0.0);
                }
            }
        }
        if (!b) {
            if (a2 != 0.0) {
                a2 = Class7698.method24498(Axis.Z, class5488, class5489.method26730(), a2);
            }
        }
        return new Vec3d(a, n, a2);
    }
    
    public static Vec3d method1683(final Vec3d class5487, AxisAlignedBB class5488, final Class1852 class5489, final Class7543 class5490, final Class8120<Class7702> class5491, final boolean b) {
        double a = class5487.x;
        double n = class5487.y;
        double a2 = class5487.z;
        if (n != 0.0) {
            n = Class7698.method24499(Axis.Y, class5488, class5489, n, class5490, class5491.method26730(), b);
            if (n != 0.0) {
                class5488 = class5488.method18499(0.0, n, 0.0);
            }
        }
        final boolean b2 = Math.abs(a) < Math.abs(a2);
        if (b2) {
            if (a2 != 0.0) {
                a2 = Class7698.method24499(Axis.Z, class5488, class5489, a2, class5490, class5491.method26730(), b);
                if (a2 != 0.0) {
                    class5488 = class5488.method18499(0.0, 0.0, a2);
                }
            }
        }
        if (a != 0.0) {
            a = Class7698.method24499(Axis.X, class5488, class5489, a, class5490, class5491.method26730(), b);
            if (!b2) {
                if (a != 0.0) {
                    class5488 = class5488.method18499(a, 0.0, 0.0);
                }
            }
        }
        if (!b2) {
            if (a2 != 0.0) {
                a2 = Class7698.method24499(Axis.Z, class5488, class5489, a2, class5490, class5491.method26730(), b);
            }
        }
        return new Vec3d(a, n, a2);
    }
    
    public float method1684() {
        return (float)((int)this.field2413 + 1);
    }
    
    public void method1685() {
        final AxisAlignedBB method1886 = this.method1886();
        this.method1948((method1886.field25073 + method1886.field25076) / 2.0, method1886.field25074, (method1886.field25075 + method1886.field25078) / 2.0);
    }
    
    public Class7795 method1686() {
        return Class8520.field35223;
    }
    
    public Class7795 method1687() {
        return Class8520.field35222;
    }
    
    public Class7795 method1688() {
        return Class8520.field35222;
    }
    
    public void method1689() {
        final AxisAlignedBB method1886 = this.method1886();
        try (final Class386 method1887 = Class386.method1298(method1886.field25073 + 0.001, method1886.field25074 + 0.001, method1886.field25075 + 0.001);
             final Class386 method1888 = Class386.method1298(method1886.field25076 - 0.001, method1886.field25077 - 0.001, method1886.field25078 - 0.001);
             final Class386 method1889 = Class386.method1296()) {
            if (this.field2391.method6972(method1887, method1888)) {
                for (int i = method1887.getX(); i <= method1888.getX(); ++i) {
                    for (int j = method1887.getY(); j <= method1888.getY(); ++j) {
                        for (int k = method1887.getZ(); k <= method1888.getZ(); ++k) {
                            method1889.method1300(i, j, k);
                            final Class7096 method1890 = this.field2391.method6701(method1889);
                            try {
                                method1890.method21741(this.field2391, method1889, this);
                                this.method1690(method1890);
                            }
                            catch (final Throwable t4) {
                                final Class7689 method1891 = Class7689.method24421(t4, "Colliding entity with block");
                                Class5204.method16304(method1891.method24418("Block being collided with"), method1889, method1890);
                                throw new Class2365(method1891);
                            }
                        }
                    }
                }
            }
        }
    }
    
    public void method1690(final Class7096 class7096) {
    }
    
    public void method1691(final BlockPos class354, final Class7096 class355) {
        if (!class355.method21697().method26438()) {
            final Class7096 method6701 = this.field2391.method6701(class354.method1137());
            final Class7696 class356 = (method6701.method21696() != Class7521.field29329) ? class355.method21759() : method6701.method21759();
            this.method1695(class356.method24480(), class356.method24477() * 0.15f, class356.method24478());
        }
    }
    
    public void method1692(final float n) {
        this.method1695(this.method1686(), n, 1.0f + (this.field2423.nextFloat() - this.field2423.nextFloat()) * 0.4f);
    }
    
    public float method1693(final float n) {
        return 0.0f;
    }
    
    public boolean method1694() {
        return false;
    }
    
    public void method1695(final Class7795 class7795, final float n, final float n2) {
        if (!this.method1696()) {
            this.field2391.method6706(null, this.getPosX(), this.getPosY(), this.getPosZ(), class7795, this.method1922(), n, n2);
        }
    }
    
    public boolean method1696() {
        return this.field2432.method33568(Entity.field2437);
    }
    
    public void method1697(final boolean b) {
        this.field2432.method33569(Entity.field2437, b);
    }
    
    public boolean method1698() {
        return this.field2432.method33568(Entity.field2438);
    }
    
    public void method1699(final boolean b) {
        this.field2432.method33569(Entity.field2438, b);
    }
    
    public boolean method1700() {
        return true;
    }
    
    public void method1701(final double n, final boolean b, final Class7096 class7096, final BlockPos class7097) {
        if (!b) {
            if (n < 0.0) {
                this.field2414 -= (float)n;
            }
        }
        else {
            if (this.field2414 > 0.0f) {
                class7096.method21696().method11860(this.field2391, class7097, this, this.field2414);
            }
            this.field2414 = 0.0f;
        }
    }
    
    @Nullable
    public AxisAlignedBB method1702() {
        return null;
    }
    
    public void method1703(final int n) {
        if (!this.method1704()) {
            this.method1740(Class7929.field32562, (float)n);
        }
    }
    
    public final boolean method1704() {
        return this.method1642().method23363();
    }
    
    public boolean method1705(final float n, final float n2) {
        if (this.method1806()) {
            final Iterator<Entity> iterator = this.method1908().iterator();
            while (iterator.hasNext()) {
                iterator.next().method1705(n, n2);
            }
        }
        return false;
    }
    
    public boolean method1706() {
        return this.field2426;
    }
    
    private boolean method1707() {
        boolean b;
        try (final Class386 method1297 = Class386.method1297(this)) {
            b = (this.field2391.method6772(method1297) || this.field2391.method6772(method1297.method1302(this.getPosX(), this.getPosY() + this.field2464.field34098, this.getPosZ())));
        }
        return b;
    }
    
    private boolean method1708() {
        return this.field2391.method6701(new BlockPos(this)).method21696() == Class7521.field29765;
    }
    
    public boolean method1709() {
        return this.method1706() || this.method1707();
    }
    
    public boolean method1710() {
        if (!this.method1706()) {
            if (!this.method1707()) {
                if (!this.method1708()) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean method1711() {
        return this.method1706() || this.method1708();
    }
    
    public boolean method1712() {
        return this.field2428 && this.method1706();
    }
    
    private void method1713() {
        this.method1715();
        this.method1716();
        this.method1714();
    }
    
    public void method1714() {
        if (!this.method1817()) {
            boolean b = false;
            Label_0086: {
                if (this.method1815()) {
                    if (this.method1712()) {
                        if (!this.method1805()) {
                            b = true;
                            break Label_0086;
                        }
                    }
                }
                b = false;
            }
            this.method1820(b);
        }
        else {
            boolean b2 = false;
            Label_0056: {
                if (this.method1815()) {
                    if (this.method1706()) {
                        if (!this.method1805()) {
                            b2 = true;
                            break Label_0056;
                        }
                    }
                }
                b2 = false;
            }
            this.method1820(b2);
        }
    }
    
    public boolean method1715() {
        if (!(this.method1920() instanceof Class423)) {
            if (!this.method1928(Class7324.field28319)) {
                this.field2426 = false;
            }
            else {
                if (!this.field2426) {
                    if (!this.field2431) {
                        this.method1717();
                    }
                }
                this.field2414 = 0.0f;
                this.field2426 = true;
                this.method1667();
            }
        }
        else {
            this.field2426 = false;
        }
        return this.field2426;
    }
    
    private void method1716() {
        this.field2428 = this.method1721(Class7324.field28319, true);
    }
    
    public void method1717() {
        final Entity class399 = (this.method1806() && this.method1907() != null) ? this.method1907() : this;
        final float n = (class399 != this) ? 0.9f : 0.2f;
        final Vec3d method1935 = class399.method1935();
        float n2 = MathHelper.sqrt(method1935.x * method1935.x * 0.20000000298023224 + method1935.y * method1935.y + method1935.z * method1935.z * 0.20000000298023224) * n;
        if (n2 > 1.0f) {
            n2 = 1.0f;
        }
        if (n2 >= 0.25) {
            this.method1695(this.method1688(), n2, 1.0f + (this.field2423.nextFloat() - this.field2423.nextFloat()) * 0.4f);
        }
        else {
            this.method1695(this.method1687(), n2, 1.0f + (this.field2423.nextFloat() - this.field2423.nextFloat()) * 0.4f);
        }
        final float n3 = (float) MathHelper.floor(this.getPosY());
        for (int n4 = 0; n4 < 1.0f + this.field2464.field34097 * 20.0f; ++n4) {
            this.field2391.method6709(Class8432.field34601, this.getPosX() + (this.field2423.nextFloat() * 2.0f - 1.0f) * this.field2464.field34097, n3 + 1.0f, this.getPosZ() + (this.field2423.nextFloat() * 2.0f - 1.0f) * this.field2464.field34097, method1935.x, method1935.y - this.field2423.nextFloat() * 0.2f, method1935.z);
        }
        for (int n5 = 0; n5 < 1.0f + this.field2464.field34097 * 20.0f; ++n5) {
            this.field2391.method6709(Class8432.field34646, this.getPosX() + (this.field2423.nextFloat() * 2.0f - 1.0f) * this.field2464.field34097, n3 + 1.0f, this.getPosZ() + (this.field2423.nextFloat() * 2.0f - 1.0f) * this.field2464.field34097, method1935.x, method1935.y, method1935.z);
        }
    }
    
    public void method1718() {
        if (this.method1815()) {
            if (!this.method1706()) {
                this.method1719();
            }
        }
    }
    
    public void method1719() {
        final Class7096 method6701 = this.field2391.method6701(new BlockPos(MathHelper.floor(this.getPosX()), MathHelper.floor(this.getPosY() - 0.20000000298023224), MathHelper.floor(this.getPosZ())));
        if (method6701.method21710() != Class2115.field12305) {
            final Vec3d method6702 = this.method1935();
            this.field2391.method6709(new Class6911(Class8432.field34600, method6701), this.getPosX() + (this.field2423.nextFloat() - 0.5) * this.field2464.field34097, this.getPosY() + 0.1, this.getPosZ() + (this.field2423.nextFloat() - 0.5) * this.field2464.field34097, method6702.x * -4.0, 1.5, method6702.z * -4.0);
        }
    }
    
    public boolean method1720(final Class7909<Class7255> class7909) {
        return this.method1721(class7909, false);
    }
    
    public boolean method1721(final Class7909<Class7255> class7909, final boolean b) {
        if (this.method1920() instanceof Class423) {
            return false;
        }
        final double method1944 = this.method1944();
        final BlockPos class7910 = new BlockPos(this.getPosX(), method1944, this.getPosZ());
        if (b && !this.field2391.method6814(class7910.getX() >> 4, class7910.getZ() >> 4)) {
            return false;
        }
        final Class7099 method1945 = this.field2391.method6702(class7910);
        return method1945.method21793(class7909) && method1944 < class7910.getY() + method1945.method21782(this.field2391, class7910) + 0.11111111f;
    }
    
    public void method1722() {
        this.field2429 = true;
    }
    
    public boolean method1723() {
        return this.field2429;
    }
    
    public void method1724(final float n, final Vec3d class5487) {
        this.method1936(this.method1935().add(method1725(class5487, n, this.field2399)));
    }
    
    private static Vec3d method1725(final Vec3d class5487, final float n, final float n2) {
        final double method16753 = class5487.lengthSquared();
        if (method16753 >= 1.0E-7) {
            final Vec3d method16754 = ((method16753 <= 1.0) ? class5487 : class5487.normalize()).scale(n);
            final float method16755 = MathHelper.sin(n2 * 0.017453292f);
            final float method16756 = MathHelper.cos(n2 * 0.017453292f);
            return new Vec3d(method16754.x * method16756 - method16754.z * method16755, method16754.y, method16754.z * method16756 + method16754.x * method16755);
        }
        return Vec3d.ZERO;
    }
    
    public float method1726() {
        final Class385 class385 = new Class385(this.getPosX(), 0.0, this.getPosZ());
        if (!this.field2391.method6971(class385)) {
            return 0.0f;
        }
        class385.method1294(MathHelper.floor(this.method1944()));
        return this.field2391.method6963(class385);
    }
    
    public void method1727(final Class1847 field2391) {
        this.field2391 = field2391;
    }
    
    public void method1728(final double n, final double field2393, final double n2, final float n3, final float n4) {
        this.method1656(this.field2392 = MathHelper.method35654(n, -3.0E7, 3.0E7), this.field2393 = field2393, this.field2394 = MathHelper.method35654(n2, -3.0E7, 3.0E7));
        this.field2399 = n3 % 360.0f;
        this.field2400 = MathHelper.clamp(n4, -90.0f, 90.0f) % 360.0f;
        this.field2401 = this.field2399;
        this.field2402 = this.field2400;
    }
    
    public void method1729(final BlockPos class354, final float n, final float n2) {
        this.method1730(class354.getX() + 0.5, class354.getY(), class354.getZ() + 0.5, n, n2);
    }
    
    public void method1730(final double n, final double n2, final double n3, final float field2399, final float field2400) {
        this.method1731(n, n2, n3);
        this.field2399 = field2399;
        this.field2400 = field2400;
        this.method1657();
    }
    
    public void method1731(final double n, final double n2, final double n3) {
        this.method1948(n, n2, n3);
        this.field2392 = n;
        this.field2393 = n2;
        this.field2394 = n3;
        this.field2417 = n;
        this.field2418 = n2;
        this.field2419 = n3;
    }
    
    public float method1732(final Entity class399) {
        final float n = (float)(this.getPosX() - class399.getPosX());
        final float n2 = (float)(this.getPosY() - class399.getPosY());
        final float n3 = (float)(this.getPosZ() - class399.getPosZ());
        return MathHelper.method35640(n * n + n2 * n2 + n3 * n3);
    }
    
    public double method1733(final double n, final double n2, final double n3) {
        final double n4 = this.getPosX() - n;
        final double n5 = this.getPosY() - n2;
        final double n6 = this.getPosZ() - n3;
        return n4 * n4 + n5 * n5 + n6 * n6;
    }
    
    public double method1734(final Entity class399) {
        return this.method1735(class399.method1934());
    }
    
    public double method1735(final Vec3d class5487) {
        final double n = this.getPosX() - class5487.x;
        final double n2 = this.getPosY() - class5487.y;
        final double n3 = this.getPosZ() - class5487.z;
        return n * n + n2 * n2 + n3 * n3;
    }
    
    public void method1736(final Class512 class512) {
    }
    
    public void method1737(final Entity class399) {
        if (!this.method1916(class399)) {
            if (!class399.field2421) {
                if (!this.field2421) {
                    final double n = class399.getPosX() - this.getPosX();
                    final double n2 = class399.getPosZ() - this.getPosZ();
                    final double method35656 = MathHelper.method35656(n, n2);
                    if (method35656 >= 0.009999999776482582) {
                        final double n3 = MathHelper.sqrt(method35656);
                        final double n4 = n / n3;
                        final double n5 = n2 / n3;
                        double n6 = 1.0 / n3;
                        if (n6 > 1.0) {
                            n6 = 1.0;
                        }
                        final double n7 = n4 * n6;
                        final double n8 = n5 * n6;
                        final double n9 = n7 * 0.05000000074505806;
                        final double n10 = n8 * 0.05000000074505806;
                        final double n11 = n9 * (1.0f - this.field2422);
                        final double n12 = n10 * (1.0f - this.field2422);
                        if (!this.method1806()) {
                            this.method1738(-n11, 0.0, -n12);
                        }
                        if (!class399.method1806()) {
                            class399.method1738(n11, 0.0, n12);
                        }
                    }
                }
            }
        }
    }
    
    public void method1738(final double n, final double n2, final double n3) {
        this.method1936(this.method1935().add(n, n2, n3));
        this.field2448 = true;
    }
    
    public void method1739() {
        this.field2408 = true;
    }
    
    public boolean method1740(final Class7929 class7929, final float n) {
        if (!this.method1849(class7929)) {
            this.method1739();
            return false;
        }
        return false;
    }
    
    public final Vec3d method1741(final float n) {
        return this.method1744(this.getPitch(n), this.getYaw(n));
    }
    
    public float getPitch(final float n) {
        return (n != 1.0f) ? MathHelper.method35700(n, this.field2402, this.field2400) : this.field2400;
    }
    
    public float getYaw(final float n) {
        return (n != 1.0f) ? MathHelper.method35700(n, this.field2401, this.field2399) : this.field2399;
    }
    
    public final Vec3d method1744(final float n, final float n2) {
        final float n3 = n * 0.017453292f;
        final float n4 = -n2 * 0.017453292f;
        final float method35639 = MathHelper.cos(n4);
        final float method35640 = MathHelper.sin(n4);
        final float method35641 = MathHelper.cos(n3);
        return new Vec3d(method35640 * method35641, -MathHelper.sin(n3), method35639 * method35641);
    }
    
    public final Vec3d method1745(final float n) {
        return this.method1746(this.getPitch(n), this.getYaw(n));
    }
    
    public final Vec3d method1746(final float n, final float n2) {
        return this.method1744(n - 90.0f, n2);
    }
    
    public final Vec3d method1747(final float n) {
        if (n != 1.0f) {
            return new Vec3d(MathHelper.method35701(n, this.field2392, this.getPosX()), MathHelper.method35701(n, this.field2393, this.getPosY()) + this.method1892(), MathHelper.method35701(n, this.field2394, this.getPosZ()));
        }
        return new Vec3d(this.getPosX(), this.method1944(), this.getPosZ());
    }
    
    public Class7006 method1748(final double n, final float n2, final boolean b) {
        final Vec3d method1747 = this.method1747(n2);
        final Vec3d method1748 = this.method1741(n2);
        return this.field2391.method6987(new Class8478(method1747, method1747.add(method1748.x * n, method1748.y * n, method1748.z * n), Class2040.field11633, b ? Class2191.field13327 : Class2191.field13325, this));
    }
    
    public boolean method1749() {
        return false;
    }
    
    public boolean method1750() {
        return false;
    }
    
    public void method1751(final Entity class399, final int n, final Class7929 class400) {
        if (class399 instanceof Class513) {
            Class7770.field31777.method13738((Class513)class399, this, class400);
        }
    }
    
    public boolean method1752(final double n, final double n2, final double n3) {
        final double n4 = this.getPosX() - n;
        final double n5 = this.getPosY() - n2;
        final double n6 = this.getPosZ() - n3;
        return this.method1753(n4 * n4 + n5 * n5 + n6 * n6);
    }
    
    public boolean method1753(final double n) {
        double method18507 = this.method1886().method18507();
        if (Double.isNaN(method18507)) {
            method18507 = 1.0;
        }
        final double n2 = method18507 * 64.0 * Entity.renderDistanceWeight;
        return n < n2 * n2;
    }
    
    public boolean method1754(final Class51 class51) {
        final String method1759 = this.method1759();
        if (!this.field2410 && method1759 != null) {
            class51.method306("id", method1759);
            this.method1756(class51);
            return true;
        }
        return false;
    }
    
    public boolean method1755(final Class51 class51) {
        return !this.method1805() && this.method1754(class51);
    }
    
    public Class51 method1756(final Class51 class51) {
        try {
            class51.method295("Pos", this.method1762(this.getPosX(), this.getPosY(), this.getPosZ()));
            final Vec3d method1935 = this.method1935();
            class51.method295("Motion", this.method1762(method1935.x, method1935.y, method1935.z));
            class51.method295("Rotation", this.method1763(this.field2399, this.field2400));
            class51.method304("FallDistance", this.field2414);
            class51.method297("Fire", (short)this.field2425);
            class51.method297("Air", (short)this.method1832());
            class51.method312("OnGround", this.field2404);
            class51.method298("Dimension", this.field2452.method1270());
            class51.method312("Invulnerable", this.field2456);
            class51.method298("PortalCooldown", this.field2449);
            class51.method300("UUID", this.method1865());
            final ITextComponent method1936 = this.getCustomName();
            if (method1936 != null) {
                class51.method306("CustomName", Class5953.method17869(method1936));
            }
            if (this.method1876()) {
                class51.method312("CustomNameVisible", this.method1876());
            }
            if (this.method1696()) {
                class51.method312("Silent", this.method1696());
            }
            if (this.method1698()) {
                class51.method312("NoGravity", this.method1698());
            }
            if (this.field2459) {
                class51.method312("Glowing", this.field2459);
            }
            if (!this.field2460.isEmpty()) {
                final Class52 class52 = new Class52();
                final Iterator<String> iterator = this.field2460.iterator();
                while (iterator.hasNext()) {
                    ((AbstractList<Class50>)class52).add(Class50.method290(iterator.next()));
                }
                class51.method295("Tags", class52);
            }
            this.method1761(class51);
            if (this.method1806()) {
                final Class52 class53 = new Class52();
                for (final Entity class54 : this.method1908()) {
                    final Class51 e = new Class51();
                    if (class54.method1754(e)) {
                        ((AbstractList<Class51>)class53).add(e);
                    }
                }
                if (!class53.isEmpty()) {
                    class51.method295("Passengers", class53);
                }
            }
            return class51;
        }
        catch (final Throwable t) {
            final Class7689 method1937 = Class7689.method24421(t, "Saving entity NBT");
            this.method1862(method1937.method24418("Entity being saved"));
            throw new Class2365(method1937);
        }
    }
    
    public void method1757(final Class51 class51) {
        try {
            final Class52 method328 = class51.method328("Pos", 6);
            final Class52 method329 = class51.method328("Motion", 6);
            final Class52 method330 = class51.method328("Rotation", 5);
            final double method331 = method329.method351(0);
            final double method332 = method329.method351(1);
            final double method333 = method329.method351(2);
            this.method1937((Math.abs(method331) > 10.0) ? 0.0 : method331, (Math.abs(method332) > 10.0) ? 0.0 : method332, (Math.abs(method333) > 10.0) ? 0.0 : method333);
            this.method1731(method328.method351(0), method328.method351(1), method328.method351(2));
            this.field2399 = method330.method352(0);
            this.field2400 = method330.method352(1);
            this.field2401 = this.field2399;
            this.field2402 = this.field2400;
            this.method1845(this.field2399);
            this.method1846(this.field2399);
            this.field2414 = class51.method321("FallDistance");
            this.field2425 = class51.method318("Fire");
            this.method1833(class51.method318("Air"));
            this.field2404 = class51.method329("OnGround");
            if (class51.method315("Dimension")) {
                this.field2452 = Class383.method1274(class51.method319("Dimension"));
            }
            this.field2456 = class51.method329("Invulnerable");
            this.field2449 = class51.method319("PortalCooldown");
            if (class51.method302("UUID")) {
                this.field2457 = class51.method301("UUID");
                this.field2458 = this.field2457.toString();
            }
            if (!Double.isFinite(this.getPosX()) || !Double.isFinite(this.getPosY()) || !Double.isFinite(this.getPosZ())) {
                throw new IllegalStateException("Entity has invalid position");
            }
            if (!Double.isFinite(this.field2399) || !Double.isFinite(this.field2400)) {
                throw new IllegalStateException("Entity has invalid rotation");
            }
            this.method1657();
            this.method1655(this.field2399, this.field2400);
            if (class51.method316("CustomName", 8)) {
                this.method1872(Class5953.method17871(class51.method323("CustomName")));
            }
            this.method1875(class51.method329("CustomNameVisible"));
            this.method1697(class51.method329("Silent"));
            this.method1699(class51.method329("NoGravity"));
            this.method1822(class51.method329("Glowing"));
            if (class51.method316("Tags", 9)) {
                this.field2460.clear();
                final Class52 method334 = class51.method328("Tags", 8);
                for (int min = Math.min(method334.size(), 1024), i = 0; i < min; ++i) {
                    this.field2460.add(method334.method353(i));
                }
            }
            this.method1760(class51);
            if (this.method1758()) {
                this.method1657();
            }
        }
        catch (final Throwable t) {
            final Class7689 method335 = Class7689.method24421(t, "Loading entity NBT");
            this.method1862(method335.method24418("Entity being loaded"));
            throw new Class2365(method335);
        }
    }
    
    public boolean method1758() {
        return true;
    }
    
    @Nullable
    public final String method1759() {
        final EntityType<?> method1642 = this.method1642();
        final Class1932 method1643 = EntityType.method23354(method1642);
        return (method1642.method23361() && method1643 != null) ? method1643.toString() : null;
    }
    
    public abstract void method1760(final Class51 p0);
    
    public abstract void method1761(final Class51 p0);
    
    public Class52 method1762(final double... array) {
        final Class52 class52 = new Class52();
        for (int length = array.length, i = 0; i < length; ++i) {
            ((AbstractList<Class44>)class52).add(Class44.method277(array[i]));
        }
        return class52;
    }
    
    public Class52 method1763(final float... array) {
        final Class52 class52 = new Class52();
        for (int length = array.length, i = 0; i < length; ++i) {
            ((AbstractList<Class46>)class52).add(Class46.method281(array[i]));
        }
        return class52;
    }
    
    @Nullable
    public Class427 method1764(final Class3832 class3832) {
        return this.method1765(class3832, 0);
    }
    
    @Nullable
    public Class427 method1765(final Class3832 class3832, final int n) {
        return this.method1767(new ItemStack(class3832), (float)n);
    }
    
    @Nullable
    public Class427 method1766(final ItemStack class8321) {
        return this.method1767(class8321, 0.0f);
    }
    
    @Nullable
    public Class427 method1767(final ItemStack class8321, final float n) {
        if (class8321.method27620()) {
            return null;
        }
        if (!this.field2391.field10067) {
            final Class427 class8322 = new Class427(this.field2391, this.getPosX(), this.getPosY() + n, this.getPosZ(), class8321);
            class8322.method2114();
            this.field2391.method6886(class8322);
            return class8322;
        }
        return null;
    }
    
    public boolean method1768() {
        return !this.field2410;
    }
    
    public boolean method1769() {
        if (this.field2421) {
            return false;
        }
        try (final Class386 method1296 = Class386.method1296()) {
            for (int i = 0; i < 8; ++i) {
                final int method1297 = MathHelper.floor(this.getPosY() + ((i >> 0) % 2 - 0.5f) * 0.1f + this.field2465);
                final int method1298 = MathHelper.floor(this.getPosX() + ((i >> 1) % 2 - 0.5f) * this.field2464.field34097 * 0.8f);
                final int method1299 = MathHelper.floor(this.getPosZ() + ((i >> 2) % 2 - 0.5f) * this.field2464.field34097 * 0.8f);
                if (method1296.getX() != method1298 || method1296.getY() != method1297 || method1296.getZ() != method1299) {
                    method1296.method1300(method1298, method1297, method1299);
                    if (this.field2391.method6701(method1296).method21746(this.field2391, method1296)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
    
    public boolean method1770(final Class512 class512, final Class316 class513) {
        return false;
    }
    
    @Nullable
    public AxisAlignedBB method1771(final Entity class399) {
        return null;
    }
    
    public void method1772() {
        this.method1936(Vec3d.ZERO);
        this.method1659();
        if (this.method1805()) {
            this.method1920().method1773(this);
        }
    }
    
    public void method1773(final Entity class399) {
        this.method1774(class399, Entity::method1656);
    }
    
    public void method1774(final Entity class399, final Class9228 class400) {
        if (this.method1909(class399)) {
            class400.method34032(class399, this.getPosX(), this.getPosY() + this.method1777() + class399.method1776(), this.getPosZ());
        }
    }
    
    public void method1775(final Entity class399) {
    }
    
    public double method1776() {
        return 0.0;
    }
    
    public double method1777() {
        return this.field2464.field34098 * 0.75;
    }
    
    public boolean method1778(final Entity class399) {
        return this.method1780(class399, false);
    }
    
    public boolean method1779() {
        return this instanceof Class511;
    }
    
    public boolean method1780(final Entity field2389, final boolean b) {
        for (Entity field2390 = field2389; field2390.field2389 != null; field2390 = field2390.field2389) {
            if (field2390.field2389 == this) {
                return false;
            }
        }
        if (!b && (!this.method1781(field2389) || !field2389.method1787(this))) {
            return false;
        }
        if (this.method1805()) {
            this.method1784();
        }
        (this.field2389 = field2389).method1785(this);
        return true;
    }
    
    public boolean method1781(final Entity class399) {
        return this.rideCooldown <= 0;
    }
    
    public boolean method1782(final Class290 class290) {
        return this.field2391.method6978(this, this.method1888(class290));
    }
    
    public void method1783() {
        for (int i = this.passengers.size() - 1; i >= 0; --i) {
            this.passengers.get(i).method1784();
        }
    }
    
    public void method1784() {
        if (this.field2389 != null) {
            final Entity field2389 = this.field2389;
            this.field2389 = null;
            field2389.method1786(this);
        }
    }
    
    public void method1785(final Entity class399) {
        if (class399.method1920() == this) {
            if (!this.field2391.field10067) {
                if (class399 instanceof Class512) {
                    if (!(this.method1907() instanceof Class512)) {
                        this.passengers.add(0, class399);
                        return;
                    }
                }
            }
            this.passengers.add(class399);
            return;
        }
        throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
    }
    
    public void method1786(final Entity class399) {
        if (class399.method1920() != this) {
            this.passengers.remove(class399);
            class399.rideCooldown = 60;
            return;
        }
        throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
    }
    
    public boolean method1787(final Entity class399) {
        return this.method1908().size() < 1;
    }
    
    public void method1788(final double n, final double n2, final double n3, final float n4, final float n5, final int n6, final boolean b) {
        this.method1656(n, n2, n3);
        this.method1655(n4, n5);
    }
    
    public void method1789(final float n, final int n2) {
        this.method1845(n);
    }
    
    public float method1790() {
        return 0.0f;
    }
    
    public Vec3d method1791() {
        return this.method1744(this.field2400, this.field2399);
    }
    
    public Vec2f method1792() {
        return new Vec2f(this.field2400, this.field2399);
    }
    
    public Vec3d method1793() {
        return Vec3d.fromPitchYaw(this.method1792());
    }
    
    public void method1794(final BlockPos class354) {
        if (this.field2449 <= 0) {
            if (!this.field2391.field10067) {
                if (!class354.equals(this.field2453)) {
                    this.field2453 = new BlockPos(class354);
                    final Class3998 class355 = (Class3998)Class7521.field29341;
                    final Class7820 method12149 = Class3998.method12149(this.field2391, this.field2453);
                    final double n = (method12149.method25266().getAxis() != Axis.X) ? method12149.method25265().getX() : ((double)method12149.method25265().getZ());
                    this.field2454 = new Vec3d(Math.abs(MathHelper.method35692(((method12149.method25266().getAxis() != Axis.X) ? this.getPosX() : this.getPosZ()) - (double)((method12149.method25266().rotateY().getAxisDirection() == AxisDirection.NEGATIVE) ? 1 : 0), n, n - method12149.method25268())), MathHelper.method35692(this.getPosY() - 1.0, method12149.method25265().getY(), method12149.method25265().getY() - method12149.method25269()), 0.0);
                    this.field2455 = method12149.method25266();
                }
            }
            this.field2450 = true;
        }
        else {
            this.field2449 = this.method1796();
        }
    }
    
    public void method1795() {
        if (this.field2391 instanceof Class1849) {
            final int method1662 = this.method1662();
            if (!this.field2450) {
                if (this.field2451 > 0) {
                    this.field2451 -= 4;
                }
                if (this.field2451 < 0) {
                    this.field2451 = 0;
                }
            }
            else {
                if (this.field2391.method6679().method1471()) {
                    if (!this.method1805()) {
                        if (this.field2451++ >= method1662) {
                            this.field2391.method6796().method15297("portal");
                            this.field2451 = method1662;
                            this.field2449 = this.method1796();
                            this.method1854((this.field2391.field10063.method20487() != Class383.field2224) ? Class383.field2224 : Class383.field2223);
                            this.field2391.method6796().method15299();
                        }
                    }
                }
                this.field2450 = false;
            }
            this.method1661();
        }
    }
    
    public int method1796() {
        return 300;
    }
    
    public void method1797(final double n, final double n2, final double n3) {
        this.method1937(n, n2, n3);
    }
    
    public void method1798(final byte b) {
        switch (b) {
            case 53: {
                Class3848.method11907(this);
                break;
            }
        }
    }
    
    public void method1799() {
    }
    
    public Iterable<ItemStack> method1800() {
        return Entity.EMPTY_EQUIPMENT;
    }
    
    public Iterable<ItemStack> method1801() {
        return Entity.EMPTY_EQUIPMENT;
    }
    
    public Iterable<ItemStack> method1802() {
        return Iterables.concat((Iterable)this.method1800(), (Iterable)this.method1801());
    }
    
    public void method1803(final Class2215 class2215, final ItemStack class2216) {
    }
    
    public boolean method1804() {
        final boolean b = this.field2391 != null && this.field2391.field10067;
        if (!this.method1704()) {
            if (this.field2425 <= 0) {
                if (!b) {
                    return false;
                }
                if (!this.method1829(0)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public boolean method1805() {
        return this.method1920() != null;
    }
    
    public boolean method1806() {
        return !this.method1908().isEmpty();
    }
    
    public boolean method1807() {
        return true;
    }
    
    public void method1808(final boolean b) {
        this.method1830(1, b);
    }
    
    public boolean method1809() {
        return this.method1829(1);
    }
    
    public boolean method1810() {
        return this.method1809();
    }
    
    public boolean method1811() {
        return this.method1809();
    }
    
    public boolean method1812() {
        return this.method1809();
    }
    
    public boolean method1813() {
        return this.method1809();
    }
    
    public boolean method1814() {
        return this.method1654() == Class290.field1668;
    }
    
    public boolean method1815() {
        return this.method1829(3);
    }
    
    public void method1816(final boolean b) {
        this.method1830(3, b);
    }
    
    public boolean method1817() {
        return this.method1829(4);
    }
    
    public boolean method1818() {
        return this.method1654() == Class290.field1666;
    }
    
    public boolean method1819() {
        return this.method1818() && !this.method1706();
    }
    
    public void method1820(final boolean b) {
        this.method1830(4, b);
    }
    
    public boolean method1821() {
        return this.field2459 || (this.field2391.field10067 && this.method1829(6));
    }
    
    public void method1822(final boolean field2459) {
        this.field2459 = field2459;
        if (!this.field2391.field10067) {
            this.method1830(6, this.field2459);
        }
    }
    
    public boolean method1823() {
        return this.method1829(5);
    }
    
    public boolean method1824(final Class512 class512) {
        if (!class512.method1639()) {
            final Class6750 method1825 = this.method1825();
            if (method1825 != null) {
                if (class512 != null) {
                    if (class512.method1825() == method1825) {
                        if (method1825.method20552()) {
                            return false;
                        }
                    }
                }
            }
            return this.method1823();
        }
        return false;
    }
    
    @Nullable
    public Class6750 method1825() {
        return this.field2391.method6782().method19651(this.method1867());
    }
    
    public boolean method1826(final Entity class399) {
        return this.method1827(class399.method1825());
    }
    
    public boolean method1827(final Class6750 class6750) {
        return this.method1825() != null && this.method1825().method20565(class6750);
    }
    
    public void method1828(final boolean b) {
        this.method1830(5, b);
    }
    
    public boolean method1829(final int n) {
        return (this.field2432.method33568(Entity.field2433) & 1 << n) != 0x0;
    }
    
    public void method1830(final int n, final boolean b) {
        final byte byteValue = this.field2432.method33568(Entity.field2433);
        if (!b) {
            this.field2432.method33569(Entity.field2433, (byte)(byteValue & ~(1 << n)));
        }
        else {
            this.field2432.method33569(Entity.field2433, (byte)(byteValue | 1 << n));
        }
    }
    
    public int method1831() {
        return 300;
    }
    
    public int method1832() {
        return this.field2432.method33568(Entity.field2434);
    }
    
    public void method1833(final int i) {
        this.field2432.method33569(Entity.field2434, i);
    }
    
    public void method1834(final Class422 class422) {
        ++this.field2425;
        if (this.field2425 == 0) {
            this.method1664(8);
        }
        this.method1740(Class7929.field32563, 5.0f);
    }
    
    public void method1835(final boolean b) {
        final Vec3d method1935 = this.method1935();
        double n;
        if (!b) {
            n = Math.min(1.8, method1935.y + 0.1);
        }
        else {
            n = Math.max(-0.9, method1935.y - 0.03);
        }
        this.method1937(method1935.x, n, method1935.z);
    }
    
    public void method1836(final boolean b) {
        final Vec3d method1935 = this.method1935();
        double n;
        if (!b) {
            n = Math.min(0.7, method1935.y + 0.06);
        }
        else {
            n = Math.max(-0.3, method1935.y - 0.03);
        }
        this.method1937(method1935.x, n, method1935.z);
        this.field2414 = 0.0f;
    }
    
    public void method1837(final Class511 class511) {
    }
    
    public void method1838(final double n, final double n2, final double n3) {
        final BlockPos class354 = new BlockPos(n, n2, n3);
        final Vec3d class355 = new Vec3d(n - class354.getX(), n2 - class354.getY(), n3 - class354.getZ());
        final Class385 class356 = new Class385();
        Direction field512 = Direction.UP;
        double n4 = Double.MAX_VALUE;
        for (final Direction class357 : new Direction[] { Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST, Direction.UP}) {
            class356.method1287(class354).method1290(class357);
            if (!this.field2391.method6701(class356).method21762(this.field2391, class356)) {
                final double method16759 = class355.getCoordinate(class357.getAxis());
                final double n5 = (class357.getAxisDirection() != AxisDirection.POSITIVE) ? method16759 : (1.0 - method16759);
                if (n5 < n4) {
                    n4 = n5;
                    field512 = class357;
                }
            }
        }
        final float n6 = this.field2423.nextFloat() * 0.2f + 0.1f;
        final float n7 = (float)field512.getAxisDirection().getOffset();
        final Vec3d method16760 = this.method1935().scale(0.75);
        if (field512.getAxis() != Axis.X) {
            if (field512.getAxis() != Axis.Y) {
                if (field512.getAxis() == Axis.Z) {
                    this.method1937(method16760.x, method16760.y, n7 * n6);
                }
            }
            else {
                this.method1937(method16760.x, n7 * n6, method16760.z);
            }
        }
        else {
            this.method1937(n7 * n6, method16760.y, method16760.z);
        }
    }
    
    public void method1839(final Class7096 class7096, final Vec3d field2409) {
        this.field2414 = 0.0f;
        this.field2409 = field2409;
    }
    
    private static void method1840(final ITextComponent class2250) {
        class2250.method8467(class2251 -> class2251.method30419(null)).method8462().forEach(Entity::method1840);
    }
    
    @Override
    public ITextComponent getName() {
        final ITextComponent method1873 = this.getCustomName();
        if (method1873 == null) {
            return this.method1842();
        }
        final ITextComponent method1874 = method1873.method8466();
        method1840(method1874);
        return method1874;
    }
    
    public ITextComponent method1842() {
        return this.type.method23367();
    }
    
    public boolean method1843(final Entity class399) {
        return this == class399;
    }
    
    public float method1844() {
        return 0.0f;
    }
    
    public void method1845(final float n) {
    }
    
    public void method1846(final float n) {
    }
    
    public boolean method1847() {
        return true;
    }
    
    public boolean method1848(final Entity class399) {
        return false;
    }
    
    @Override
    public String toString() {
        return String.format(Locale.ROOT, "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]", this.getClass().getSimpleName(), this.getName().method8459(), this.entityId, (this.field2391 != null) ? this.field2391.method6764().method29549() : "~NULL~", this.getPosX(), this.getPosY(), this.getPosZ());
    }
    
    public boolean method1849(final Class7929 class7929) {
        if (this.field2456) {
            if (class7929 != Class7929.field32574) {
                if (!class7929.method25725()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean method1850() {
        return this.field2456;
    }
    
    public void method1851(final boolean field2456) {
        this.field2456 = field2456;
    }
    
    public void method1852(final Entity class399) {
        this.method1730(class399.getPosX(), class399.getPosY(), class399.getPosZ(), class399.field2399, class399.field2400);
    }
    
    public void method1853(final Entity class399) {
        final Class51 method1756 = class399.method1756(new Class51());
        method1756.method330("Dimension");
        this.method1757(method1756);
        this.field2449 = class399.field2449;
        this.field2453 = class399.field2453;
        this.field2454 = class399.field2454;
        this.field2455 = class399.field2455;
    }
    
    @Nullable
    public Entity method1854(final Class383 field2452) {
        if (!this.field2391.field10067 && !this.field2410) {
            this.field2391.method6796().method15297("changeDimension");
            final Class394 method1897 = this.method1897();
            final Class383 field2453 = this.field2452;
            final Class1849 method1898 = method1897.method1481(field2453);
            final Class1849 method1899 = method1897.method1481(field2452);
            this.field2452 = field2452;
            this.method1640();
            this.field2391.method6796().method15297("reposition");
            Vec3d class5487 = this.method1935();
            float n = 0.0f;
            BlockPos class5488;
            if (field2453 == Class383.field2225 && field2452 == Class383.field2223) {
                class5488 = method1899.method6958(Class2020.field11526, method1899.method6758());
            }
            else if (field2452 != Class383.field2225) {
                double method1900 = this.getPosX();
                double method1901 = this.getPosZ();
                if (field2453 == Class383.field2223 && field2452 == Class383.field2224) {
                    method1900 /= 8.0;
                    method1901 /= 8.0;
                }
                else if (field2453 == Class383.field2224) {
                    if (field2452 == Class383.field2223) {
                        method1900 *= 8.0;
                        method1901 *= 8.0;
                    }
                }
                final double min = Math.min(-2.9999872E7, method1899.method6787().method34786() + 16.0);
                final double min2 = Math.min(-2.9999872E7, method1899.method6787().method34787() + 16.0);
                final double min3 = Math.min(2.9999872E7, method1899.method6787().method34788() - 16.0);
                final double min4 = Math.min(2.9999872E7, method1899.method6787().method34789() - 16.0);
                final double method1902 = MathHelper.method35654(method1900, min, min3);
                final double method1903 = MathHelper.method35654(method1901, min2, min4);
                final Vec3d method1904 = this.method1859();
                final Class9402 method1905 = method1899.method6909().method31768(new BlockPos(method1902, this.getPosY(), method1903), class5487, this.method1860(), method1904.x, method1904.y, this instanceof Class512);
                if (method1905 == null) {
                    return null;
                }
                class5488 = new BlockPos(method1905.field40340);
                class5487 = method1905.field40341;
                n = (float)method1905.field40342;
            }
            else {
                class5488 = method1899.method6878();
            }
            this.field2391.method6796().method15300("reloading");
            final Object method1906 = this.method1642().method23371(method1899);
            if (method1906 != null) {
                ((Entity)method1906).method1853(this);
                ((Entity)method1906).method1729(class5488, ((Entity)method1906).field2399 + n, ((Entity)method1906).field2400);
                ((Entity)method1906).method1936(class5487);
                method1899.method6888((Entity)method1906);
            }
            this.field2410 = true;
            this.field2391.method6796().method15299();
            method1898.method6870();
            method1899.method6870();
            this.field2391.method6796().method15299();
            return (Entity)method1906;
        }
        return null;
    }
    
    public boolean method1855() {
        return true;
    }
    
    public float method1856(final Class6154 class6154, final Class1855 class6155, final BlockPos class6156, final Class7096 class6157, final Class7099 class6158, final float n) {
        return n;
    }
    
    public boolean method1857(final Class6154 class6154, final Class1855 class6155, final BlockPos class6156, final Class7096 class6157, final float n) {
        return true;
    }
    
    public int method1858() {
        return 3;
    }
    
    public Vec3d method1859() {
        return this.field2454;
    }
    
    public Direction method1860() {
        return this.field2455;
    }
    
    public boolean method1861() {
        return false;
    }
    
    public void method1862(final Class5204 class5204) {
        class5204.method16296("Entity Type", () -> EntityType.method23354(this.method1642()) + " (" + this.getClass().getCanonicalName() + ")");
        class5204.method16297("Entity ID", this.entityId);
        class5204.method16296("Entity Name", () -> this.getName().getString());
        class5204.method16297("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.getPosX(), this.getPosY(), this.getPosZ()));
        class5204.method16297("Entity's Block location", Class5204.method16295(MathHelper.floor(this.getPosX()), MathHelper.floor(this.getPosY()), MathHelper.floor(this.getPosZ())));
        final Vec3d method1935 = this.method1935();
        class5204.method16297("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", method1935.x, method1935.y, method1935.z));
        class5204.method16296("Entity's Passengers", () -> this.method1908().toString());
        class5204.method16296("Entity's Vehicle", () -> this.method1920().toString());
    }
    
    public boolean method1863() {
        return this.method1804() && !this.method1639();
    }
    
    public void method1864(final UUID field2457) {
        this.field2457 = field2457;
        this.field2458 = this.field2457.toString();
    }
    
    public UUID method1865() {
        return this.field2457;
    }
    
    public String method1866() {
        return this.field2458;
    }
    
    public String method1867() {
        return this.field2458;
    }
    
    public boolean method1868() {
        return true;
    }
    
    public static double method1869() {
        return Entity.renderDistanceWeight;
    }
    
    public static void method1870(final double field2383) {
        Entity.renderDistanceWeight = field2383;
    }
    
    @Override
    public ITextComponent getDisplayName() {
        return Class6749.method20549(this.method1825(), this.getName()).method8467(class8768 -> class8768.method30420(this.method1884()).method30421(this.method1866()));
    }
    
    public void method1872(final ITextComponent value) {
        this.field2432.method33569(Entity.field2435, Optional.ofNullable(value));
    }
    
    @Nullable
    @Override
    public ITextComponent getCustomName() {
        return this.field2432.method33568(Entity.field2435).orElse(null);
    }
    
    @Override
    public boolean hasCustomName() {
        return this.field2432.method33568(Entity.field2435).isPresent();
    }
    
    public void method1875(final boolean b) {
        this.field2432.method33569(Entity.field2436, b);
    }
    
    public boolean method1876() {
        return this.field2432.method33568(Entity.field2436);
    }
    
    public final void method1877(final double n, final double n2, final double n3) {
        if (this.field2391 instanceof Class1849) {
            final Class7859 class7859 = new Class7859(new BlockPos(n, n2, n3));
            ((Class1849)this.field2391).method6904().method7441(Class9105.field38571, class7859, 0, this.method1643());
            this.field2391.method6686(class7859.field32290, class7859.field32291);
            this.method1878(n, n2, n3);
        }
    }
    
    public void method1878(final double n, final double n2, final double n3) {
        if (this.field2391 instanceof Class1849) {
            final Class1849 class1849 = (Class1849)this.field2391;
            this.method1730(n, n2, n3, this.field2399, this.field2400);
            this.method1912().forEach(class1851 -> {
                class1850.method6875(class1851);
                class1851.field2461 = true;
                class1851.method1918(Entity::method1950);
            });
        }
    }
    
    public boolean method1879() {
        return this.method1876();
    }
    
    public void method1880(final Class8810<?> class8810) {
        if (Entity.field2439.equals(class8810)) {
            this.method1881();
        }
    }
    
    public void method1881() {
        final Class8295 field2464 = this.field2464;
        final Class290 method1654 = this.method1654();
        final Class8295 method1655 = this.method1933(method1654);
        this.field2464 = method1655;
        this.field2465 = this.method1890(method1654, method1655);
        if (method1655.field34097 >= field2464.field34097) {
            final AxisAlignedBB method1656 = this.method1886();
            this.method1889(new AxisAlignedBB(method1656.field25073, method1656.field25074, method1656.field25075, method1656.field25073 + method1655.field34097, method1656.field25074 + method1655.field34098, method1656.field25075 + method1655.field34097));
            if (method1655.field34097 > field2464.field34097) {
                if (!this.field2431) {
                    if (!this.field2391.field10067) {
                        final float n = field2464.field34097 - method1655.field34097;
                        this.method1671(Class2160.field12826, new Vec3d(n, 0.0, n));
                    }
                }
            }
        }
        else {
            final double n2 = method1655.field34097 / 2.0;
            this.method1889(new AxisAlignedBB(this.getPosX() - n2, this.getPosY(), this.getPosZ() - n2, this.getPosX() + n2, this.getPosY() + method1655.field34098, this.getPosZ() + n2));
        }
    }
    
    public Direction method1882() {
        return Direction.fromAngle(this.field2399);
    }
    
    public Direction method1883() {
        return this.method1882();
    }
    
    public Class9390 method1884() {
        final Class51 class51 = new Class51();
        final Class1932 method23354 = EntityType.method23354(this.method1642());
        class51.method306("id", this.method1866());
        if (method23354 != null) {
            class51.method306("type", method23354.toString());
        }
        class51.method306("name", Class5953.method17869(this.getName()));
        return new Class9390(Class1961.field10699, new Class2260(class51.toString()));
    }
    
    public boolean method1885(final Class513 class513) {
        return true;
    }
    
    public AxisAlignedBB method1886() {
        return this.field2403;
    }
    
    public AxisAlignedBB method1887() {
        return this.method1886();
    }
    
    public AxisAlignedBB method1888(final Class290 class290) {
        final Class8295 method1933 = this.method1933(class290);
        final float n = method1933.field34097 / 2.0f;
        return new AxisAlignedBB(new Vec3d(this.getPosX() - n, this.getPosY(), this.getPosZ() - n), new Vec3d(this.getPosX() + n, this.getPosY() + method1933.field34098, this.getPosZ() + n));
    }
    
    public void method1889(final AxisAlignedBB field2403) {
        this.field2403 = field2403;
    }
    
    public float method1890(final Class290 class290, final Class8295 class291) {
        return class291.field34098 * 0.85f;
    }
    
    public float method1891(final Class290 class290) {
        return this.method1890(class290, this.method1933(class290));
    }
    
    public final float method1892() {
        return this.field2465;
    }
    
    public boolean method1893(final int n, final ItemStack class8321) {
        return false;
    }
    
    @Override
    public void sendMessage(final ITextComponent class2250) {
    }
    
    public BlockPos method1894() {
        return new BlockPos(this);
    }
    
    public Vec3d method1895() {
        return this.method1934();
    }
    
    public Class1847 method1896() {
        return this.field2391;
    }
    
    @Nullable
    public Class394 method1897() {
        return this.field2391.method6679();
    }
    
    public Class2201 method1898(final Class512 class512, final Vec3d class513, final Class316 class514) {
        return Class2201.field13402;
    }
    
    public boolean method1899() {
        return false;
    }
    
    public void method1900(final Class511 class511, final Entity class512) {
        if (class512 instanceof Class511) {
            Class8742.method30204((Class511)class512, class511);
        }
        Class8742.method30205(class511, class512);
    }
    
    public void method1901(final Class513 class513) {
    }
    
    public void method1902(final Class513 class513) {
    }
    
    public float method1903(final Class2052 class2052) {
        final float method35668 = MathHelper.method35668(this.field2399);
        switch (Class7274.field28177[class2052.ordinal()]) {
            case 1: {
                return method35668 + 180.0f;
            }
            case 2: {
                return method35668 + 270.0f;
            }
            case 3: {
                return method35668 + 90.0f;
            }
            default: {
                return method35668;
            }
        }
    }
    
    public float method1904(final Class2181 class2181) {
        final float method35668 = MathHelper.method35668(this.field2399);
        switch (Class7274.field28178[class2181.ordinal()]) {
            case 1: {
                return -method35668;
            }
            case 2: {
                return 180.0f - method35668;
            }
            default: {
                return method35668;
            }
        }
    }
    
    public boolean method1905() {
        return false;
    }
    
    public boolean method1906() {
        final boolean field2461 = this.field2461;
        this.field2461 = false;
        return field2461;
    }
    
    @Nullable
    public Entity method1907() {
        return null;
    }
    
    public List<Entity> method1908() {
        return this.passengers.isEmpty() ? Collections.emptyList() : Lists.newArrayList((Iterable)this.passengers);
    }
    
    public boolean method1909(final Entity class399) {
        final Iterator<Entity> iterator = this.method1908().iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().equals(class399)) {
                continue;
            }
            return true;
        }
        return false;
    }
    
    public boolean method1910(final Class<? extends Entity> clazz) {
        final Iterator<Entity> iterator = this.method1908().iterator();
        while (iterator.hasNext()) {
            if (!clazz.isAssignableFrom(iterator.next().getClass())) {
                continue;
            }
            return true;
        }
        return false;
    }
    
    public Collection<Entity> method1911() {
        final HashSet hashSet = Sets.newHashSet();
        for (final Entity class399 : this.method1908()) {
            hashSet.add(class399);
            class399.method1914(false, hashSet);
        }
        return hashSet;
    }
    
    public Stream<Entity> method1912() {
        return Stream.concat((Stream<? extends Entity>)Stream.of(this), this.passengers.stream().flatMap((Function<? super Object, ? extends Stream<? extends Entity>>) Entity::method1912));
    }
    
    public boolean method1913() {
        final HashSet hashSet = Sets.newHashSet();
        this.method1914(true, hashSet);
        return hashSet.size() == 1;
    }
    
    private void method1914(final boolean b, final Set<Entity> set) {
        for (final Entity class399 : this.method1908()) {
            if (!b || Class513.class.isAssignableFrom(class399.getClass())) {
                set.add(class399);
            }
            class399.method1914(b, set);
        }
    }
    
    public Entity method1915() {
        Entity method1920;
        for (method1920 = this; method1920.method1805(); method1920 = method1920.method1920()) {}
        return method1920;
    }
    
    public boolean method1916(final Entity class399) {
        return this.method1915() == class399.method1915();
    }
    
    public boolean method1917(final Entity class399) {
        for (final Entity class400 : this.method1908()) {
            if (class400.equals(class399)) {
                return true;
            }
            if (!class400.method1917(class399)) {
                continue;
            }
            return true;
        }
        return false;
    }
    
    public void method1918(final Class9228 class9228) {
        final Iterator<Entity> iterator = this.passengers.iterator();
        while (iterator.hasNext()) {
            this.method1774(iterator.next(), class9228);
        }
    }
    
    public boolean method1919() {
        final Entity method1907 = this.method1907();
        if (!(method1907 instanceof Class512)) {
            return !this.field2391.field10067;
        }
        return ((Class512)method1907).method2843();
    }
    
    @Nullable
    public Entity method1920() {
        return this.field2389;
    }
    
    public Class2117 method1921() {
        return Class2117.field12340;
    }
    
    public Class286 method1922() {
        return Class286.field1584;
    }
    
    public int method1923() {
        return 1;
    }
    
    public Class7492 method1924() {
        return new Class7492(this, this.method1934(), this.method1792(), (this.field2391 instanceof Class1849) ? ((Class1849)this.field2391) : null, this.method1925(), this.getName().getString(), this.getDisplayName(), this.field2391.method6679(), this);
    }
    
    public int method1925() {
        return 0;
    }
    
    public boolean method1926(final int n) {
        return this.method1925() >= n;
    }
    
    @Override
    public boolean shouldReceiveFeedback() {
        return this.field2391.method6765().method31216(Class8878.field37328);
    }
    
    @Override
    public boolean shouldReceiveErrors() {
        return true;
    }
    
    @Override
    public boolean allowLogging() {
        return true;
    }
    
    public void method1927(final Class2042 class2042, final Vec3d class2043) {
        final Vec3d method8122 = class2042.method8122(this);
        final double n = class2043.x - method8122.x;
        final double n2 = class2043.y - method8122.y;
        final double n3 = class2043.z - method8122.z;
        this.field2400 = MathHelper.method35668((float)(-(MathHelper.method35693(n2, MathHelper.sqrt(n * n + n3 * n3)) * 57.2957763671875)));
        this.method1845(this.field2399 = MathHelper.method35668((float)(MathHelper.method35693(n3, n) * 57.2957763671875) - 90.0f));
        this.field2402 = this.field2400;
        this.field2401 = this.field2399;
    }
    
    public boolean method1928(final Class7909<Class7255> class7909) {
        final AxisAlignedBB method18511 = this.method1886().method18511(0.001);
        final int method18512 = MathHelper.floor(method18511.field25073);
        final int method18513 = MathHelper.method35650(method18511.field25076);
        final int method18514 = MathHelper.floor(method18511.field25074);
        final int method18515 = MathHelper.method35650(method18511.field25077);
        final int method18516 = MathHelper.floor(method18511.field25075);
        final int method18517 = MathHelper.method35650(method18511.field25078);
        if (!this.field2391.method6973(method18512, method18514, method18516, method18513, method18515, method18517)) {
            return false;
        }
        double max = 0.0;
        final boolean method18518 = this.method1868();
        boolean b = false;
        Vec3d class7910 = Vec3d.ZERO;
        int n = 0;
        try (final Class386 method18519 = Class386.method1296()) {
            for (int i = method18512; i < method18513; ++i) {
                for (int j = method18514; j < method18515; ++j) {
                    for (int k = method18516; k < method18517; ++k) {
                        method18519.method1300(i, j, k);
                        final Class7099 method18520 = this.field2391.method6702(method18519);
                        if (method18520.method21793(class7909)) {
                            final double n2 = j + method18520.method21782(this.field2391, method18519);
                            if (n2 >= method18511.field25074) {
                                b = true;
                                max = Math.max(n2 - method18511.field25074, max);
                                if (method18518) {
                                    Vec3d class7911 = method18520.method21790(this.field2391, method18519);
                                    if (max < 0.4) {
                                        class7911 = class7911.scale(max);
                                    }
                                    class7910 = class7910.add(class7911);
                                    ++n;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (class7910.length() > 0.0) {
            if (n > 0) {
                class7910 = class7910.scale(1.0 / n);
            }
            if (!(this instanceof Class512)) {
                class7910 = class7910.normalize();
            }
            this.method1936(this.method1935().add(class7910.scale(0.014)));
        }
        this.field2427 = max;
        return b;
    }
    
    public double method1929() {
        return this.field2427;
    }
    
    public final float method1930() {
        return this.field2464.field34097;
    }
    
    public final float method1931() {
        return this.field2464.field34098;
    }
    
    public abstract Class4252<?> method1932();
    
    public Class8295 method1933(final Class290 class290) {
        return this.type.method23376();
    }
    
    public Vec3d method1934() {
        return new Vec3d(this.field2395, this.field2396, this.field2397);
    }
    
    public Vec3d method1935() {
        return this.field2398;
    }
    
    public void method1936(final Vec3d field2398) {
        this.field2398 = field2398;
    }
    
    public void method1937(final double n, final double n2, final double n3) {
        this.method1936(new Vec3d(n, n2, n3));
    }
    
    public final double getPosX() {
        return this.field2395;
    }
    
    public double method1939(final double n) {
        return this.field2395 + this.method1930() * n;
    }
    
    public double method1940(final double n) {
        return this.method1939((2.0 * this.field2423.nextDouble() - 1.0) * n);
    }
    
    public final double getPosY() {
        return this.field2396;
    }
    
    public double method1942(final double n) {
        return this.field2396 + this.method1931() * n;
    }
    
    public double method1943() {
        return this.method1942(this.field2423.nextDouble());
    }
    
    public double method1944() {
        return this.field2396 + this.field2465;
    }
    
    public final double getPosZ() {
        return this.field2397;
    }
    
    public double method1946(final double n) {
        return this.field2397 + this.method1930() * n;
    }
    
    public double method1947(final double n) {
        return this.method1946((2.0 * this.field2423.nextDouble() - 1.0) * n);
    }
    
    public void method1948(final double field2395, final double field2396, final double field2397) {
        this.field2395 = field2395;
        this.field2396 = field2396;
        this.field2397 = field2397;
    }
    
    public void method1949() {
    }
    
    public void method1950(final double n, final double n2, final double n3) {
        this.method1730(n, n2, n3, this.field2399, this.field2400);
    }
    
    static {
        LOGGER = LogManager.getLogger();
        NEXT_ENTITY_ID = new AtomicInteger();
        EMPTY_EQUIPMENT = Collections.emptyList();
        ZERO_AABB = new AxisAlignedBB(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
        Entity.renderDistanceWeight = 1.0;
        field2433 = Class9184.method33564(Entity.class, Class7709.field30653);
        field2434 = Class9184.method33564(Entity.class, Class7709.field30654);
        field2435 = Class9184.method33564(Entity.class, Class7709.field30658);
        field2436 = Class9184.method33564(Entity.class, Class7709.field30661);
        field2437 = Class9184.method33564(Entity.class, Class7709.field30661);
        field2438 = Class9184.method33564(Entity.class, Class7709.field30661);
        field2439 = Class9184.method33564(Entity.class, Class7709.field30671);
    }
}
