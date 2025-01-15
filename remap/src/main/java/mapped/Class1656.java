// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collections;

import net.minecraft.client.renderer.Matrix4f;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.client.renderer.Vector4f;
import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.apache.logging.log4j.LogManager;
import java.util.BitSet;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap$Entry;
import org.lwjgl.opengl.GL11;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collection;
import java.util.Comparator;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.Random;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.LinkedHashSet;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Deque;
import java.util.Map;
import java.util.SortedSet;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.objects.ObjectList;
import java.util.Set;
import org.apache.logging.log4j.Logger;

public class Class1656 implements AutoCloseable, Class1657
{
    private static final Logger field9279;
    private static final Class1932 field9280;
    private static final Class1932 field9281;
    private static final Class1932 field9282;
    private static final Class1932 field9283;
    private static final Class1932 field9284;
    private static final Class1932 field9285;
    private static final Class1932 field9286;
    public static final Direction[] field9287;
    private final Class869 field9288;
    private final Class1663 field9289;
    public final Class8551 field9290;
    private final Class3442 field9291;
    private Class1848 field9292;
    private Set<Class8974> field9293;
    private ObjectList<Class9071> field9294;
    private final Set<Class436> field9295;
    private Class9112 field9296;
    private final Class9272 field9297;
    private Class1918 field9298;
    private Class1918 field9299;
    private Class1918 field9300;
    private boolean field9301;
    private Class1918 field9302;
    private Class8836 field9303;
    private int field9304;
    private final Int2ObjectMap<Class349> field9305;
    private final Long2ObjectMap<SortedSet<Class349>> field9306;
    private final Map<BlockPos, Class6834> field9307;
    public Class6153 field9308;
    private Class1884 field9309;
    private double field9310;
    private double field9311;
    private double field9312;
    private int field9313;
    private int field9314;
    private int field9315;
    private double field9316;
    private double field9317;
    private double field9318;
    private double field9319;
    private double field9320;
    private int field9321;
    private int field9322;
    private int field9323;
    private Vec3d field9324;
    private Class2202 field9325;
    private Class7520 field9326;
    private final Class9272 field9327;
    private int field9328;
    private int field9329;
    private int field9330;
    private boolean field9331;
    private Class6664 field9332;
    private final Vector4f[] field9333;
    private final Class7283 field9334;
    private double field9335;
    private double field9336;
    private double field9337;
    private boolean field9338;
    private int field9339;
    private int field9340;
    private final float[] field9341;
    private final float[] field9342;
    public Entity field9343;
    public Set field9344;
    public Set field9345;
    private Set<Class8974> field9346;
    private Deque field9347;
    private List<Class9071> field9348;
    private List<Class9071> field9349;
    private ObjectList field9350;
    private List field9351;
    private List field9352;
    private ObjectList field9353;
    private List field9354;
    private List field9355;
    private int field9356;
    private int field9357;
    private static final Set field9358;
    private int field9359;
    private int field9360;
    private Class9145 field9361;
    public boolean field9362;
    public boolean field9363;
    private boolean field9364;
    private static int field9365;
    public int field9366;
    public static final int field9367 = 201435902;
    private static boolean field9368;
    
    @Nullable
    private Class8974 method5688(final BlockPos class354, final Class8974 class355, final Direction class356) {
        final BlockPos method31878 = class355.method31878(class356);
        if (MathHelper.abs(class354.getX() - method31878.getX()) > this.field9328 * 16) {
            return null;
        }
        if (method31878.getY() >= 0 && method31878.getY() < 256) {
            return (MathHelper.abs(class354.getZ() - method31878.getZ()) > this.field9328 * 16) ? null : this.field9296.method32963(method31878);
        }
        return null;
    }
    
    public Class1656(final Class869 field9288, final Class3442 field9289) {
        this.field9293 = (Set<Class8974>)new ObjectLinkedOpenHashSet();
        this.field9294 = (ObjectList<Class9071>)new ObjectArrayList(69696);
        this.field9295 = Sets.newHashSet();
        this.field9297 = Class9237.field39614;
        this.field9301 = true;
        this.field9303 = new Class8836(100);
        this.field9305 = (Int2ObjectMap<Class349>)new Int2ObjectOpenHashMap();
        this.field9306 = (Long2ObjectMap<SortedSet<Class349>>)new Long2ObjectOpenHashMap();
        this.field9307 = Maps.newHashMap();
        this.field9310 = Double.MIN_VALUE;
        this.field9311 = Double.MIN_VALUE;
        this.field9312 = Double.MIN_VALUE;
        this.field9313 = Integer.MIN_VALUE;
        this.field9314 = Integer.MIN_VALUE;
        this.field9315 = Integer.MIN_VALUE;
        this.field9316 = Double.MIN_VALUE;
        this.field9317 = Double.MIN_VALUE;
        this.field9318 = Double.MIN_VALUE;
        this.field9319 = Double.MIN_VALUE;
        this.field9320 = Double.MIN_VALUE;
        this.field9321 = Integer.MIN_VALUE;
        this.field9322 = Integer.MIN_VALUE;
        this.field9323 = Integer.MIN_VALUE;
        this.field9324 = Vec3d.ZERO;
        this.field9327 = Class9237.field39607;
        this.field9328 = -1;
        this.field9333 = new Vector4f[8];
        this.field9334 = new Class7283(0.0, 0.0, 0.0);
        this.field9338 = true;
        this.field9341 = new float[1024];
        this.field9342 = new float[1024];
        this.field9344 = new LinkedHashSet();
        this.field9345 = new LinkedHashSet();
        this.field9346 = (Set<Class8974>)new ObjectLinkedOpenHashSet();
        this.field9347 = new ArrayDeque();
        this.field9348 = new ArrayList<Class9071>(1024);
        this.field9349 = new ArrayList<Class9071>(1024);
        this.field9350 = (ObjectList)new ObjectArrayList(1024);
        this.field9351 = new ArrayList(1024);
        this.field9352 = new ArrayList(1024);
        this.field9353 = (ObjectList)new ObjectArrayList(1024);
        this.field9354 = new ArrayList(1024);
        this.field9355 = new ArrayList(1024);
        this.field9356 = 0;
        this.field9357 = 0;
        this.field9360 = 0;
        this.field9361 = new Class9145(Class7521.field29147.method11878(), new BlockPos(0, 0, 0));
        this.field9362 = false;
        this.field9363 = false;
        this.field9364 = false;
        this.field9366 = -1;
        this.field9288 = field9288;
        this.field9290 = field9288.method5306();
        this.field9291 = field9289;
        this.field9289 = field9288.method5290();
        for (int i = 0; i < 32; ++i) {
            for (int j = 0; j < 32; ++j) {
                final float n = (float)(j - 16);
                final float n2 = (float)(i - 16);
                final float method35640 = MathHelper.method35640(n * n + n2 * n2);
                this.field9341[i << 5 | j] = -n2 / method35640;
                this.field9342[i << 5 | j] = n / method35640;
            }
        }
        this.method5698();
        this.method5696();
        this.method5695();
    }
    
    private void method5689(final Class392 class392, final float f, final double n, final double n2, final double n3) {
        if (Class9570.field41364.method22605()) {
            final Object method35826 = Class9570.method35826(this.field9288.field4683.field10063, Class9570.field41364, new Object[0]);
            if (method35826 != null) {
                Class9570.method35819(method35826, Class9570.field41368, this.field9304, f, this.field9288.field4683, this.field9288);
                return;
            }
        }
        final float method35827 = this.field9288.field4683.method6768(f);
        if (method35827 > 0.0f) {
            if (Class8571.method28856()) {
                return;
            }
            class392.method1418();
            final Class1848 field4683 = this.field9288.field4683;
            final int method35828 = MathHelper.floor(n);
            final int method35829 = MathHelper.floor(n2);
            final int method35830 = MathHelper.floor(n3);
            final Class7392 method35831 = Class7392.method22694();
            final Class4148 method35832 = method35831.method22696();
            Class8726.method30029();
            Class8726.method30006(0.0f, 1.0f, 0.0f);
            Class8726.method30011();
            Class8726.method30117();
            Class8726.method30118();
            int n4 = 5;
            if (Class8571.method28855()) {
                n4 = 10;
            }
            int n5 = -1;
            final float n6 = this.field9304 + f;
            Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
            final Class385 class393 = new Class385();
            for (int i = method35830 - n4; i <= method35830 + n4; ++i) {
                for (int j = method35828 - n4; j <= method35828 + n4; ++j) {
                    final int n7 = (i - method35830 + 16) * 32 + j - method35828 + 16;
                    final double n8 = this.field9341[n7] * 0.5;
                    final double n9 = this.field9342[n7] * 0.5;
                    class393.method1284(j, 0, i);
                    final Class3090 method35833 = field4683.method6959(class393);
                    if (method35833.method9841() != Class2145.field12628) {
                        final int method35834 = field4683.method6958(Class2020.field11525, class393).getY();
                        int n10 = method35829 - n4;
                        int n11 = method35829 + n4;
                        if (n10 < method35834) {
                            n10 = method35834;
                        }
                        if (n11 < method35834) {
                            n11 = method35834;
                        }
                        int n12;
                        if ((n12 = method35834) < method35829) {
                            n12 = method35829;
                        }
                        if (n10 != n11) {
                            final Random random = new Random(j * j * 3121 + j * 45238971 ^ i * i * 418711 + i * 13761);
                            class393.method1284(j, n10, i);
                            if (method35833.method9845(class393) >= 0.15f) {
                                if (n5 != 0) {
                                    if (n5 >= 0) {
                                        method35831.method22695();
                                    }
                                    n5 = 0;
                                    this.field9288.method5290().method5849(Class1656.field9285);
                                    method35832.method12390(7, Class9237.field39613);
                                }
                                final float n13 = -((this.field9304 + j * j * 3121 + j * 45238971 + i * i * 418711 + i * 13761 & 0x1F) + f) / 32.0f * (3.0f + random.nextFloat());
                                final double n14 = j + 0.5f - n;
                                final double n15 = i + 0.5f - n3;
                                final float n16 = MathHelper.sqrt(n14 * n14 + n15 * n15) / n4;
                                final float n17 = ((1.0f - n16 * n16) * 0.5f + 0.5f) * method35827;
                                class393.method1284(j, n12, i);
                                final int method35835 = method5776(field4683, class393);
                                method35832.method12432(j - n - n8 + 0.5, n11 - n2, i - n3 - n9 + 0.5).method12391(0.0f, n10 * 0.25f + n13).method12439(1.0f, 1.0f, 1.0f, n17).method12440(method35835).method12397();
                                method35832.method12432(j - n + n8 + 0.5, n11 - n2, i - n3 + n9 + 0.5).method12391(1.0f, n10 * 0.25f + n13).method12439(1.0f, 1.0f, 1.0f, n17).method12440(method35835).method12397();
                                method35832.method12432(j - n + n8 + 0.5, n10 - n2, i - n3 + n9 + 0.5).method12391(1.0f, n11 * 0.25f + n13).method12439(1.0f, 1.0f, 1.0f, n17).method12440(method35835).method12397();
                                method35832.method12432(j - n - n8 + 0.5, n10 - n2, i - n3 - n9 + 0.5).method12391(0.0f, n11 * 0.25f + n13).method12439(1.0f, 1.0f, 1.0f, n17).method12440(method35835).method12397();
                            }
                            else {
                                if (n5 != 1) {
                                    if (n5 >= 0) {
                                        method35831.method22695();
                                    }
                                    n5 = 1;
                                    this.field9288.method5290().method5849(Class1656.field9286);
                                    method35832.method12390(7, Class9237.field39613);
                                }
                                final float n18 = -((this.field9304 & 0x1FF) + f) / 512.0f;
                                final float n19 = (float)(random.nextDouble() + n6 * 0.01 * (float)random.nextGaussian());
                                final float n20 = (float)(random.nextDouble() + n6 * (float)random.nextGaussian() * 0.001);
                                final double n21 = j + 0.5f - n;
                                final double n22 = i + 0.5f - n3;
                                final float n23 = MathHelper.sqrt(n21 * n21 + n22 * n22) / n4;
                                final float n24 = ((1.0f - n23 * n23) * 0.3f + 0.5f) * method35827;
                                class393.method1284(j, n12, i);
                                final int method35836 = method5776(field4683, class393);
                                final int n25 = method35836 >> 16 & 0xFFFF;
                                final int n26 = (method35836 & 0xFFFF) * 3;
                                final int n27 = (n25 * 3 + 240) / 4;
                                final int n28 = (n26 * 3 + 240) / 4;
                                method35832.method12432(j - n - n8 + 0.5, n11 - n2, i - n3 - n9 + 0.5).method12391(0.0f + n19, n10 * 0.25f + n18 + n20).method12439(1.0f, 1.0f, 1.0f, n24).method12434(n28, n27).method12397();
                                method35832.method12432(j - n + n8 + 0.5, n11 - n2, i - n3 + n9 + 0.5).method12391(1.0f + n19, n10 * 0.25f + n18 + n20).method12439(1.0f, 1.0f, 1.0f, n24).method12434(n28, n27).method12397();
                                method35832.method12432(j - n + n8 + 0.5, n10 - n2, i - n3 + n9 + 0.5).method12391(1.0f + n19, n11 * 0.25f + n18 + n20).method12439(1.0f, 1.0f, 1.0f, n24).method12434(n28, n27).method12397();
                                method35832.method12432(j - n - n8 + 0.5, n10 - n2, i - n3 - n9 + 0.5).method12391(0.0f + n19, n11 * 0.25f + n18 + n20).method12439(1.0f, 1.0f, 1.0f, n24).method12434(n28, n27).method12397();
                            }
                        }
                    }
                }
            }
            if (n5 >= 0) {
                method35831.method22695();
            }
            Class8726.method30028();
            Class8726.method30012();
            Class8726.method30118();
            class392.method1417();
        }
    }
    
    public void method5690(final Class6092 class6092) {
        float method6768 = this.field9288.field4683.method6768(1.0f);
        if (!Class8571.method28855()) {
            method6768 /= 2.0f;
        }
        if (method6768 != 0.0f && Class8571.method28881()) {
            final Random random = new Random(this.field9304 * 312987231L);
            final Class1848 field4683 = this.field9288.field4683;
            final BlockPos class6093 = new BlockPos(class6092.method18161());
            double n = 0.0;
            double n2 = 0.0;
            double n3 = 0.0;
            int bound = 0;
            int n4 = (int)(100.0f * method6768 * method6768);
            if (this.field9288.field4648.field23474 == Class2159.field12820) {
                n4 >>= 1;
            }
            else if (this.field9288.field4648.field23474 == Class2159.field12821) {
                n4 = 0;
            }
            for (int i = 0; i < n4; ++i) {
                final BlockPos method6769 = field4683.method6958(Class2020.field11525, class6093.method1134(random.nextInt(10) - random.nextInt(10), 0, random.nextInt(10) - random.nextInt(10)));
                final Class3090 method6770 = field4683.method6959(method6769);
                final BlockPos method6771 = method6769.method1139();
                if (method6769.getY() <= class6093.getY() + 10 && method6769.getY() >= class6093.getY() - 10 && method6770.method9841() == Class2145.field12629 && method6770.method9845(method6769) >= 0.15f) {
                    final double nextDouble = random.nextDouble();
                    final double nextDouble2 = random.nextDouble();
                    final Class7096 method6772 = field4683.method6701(method6771);
                    final Class7099 method6773 = field4683.method6702(method6769);
                    final Class7702 method6774 = method6772.method21727(field4683, method6771);
                    final double method6775 = method6774.method24547(Axis.Y, nextDouble, nextDouble2);
                    double n5;
                    double method6776;
                    if (method6775 >= method6773.method21782(field4683, method6769)) {
                        n5 = method6775;
                        method6776 = method6774.method24546(Axis.Y, nextDouble, nextDouble2);
                    }
                    else {
                        n5 = 0.0;
                        method6776 = 0.0;
                    }
                    if (n5 > -1.7976931348623157E308) {
                        if (!method6773.method21793(Class7324.field28320) && method6772.method21696() != Class7521.field29642 && (method6772.method21696() != Class7521.field29818 || !method6772.method21772((Class7111<Boolean>)Class3918.field17760))) {
                            ++bound;
                            if (random.nextInt(bound) == 0) {
                                n = method6771.getX() + nextDouble;
                                n2 = method6771.getY() + 0.1f + n5 - 1.0;
                                n3 = method6771.getZ() + nextDouble2;
                            }
                            this.field9288.field4683.method6709(Class8432.field34638, method6771.getX() + nextDouble, method6771.getY() + 0.1f + n5, method6771.getZ() + nextDouble2, 0.0, 0.0, 0.0);
                        }
                        else {
                            this.field9288.field4683.method6709(Class8432.field34639, method6769.getX() + nextDouble, method6769.getY() + 0.1f - method6776, method6769.getZ() + nextDouble2, 0.0, 0.0, 0.0);
                        }
                    }
                }
            }
            if (bound > 0 && random.nextInt(3) < this.field9340++) {
                this.field9340 = 0;
                if (n2 > class6093.getY() + 1 && field4683.method6958(Class2020.field11525, class6093).getY() > MathHelper.method35642((float)class6093.getY())) {
                    this.field9288.field4683.method6708(n, n2, n3, Class8520.field35712, Class286.field1581, 0.1f, 0.5f, false);
                }
                else {
                    this.field9288.field4683.method6708(n, n2, n3, Class8520.field35711, Class286.field1581, 0.2f, 1.0f, false);
                }
            }
        }
    }
    
    @Override
    public void close() {
        if (this.field9309 != null) {
            this.field9309.close();
        }
    }
    
    @Override
    public void method5691(final Class6582 class6582) {
        this.field9289.method5849(Class1656.field9284);
        Class8726.method30042(3553, 10242, 10497);
        Class8726.method30042(3553, 10243, 10497);
        Class8726.method30044(0);
        this.method5692();
    }
    
    public void method5692() {
        if (this.field9309 != null) {
            this.field9309.close();
        }
        final Class1932 class1932 = new Class1932("shaders/post/entity_outline.json");
        try {
            (this.field9309 = new Class1884(this.field9288.method5290(), this.field9288.method5291(), this.field9288.method5234(), class1932)).method7246(this.field9288.method5332().method7692(), this.field9288.method5332().method7693());
            this.field9308 = this.field9309.method7242("final");
        }
        catch (final IOException ex) {
            Class1656.field9279.warn("Failed to load shader: {}", (Object)class1932, (Object)ex);
            this.field9309 = null;
            this.field9308 = null;
        }
        catch (final JsonSyntaxException ex2) {
            Class1656.field9279.warn("Failed to load shader: {}", (Object)class1932, (Object)ex2);
            this.field9309 = null;
            this.field9308 = null;
        }
    }
    
    public void method5693() {
        if (this.method5694()) {
            Class8726.method30011();
            Class8726.method30015(Class2050.field11693, Class2135.field12460, Class2050.field11696, Class2135.field12455);
            this.field9308.method18400(this.field9288.method5332().method7692(), this.field9288.method5332().method7693(), false);
            Class8726.method30012();
        }
    }
    
    public boolean method5694() {
        return !Class8571.method28953() && !Class8571.method28955() && !Class8571.method28926() && this.field9308 != null && this.field9309 != null && this.field9288.field4684 != null;
    }
    
    private void method5695() {
        final Class4148 method22696 = Class7392.method22694().method22696();
        if (this.field9300 != null) {
            this.field9300.close();
        }
        this.field9300 = new Class1918(this.field9297);
        this.method5697(method22696, -16.0f, true);
        method22696.method12393();
        this.field9300.method7588(method22696);
    }
    
    private void method5696() {
        final Class4148 method22696 = Class7392.method22694().method22696();
        if (this.field9299 != null) {
            this.field9299.close();
        }
        this.field9299 = new Class1918(this.field9297);
        this.method5697(method22696, 16.0f, false);
        method22696.method12393();
        this.field9299.method7588(method22696);
    }
    
    private void method5697(final Class4148 class4148, final float n, final boolean b) {
        class4148.method12390(7, Class9237.field39614);
        for (int n2 = (this.field9356 / 64 + 1) * 64 + 64, i = -n2; i <= n2; i += 64) {
            for (int j = -n2; j <= n2; j += 64) {
                float n3 = (float)i;
                float n4 = (float)(i + 64);
                if (b) {
                    n4 = (float)i;
                    n3 = (float)(i + 64);
                }
                class4148.method12432(n3, n, j).method12397();
                class4148.method12432(n4, n, j).method12397();
                class4148.method12432(n4, n, j + 64).method12397();
                class4148.method12432(n3, n, j + 64).method12397();
            }
        }
    }
    
    private void method5698() {
        final Class4148 method22696 = Class7392.method22694().method22696();
        if (this.field9298 != null) {
            this.field9298.close();
        }
        this.field9298 = new Class1918(this.field9297);
        this.method5699(method22696);
        method22696.method12393();
        this.field9298.method7588(method22696);
    }
    
    private void method5699(final Class4148 class4148) {
        final Random random = new Random(10842L);
        class4148.method12390(7, Class9237.field39614);
        for (int i = 0; i < 1500; ++i) {
            final double n = random.nextFloat() * 2.0f - 1.0f;
            final double n2 = random.nextFloat() * 2.0f - 1.0f;
            final double n3 = random.nextFloat() * 2.0f - 1.0f;
            final double n4 = 0.15f + random.nextFloat() * 0.1f;
            final double a = n * n + n2 * n2 + n3 * n3;
            if (a < 1.0 && a > 0.01) {
                final double n5 = 1.0 / Math.sqrt(a);
                final double y = n * n5;
                final double x = n2 * n5;
                final double x2 = n3 * n5;
                final double n6 = y * 100.0;
                final double n7 = x * 100.0;
                final double n8 = x2 * 100.0;
                final double atan2 = Math.atan2(y, x2);
                final double sin = Math.sin(atan2);
                final double cos = Math.cos(atan2);
                final double atan3 = Math.atan2(Math.sqrt(y * y + x2 * x2), x);
                final double sin2 = Math.sin(atan3);
                final double cos2 = Math.cos(atan3);
                final double n9 = random.nextDouble() * 3.141592653589793 * 2.0;
                final double sin3 = Math.sin(n9);
                final double cos3 = Math.cos(n9);
                for (int j = 0; j < 4; ++j) {
                    final double n10 = ((j & 0x2) - 1) * n4;
                    final double n11 = ((j + 1 & 0x2) - 1) * n4;
                    final double n12 = n10 * cos3 - n11 * sin3;
                    final double n13 = n11 * cos3 + n10 * sin3;
                    final double n14 = n12 * sin2 + 0.0 * cos2;
                    final double n15 = 0.0 * sin2 - n12 * cos2;
                    class4148.method12432(n6 + (n15 * sin - n13 * cos), n7 + n14, n8 + (n13 * sin + n15 * cos)).method12397();
                }
            }
        }
    }
    
    public void method5700(final Class1848 field9292) {
        this.field9310 = Double.MIN_VALUE;
        this.field9311 = Double.MIN_VALUE;
        this.field9312 = Double.MIN_VALUE;
        this.field9313 = Integer.MIN_VALUE;
        this.field9314 = Integer.MIN_VALUE;
        this.field9315 = Integer.MIN_VALUE;
        this.field9290.method28714(field9292);
        this.field9292 = field9292;
        if (Class8571.method29002()) {
            Class8850.method30997();
        }
        Class9242.method34077();
        this.field9361.method33373(null, null);
        Class9216.method33798(this.field9292);
        if (field9292 != null) {
            this.method5701();
        }
        else {
            this.field9293.clear();
            this.field9346.clear();
            this.method5764();
            if (this.field9296 != null) {
                this.field9296.method32958();
                this.field9296 = null;
            }
            if (this.field9326 != null) {
                this.field9326.method23465();
            }
            this.field9326 = null;
            this.field9295.clear();
        }
    }
    
    public void method5701() {
        if (this.field9292 != null) {
            this.field9292.method6813();
            if (this.field9326 == null) {
                this.field9326 = new Class7520(this.field9292, this, Class8349.method27841(), this.field9288.method5297(), this.field9291.method11005());
            }
            else {
                this.field9326.method23452(this.field9292);
            }
            this.field9338 = true;
            this.field9301 = true;
            Class7969.method25828(Class8571.method28861());
            Class9144.method33369();
            if (Class8571.method29002()) {
                Class8850.method30997();
            }
            Class7663.method24284();
            Class1656.field9368 = Class869.method5272();
            this.field9328 = this.field9288.field4648.field23382;
            this.field9356 = this.field9328 * 16;
            this.field9357 = this.field9356 * this.field9356;
            this.method5698();
            this.method5696();
            this.method5695();
            if (this.field9296 != null) {
                this.field9296.method32958();
            }
            this.method5702();
            synchronized (this.field9295) {
                this.field9295.clear();
            }
            this.field9296 = new Class9112(this.field9326, this.field9292, this.field9288.field4648.field23382, this);
            if (this.field9292 != null) {
                final Entity method5303 = this.field9288.method5303();
                if (method5303 != null) {
                    this.field9296.method32961(method5303.getPosX(), method5303.getPosZ());
                }
            }
        }
        if (this.field9288.field4684 == null) {
            this.field9364 = true;
        }
    }
    
    public void method5702() {
        this.field9293.clear();
        this.field9326.method23459();
    }
    
    public void method5703(final int n, final int n2) {
        this.method5755();
        if (this.field9309 != null) {
            this.field9309.method7246(n, n2);
        }
    }
    
    public String method5704() {
        return String.format("C: %d/%d %sD: %d, %s", this.method5705(), this.field9296.field38610.length, this.field9288.field4710 ? "(s) " : "", this.field9328, (this.field9326 == null) ? "null" : this.field9326.method23454());
    }
    
    public int method5705() {
        int n = 0;
        final ObjectListIterator iterator = this.field9294.iterator();
        while (((Iterator)iterator).hasNext()) {
            if (!((Class9071)((Iterator)iterator).next()).field38417.method31870().method32212()) {
                ++n;
            }
        }
        return n;
    }
    
    public String method5706() {
        return "E: " + this.field9329 + "/" + this.field9292.method6816() + ", B: " + this.field9330 + ", " + Class8571.method28815();
    }
    
    public void method5707(final Class6092 class6092, final Class6664 class6093, final boolean b, final int n, final boolean b2) {
        final Vec3d method18161 = class6092.method18161();
        if (this.field9288.field4648.field23382 != this.field9328) {
            this.method5701();
        }
        this.field9292.method6796().method15297("camera");
        final double n2 = this.field9288.field4684.getPosX() - this.field9310;
        final double n3 = this.field9288.field4684.getPosY() - this.field9311;
        final double n4 = this.field9288.field4684.getPosZ() - this.field9312;
        if (this.field9313 != this.field9288.field4684.field2441 || this.field9314 != this.field9288.field4684.field2442 || this.field9315 != this.field9288.field4684.field2443 || n2 * n2 + n3 * n3 + n4 * n4 > 16.0) {
            this.field9310 = this.field9288.field4684.getPosX();
            this.field9311 = this.field9288.field4684.getPosY();
            this.field9312 = this.field9288.field4684.getPosZ();
            this.field9313 = this.field9288.field4684.field2441;
            this.field9314 = this.field9288.field4684.field2442;
            this.field9315 = this.field9288.field4684.field2443;
            this.field9296.method32961(this.field9288.field4684.getPosX(), this.field9288.field4684.getPosZ());
        }
        if (Class8571.method29002()) {
            Class8850.method30985(this);
        }
        this.field9326.method23455(method18161);
        this.field9292.method6796().method15300("cull");
        this.field9288.method5327().method15300("culling");
        final BlockPos method18162 = class6092.method18162();
        final Class8974 method18163 = this.field9296.method32963(method18162);
        final BlockPos class6094 = new BlockPos(MathHelper.floor(method18161.x / 16.0) * 16, MathHelper.floor(method18161.y / 16.0) * 16, MathHelper.floor(method18161.z / 16.0) * 16);
        final float method18164 = class6092.method18163();
        final float method18165 = class6092.method18164();
        this.field9338 = (this.field9338 || !this.field9293.isEmpty() || method18161.x != this.field9316 || method18161.y != this.field9317 || method18161.z != this.field9318 || method18164 != this.field9319 || method18165 != this.field9320);
        this.field9316 = method18161.x;
        this.field9317 = method18161.y;
        this.field9318 = method18161.z;
        this.field9319 = method18164;
        this.field9320 = method18165;
        this.field9288.method5327().method15300("update");
        Class9036.field38224.method26344();
        final int method18166 = this.method5760();
        if (method18166 != this.field9360) {
            this.field9360 = method18166;
            this.field9338 = true;
        }
        final Entity method18167 = class6092.method18166();
        int method18168 = 256;
        if (!Class9242.method34074()) {
            this.field9338 = true;
        }
        if (!b && this.field9338 && Class8571.method29015() && !Class9216.field39049) {
            method18168 = Class9242.method34073(this.field9292, method18167, this.field9328);
        }
        final Class8974 method18169 = this.field9296.method32963(new BlockPos(method18167.getPosX(), method18167.getPosY(), method18167.getPosZ()));
        if (Class9216.field39049) {
            this.field9294 = (ObjectList<Class9071>)this.field9353;
            this.field9348 = this.field9354;
            this.field9349 = this.field9355;
            if (!b && this.field9338) {
                this.method5764();
                if (method18169 != null && method18169.method31873().getY() > method18168) {
                    this.field9348.add(method18169.method31901());
                }
                final Iterator<Class8974> method18170 = Class8346.method27814(this.field9292, 0.0, method18167, this.field9328, this.field9296);
                while (method18170.hasNext()) {
                    final Class8974 class6095 = method18170.next();
                    if (class6095 != null && class6095.method31873().getY() <= method18168) {
                        final Class9071 method18171 = class6095.method31901();
                        if (!class6095.field37809.get().method32212()) {
                            this.field9294.add((Object)method18171);
                        }
                        if (Class6502.method19584(class6095.method31895())) {
                            this.field9348.add(method18171);
                        }
                        if (class6095.method31870().method32214().size() <= 0) {
                            continue;
                        }
                        this.field9349.add(method18171);
                    }
                }
            }
        }
        else {
            this.field9294 = (ObjectList<Class9071>)this.field9350;
            this.field9348 = this.field9351;
            this.field9349 = this.field9352;
        }
        if (!b && this.field9338 && !Class9216.field39049) {
            this.field9338 = false;
            this.method5764();
            this.field9347.clear();
            final Deque field9347 = this.field9347;
            Entity.method1870(MathHelper.method35654(this.field9288.field4648.field23382 / 8.0, 1.0, 2.5));
            boolean field9348 = this.field9288.field4710;
            if (method18163 != null && method18163.method31873().getY() <= method18168) {
                boolean b3 = false;
                final Class9071 class6096 = new Class9071(method18163, null, 0);
                final Set field9349 = Class1656.field9358;
                if (field9349.size() == 1) {
                    final Vector3f method18172 = class6092.method18173();
                    field9349.remove(Direction.getFacingFromVector(method18172.getX(), method18172.getY(), method18172.getZ()).getOpposite());
                }
                if (field9349.isEmpty()) {
                    b3 = true;
                }
                if (b3 && !b2) {
                    this.field9294.add((Object)class6096);
                }
                else {
                    if (b2 && this.field9292.method6701(method18162).method21722(this.field9292, method18162)) {
                        field9348 = false;
                    }
                    method18163.method31865(n);
                    field9347.add(class6096);
                }
            }
            else {
                final int n5 = (class6094.getY() > 0) ? Math.min(method18168, 248) : 8;
                if (method18169 != null) {
                    this.field9348.add(method18169.method31901());
                }
                final int n6 = MathHelper.floor(method18161.x / 16.0) * 16;
                final int n7 = MathHelper.floor(method18161.z / 16.0) * 16;
                final ArrayList arrayList = Lists.newArrayList();
                for (int i = -this.field9328; i <= this.field9328; ++i) {
                    for (int j = -this.field9328; j <= this.field9328; ++j) {
                        final Class8974 method18173 = this.field9296.method32963(new BlockPos(n6 + (i << 4) + 8, n5, n7 + (j << 4) + 8));
                        if (method18173 != null && class6093.method20261(method18173.field37814)) {
                            method18173.method31865(n);
                            final Class9071 method18174 = method18173.method31901();
                            Class9071.method32680(method18174, null, 0, 0);
                            arrayList.add(method18174);
                        }
                    }
                }
                arrayList.sort(Comparator.comparingDouble(class6101 -> class6100.method1083(class6101.field38417.method31873().method1134(8, 8, 8))));
                field9347.addAll(arrayList);
            }
            this.field9288.method5327().method15297("iteration");
            final boolean method18175 = Class8571.method28844();
            while (!field9347.isEmpty()) {
                final Class9071 class6097 = field9347.poll();
                final Class8974 field9350 = class6097.field38417;
                final Direction method18176 = Class9071.method32681(class6097);
                final Class9006 class6098 = field9350.field37809.get();
                if (!class6098.method32212() || field9350.method31876()) {
                    this.field9294.add((Object)class6097);
                }
                if (Class6502.method19584(field9350.method31895())) {
                    this.field9348.add(class6097);
                }
                if (class6098.method32214().size() > 0) {
                    this.field9349.add(class6097);
                }
                for (final Direction class6099 : field9348 ? Class9242.method34076(Class9071.method32682(class6097)) : Direction.VALUES) {
                    if (!field9348 || method18176 == null || class6098.method32210(method18176.getOpposite(), class6099)) {
                        final Class8974 method18177 = this.method5709(class6094, field9350, class6099, method18175, method18168);
                        if (method18177 != null && method18177.method31865(n) && class6093.method20261(method18177.field37814)) {
                            final int n8 = Class9071.method32682(class6097) | 1 << class6099.ordinal();
                            final Class9071 method18178 = method18177.method31901();
                            Class9071.method32680(method18178, class6099, n8, Class9071.method32683(class6097) + 1);
                            field9347.add(method18178);
                        }
                    }
                }
            }
            this.field9288.method5327().method15299();
        }
        Class9036.field38224.method26345();
        if (Class9216.field39049) {
            Class9216.method33890();
        }
        else {
            this.field9288.method5327().method15300("rebuildNear");
            final Set<Class8974> field9351 = this.field9293;
            this.field9293 = this.field9346;
            this.field9346 = field9351;
            this.field9293.clear();
            Class9036.field38223.method26344();
            final ObjectListIterator iterator = this.field9294.iterator();
            while (((Iterator)iterator).hasNext()) {
                final Class8974 field9352 = ((Class9071)((Iterator)iterator).next()).field38417;
                if (field9352.method31876() || field9351.contains(field9352)) {
                    this.field9338 = true;
                    final BlockPos method18179 = field9352.method31873();
                    final boolean b4 = Class8500.method28411(class6094, (float)(method18179.getX() + 8), (float)(method18179.getY() + 8), (float)(method18179.getZ() + 8)) < 768.0;
                    if (!field9352.method31877() && !b4) {
                        this.field9293.add(field9352);
                    }
                    else if (!field9352.method31886()) {
                        this.field9345.add(field9352);
                    }
                    else {
                        this.field9288.method5327().method15297("build near");
                        this.field9326.method23458(field9352);
                        field9352.method31875();
                        this.field9288.method5327().method15299();
                    }
                }
            }
            Class9036.field38223.method26345();
            this.field9293.addAll(field9351);
            this.field9288.method5327().method15299();
        }
    }
    
    private Set<Direction> method5708(final BlockPos class354) {
        if (Class3237.field15720.method9906()) {
            return new HashSet<Direction>(Arrays.asList(Direction.values()));
        }
        final Class8388 class355 = new Class8388();
        final BlockPos class356 = new BlockPos(class354.getX() >> 4 << 4, class354.getY() >> 4 << 4, class354.getZ() >> 4 << 4);
        final Class1862 method6685 = this.field9292.method6685(class356);
        for (final BlockPos class357 : BlockPos.method1154(class356, class356.method1134(15, 15, 15))) {
            if (method6685.method6701(class357).method21722(this.field9292, class357)) {
                class355.method27958(class357);
            }
        }
        return class355.method27962(class354);
    }
    
    @Nullable
    private Class8974 method5709(final BlockPos class354, final Class8974 class355, final Direction class356, final boolean b, final int n) {
        final Class8974 method31900 = class355.method31900(class356);
        if (method31900 == null) {
            return null;
        }
        if (method31900.method31873().getY() > n) {
            return null;
        }
        if (b) {
            final BlockPos method31901 = method31900.method31873();
            final int n2 = class354.getX() - method31901.getX();
            final int n3 = class354.getZ() - method31901.getZ();
            if (n2 * n2 + n3 * n3 > this.field9357) {
                return null;
            }
        }
        return method31900;
    }
    
    private void method5710(final Matrix4f class6789, final Matrix4f class6790, final double field28226, final double field28227, final double field28228, final Class6664 field28229) {
        this.field9332 = field28229;
        final Matrix4f method20758 = class6790.method20758();
        method20758.method20752(class6789);
        method20758.method20751();
        this.field9334.field28226 = field28226;
        this.field9334.field28227 = field28227;
        this.field9334.field28228 = field28228;
        this.field9333[0] = new Vector4f(-1.0f, -1.0f, -1.0f, 1.0f);
        this.field9333[1] = new Vector4f(1.0f, -1.0f, -1.0f, 1.0f);
        this.field9333[2] = new Vector4f(1.0f, 1.0f, -1.0f, 1.0f);
        this.field9333[3] = new Vector4f(-1.0f, 1.0f, -1.0f, 1.0f);
        this.field9333[4] = new Vector4f(-1.0f, -1.0f, 1.0f, 1.0f);
        this.field9333[5] = new Vector4f(1.0f, -1.0f, 1.0f, 1.0f);
        this.field9333[6] = new Vector4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.field9333[7] = new Vector4f(-1.0f, 1.0f, 1.0f, 1.0f);
        for (int i = 0; i < 8; ++i) {
            this.field9333[i].method28603(method20758);
            this.field9333[i].method28605();
        }
    }
    
    public void method5711(final Class7351 class7351, final float f, final long n, final boolean b, final Class6092 class7352, final Class1660 class7353, final Class392 class7354, final Matrix4f class7355) {
        Class9550.field41126.method35725(this.field9292, this.field9288.method5290(), this.field9288.field4643, class7352, this.field9288.field4691);
        this.field9290.method28700(this.field9292, class7352, this.field9288.field4690);
        final Class5028 method6796 = this.field9292.method6796();
        method6796.method15300("light_updates");
        this.field9288.field4683.method6835().method7405().method7250(Integer.MAX_VALUE, true, true);
        final Vec3d method6797 = class7352.method18161();
        final double method6798 = method6797.getX();
        final double method6799 = method6797.getY();
        final double method6800 = method6797.getZ();
        final Matrix4f method6801 = class7351.method22569().method32111();
        method6796.method15300("culling");
        final boolean b2 = this.field9332 != null;
        Class6664 field9332;
        if (b2) {
            field9332 = this.field9332;
            field9332.method20262(this.field9334.field28226, this.field9334.field28227, this.field9334.field28228);
        }
        else {
            field9332 = new Class6664(method6801, class7355);
            field9332.method20262(method6798, method6799, method6800);
        }
        this.field9288.method5327().method15300("captureFrustum");
        if (this.field9331) {
            this.method5710(method6801, class7355, method6797.x, method6797.y, method6797.z, b2 ? new Class6664(method6801, class7355) : field9332);
            this.field9331 = false;
        }
        method6796.method15300("clear");
        if (Class8571.method28955()) {
            Class9216.method33801(0, 0, this.field9288.method5332().method7692(), this.field9288.method5332().method7693());
        }
        else {
            Class8726.method30048(0, 0, this.field9288.method5332().method7692(), this.field9288.method5332().method7693());
        }
        Class9111.method32952(class7352, f, this.field9288.field4683, this.field9288.field4648.field23382, class7353.method5831(f));
        Class8726.method30056(16640, Class869.field4623);
        final boolean method6802 = Class8571.method28955();
        if (method6802) {
            Class9216.method33805();
        }
        if (method6802) {
            Class9216.method33806(class7351, class7352, f);
        }
        field9332.field26328 = (Class8571.method28955() && !Class9216.method33760());
        final float method6803 = class7353.method5832();
        final boolean b3 = this.field9288.field4683.field10063.method20495(MathHelper.floor(method6798), MathHelper.floor(method6799)) || this.field9288.field4647.method3813().method3336();
        if ((Class8571.method28913() || Class8571.method28914() || Class8571.method28918()) && !Class9216.field39049) {
            Class9111.method32955(class7352, Class1985.field10993, method6803, b3, f);
            method6796.method15300("sky");
            if (method6802) {
                Class9216.method33824();
            }
            this.method5721(class7351, f);
            if (method6802) {
                Class9216.method33828();
            }
        }
        else {
            Class8933.method31518();
        }
        method6796.method15300("fog");
        Class9111.method32955(class7352, Class1985.field10994, Math.max(method6803 - 16.0f, 32.0f), b3, f);
        method6796.method15300("terrain_setup");
        this.method5772(class7352, field9332, this.field9288.field4684.method1639());
        this.method5707(class7352, field9332, b2, this.field9339++, this.field9288.field4684.method1639());
        method6796.method15300("updatechunks");
        final int field9333 = this.field9288.field4648.field23383;
        long n2;
        if (field9333 == Class6469.field25712.method19473()) {
            n2 = 0L;
        }
        else {
            n2 = 1000000000 / field9333;
        }
        final long method6804 = MathHelper.method35652(this.field9303.method30857(Class8349.method27838() - n) * 3L / 2L, n2, 33333333L);
        Class9036.field38222.method26344();
        this.method5724(n + method6804);
        Class9036.field38222.method26345();
        method6796.method15300("terrain");
        Class9036.field38225.method26344();
        if (this.field9288.field4648.field23481) {
            this.field9288.method5327().method15300("finish");
            GL11.glFinish();
            this.field9288.method5327().method15300("terrain");
        }
        if (Class8571.method28843() && Class9111.field38603) {
            Class8933.method31687(false);
        }
        this.method5714(Class6332.method18761(), class7351, method6798, method6799, method6800);
        this.field9288.method5290().method5853(Class1774.field9853).method5868(false, this.field9288.field4648.field23405 > 0);
        this.method5714(Class6332.method18762(), class7351, method6798, method6799, method6800);
        this.field9288.method5290().method5853(Class1774.field9853).method5876();
        this.method5714(Class6332.method18763(), class7351, method6798, method6799, method6800);
        if (method6802) {
            Class7778.method24947();
        }
        Class9036.field38225.method26345();
        Class8317.method27610(class7351.method22569().method32111());
        if (method6802) {
            Class9216.method33834();
        }
        Class4791.method14174();
        method6796.method15300("entities");
        method6796.method15297("prepare");
        ++Class1656.field9365;
        this.field9329 = 0;
        this.field9330 = 0;
        this.field9359 = 0;
        method6796.method15300("entities");
        if (this.method5694()) {
            this.field9308.method18402(Class869.field4623);
            this.field9288.method5234().method18395(false);
        }
        boolean b4 = false;
        final Class7808 method6805 = this.field9291.method11006();
        for (final Entity field9334 : this.field9292.method6806()) {
            if ((this.field9290.method28705(field9334, field9332, method6798, method6799, method6800) || field9334.method1917(this.field9288.field4684)) && (field9334 != class7352.method18166() || Class9216.field39049 || class7352.method18168() || (class7352.method18166() instanceof Class511 && ((Class511)class7352.method18166()).method2783())) && (!(field9334 instanceof Class756) || class7352.method18166() == field9334)) {
                ++this.field9329;
                if (field9334.field2424 == 0) {
                    field9334.field2417 = field9334.getPosX();
                    field9334.field2418 = field9334.getPosY();
                    field9334.field2419 = field9334.getPosZ();
                }
                Class7807 method6806;
                if (this.method5694() && field9334.method1821()) {
                    b4 = true;
                    final Class7809 class7356 = (Class7809)(method6806 = this.field9291.method11008());
                    final int method6807 = field9334.method1638();
                    class7356.method25218(method6807 >> 16 & 0xFF, method6807 >> 8 & 0xFF, method6807 & 0xFF, 255);
                }
                else {
                    method6806 = method6805;
                }
                this.field9343 = field9334;
                if (method6802) {
                    Class9216.method33835(field9334);
                }
                this.method5713(field9334, method6798, method6799, method6800, f, class7351, method6806);
                this.field9343 = null;
            }
        }
        this.method5712(class7351);
        method6805.method25217(Class6332.method18767(Class1774.field9853));
        method6805.method25217(Class6332.method18768(Class1774.field9853));
        method6805.method25217(Class6332.method18770(Class1774.field9853));
        method6805.method25217(Class6332.method18774(Class1774.field9853));
        if (method6802) {
            Class9216.method33839();
            Class9216.method33845();
        }
        method6796.method15300("blockentities");
        Class4159.method12463();
        final boolean method6808 = Class9570.field41359.method22605();
        final Class6664 class7357 = field9332;
        final Iterator<Class9071> iterator2 = this.field9349.iterator();
        while (iterator2.hasNext()) {
            final List<Class436> method6809 = iterator2.next().field38417.method31870().method32214();
            if (!method6809.isEmpty()) {
                for (final Class436 class7358 : method6809) {
                    if (method6808) {
                        final AxisAlignedBB class7359 = (AxisAlignedBB)Class9570.method35826(class7358, Class9570.field41359, new Object[0]);
                        if (class7359 != null) {
                            if (!class7357.method20261(class7359)) {
                                continue;
                            }
                        }
                    }
                    if (method6802) {
                        Class9216.method33846(class7358);
                    }
                    final BlockPos method6810 = class7358.method2193();
                    Class7807 class7360 = method6805;
                    class7351.method22567();
                    class7351.method22564(method6810.getX() - method6798, method6810.getY() - method6799, method6810.getZ() - method6800);
                    final SortedSet set = (SortedSet)this.field9306.get(method6810.method1132());
                    if (set != null && !set.isEmpty()) {
                        final int method6811 = set.last().method1048();
                        if (method6811 >= 0) {
                            class7360 = (class7810 -> {
                                final Class4150 method25214 = method6805.method25214(class7810);
                                return class7810.method18801() ? Class9343.method34633(class7809, method25214) : method25214;
                            });
                        }
                    }
                    Class9550.field41126.method35726(class7358, f, class7351, class7360);
                    class7351.method22568();
                    ++this.field9359;
                }
            }
        }
        synchronized (this.field9295) {
            for (final Class436 class7361 : this.field9295) {
                if (method6808) {
                    final AxisAlignedBB class7362 = (AxisAlignedBB)Class9570.method35826(class7361, Class9570.field41359, new Object[0]);
                    if (class7362 != null) {
                        if (!class7357.method20261(class7362)) {
                            continue;
                        }
                    }
                }
                if (method6802) {
                    Class9216.method33846(class7361);
                }
                final BlockPos method6812 = class7361.method2193();
                class7351.method22567();
                class7351.method22564(method6812.getX() - method6798, method6812.getY() - method6799, method6812.getZ() - method6800);
                Class9550.field41126.method35726(class7361, f, class7351, method6805);
                class7351.method22568();
                ++this.field9359;
            }
        }
        this.method5712(class7351);
        method6805.method25217(Class6332.method18761());
        method6805.method25217(Class8752.method30263());
        method6805.method25217(Class8752.method30264());
        method6805.method25217(Class8752.method30259());
        method6805.method25217(Class8752.method30260());
        method6805.method25217(Class8752.method30261());
        method6805.method25217(Class8752.method30262());
        method6805.method25217(Class8752.method30257());
        this.field9291.method11008().method25219();
        if (b4) {
            this.field9309.method7247(f);
            this.field9288.method5234().method18395(false);
        }
        if (method6802) {
            Class9216.method33849();
        }
        this.field9362 = true;
        method6796.method15300("destroyProgress");
        for (final Long2ObjectMap$Entry long2ObjectMap$Entry : this.field9306.long2ObjectEntrySet()) {
            final BlockPos method6813 = BlockPos.method1129(long2ObjectMap$Entry.getLongKey());
            final double n3 = method6813.getX() - method6798;
            final double n4 = method6813.getY() - method6799;
            final double n5 = method6813.getZ() - method6800;
            if (n3 * n3 + n4 * n4 + n5 * n5 <= 1024.0) {
                final SortedSet set2 = (SortedSet)long2ObjectMap$Entry.getValue();
                if (set2 == null || set2.isEmpty()) {
                    continue;
                }
                final int method6814 = set2.last().method1048();
                class7351.method22567();
                class7351.method22564(method6813.getX() - method6798, method6813.getY() - method6799, method6813.getZ() - method6800);
                this.field9288.method5305().method5788(this.field9292.method6701(method6813), method6813, this.field9292, class7351, new Class4155(this.field9291.method11007().method25214(Class7637.field30247.get(method6814)), class7351.method22569()));
                class7351.method22568();
            }
        }
        this.field9362 = false;
        --Class1656.field9365;
        this.method5712(class7351);
        method6796.method15299();
        final Class7006 field9335 = this.field9288.field4691;
        if (b && field9335 != null && field9335.method21449() == Class2165.field12881) {
            method6796.method15300("outline");
            final BlockPos method6815 = ((Class7005)field9335).method21447();
            final Class7096 method6816 = this.field9292.method6701(method6815);
            boolean b5;
            if (Class9570.field41247.method22605() && Class9570.field41298.method22605()) {
                b5 = (!Class9570.method35812(Class9570.field41298, this, class7352, this.field9288.field4691, f, class7351, method6805) && !Class9570.method35820(method6816, Class9570.field41247, this.field9292, method6815) && this.field9292.method6787().method34779(method6815));
            }
            else {
                b5 = (!method6816.method21706() && this.field9292.method6787().method34779(method6815));
            }
            if (b5) {
                this.method5727(class7351, method6805.method25214(Class6332.method18791()), class7352.method18166(), method6798, method6799, method6800, method6815, method6816);
            }
        }
        Class8726.method30059();
        Class8726.method30067(class7351.method22569().method32111());
        final boolean method6817 = Class8933.method31670();
        Class8933.method31585();
        this.field9288.field4645.method22332(class7351, method6805, method6798, method6799, method6800);
        Class8933.method31671(method6817);
        this.method5725(class7352);
        Class8726.method30060();
        method6805.method25217(Class8752.method30265());
        method6805.method25217(Class8752.method30257());
        method6805.method25217(Class8752.method30258());
        method6805.method25217(Class6332.method18784());
        method6805.method25217(Class6332.method18785());
        method6805.method25217(Class6332.method18782());
        this.field9291.method11007().method25216();
        method6805.method25217(Class6332.method18791());
        method6805.method25216();
        if (method6802) {
            Class9216.method33856();
            Class7778.method24950(class7353, class7351, class7352, f);
            Class9216.method33857();
        }
        method6796.method15300("translucent");
        if (method6802) {
            Class9216.method33858();
        }
        this.method5714(Class6332.method18765(), class7351, method6798, method6799, method6800);
        if (method6802) {
            Class9216.method33859();
        }
        method6796.method15300("particles");
        if (method6802) {
            Class9216.method33851();
        }
        if (!Class3375.field16048) {
            this.field9288.field4640.method6484(class7351, method6805, class7354, class7352, f);
        }
        if (method6802) {
            Class9216.method33852();
        }
        Class8933.method31687(true);
        Class8726.method30059();
        Class8726.method30067(class7351.method22569().method32111());
        method6796.method15300("cloudsLayers");
        if (this.field9288.field4648.method17128() != Class2202.field13405) {
            method6796.method15300("clouds");
            this.method5722(class7351, f, method6798, method6799, method6800);
        }
        Class8726.method30010(false);
        if (Class8571.method28955()) {
            Class8933.method31517(Class9216.method33757());
        }
        method6796.method15300("weather");
        if (method6802) {
            Class9216.method33854();
        }
        this.method5689(class7354, f, method6798, method6799, method6800);
        if (method6802) {
            Class9216.method33855();
        }
        Class8726.method30010(true);
        this.method5715(class7352);
        Class8726.method30045(7424);
        Class8726.method30010(true);
        Class8726.method30012();
        Class8726.method30060();
        Class9111.method32953();
    }
    
    public void method5712(final Class7351 class7351) {
        if (!class7351.method22570()) {
            throw new IllegalStateException("Pose stack not empty");
        }
    }
    
    public void method5713(final Entity class399, final double n, final double n2, final double n3, final float n4, final Class7351 class400, final Class7807 class401) {
        this.field9290.method28706(class399, MathHelper.method35701(n4, class399.field2417, class399.getPosX()) - n, MathHelper.method35701(n4, class399.field2418, class399.getPosY()) - n2, MathHelper.method35701(n4, class399.field2419, class399.getPosZ()) - n3, MathHelper.method35700(n4, class399.field2401, class399.field2399), n4, class400, class401, this.field9290.method28695(class399, n4));
    }
    
    public void method5714(final Class6332 class6332, final Class7351 class6333, final double field9335, final double field9336, final double field9337) {
        class6332.method18709();
        final boolean method28955 = Class8571.method28955();
        if (class6332 == Class6332.method18765() && !Class9216.field39049) {
            this.field9288.method5327().method15297("translucent_sort");
            final double n = field9335 - this.field9335;
            final double n2 = field9336 - this.field9336;
            final double n3 = field9337 - this.field9337;
            if (n * n + n2 * n2 + n3 * n3 > 1.0) {
                this.field9335 = field9335;
                this.field9336 = field9336;
                this.field9337 = field9337;
                int n4 = 0;
                this.field9344.clear();
                for (final Class9071 class6334 : this.field9294) {
                    if (n4 < 15 && class6334.field38417.method31870().method32216(class6332)) {
                        this.field9344.add(class6334.field38417);
                        ++n4;
                    }
                }
            }
            this.field9288.method5327().method15299();
        }
        this.field9288.method5327().method15297("filterempty");
        if (method28955) {
            Class7778.method24958(class6332);
        }
        final boolean method28956 = Class7663.method24283();
        this.field9288.method5327().method15301(() -> "render_" + obj);
        final boolean b = class6332 != Class6332.method18765();
        final ObjectListIterator listIterator = this.field9294.listIterator(b ? 0 : this.field9294.size());
        while (true) {
            if (b) {
                if (!listIterator.hasNext()) {
                    break;
                }
            }
            else if (!listIterator.hasPrevious()) {
                break;
            }
            final Class8974 field9338 = ((Class9071)(b ? listIterator.next() : ((Class9071)listIterator.previous()))).field38417;
            if (!field9338.method31870().method32213(class6332)) {
                final Class1918 method28957 = field9338.method31866(class6332);
                class6333.method22567();
                final BlockPos method28958 = field9338.method31873();
                class6333.method22564(method28958.getX() - field9335, method28958.getY() - field9336, method28958.getZ() - field9337);
                method28957.method7587();
                Class9237.field39607.method34196(0L);
                if (method28955) {
                    Class7778.method24962();
                }
                method28957.method7591(class6333.method22569().method32111(), 7);
                class6333.method22568();
                if (!method28956) {
                    continue;
                }
                final BitSet method28959 = field9338.method31870().method32215(class6332);
                if (method28959 == null) {
                    continue;
                }
                Class7663.method24286(method28959);
            }
        }
        Class1918.method7592();
        Class8726.method30070();
        Class9237.field39607.method34197();
        this.field9288.method5327().method15299();
        if (method28955) {
            Class7778.method24959(class6332);
        }
        class6332.method18710();
    }
    
    private void method5715(final Class6092 class6092) {
        final Class7392 method22694 = Class7392.method22694();
        final Class4148 method22695 = method22694.method22696();
        if (this.field9288.field4708 || this.field9288.field4709) {
            final double method22696 = class6092.method18161().getX();
            final double method22697 = class6092.method18161().getY();
            final double method22698 = class6092.method18161().getZ();
            Class8726.method30010(true);
            Class8726.method30029();
            Class8726.method30011();
            Class8726.method30117();
            Class8726.method30041();
            for (final Class9071 class6093 : this.field9294) {
                final Class8974 field38417 = class6093.field38417;
                Class8726.method30059();
                final BlockPos method22699 = field38417.method31873();
                Class8726.method30066(method22699.getX() - method22696, method22699.getY() - method22697, method22699.getZ() - method22698);
                if (this.field9288.field4708) {
                    method22695.method12390(1, Class9237.field39615);
                    Class8726.method30072(10.0f);
                    final int n = (Class9071.method32683(class6093) == 0) ? 0 : MathHelper.method35697(Class9071.method32683(class6093) / 50.0f, 0.9f, 0.9f);
                    final int n2 = n >> 16 & 0xFF;
                    final int n3 = n >> 8 & 0xFF;
                    final int n4 = n & 0xFF;
                    final Direction method22700 = Class9071.method32681(class6093);
                    if (method22700 != null) {
                        method22695.method12432(8.0, 8.0, 8.0).method12399(n2, n3, n4, 255).method12397();
                        method22695.method12432(8 - 16 * method22700.getXOffset(), 8 - 16 * method22700.getYOffset(), 8 - 16 * method22700.getZOffset()).method12399(n2, n3, n4, 255).method12397();
                    }
                    method22694.method22695();
                    Class8726.method30072(1.0f);
                }
                if (this.field9288.field4709 && !field38417.method31870().method32212()) {
                    method22695.method12390(1, Class9237.field39615);
                    Class8726.method30072(10.0f);
                    int n5 = 0;
                    for (final Direction class6094 : Direction.values()) {
                        for (final Direction class6095 : Direction.values()) {
                            if (!field38417.method31870().method32210(class6094, class6095)) {
                                ++n5;
                                method22695.method12432(8 + 8 * class6094.getXOffset(), 8 + 8 * class6094.getYOffset(), 8 + 8 * class6094.getZOffset()).method12399(1, 0, 0, 1).method12397();
                                method22695.method12432(8 + 8 * class6095.getXOffset(), 8 + 8 * class6095.getYOffset(), 8 + 8 * class6095.getZOffset()).method12399(1, 0, 0, 1).method12397();
                            }
                        }
                    }
                    method22694.method22695();
                    Class8726.method30072(1.0f);
                    if (n5 > 0) {
                        method22695.method12390(7, Class9237.field39615);
                        method22695.method12432(0.5, 15.5, 0.5).method12439(0.9f, 0.9f, 0.0f, 0.2f).method12397();
                        method22695.method12432(15.5, 15.5, 0.5).method12439(0.9f, 0.9f, 0.0f, 0.2f).method12397();
                        method22695.method12432(15.5, 15.5, 15.5).method12439(0.9f, 0.9f, 0.0f, 0.2f).method12397();
                        method22695.method12432(0.5, 15.5, 15.5).method12439(0.9f, 0.9f, 0.0f, 0.2f).method12397();
                        method22695.method12432(0.5, 0.5, 15.5).method12439(0.9f, 0.9f, 0.0f, 0.2f).method12397();
                        method22695.method12432(15.5, 0.5, 15.5).method12439(0.9f, 0.9f, 0.0f, 0.2f).method12397();
                        method22695.method12432(15.5, 0.5, 0.5).method12439(0.9f, 0.9f, 0.0f, 0.2f).method12397();
                        method22695.method12432(0.5, 0.5, 0.5).method12439(0.9f, 0.9f, 0.0f, 0.2f).method12397();
                        method22695.method12432(0.5, 15.5, 0.5).method12439(0.9f, 0.9f, 0.0f, 0.2f).method12397();
                        method22695.method12432(0.5, 15.5, 15.5).method12439(0.9f, 0.9f, 0.0f, 0.2f).method12397();
                        method22695.method12432(0.5, 0.5, 15.5).method12439(0.9f, 0.9f, 0.0f, 0.2f).method12397();
                        method22695.method12432(0.5, 0.5, 0.5).method12439(0.9f, 0.9f, 0.0f, 0.2f).method12397();
                        method22695.method12432(15.5, 0.5, 0.5).method12439(0.9f, 0.9f, 0.0f, 0.2f).method12397();
                        method22695.method12432(15.5, 0.5, 15.5).method12439(0.9f, 0.9f, 0.0f, 0.2f).method12397();
                        method22695.method12432(15.5, 15.5, 15.5).method12439(0.9f, 0.9f, 0.0f, 0.2f).method12397();
                        method22695.method12432(15.5, 15.5, 0.5).method12439(0.9f, 0.9f, 0.0f, 0.2f).method12397();
                        method22695.method12432(0.5, 0.5, 0.5).method12439(0.9f, 0.9f, 0.0f, 0.2f).method12397();
                        method22695.method12432(15.5, 0.5, 0.5).method12439(0.9f, 0.9f, 0.0f, 0.2f).method12397();
                        method22695.method12432(15.5, 15.5, 0.5).method12439(0.9f, 0.9f, 0.0f, 0.2f).method12397();
                        method22695.method12432(0.5, 15.5, 0.5).method12439(0.9f, 0.9f, 0.0f, 0.2f).method12397();
                        method22695.method12432(0.5, 15.5, 15.5).method12439(0.9f, 0.9f, 0.0f, 0.2f).method12397();
                        method22695.method12432(15.5, 15.5, 15.5).method12439(0.9f, 0.9f, 0.0f, 0.2f).method12397();
                        method22695.method12432(15.5, 0.5, 15.5).method12439(0.9f, 0.9f, 0.0f, 0.2f).method12397();
                        method22695.method12432(0.5, 0.5, 15.5).method12439(0.9f, 0.9f, 0.0f, 0.2f).method12397();
                        method22694.method22695();
                    }
                }
                Class8726.method30060();
            }
            Class8726.method30010(true);
            Class8726.method30012();
            Class8726.method30028();
            Class8726.method30040();
        }
        if (this.field9332 != null) {
            Class8726.method30029();
            Class8726.method30041();
            Class8726.method30011();
            Class8726.method30117();
            Class8726.method30072(10.0f);
            Class8726.method30059();
            Class8726.method30065((float)(this.field9334.field28226 - class6092.method18161().x), (float)(this.field9334.field28227 - class6092.method18161().y), (float)(this.field9334.field28228 - class6092.method18161().z));
            Class8726.method30010(true);
            method22695.method12390(7, Class9237.field39615);
            this.method5717(method22695, 0, 1, 2, 3, 0, 1, 1);
            this.method5717(method22695, 4, 5, 6, 7, 1, 0, 0);
            this.method5717(method22695, 0, 1, 5, 4, 1, 1, 0);
            this.method5717(method22695, 2, 3, 7, 6, 0, 0, 1);
            this.method5717(method22695, 0, 4, 7, 3, 0, 1, 0);
            this.method5717(method22695, 1, 5, 6, 2, 1, 0, 1);
            method22694.method22695();
            Class8726.method30010(false);
            method22695.method12390(1, Class9237.field39614);
            Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
            this.method5716(method22695, 0);
            this.method5716(method22695, 1);
            this.method5716(method22695, 1);
            this.method5716(method22695, 2);
            this.method5716(method22695, 2);
            this.method5716(method22695, 3);
            this.method5716(method22695, 3);
            this.method5716(method22695, 0);
            this.method5716(method22695, 4);
            this.method5716(method22695, 5);
            this.method5716(method22695, 5);
            this.method5716(method22695, 6);
            this.method5716(method22695, 6);
            this.method5716(method22695, 7);
            this.method5716(method22695, 7);
            this.method5716(method22695, 4);
            this.method5716(method22695, 0);
            this.method5716(method22695, 4);
            this.method5716(method22695, 1);
            this.method5716(method22695, 5);
            this.method5716(method22695, 2);
            this.method5716(method22695, 6);
            this.method5716(method22695, 3);
            this.method5716(method22695, 7);
            method22694.method22695();
            Class8726.method30060();
            Class8726.method30010(true);
            Class8726.method30012();
            Class8726.method30028();
            Class8726.method30040();
            Class8726.method30072(1.0f);
        }
    }
    
    private void method5716(final Class4150 class4150, final int n) {
        class4150.method12432(this.field9333[n].method28595(), this.field9333[n].method28596(), this.field9333[n].method28597()).method12397();
    }
    
    private void method5717(final Class4150 class4150, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        class4150.method12432(this.field9333[n].method28595(), this.field9333[n].method28596(), this.field9333[n].method28597()).method12439((float)n5, (float)n6, (float)n7, 0.25f).method12397();
        class4150.method12432(this.field9333[n2].method28595(), this.field9333[n2].method28596(), this.field9333[n2].method28597()).method12439((float)n5, (float)n6, (float)n7, 0.25f).method12397();
        class4150.method12432(this.field9333[n3].method28595(), this.field9333[n3].method28596(), this.field9333[n3].method28597()).method12439((float)n5, (float)n6, (float)n7, 0.25f).method12397();
        class4150.method12432(this.field9333[n4].method28595(), this.field9333[n4].method28596(), this.field9333[n4].method28597()).method12439((float)n5, (float)n6, (float)n7, 0.25f).method12397();
    }
    
    public void method5718() {
        ++this.field9304;
        if (this.field9304 % 20 == 0) {
            final ObjectIterator iterator = this.field9305.values().iterator();
            while (((Iterator)iterator).hasNext()) {
                final Class349 class349 = ((Iterator<Class349>)iterator).next();
                if (this.field9304 - class349.method1050() > 400) {
                    ((Iterator)iterator).remove();
                    this.method5719(class349);
                }
            }
        }
    }
    
    private void method5719(final Class349 class349) {
        final long method1132 = class349.method1046().method1132();
        final Set set = (Set)this.field9306.get(method1132);
        set.remove(class349);
        if (set.isEmpty()) {
            this.field9306.remove(method1132);
        }
    }
    
    private void method5720(final Class7351 class7351) {
        if (Class8571.method28913()) {
            Class8726.method29998();
            Class8726.method30011();
            Class8726.method30117();
            Class8726.method30010(false);
            this.field9289.method5849(Class1656.field9283);
            final Class7392 method22694 = Class7392.method22694();
            final Class4148 method22695 = method22694.method22696();
            for (int i = 0; i < 6; ++i) {
                class7351.method22567();
                if (i == 1) {
                    class7351.method22566(Vector3f.XP.rotationDegrees(90.0f));
                }
                if (i == 2) {
                    class7351.method22566(Vector3f.XP.rotationDegrees(-90.0f));
                }
                if (i == 3) {
                    class7351.method22566(Vector3f.XP.rotationDegrees(180.0f));
                }
                if (i == 4) {
                    class7351.method22566(Vector3f.ZP.rotationDegrees(90.0f));
                }
                if (i == 5) {
                    class7351.method22566(Vector3f.ZP.rotationDegrees(-90.0f));
                }
                final Matrix4f method22696 = class7351.method22569().method32111();
                method22695.method12390(7, Class9237.field39619);
                int n = 40;
                int n2 = 40;
                int n3 = 40;
                if (Class8571.method28945()) {
                    final Vec3d method22697 = Class8763.method30363(new Vec3d(n / 255.0, n2 / 255.0, n3 / 255.0), this.field9292, this.field9288.method5303(), 0.0f);
                    n = (int)(method22697.x * 255.0);
                    n2 = (int)(method22697.y * 255.0);
                    n3 = (int)(method22697.z * 255.0);
                }
                method22695.method12444(method22696, -100.0f, -100.0f, -100.0f).method12391(0.0f, 0.0f).method12399(n, n2, n3, 255).method12397();
                method22695.method12444(method22696, -100.0f, -100.0f, 100.0f).method12391(0.0f, 16.0f).method12399(n, n2, n3, 255).method12397();
                method22695.method12444(method22696, 100.0f, -100.0f, 100.0f).method12391(16.0f, 16.0f).method12399(n, n2, n3, 255).method12397();
                method22695.method12444(method22696, 100.0f, -100.0f, -100.0f).method12391(16.0f, 0.0f).method12399(n, n2, n3, 255).method12397();
                method22694.method22695();
                class7351.method22568();
            }
            Class8726.method30010(true);
            Class8726.method30040();
            Class8726.method30012();
            Class8726.method29999();
        }
    }
    
    public void method5721(final Class7351 class7351, final float f) {
        if (Class9570.field41363.method22605()) {
            final Object method35826 = Class9570.method35826(this.field9288.field4683.field10063, Class9570.field41363, new Object[0]);
            if (method35826 != null) {
                Class9570.method35819(method35826, Class9570.field41368, this.field9304, f, this.field9292, this.field9288);
                return;
            }
        }
        if (this.field9288.field4683.field10063.method20487() == Class383.field2225) {
            this.method5720(class7351);
        }
        else if (this.field9288.field4683.field10063.method20492()) {
            Class8726.method30041();
            final boolean method35827 = Class8571.method28955();
            if (method35827) {
                Class9216.method33872();
            }
            final Vec3d method35828 = Class8763.method30355(this.field9292.method6843(this.field9288.field4644.method5833().method18162(), f), this.field9288.field4683, this.field9288.method5303().getPosX(), this.field9288.method5303().getPosY() + 1.0, this.field9288.method5303().getPosZ());
            if (method35827) {
                Class9216.method33825(method35828);
            }
            final float n = (float)method35828.x;
            final float n2 = (float)method35828.y;
            final float n3 = (float)method35828.z;
            Class9111.method32956();
            final Class4148 method35829 = Class7392.method22694().method22696();
            Class8726.method30010(false);
            Class8726.method30019();
            if (method35827) {
                Class9216.method33875();
            }
            Class8726.method30069(n, n2, n3);
            if (method35827) {
                Class9216.method33827(class7351);
            }
            if (Class8571.method28913()) {
                this.field9299.method7587();
                this.field9297.method34196(0L);
                this.field9299.method7591(class7351.method22569().method32111(), 7);
                Class1918.method7592();
                this.field9297.method34197();
            }
            Class8726.method30020();
            if (method35827) {
                Class9216.method33876();
            }
            Class8726.method29998();
            Class8726.method30011();
            Class8726.method30117();
            final float[] method35830 = this.field9292.field10063.method20497(this.field9292.method6952(f), f);
            if (method35830 != null && Class8571.method28914()) {
                Class8726.method30041();
                if (method35827) {
                    Class9216.method33872();
                }
                Class8726.method30045(7425);
                class7351.method22567();
                class7351.method22566(Vector3f.XP.rotationDegrees(90.0f));
                class7351.method22566(Vector3f.ZP.rotationDegrees((MathHelper.sin(this.field9292.method6713(f)) < 0.0f) ? 180.0f : 0.0f));
                class7351.method22566(Vector3f.ZP.rotationDegrees(90.0f));
                final float n4 = method35830[0];
                final float n5 = method35830[1];
                final float n6 = method35830[2];
                final Matrix4f method35831 = class7351.method22569().method32111();
                method35829.method12390(6, Class9237.field39615);
                method35829.method12444(method35831, 0.0f, 100.0f, 0.0f).method12439(n4, n5, n6, method35830[3]).method12397();
                for (int i = 0; i <= 16; ++i) {
                    final float n7 = i * 6.2831855f / 16.0f;
                    final float method35832 = MathHelper.sin(n7);
                    final float method35833 = MathHelper.cos(n7);
                    method35829.method12444(method35831, method35832 * 120.0f, method35833 * 120.0f, -method35833 * 40.0f * method35830[3]).method12439(method35830[0], method35830[1], method35830[2], 0.0f).method12397();
                }
                method35829.method12393();
                Class8475.method28282(method35829);
                class7351.method22568();
                Class8726.method30045(7424);
            }
            Class8726.method30040();
            if (method35827) {
                Class9216.method33871();
            }
            Class8726.method30015(Class2050.field11693, Class2135.field12455, Class2050.field11686, Class2135.field12464);
            class7351.method22567();
            final float n8 = 1.0f - this.field9292.method6768(f);
            Class8726.method30068(1.0f, 1.0f, 1.0f, n8);
            class7351.method22566(Vector3f.YP.rotationDegrees(-90.0f));
            Class9132.method33155(this.field9292, this.field9289, class7351, f);
            if (method35827) {
                Class9216.method33810(class7351);
            }
            class7351.method22566(Vector3f.XP.rotationDegrees(this.field9292.method6952(f) * 360.0f));
            if (method35827) {
                Class9216.method33811(class7351);
            }
            final Matrix4f method35834 = class7351.method22569().method32111();
            final float n9 = 30.0f;
            if (Class8571.method28915()) {
                this.field9289.method5849(Class1656.field9281);
                method35829.method12390(7, Class9237.field39617);
                method35829.method12444(method35834, -n9, 100.0f, -n9).method12391(0.0f, 0.0f).method12397();
                method35829.method12444(method35834, n9, 100.0f, -n9).method12391(1.0f, 0.0f).method12397();
                method35829.method12444(method35834, n9, 100.0f, n9).method12391(1.0f, 1.0f).method12397();
                method35829.method12444(method35834, -n9, 100.0f, n9).method12391(0.0f, 1.0f).method12397();
                method35829.method12393();
                Class8475.method28282(method35829);
            }
            final float n10 = 20.0f;
            if (Class8571.method28916()) {
                this.field9289.method5849(Class1656.field9280);
                final int method35835 = this.field9292.method6953();
                final int n11 = method35835 % 4;
                final int n12 = method35835 / 4 % 2;
                final float n13 = (n11 + 0) / 4.0f;
                final float n14 = (n12 + 0) / 2.0f;
                final float n15 = (n11 + 1) / 4.0f;
                final float n16 = (n12 + 1) / 2.0f;
                method35829.method12390(7, Class9237.field39617);
                method35829.method12444(method35834, -n10, -100.0f, n10).method12391(n15, n16).method12397();
                method35829.method12444(method35834, n10, -100.0f, n10).method12391(n13, n16).method12397();
                method35829.method12444(method35834, n10, -100.0f, -n10).method12391(n13, n14).method12397();
                method35829.method12444(method35834, -n10, -100.0f, -n10).method12391(n15, n14).method12397();
                method35829.method12393();
                Class8475.method28282(method35829);
            }
            Class8726.method30041();
            if (method35827) {
                Class9216.method33872();
            }
            final float n17 = this.field9292.method6846(f) * n8;
            if (n17 > 0.0f && Class8571.method28918() && !Class9132.method33156(this.field9292)) {
                Class8726.method30068(n17, n17, n17, n17);
                this.field9298.method7587();
                this.field9297.method34196(0L);
                this.field9298.method7591(class7351.method22569().method32111(), 7);
                Class1918.method7592();
                this.field9297.method34197();
            }
            Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
            Class8726.method30012();
            Class8726.method29999();
            Class8726.method30019();
            if (method35827) {
                Class9216.method33875();
            }
            class7351.method22568();
            Class8726.method30041();
            if (method35827) {
                Class9216.method33872();
            }
            Class8726.method30069(0.0f, 0.0f, 0.0f);
            if (this.field9288.field4684.method1747(f).y - this.field9292.method6847() < 0.0) {
                class7351.method22567();
                class7351.method22564(0.0, 12.0, 0.0);
                this.field9300.method7587();
                this.field9297.method34196(0L);
                this.field9300.method7591(class7351.method22569().method32111(), 7);
                Class1918.method7592();
                this.field9297.method34197();
                class7351.method22568();
            }
            if (this.field9292.field10063.method20499()) {
                Class8726.method30069(n * 0.2f + 0.04f, n2 * 0.2f + 0.04f, n3 * 0.6f + 0.1f);
            }
            else {
                Class8726.method30069(n, n2, n3);
            }
            Class8726.method30040();
            Class8726.method30010(true);
            Class8726.method30020();
        }
    }
    
    public void method5722(final Class7351 class7351, final float f, final double n, final double n2, final double n3) {
        if (!Class8571.method28858()) {
            if (Class9570.field41362.method22605()) {
                final Object method35826 = Class9570.method35826(this.field9288.field4683.field10063, Class9570.field41362, new Object[0]);
                if (method35826 != null) {
                    Class9570.method35819(method35826, Class9570.field41368, f, this.field9292, this.field9288);
                    return;
                }
            }
            if (this.field9288.field4683.field10063.method20492()) {
                if (Class8571.method28955()) {
                    Class9216.method33832();
                }
                Class8726.method30029();
                Class8726.method30011();
                Class8726.method29999();
                Class8726.method30008();
                Class8726.method30118();
                Class8726.method30117();
                Class8726.method30019();
                final double n4 = (n + (this.field9304 + f) * 0.03f) / 12.0;
                final double n5 = this.field9292.field10063.method20498() - (float)n2 + 0.33f + this.field9288.field4648.field23490 * 128.0;
                final double n6 = n3 / 12.0 + 0.33000001311302185;
                final double a = n4 - MathHelper.floor(n4 / 2048.0) * 2048;
                final double a2 = n6 - MathHelper.floor(n6 / 2048.0) * 2048;
                final float n7 = (float)(a - MathHelper.floor(a));
                final float n8 = (float)(n5 / 4.0 - MathHelper.floor(n5 / 4.0)) * 4.0f;
                final float n9 = (float)(a2 - MathHelper.floor(a2));
                final Vec3d method35827 = this.field9292.method6844(f);
                final int field9321 = (int)Math.floor(a);
                final int field9322 = (int)Math.floor(n5 / 4.0);
                final int field9323 = (int)Math.floor(a2);
                if (field9321 != this.field9321 || field9322 != this.field9322 || field9323 != this.field9323 || this.field9288.field4648.method17128() != this.field9325 || this.field9324.squareDistanceTo(method35827) > 2.0E-4) {
                    this.field9321 = field9321;
                    this.field9322 = field9322;
                    this.field9323 = field9323;
                    this.field9324 = method35827;
                    this.field9325 = this.field9288.field4648.method17128();
                    this.field9301 = true;
                }
                if (this.field9301) {
                    this.field9301 = false;
                    final Class4148 method35828 = Class7392.method22694().method22696();
                    if (this.field9302 != null) {
                        this.field9302.close();
                    }
                    this.field9302 = new Class1918(Class9237.field39622);
                    this.method5723(method35828, a, n5, a2, method35827);
                    method35828.method12393();
                    this.field9302.method7588(method35828);
                }
                this.field9289.method5849(Class1656.field9282);
                class7351.method22567();
                class7351.method22565(12.0f, 1.0f, 12.0f);
                class7351.method22564(-n7, n8, -n9);
                if (this.field9302 != null) {
                    this.field9302.method7587();
                    Class9237.field39622.method34196(0L);
                    for (int i = (this.field9325 != Class2202.field13407) ? 1 : 0; i < 2; ++i) {
                        if (i == 0) {
                            Class8726.method30049(false, false, false, false);
                        }
                        else {
                            Class8726.method30049(true, true, true, true);
                        }
                        this.field9302.method7591(class7351.method22569().method32111(), 7);
                    }
                    Class1918.method7592();
                    Class9237.field39622.method34197();
                }
                class7351.method22568();
                Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
                Class8726.method29998();
                Class8726.method30028();
                Class8726.method30012();
                Class8726.method30020();
                if (Class8571.method28955()) {
                    Class9216.method33833();
                }
            }
        }
    }
    
    private void method5723(final Class4148 class4148, final double n, final double n2, final double n3, final Vec3d class4149) {
        final float n4 = MathHelper.floor(n) * 0.00390625f;
        final float n5 = MathHelper.floor(n3) * 0.00390625f;
        final float n6 = (float)class4149.x;
        final float n7 = (float)class4149.y;
        final float n8 = (float)class4149.z;
        final float n9 = n6 * 0.9f;
        final float n10 = n7 * 0.9f;
        final float n11 = n8 * 0.9f;
        final float n12 = n6 * 0.7f;
        final float n13 = n7 * 0.7f;
        final float n14 = n8 * 0.7f;
        final float n15 = n6 * 0.8f;
        final float n16 = n7 * 0.8f;
        final float n17 = n8 * 0.8f;
        class4148.method12390(7, Class9237.field39622);
        final float n18 = (float)Math.floor(n2 / 4.0) * 4.0f;
        if (Class8571.method28857()) {
            for (int i = -3; i <= 4; ++i) {
                for (int j = -3; j <= 4; ++j) {
                    final float n19 = (float)(i * 8);
                    final float n20 = (float)(j * 8);
                    if (n18 > -5.0f) {
                        class4148.method12432(n19 + 0.0f, n18 + 0.0f, n20 + 8.0f).method12391((n19 + 0.0f) * 0.00390625f + n4, (n20 + 8.0f) * 0.00390625f + n5).method12439(n12, n13, n14, 0.8f).method12436(0.0f, -1.0f, 0.0f).method12397();
                        class4148.method12432(n19 + 8.0f, n18 + 0.0f, n20 + 8.0f).method12391((n19 + 8.0f) * 0.00390625f + n4, (n20 + 8.0f) * 0.00390625f + n5).method12439(n12, n13, n14, 0.8f).method12436(0.0f, -1.0f, 0.0f).method12397();
                        class4148.method12432(n19 + 8.0f, n18 + 0.0f, n20 + 0.0f).method12391((n19 + 8.0f) * 0.00390625f + n4, (n20 + 0.0f) * 0.00390625f + n5).method12439(n12, n13, n14, 0.8f).method12436(0.0f, -1.0f, 0.0f).method12397();
                        class4148.method12432(n19 + 0.0f, n18 + 0.0f, n20 + 0.0f).method12391((n19 + 0.0f) * 0.00390625f + n4, (n20 + 0.0f) * 0.00390625f + n5).method12439(n12, n13, n14, 0.8f).method12436(0.0f, -1.0f, 0.0f).method12397();
                    }
                    if (n18 <= 5.0f) {
                        class4148.method12432(n19 + 0.0f, n18 + 4.0f - 9.765625E-4f, n20 + 8.0f).method12391((n19 + 0.0f) * 0.00390625f + n4, (n20 + 8.0f) * 0.00390625f + n5).method12439(n6, n7, n8, 0.8f).method12436(0.0f, 1.0f, 0.0f).method12397();
                        class4148.method12432(n19 + 8.0f, n18 + 4.0f - 9.765625E-4f, n20 + 8.0f).method12391((n19 + 8.0f) * 0.00390625f + n4, (n20 + 8.0f) * 0.00390625f + n5).method12439(n6, n7, n8, 0.8f).method12436(0.0f, 1.0f, 0.0f).method12397();
                        class4148.method12432(n19 + 8.0f, n18 + 4.0f - 9.765625E-4f, n20 + 0.0f).method12391((n19 + 8.0f) * 0.00390625f + n4, (n20 + 0.0f) * 0.00390625f + n5).method12439(n6, n7, n8, 0.8f).method12436(0.0f, 1.0f, 0.0f).method12397();
                        class4148.method12432(n19 + 0.0f, n18 + 4.0f - 9.765625E-4f, n20 + 0.0f).method12391((n19 + 0.0f) * 0.00390625f + n4, (n20 + 0.0f) * 0.00390625f + n5).method12439(n6, n7, n8, 0.8f).method12436(0.0f, 1.0f, 0.0f).method12397();
                    }
                    if (i > -1) {
                        for (int k = 0; k < 8; ++k) {
                            class4148.method12432(n19 + k + 0.0f, n18 + 0.0f, n20 + 8.0f).method12391((n19 + k + 0.5f) * 0.00390625f + n4, (n20 + 8.0f) * 0.00390625f + n5).method12439(n9, n10, n11, 0.8f).method12436(-1.0f, 0.0f, 0.0f).method12397();
                            class4148.method12432(n19 + k + 0.0f, n18 + 4.0f, n20 + 8.0f).method12391((n19 + k + 0.5f) * 0.00390625f + n4, (n20 + 8.0f) * 0.00390625f + n5).method12439(n9, n10, n11, 0.8f).method12436(-1.0f, 0.0f, 0.0f).method12397();
                            class4148.method12432(n19 + k + 0.0f, n18 + 4.0f, n20 + 0.0f).method12391((n19 + k + 0.5f) * 0.00390625f + n4, (n20 + 0.0f) * 0.00390625f + n5).method12439(n9, n10, n11, 0.8f).method12436(-1.0f, 0.0f, 0.0f).method12397();
                            class4148.method12432(n19 + k + 0.0f, n18 + 0.0f, n20 + 0.0f).method12391((n19 + k + 0.5f) * 0.00390625f + n4, (n20 + 0.0f) * 0.00390625f + n5).method12439(n9, n10, n11, 0.8f).method12436(-1.0f, 0.0f, 0.0f).method12397();
                        }
                    }
                    if (i <= 1) {
                        for (int l = 0; l < 8; ++l) {
                            class4148.method12432(n19 + l + 1.0f - 9.765625E-4f, n18 + 0.0f, n20 + 8.0f).method12391((n19 + l + 0.5f) * 0.00390625f + n4, (n20 + 8.0f) * 0.00390625f + n5).method12439(n9, n10, n11, 0.8f).method12436(1.0f, 0.0f, 0.0f).method12397();
                            class4148.method12432(n19 + l + 1.0f - 9.765625E-4f, n18 + 4.0f, n20 + 8.0f).method12391((n19 + l + 0.5f) * 0.00390625f + n4, (n20 + 8.0f) * 0.00390625f + n5).method12439(n9, n10, n11, 0.8f).method12436(1.0f, 0.0f, 0.0f).method12397();
                            class4148.method12432(n19 + l + 1.0f - 9.765625E-4f, n18 + 4.0f, n20 + 0.0f).method12391((n19 + l + 0.5f) * 0.00390625f + n4, (n20 + 0.0f) * 0.00390625f + n5).method12439(n9, n10, n11, 0.8f).method12436(1.0f, 0.0f, 0.0f).method12397();
                            class4148.method12432(n19 + l + 1.0f - 9.765625E-4f, n18 + 0.0f, n20 + 0.0f).method12391((n19 + l + 0.5f) * 0.00390625f + n4, (n20 + 0.0f) * 0.00390625f + n5).method12439(n9, n10, n11, 0.8f).method12436(1.0f, 0.0f, 0.0f).method12397();
                        }
                    }
                    if (j > -1) {
                        for (int n21 = 0; n21 < 8; ++n21) {
                            class4148.method12432(n19 + 0.0f, n18 + 4.0f, n20 + n21 + 0.0f).method12391((n19 + 0.0f) * 0.00390625f + n4, (n20 + n21 + 0.5f) * 0.00390625f + n5).method12439(n15, n16, n17, 0.8f).method12436(0.0f, 0.0f, -1.0f).method12397();
                            class4148.method12432(n19 + 8.0f, n18 + 4.0f, n20 + n21 + 0.0f).method12391((n19 + 8.0f) * 0.00390625f + n4, (n20 + n21 + 0.5f) * 0.00390625f + n5).method12439(n15, n16, n17, 0.8f).method12436(0.0f, 0.0f, -1.0f).method12397();
                            class4148.method12432(n19 + 8.0f, n18 + 0.0f, n20 + n21 + 0.0f).method12391((n19 + 8.0f) * 0.00390625f + n4, (n20 + n21 + 0.5f) * 0.00390625f + n5).method12439(n15, n16, n17, 0.8f).method12436(0.0f, 0.0f, -1.0f).method12397();
                            class4148.method12432(n19 + 0.0f, n18 + 0.0f, n20 + n21 + 0.0f).method12391((n19 + 0.0f) * 0.00390625f + n4, (n20 + n21 + 0.5f) * 0.00390625f + n5).method12439(n15, n16, n17, 0.8f).method12436(0.0f, 0.0f, -1.0f).method12397();
                        }
                    }
                    if (j <= 1) {
                        for (int n22 = 0; n22 < 8; ++n22) {
                            class4148.method12432(n19 + 0.0f, n18 + 4.0f, n20 + n22 + 1.0f - 9.765625E-4f).method12391((n19 + 0.0f) * 0.00390625f + n4, (n20 + n22 + 0.5f) * 0.00390625f + n5).method12439(n15, n16, n17, 0.8f).method12436(0.0f, 0.0f, 1.0f).method12397();
                            class4148.method12432(n19 + 8.0f, n18 + 4.0f, n20 + n22 + 1.0f - 9.765625E-4f).method12391((n19 + 8.0f) * 0.00390625f + n4, (n20 + n22 + 0.5f) * 0.00390625f + n5).method12439(n15, n16, n17, 0.8f).method12436(0.0f, 0.0f, 1.0f).method12397();
                            class4148.method12432(n19 + 8.0f, n18 + 0.0f, n20 + n22 + 1.0f - 9.765625E-4f).method12391((n19 + 8.0f) * 0.00390625f + n4, (n20 + n22 + 0.5f) * 0.00390625f + n5).method12439(n15, n16, n17, 0.8f).method12436(0.0f, 0.0f, 1.0f).method12397();
                            class4148.method12432(n19 + 0.0f, n18 + 0.0f, n20 + n22 + 1.0f - 9.765625E-4f).method12391((n19 + 0.0f) * 0.00390625f + n4, (n20 + n22 + 0.5f) * 0.00390625f + n5).method12439(n15, n16, n17, 0.8f).method12436(0.0f, 0.0f, 1.0f).method12397();
                        }
                    }
                }
            }
        }
        else {
            for (int n23 = -32; n23 < 32; n23 += 32) {
                for (int n24 = -32; n24 < 32; n24 += 32) {
                    class4148.method12432(n23 + 0, n18, n24 + 32).method12391((n23 + 0) * 0.00390625f + n4, (n24 + 32) * 0.00390625f + n5).method12439(n6, n7, n8, 0.8f).method12436(0.0f, -1.0f, 0.0f).method12397();
                    class4148.method12432(n23 + 32, n18, n24 + 32).method12391((n23 + 32) * 0.00390625f + n4, (n24 + 32) * 0.00390625f + n5).method12439(n6, n7, n8, 0.8f).method12436(0.0f, -1.0f, 0.0f).method12397();
                    class4148.method12432(n23 + 32, n18, n24 + 0).method12391((n23 + 32) * 0.00390625f + n4, (n24 + 0) * 0.00390625f + n5).method12439(n6, n7, n8, 0.8f).method12436(0.0f, -1.0f, 0.0f).method12397();
                    class4148.method12432(n23 + 0, n18, n24 + 0).method12391((n23 + 0) * 0.00390625f + n4, (n24 + 0) * 0.00390625f + n5).method12439(n6, n7, n8, 0.8f).method12436(0.0f, -1.0f, 0.0f).method12397();
                }
            }
        }
    }
    
    public void method5724(long n) {
        n += (long)1.0E8;
        this.field9338 |= this.field9326.method23457();
        Class8349.method27838();
        if (this.field9345.size() > 0) {
            final Iterator iterator = this.field9345.iterator();
            while (iterator.hasNext()) {
                final Class8974 class8974 = (Class8974)iterator.next();
                if (!this.field9326.method23469(class8974)) {
                    break;
                }
                class8974.method31875();
                iterator.remove();
                this.field9293.remove(class8974);
                this.field9344.remove(class8974);
            }
        }
        if (this.field9344.size() > 0) {
            final Iterator iterator2 = this.field9344.iterator();
            if (iterator2.hasNext() && this.field9326.method23470((Class8974)iterator2.next())) {
                iterator2.remove();
            }
        }
        double n2 = 0.0;
        final int method28853 = Class8571.method28853();
        if (!this.field9293.isEmpty()) {
            final Iterator<Class8974> iterator3 = this.field9293.iterator();
            while (iterator3.hasNext()) {
                final Class8974 class8975 = iterator3.next();
                final boolean method28854 = class8975.method31897();
                boolean b;
                if (!class8975.method31877() && !method28854) {
                    b = this.field9326.method23469(class8975);
                }
                else {
                    b = this.field9326.method23468(class8975);
                }
                if (!b) {
                    break;
                }
                class8975.method31875();
                iterator3.remove();
                if (method28854) {
                    continue;
                }
                n2 += 2.0 * Class7852.method25389(class8975);
                if (n2 > method28853) {
                    break;
                }
            }
        }
    }
    
    private void method5725(final Class6092 class6092) {
        final Class4148 method22696 = Class7392.method22694().method22696();
        final Class9375 method22697 = this.field9292.method6787();
        final double n = this.field9288.field4648.field23382 * 16;
        if (class6092.method18161().x >= method22697.method34788() - n || class6092.method18161().x <= method22697.method34786() + n || class6092.method18161().z >= method22697.method34789() - n || class6092.method18161().z <= method22697.method34787() + n) {
            final double pow = Math.pow(1.0 - method22697.method34784(class6092.method18161().x, class6092.method18161().z) / n, 4.0);
            final double field22770 = class6092.method18161().x;
            final double field22771 = class6092.method18161().y;
            final double field22772 = class6092.method18161().z;
            Class8726.method30011();
            Class8726.method30008();
            Class8726.method30015(Class2050.field11693, Class2135.field12455, Class2050.field11686, Class2135.field12464);
            this.field9289.method5849(Class1656.field9284);
            Class8726.method30010(false);
            Class8726.method30059();
            final int method22698 = method22697.method34785().method8217();
            Class8726.method30068((method22698 >> 16 & 0xFF) / 255.0f, (method22698 >> 8 & 0xFF) / 255.0f, (method22698 & 0xFF) / 255.0f, (float)pow);
            Class8726.method30035(-3.0f, -3.0f);
            Class8726.method30031();
            Class8726.method30118();
            Class8726.method29999();
            Class8726.method30029();
            final float n2 = Class8349.method27837() % 3000L / 3000.0f;
            method22696.method12390(7, Class9237.field39617);
            final double max = Math.max(MathHelper.floor(field22772 - n), method22697.method34787());
            final double min = Math.min(MathHelper.method35650(field22772 + n), method22697.method34789());
            if (field22770 > method22697.method34788() - n) {
                float n3 = 0.0f;
                for (double n4 = max; n4 < min; ++n4, n3 += 0.5f) {
                    final double min2 = Math.min(1.0, min - n4);
                    final float n5 = (float)min2 * 0.5f;
                    this.method5726(method22696, field22770, field22771, field22772, method22697.method34788(), 256, n4, n2 + n3, n2 + 0.0f);
                    this.method5726(method22696, field22770, field22771, field22772, method22697.method34788(), 256, n4 + min2, n2 + n5 + n3, n2 + 0.0f);
                    this.method5726(method22696, field22770, field22771, field22772, method22697.method34788(), 0, n4 + min2, n2 + n5 + n3, n2 + 128.0f);
                    this.method5726(method22696, field22770, field22771, field22772, method22697.method34788(), 0, n4, n2 + n3, n2 + 128.0f);
                }
            }
            if (field22770 < method22697.method34786() + n) {
                float n6 = 0.0f;
                for (double n7 = max; n7 < min; ++n7, n6 += 0.5f) {
                    final double min3 = Math.min(1.0, min - n7);
                    final float n8 = (float)min3 * 0.5f;
                    this.method5726(method22696, field22770, field22771, field22772, method22697.method34786(), 256, n7, n2 + n6, n2 + 0.0f);
                    this.method5726(method22696, field22770, field22771, field22772, method22697.method34786(), 256, n7 + min3, n2 + n8 + n6, n2 + 0.0f);
                    this.method5726(method22696, field22770, field22771, field22772, method22697.method34786(), 0, n7 + min3, n2 + n8 + n6, n2 + 128.0f);
                    this.method5726(method22696, field22770, field22771, field22772, method22697.method34786(), 0, n7, n2 + n6, n2 + 128.0f);
                }
            }
            final double max2 = Math.max(MathHelper.floor(field22770 - n), method22697.method34786());
            final double min4 = Math.min(MathHelper.method35650(field22770 + n), method22697.method34788());
            if (field22772 > method22697.method34789() - n) {
                float n9 = 0.0f;
                for (double n10 = max2; n10 < min4; ++n10, n9 += 0.5f) {
                    final double min5 = Math.min(1.0, min4 - n10);
                    final float n11 = (float)min5 * 0.5f;
                    this.method5726(method22696, field22770, field22771, field22772, n10, 256, method22697.method34789(), n2 + n9, n2 + 0.0f);
                    this.method5726(method22696, field22770, field22771, field22772, n10 + min5, 256, method22697.method34789(), n2 + n11 + n9, n2 + 0.0f);
                    this.method5726(method22696, field22770, field22771, field22772, n10 + min5, 0, method22697.method34789(), n2 + n11 + n9, n2 + 128.0f);
                    this.method5726(method22696, field22770, field22771, field22772, n10, 0, method22697.method34789(), n2 + n9, n2 + 128.0f);
                }
            }
            if (field22772 < method22697.method34787() + n) {
                float n12 = 0.0f;
                for (double n13 = max2; n13 < min4; ++n13, n12 += 0.5f) {
                    final double min6 = Math.min(1.0, min4 - n13);
                    final float n14 = (float)min6 * 0.5f;
                    this.method5726(method22696, field22770, field22771, field22772, n13, 256, method22697.method34787(), n2 + n12, n2 + 0.0f);
                    this.method5726(method22696, field22770, field22771, field22772, n13 + min6, 256, method22697.method34787(), n2 + n14 + n12, n2 + 0.0f);
                    this.method5726(method22696, field22770, field22771, field22772, n13 + min6, 0, method22697.method34787(), n2 + n14 + n12, n2 + 128.0f);
                    this.method5726(method22696, field22770, field22771, field22772, n13, 0, method22697.method34787(), n2 + n12, n2 + 128.0f);
                }
            }
            method22696.method12393();
            Class8475.method28282(method22696);
            Class8726.method30028();
            Class8726.method29998();
            Class8726.method30035(0.0f, 0.0f);
            Class8726.method30032();
            Class8726.method29999();
            Class8726.method30015(Class2050.field11693, Class2135.field12460, Class2050.field11686, Class2135.field12464);
            Class8726.method30012();
            Class8726.method30060();
            Class8726.method30010(true);
        }
    }
    
    private void method5726(final Class4148 class4148, final double n, final double n2, final double n3, final double n4, final int n5, final double n6, final float n7, final float n8) {
        class4148.method12432(n4 - n, n5 - n2, n6 - n3).method12391(n7, n8).method12397();
    }
    
    private void method5727(final Class7351 class7351, final Class4150 class7352, final Entity class7353, final double n, final double n2, final double n3, final BlockPos class7354, final Class7096 class7355) {
        method5729(class7351, class7352, class7355.method21726(this.field9292, class7354, Class7543.method23630(class7353)), class7354.getX() - n, class7354.getY() - n2, class7354.getZ() - n3, 0.0f, 0.0f, 0.0f, 0.4f);
    }
    
    public static void method5728(final Class7351 class7351, final Class4150 class7352, final Class7702 class7353, final double n, final double n2, final double n3, final float n4, final float n5, final float n6, final float n7) {
        final List<AxisAlignedBB> method24545 = class7353.method24545();
        final int method24546 = MathHelper.method35650(method24545.size() / 3.0);
        for (int i = 0; i < method24545.size(); ++i) {
            final AxisAlignedBB class7354 = method24545.get(i);
            final float n8 = (i % (float)method24546 + 1.0f) / method24546;
            final float n9 = (float)(i / method24546);
            method5729(class7351, class7352, Class7698.method24489(class7354.method18499(0.0, 0.0, 0.0)), n, n2, n3, n8 * (float)((n9 == 0.0f) ? 1 : 0), n8 * (float)((n9 == 1.0f) ? 1 : 0), n8 * (float)((n9 == 2.0f) ? 1 : 0), 1.0f);
        }
    }
    
    private static void method5729(final Class7351 class7351, final Class4150 class7352, final Class7702 class7353, final double n, final double n2, final double n3, final float n4, final float n5, final float n6, final float n7) {
        class7353.method24543((n8, n9, n10, n11, n12, n13) -> {
            class7352.method12444(class4151, (float)(n8 + n), (float)(n9 + n2), (float)(n10 + n3)).method12439(n4, n5, n6, n7).method12397();
            class7352.method12444(class4151, (float)(n11 + n), (float)(n12 + n2), (float)(n13 + n3)).method12439(n4, n5, n6, n7).method12397();
        });
    }
    
    public static void method5730(final Class4150 class4150, final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final float n7, final float n8, final float n9, final float n10) {
        method5733(new Class7351(), class4150, n, n2, n3, n4, n5, n6, n7, n8, n9, n10, n7, n8, n9);
    }
    
    public static void method5731(final Class7351 class7351, final Class4150 class7352, final AxisAlignedBB class7353, final float n, final float n2, final float n3, final float n4) {
        method5733(class7351, class7352, class7353.field25073, class7353.field25074, class7353.field25075, class7353.field25076, class7353.field25077, class7353.field25078, n, n2, n3, n4, n, n2, n3);
    }
    
    public static void method5732(final Class7351 class7351, final Class4150 class7352, final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final float n7, final float n8, final float n9, final float n10) {
        method5733(class7351, class7352, n, n2, n3, n4, n5, n6, n7, n8, n9, n10, n7, n8, n9);
    }
    
    public static void method5733(final Class7351 class7351, final Class4150 class7352, final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final float n7, final float n8, final float n9, final float n10, final float n11, final float n12, final float n13) {
        final Matrix4f method32111 = class7351.method22569().method32111();
        final float n14 = (float)n;
        final float n15 = (float)n2;
        final float n16 = (float)n3;
        final float n17 = (float)n4;
        final float n18 = (float)n5;
        final float n19 = (float)n6;
        class7352.method12444(method32111, n14, n15, n16).method12439(n7, n12, n13, n10).method12397();
        class7352.method12444(method32111, n17, n15, n16).method12439(n7, n12, n13, n10).method12397();
        class7352.method12444(method32111, n14, n15, n16).method12439(n11, n8, n13, n10).method12397();
        class7352.method12444(method32111, n14, n18, n16).method12439(n11, n8, n13, n10).method12397();
        class7352.method12444(method32111, n14, n15, n16).method12439(n11, n12, n9, n10).method12397();
        class7352.method12444(method32111, n14, n15, n19).method12439(n11, n12, n9, n10).method12397();
        class7352.method12444(method32111, n17, n15, n16).method12439(n7, n8, n9, n10).method12397();
        class7352.method12444(method32111, n17, n18, n16).method12439(n7, n8, n9, n10).method12397();
        class7352.method12444(method32111, n17, n18, n16).method12439(n7, n8, n9, n10).method12397();
        class7352.method12444(method32111, n14, n18, n16).method12439(n7, n8, n9, n10).method12397();
        class7352.method12444(method32111, n14, n18, n16).method12439(n7, n8, n9, n10).method12397();
        class7352.method12444(method32111, n14, n18, n19).method12439(n7, n8, n9, n10).method12397();
        class7352.method12444(method32111, n14, n18, n19).method12439(n7, n8, n9, n10).method12397();
        class7352.method12444(method32111, n14, n15, n19).method12439(n7, n8, n9, n10).method12397();
        class7352.method12444(method32111, n14, n15, n19).method12439(n7, n8, n9, n10).method12397();
        class7352.method12444(method32111, n17, n15, n19).method12439(n7, n8, n9, n10).method12397();
        class7352.method12444(method32111, n17, n15, n19).method12439(n7, n8, n9, n10).method12397();
        class7352.method12444(method32111, n17, n15, n16).method12439(n7, n8, n9, n10).method12397();
        class7352.method12444(method32111, n14, n18, n19).method12439(n7, n8, n9, n10).method12397();
        class7352.method12444(method32111, n17, n18, n19).method12439(n7, n8, n9, n10).method12397();
        class7352.method12444(method32111, n17, n15, n19).method12439(n7, n8, n9, n10).method12397();
        class7352.method12444(method32111, n17, n18, n19).method12439(n7, n8, n9, n10).method12397();
        class7352.method12444(method32111, n17, n18, n16).method12439(n7, n8, n9, n10).method12397();
        class7352.method12444(method32111, n17, n18, n19).method12439(n7, n8, n9, n10).method12397();
    }
    
    public static void method5734(final Class4148 class4148, final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final float n7, final float n8, final float n9, final float n10) {
        class4148.method12432(n, n2, n3).method12439(n7, n8, n9, n10).method12397();
        class4148.method12432(n, n2, n3).method12439(n7, n8, n9, n10).method12397();
        class4148.method12432(n, n2, n3).method12439(n7, n8, n9, n10).method12397();
        class4148.method12432(n, n2, n6).method12439(n7, n8, n9, n10).method12397();
        class4148.method12432(n, n5, n3).method12439(n7, n8, n9, n10).method12397();
        class4148.method12432(n, n5, n6).method12439(n7, n8, n9, n10).method12397();
        class4148.method12432(n, n5, n6).method12439(n7, n8, n9, n10).method12397();
        class4148.method12432(n, n2, n6).method12439(n7, n8, n9, n10).method12397();
        class4148.method12432(n4, n5, n6).method12439(n7, n8, n9, n10).method12397();
        class4148.method12432(n4, n2, n6).method12439(n7, n8, n9, n10).method12397();
        class4148.method12432(n4, n2, n6).method12439(n7, n8, n9, n10).method12397();
        class4148.method12432(n4, n2, n3).method12439(n7, n8, n9, n10).method12397();
        class4148.method12432(n4, n5, n6).method12439(n7, n8, n9, n10).method12397();
        class4148.method12432(n4, n5, n3).method12439(n7, n8, n9, n10).method12397();
        class4148.method12432(n4, n5, n3).method12439(n7, n8, n9, n10).method12397();
        class4148.method12432(n4, n2, n3).method12439(n7, n8, n9, n10).method12397();
        class4148.method12432(n, n5, n3).method12439(n7, n8, n9, n10).method12397();
        class4148.method12432(n, n2, n3).method12439(n7, n8, n9, n10).method12397();
        class4148.method12432(n, n2, n3).method12439(n7, n8, n9, n10).method12397();
        class4148.method12432(n4, n2, n3).method12439(n7, n8, n9, n10).method12397();
        class4148.method12432(n, n2, n6).method12439(n7, n8, n9, n10).method12397();
        class4148.method12432(n4, n2, n6).method12439(n7, n8, n9, n10).method12397();
        class4148.method12432(n4, n2, n6).method12439(n7, n8, n9, n10).method12397();
        class4148.method12432(n, n5, n3).method12439(n7, n8, n9, n10).method12397();
        class4148.method12432(n, n5, n3).method12439(n7, n8, n9, n10).method12397();
        class4148.method12432(n, n5, n6).method12439(n7, n8, n9, n10).method12397();
        class4148.method12432(n4, n5, n3).method12439(n7, n8, n9, n10).method12397();
        class4148.method12432(n4, n5, n6).method12439(n7, n8, n9, n10).method12397();
        class4148.method12432(n4, n5, n6).method12439(n7, n8, n9, n10).method12397();
        class4148.method12432(n4, n5, n6).method12439(n7, n8, n9, n10).method12397();
    }
    
    public void method5735(final Class1855 class1855, final BlockPos class1856, final Class7096 class1857, final Class7096 class1858, final int n) {
        this.method5736(class1856, false);
    }
    
    private void method5736(final BlockPos class354, final boolean b) {
        for (int i = class354.getZ() - 1; i <= class354.getZ() + 1; ++i) {
            for (int j = class354.getX() - 1; j <= class354.getX() + 1; ++j) {
                for (int k = class354.getY() - 1; k <= class354.getY() + 1; ++k) {
                    this.method5741(j >> 4, k >> 4, i >> 4, b);
                }
            }
        }
    }
    
    public void method5737(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        for (int i = n3 - 1; i <= n6 + 1; ++i) {
            for (int j = n - 1; j <= n4 + 1; ++j) {
                for (int k = n2 - 1; k <= n5 + 1; ++k) {
                    this.method5740(j >> 4, k >> 4, i >> 4);
                }
            }
        }
    }
    
    public void method5738(final BlockPos class354, final Class7096 class355, final Class7096 class356) {
        if (this.field9288.method5322().method6456(class355, class356)) {
            this.method5737(class354.getX(), class354.getY(), class354.getZ(), class354.getX(), class354.getY(), class354.getZ());
        }
    }
    
    public void method5739(final int n, final int n2, final int n3) {
        for (int i = n3 - 1; i <= n3 + 1; ++i) {
            for (int j = n - 1; j <= n + 1; ++j) {
                for (int k = n2 - 1; k <= n2 + 1; ++k) {
                    this.method5740(j, k, i);
                }
            }
        }
    }
    
    public void method5740(final int n, final int n2, final int n3) {
        this.method5741(n, n2, n3, false);
    }
    
    private void method5741(final int n, final int n2, final int n3, final boolean b) {
        this.field9296.method32962(n, n2, n3, b);
    }
    
    public void method5742(final Class7795 class7795, final BlockPos class7796) {
        final Class6834 class7797 = this.field9307.get(class7796);
        if (class7797 != null) {
            this.field9288.method5299().method6431(class7797);
            this.field9307.remove(class7796);
        }
        if (class7795 != null) {
            final Class3828 method11765 = Class3828.method11765(class7795);
            if (method11765 != null) {
                this.field9288.field4647.method3802(method11765.method11764().method8461());
            }
            final Class6836 method11766 = Class6836.method20936(class7795, (float)class7796.getX(), (float)class7796.getY(), (float)class7796.getZ());
            this.field9307.put(class7796, method11766);
            this.field9288.method5299().method6422(method11766);
        }
        this.method5743(this.field9292, class7796, class7795 != null);
    }
    
    private void method5743(final Class1847 class1847, final BlockPos class1848, final boolean b) {
        final Iterator<Entity> iterator = (Iterator<Entity>)class1847.method7128((Class<? extends Class511>)Class511.class, new AxisAlignedBB(class1848).method18496(3.0)).iterator();
        while (iterator.hasNext()) {
            iterator.next().method2778(class1848, b);
        }
    }
    
    public void method5744(final Class6909 class6909, final boolean b, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        this.method5745(class6909, b, false, n, n2, n3, n4, n5, n6);
    }
    
    public void method5745(final Class6909 class6909, final boolean b, final boolean b2, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        try {
            this.method5748(class6909, b, b2, n, n2, n3, n4, n5, n6);
        }
        catch (final Throwable t) {
            final Class7689 method24421 = Class7689.method24421(t, "Exception while adding particle");
            final Class5204 method24422 = method24421.method24418("Particle being added");
            method24422.method16297("ID", Class90.field222.method503((Class6907<? extends Class6909>)class6909.method21272()));
            method24422.method16297("Parameters", class6909.method21274());
            method24422.method16296("Position", () -> Class5204.method16293(n7, n8, n9));
            throw new Class2365(method24421);
        }
    }
    
    private <T extends Class6909> void method5746(final T t, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        this.method5744(t, t.method21272().method21270(), n, n2, n3, n4, n5, n6);
    }
    
    @Nullable
    private Class6173 method5747(final Class6909 class6909, final boolean b, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        return this.method5748(class6909, b, false, n, n2, n3, n4, n5, n6);
    }
    
    @Nullable
    private Class6173 method5748(final Class6909 class6909, final boolean b, final boolean b2, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        final Class6092 method5833 = this.field9288.field4644.method5833();
        if (this.field9288 == null || !method5833.method18167() || this.field9288.field4640 == null) {
            return null;
        }
        final Class2159 method5834 = this.method5749(b2);
        if (class6909 == Class8432.field34618 && !Class8571.method28876()) {
            return null;
        }
        if (class6909 == Class8432.field34619 && !Class8571.method28876()) {
            return null;
        }
        if (class6909 == Class8432.field34636 && !Class8571.method28876()) {
            return null;
        }
        if (class6909 == Class8432.field34645 && !Class8571.method28880()) {
            return null;
        }
        if (class6909 == Class8432.field34639 && !Class8571.method28878()) {
            return null;
        }
        if (class6909 == Class8432.field34632 && !Class8571.method28878()) {
            return null;
        }
        if (class6909 == Class8432.field34617 && !Class8571.method28883()) {
            return null;
        }
        if (class6909 == Class8432.field34597 && !Class8571.method28883()) {
            return null;
        }
        if (class6909 == Class8432.field34612 && !Class8571.method28883()) {
            return null;
        }
        if (class6909 == Class8432.field34628 && !Class8571.method28883()) {
            return null;
        }
        if (class6909 == Class8432.field34647 && !Class8571.method28883()) {
            return null;
        }
        if (class6909 == Class8432.field34637 && !Class8571.method28882()) {
            return null;
        }
        if (class6909 == Class8432.field34623 && !Class8571.method28877()) {
            return null;
        }
        if (class6909 == Class8432.field34611 && !Class8571.method28875()) {
            return null;
        }
        if (class6909 == Class8432.field34609 && !Class8571.method28931()) {
            return null;
        }
        if (class6909 == Class8432.field34606 && !Class8571.method28931()) {
            return null;
        }
        if (class6909 == Class8432.field34621 && !Class8571.method28884()) {
            return null;
        }
        if (!b) {
            double n7 = 1024.0;
            if (class6909 == Class8432.field34603) {
                n7 = 38416.0;
            }
            if (method5833.method18161().squareDistanceTo(n, n2, n3) > n7) {
                return null;
            }
            if (method5834 == Class2159.field12821) {
                return null;
            }
        }
        final Class6173 method5835 = this.field9288.field4640.method6478(class6909, n, n2, n3, n4, n5, n6);
        if (class6909 == Class8432.field34601) {
            Class8763.method30350(method5835, this.field9292, n, n2, n3, this.field9361);
        }
        if (class6909 == Class8432.field34646) {
            Class8763.method30350(method5835, this.field9292, n, n2, n3, this.field9361);
        }
        if (class6909 == Class8432.field34638) {
            Class8763.method30350(method5835, this.field9292, n, n2, n3, this.field9361);
        }
        if (class6909 == Class8432.field34634) {
            Class8763.method30343(method5835);
        }
        if (class6909 == Class8432.field34637) {
            Class8763.method30342(method5835);
        }
        if (class6909 == Class8432.field34611) {
            Class8763.method30345(method5835, this.field9292, n, n2, n3);
        }
        return method5835;
    }
    
    private Class2159 method5749(final boolean b) {
        Class2159 class2159 = this.field9288.field4648.field23474;
        if (b && class2159 == Class2159.field12821 && this.field9292.field10062.nextInt(10) == 0) {
            class2159 = Class2159.field12820;
        }
        if (class2159 == Class2159.field12820 && this.field9292.field10062.nextInt(3) == 0) {
            class2159 = Class2159.field12821;
        }
        return class2159;
    }
    
    public void method5750() {
    }
    
    public void method5751(final int n, final BlockPos class354, final int n2) {
        switch (n) {
            case 1023:
            case 1028:
            case 1038: {
                final Class6092 method5833 = this.field9288.field4644.method5833();
                if (!method5833.method18167()) {
                    break;
                }
                final double n3 = class354.getX() - method5833.method18161().x;
                final double n4 = class354.getY() - method5833.method18161().y;
                final double n5 = class354.getZ() - method5833.method18161().z;
                final double sqrt = Math.sqrt(n3 * n3 + n4 * n4 + n5 * n5);
                double field22770 = method5833.method18161().x;
                double field22771 = method5833.method18161().y;
                double field22772 = method5833.method18161().z;
                if (sqrt > 0.0) {
                    field22770 += n3 / sqrt * 2.0;
                    field22771 += n4 / sqrt * 2.0;
                    field22772 += n5 / sqrt * 2.0;
                }
                if (n == 1023) {
                    this.field9292.method6708(field22770, field22771, field22772, Class8520.field35728, Class286.field1583, 1.0f, 1.0f, false);
                    break;
                }
                if (n == 1038) {
                    this.field9292.method6708(field22770, field22771, field22772, Class8520.field35175, Class286.field1583, 1.0f, 1.0f, false);
                    break;
                }
                this.field9292.method6708(field22770, field22771, field22772, Class8520.field35154, Class286.field1583, 5.0f, 1.0f, false);
                break;
            }
        }
    }
    
    public void method5752(final Class512 class512, final int n, final BlockPos class513, final int n2) {
        final Random field10062 = this.field9292.field10062;
        switch (n) {
            case 1000: {
                this.field9292.method6831(class513, Class8520.field35113, Class286.field1582, 1.0f, 1.0f, false);
                break;
            }
            case 1001: {
                this.field9292.method6831(class513, Class8520.field35114, Class286.field1582, 1.0f, 1.2f, false);
                break;
            }
            case 1002: {
                this.field9292.method6831(class513, Class8520.field35115, Class286.field1582, 1.0f, 1.2f, false);
                break;
            }
            case 1003: {
                this.field9292.method6831(class513, Class8520.field35161, Class286.field1584, 1.0f, 1.2f, false);
                break;
            }
            case 1004: {
                this.field9292.method6831(class513, Class8520.field35195, Class286.field1584, 1.0f, 1.2f, false);
                break;
            }
            case 1005: {
                this.field9292.method6831(class513, Class8520.field35312, Class286.field1582, 1.0f, this.field9292.field10062.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1006: {
                this.field9292.method6831(class513, Class8520.field35739, Class286.field1582, 1.0f, this.field9292.field10062.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1007: {
                this.field9292.method6831(class513, Class8520.field35741, Class286.field1582, 1.0f, this.field9292.field10062.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1008: {
                this.field9292.method6831(class513, Class8520.field35188, Class286.field1582, 1.0f, this.field9292.field10062.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1009: {
                this.field9292.method6831(class513, Class8520.field35199, Class286.field1582, 0.5f, 2.6f + (field10062.nextFloat() - field10062.nextFloat()) * 0.8f, false);
                break;
            }
            case 1010: {
                if (Class3820.method11697(n2) instanceof Class3828) {
                    this.method5742(((Class3828)Class3820.method11697(n2)).method11766(), class513);
                    break;
                }
                this.method5742(null, class513);
                break;
            }
            case 1011: {
                this.field9292.method6831(class513, Class8520.field35311, Class286.field1582, 1.0f, this.field9292.field10062.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1012: {
                this.field9292.method6831(class513, Class8520.field35738, Class286.field1582, 1.0f, this.field9292.field10062.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1013: {
                this.field9292.method6831(class513, Class8520.field35740, Class286.field1582, 1.0f, this.field9292.field10062.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1014: {
                this.field9292.method6831(class513, Class8520.field35187, Class286.field1582, 1.0f, this.field9292.field10062.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1015: {
                this.field9292.method6831(class513, Class8520.field35229, Class286.field1583, 10.0f, (field10062.nextFloat() - field10062.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1016: {
                this.field9292.method6831(class513, Class8520.field35228, Class286.field1583, 10.0f, (field10062.nextFloat() - field10062.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1017: {
                this.field9292.method6831(class513, Class8520.field35159, Class286.field1583, 10.0f, (field10062.nextFloat() - field10062.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1018: {
                this.field9292.method6831(class513, Class8520.field35031, Class286.field1583, 2.0f, (field10062.nextFloat() - field10062.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1019: {
                this.field9292.method6831(class513, Class8520.field35752, Class286.field1583, 2.0f, (field10062.nextFloat() - field10062.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1020: {
                this.field9292.method6831(class513, Class8520.field35753, Class286.field1583, 2.0f, (field10062.nextFloat() - field10062.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1021: {
                this.field9292.method6831(class513, Class8520.field35754, Class286.field1583, 2.0f, (field10062.nextFloat() - field10062.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1022: {
                this.field9292.method6831(class513, Class8520.field35720, Class286.field1583, 2.0f, (field10062.nextFloat() - field10062.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1024: {
                this.field9292.method6831(class513, Class8520.field35723, Class286.field1583, 2.0f, (field10062.nextFloat() - field10062.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1025: {
                this.field9292.method6831(class513, Class8520.field35009, Class286.field1584, 0.05f, (field10062.nextFloat() - field10062.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1026: {
                this.field9292.method6831(class513, Class8520.field35762, Class286.field1583, 2.0f, (field10062.nextFloat() - field10062.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1027: {
                this.field9292.method6831(class513, Class8520.field35769, Class286.field1584, 2.0f, (field10062.nextFloat() - field10062.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1029: {
                this.field9292.method6831(class513, Class8520.field34972, Class286.field1582, 1.0f, this.field9292.field10062.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1030: {
                this.field9292.method6831(class513, Class8520.field34978, Class286.field1582, 1.0f, this.field9292.field10062.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1031: {
                this.field9292.method6831(class513, Class8520.field34975, Class286.field1582, 0.3f, this.field9292.field10062.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1032: {
                this.field9288.method5299().method6422(Class6836.method20933(Class8520.field35497, field10062.nextFloat() * 0.4f + 0.8f));
                break;
            }
            case 1033: {
                this.field9292.method6831(class513, Class8520.field35074, Class286.field1582, 1.0f, 1.0f, false);
                break;
            }
            case 1034: {
                this.field9292.method6831(class513, Class8520.field35073, Class286.field1582, 1.0f, 1.0f, false);
                break;
            }
            case 1035: {
                this.field9292.method6831(class513, Class8520.field35043, Class286.field1582, 1.0f, 1.0f, false);
                break;
            }
            case 1036: {
                this.field9292.method6831(class513, Class8520.field35319, Class286.field1582, 1.0f, this.field9292.field10062.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1037: {
                this.field9292.method6831(class513, Class8520.field35320, Class286.field1582, 1.0f, this.field9292.field10062.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1039: {
                this.field9292.method6831(class513, Class8520.field35455, Class286.field1583, 0.3f, this.field9292.field10062.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1040: {
                this.field9292.method6831(class513, Class8520.field35755, Class286.field1584, 2.0f, (field10062.nextFloat() - field10062.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1041: {
                this.field9292.method6831(class513, Class8520.field35292, Class286.field1584, 2.0f, (field10062.nextFloat() - field10062.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1042: {
                this.field9292.method6831(class513, Class8520.field35255, Class286.field1582, 1.0f, this.field9292.field10062.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1043: {
                this.field9292.method6831(class513, Class8520.field35034, Class286.field1582, 1.0f, this.field9292.field10062.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1500: {
                Class3965.method12096(this.field9292, class513, n2 > 0);
                break;
            }
            case 1501: {
                this.field9292.method6831(class513, Class8520.field35339, Class286.field1582, 0.5f, 2.6f + (this.field9292.method6790().nextFloat() - this.field9292.method6790().nextFloat()) * 0.8f, false);
                for (int i = 0; i < 8; ++i) {
                    this.field9292.method6709(Class8432.field34632, class513.getX() + Math.random(), class513.getY() + 1.2, class513.getZ() + Math.random(), 0.0, 0.0, 0.0);
                }
                break;
            }
            case 1502: {
                this.field9292.method6831(class513, Class8520.field35525, Class286.field1582, 0.5f, 2.6f + (this.field9292.field10062.nextFloat() - this.field9292.field10062.nextFloat()) * 0.8f, false);
                for (int j = 0; j < 5; ++j) {
                    this.field9292.method6709(Class8432.field34639, class513.getX() + field10062.nextDouble() * 0.6 + 0.2, class513.getY() + field10062.nextDouble() * 0.6 + 0.2, class513.getZ() + field10062.nextDouble() * 0.6 + 0.2, 0.0, 0.0, 0.0);
                }
                break;
            }
            case 1503: {
                this.field9292.method6831(class513, Class8520.field35174, Class286.field1582, 1.0f, 1.0f, false);
                for (int k = 0; k < 16; ++k) {
                    this.field9292.method6709(Class8432.field34639, class513.getX() + (5.0f + field10062.nextFloat() * 6.0f) / 16.0f, class513.getY() + 0.8125f, class513.getZ() + (5.0f + field10062.nextFloat() * 6.0f) / 16.0f, 0.0, 0.0, 0.0);
                }
                break;
            }
            case 2000: {
                final Direction method792 = Direction.byIndex(n2);
                final int method793 = method792.getXOffset();
                final int method794 = method792.getYOffset();
                final int method795 = method792.getZOffset();
                final double n3 = class513.getX() + method793 * 0.6 + 0.5;
                final double n4 = class513.getY() + method794 * 0.6 + 0.5;
                final double n5 = class513.getZ() + method795 * 0.6 + 0.5;
                for (int l = 0; l < 10; ++l) {
                    final double n6 = field10062.nextDouble() * 0.2 + 0.01;
                    this.method5746(Class8432.field34639, n3 + method793 * 0.01 + (field10062.nextDouble() - 0.5) * method795 * 0.5, n4 + method794 * 0.01 + (field10062.nextDouble() - 0.5) * method794 * 0.5, n5 + method795 * 0.01 + (field10062.nextDouble() - 0.5) * method793 * 0.5, method793 * n6 + field10062.nextGaussian() * 0.01, method794 * n6 + field10062.nextGaussian() * 0.01, method795 * n6 + field10062.nextGaussian() * 0.01);
                }
                break;
            }
            case 2001: {
                final Class7096 method796 = Class3833.method11775(n2);
                if (!Class7667.method24309(method796, this.field9292, class513)) {
                    Class7696 method797 = method796.method21759();
                    if (Class9570.field41244.method22605()) {
                        method797 = (Class7696)Class9570.method35826(method796, Class9570.field41244, this.field9292, class513, null);
                    }
                    this.field9292.method6831(class513, method797.method24479(), Class286.field1582, (method797.method24477() + 1.0f) / 2.0f, method797.method24478() * 0.8f, false);
                }
                this.field9288.field4640.method6486(class513, method796);
                break;
            }
            case 2002:
            case 2007: {
                final double n7 = class513.getX();
                final double n8 = class513.getY();
                final double n9 = class513.getZ();
                for (int n10 = 0; n10 < 8; ++n10) {
                    this.method5746(new Class6910(Class8432.field34629, new Class8321(Class7739.field31579)), n7, n8, n9, field10062.nextGaussian() * 0.15, field10062.nextDouble() * 0.2, field10062.nextGaussian() * 0.15);
                }
                final float n11 = (n2 >> 16 & 0xFF) / 255.0f;
                final float n12 = (n2 >> 8 & 0xFF) / 255.0f;
                final float n13 = (n2 >> 0 & 0xFF) / 255.0f;
                final Class6908 class514 = (n == 2007) ? Class8432.field34628 : Class8432.field34612;
                for (int n14 = 0; n14 < 100; ++n14) {
                    final double n15 = field10062.nextDouble() * 4.0;
                    final double n16 = field10062.nextDouble() * 3.141592653589793 * 2.0;
                    final double n17 = Math.cos(n16) * n15;
                    final double n18 = 0.01 + field10062.nextDouble() * 0.5;
                    final double n19 = Math.sin(n16) * n15;
                    final Class6173 method798 = this.method5747(class514, class514.method21272().method21270(), n7 + n17 * 0.1, n8 + 0.3, n9 + n19 * 0.1, n17, n18, n19);
                    if (method798 != null) {
                        final float n20 = 0.75f + field10062.nextFloat() * 0.25f;
                        method798.method18435(n11 * n20, n12 * n20, n13 * n20);
                        method798.method18434((float)n15);
                    }
                }
                this.field9292.method6831(class513, Class8520.field35609, Class286.field1584, 1.0f, this.field9292.field10062.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 2003: {
                final double n21 = class513.getX() + 0.5;
                final double n22 = class513.getY();
                final double n23 = class513.getZ() + 0.5;
                for (int n24 = 0; n24 < 8; ++n24) {
                    this.method5746(new Class6910(Class8432.field34629, new Class8321(Class7739.field31449)), n21, n22, n23, field10062.nextGaussian() * 0.15, field10062.nextDouble() * 0.2, field10062.nextGaussian() * 0.15);
                }
                for (double n25 = 0.0; n25 < 6.283185307179586; n25 += 0.15707963267948966) {
                    this.method5746(Class8432.field34637, n21 + Math.cos(n25) * 5.0, n22 - 0.4, n23 + Math.sin(n25) * 5.0, Math.cos(n25) * -5.0, 0.0, Math.sin(n25) * -5.0);
                    this.method5746(Class8432.field34637, n21 + Math.cos(n25) * 5.0, n22 - 0.4, n23 + Math.sin(n25) * 5.0, Math.cos(n25) * -7.0, 0.0, Math.sin(n25) * -7.0);
                }
                break;
            }
            case 2004: {
                for (int n26 = 0; n26 < 20; ++n26) {
                    final double n27 = class513.getX() + 0.5 + (this.field9292.field10062.nextFloat() - 0.5) * 2.0;
                    final double n28 = class513.getY() + 0.5 + (this.field9292.field10062.nextFloat() - 0.5) * 2.0;
                    final double n29 = class513.getZ() + 0.5 + (this.field9292.field10062.nextFloat() - 0.5) * 2.0;
                    this.field9292.method6709(Class8432.field34639, n27, n28, n29, 0.0, 0.0, 0.0);
                    this.field9292.method6709(Class8432.field34623, n27, n28, n29, 0.0, 0.0, 0.0);
                }
                break;
            }
            case 2005: {
                Class4088.method12324(this.field9292, class513, n2);
                break;
            }
            case 2006: {
                for (int n30 = 0; n30 < 200; ++n30) {
                    final float n31 = field10062.nextFloat() * 4.0f;
                    final float n32 = field10062.nextFloat() * 6.2831855f;
                    final double n33 = MathHelper.cos(n32) * n31;
                    final double n34 = 0.01 + field10062.nextDouble() * 0.5;
                    final double n35 = MathHelper.sin(n32) * n31;
                    final Class6173 method799 = this.method5747(Class8432.field34605, false, class513.getX() + n33 * 0.1, class513.getY() + 0.3, class513.getZ() + n35 * 0.1, n33, n34, n35);
                    if (method799 != null) {
                        method799.method18434(n31);
                    }
                }
                this.field9292.method6831(class513, Class8520.field35155, Class286.field1583, 1.0f, this.field9292.field10062.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 2008: {
                this.field9292.method6709(Class8432.field34619, class513.getX() + 0.5, class513.getY() + 0.5, class513.getZ() + 0.5, 0.0, 0.0, 0.0);
                break;
            }
            case 2009: {
                for (int n36 = 0; n36 < 8; ++n36) {
                    this.field9292.method6709(Class8432.field34602, class513.getX() + Math.random(), class513.getY() + 1.2, class513.getZ() + Math.random(), 0.0, 0.0, 0.0);
                }
                break;
            }
            case 3000: {
                this.field9292.method6710(Class8432.field34618, true, class513.getX() + 0.5, class513.getY() + 0.5, class513.getZ() + 0.5, 0.0, 0.0, 0.0);
                this.field9292.method6831(class513, Class8520.field35173, Class286.field1582, 10.0f, (1.0f + (this.field9292.field10062.nextFloat() - this.field9292.field10062.nextFloat()) * 0.2f) * 0.7f, false);
                break;
            }
            case 3001: {
                this.field9292.method6831(class513, Class8520.field35157, Class286.field1583, 64.0f, 0.8f + this.field9292.field10062.nextFloat() * 0.3f, false);
                break;
            }
        }
    }
    
    public void method5753(final int n, final BlockPos class354, final int n2) {
        if (n2 >= 0 && n2 < 10) {
            Class349 class355 = (Class349)this.field9305.get(n);
            if (class355 != null) {
                this.method5719(class355);
            }
            if (class355 == null || class355.method1046().getX() != class354.getX() || class355.method1046().getY() != class354.getY() || class355.method1046().getZ() != class354.getZ()) {
                class355 = new Class349(n, class354);
                this.field9305.put(n, (Object)class355);
            }
            class355.method1047(n2);
            class355.method1049(this.field9304);
            ((SortedSet)this.field9306.computeIfAbsent(class355.method1046().method1132(), p0 -> Sets.newTreeSet())).add(class355);
        }
        else {
            final Class349 class356 = (Class349)this.field9305.remove(n);
            if (class356 != null) {
                this.method5719(class356);
            }
        }
    }
    
    public boolean method5754() {
        return this.field9293.isEmpty() && this.field9326.method23464();
    }
    
    public void method5755() {
        this.field9338 = true;
        this.field9301 = true;
    }
    
    public int method5756() {
        return this.field9296.field38610.length;
    }
    
    public int method5757() {
        return this.field9294.size();
    }
    
    public int method5758() {
        return this.field9329;
    }
    
    public int method5759() {
        return this.field9359;
    }
    
    public int method5760() {
        if (this.field9292 == null) {
            return 0;
        }
        final Class1907 method6835 = this.field9292.method6835();
        return (method6835 == null) ? 0 : method6835.method7419();
    }
    
    public int method5761() {
        return this.field9293.size();
    }
    
    public Class8974 method5762(final BlockPos class354) {
        return this.field9296.method32963(class354);
    }
    
    public Class1848 method5763() {
        return this.field9292;
    }
    
    private void method5764() {
        if (Class1656.field9365 > 0) {
            this.field9294 = (ObjectList<Class9071>)new ObjectArrayList(this.field9294.size() + 16);
            this.field9348 = new ArrayList<Class9071>(this.field9348.size() + 16);
            this.field9349 = new ArrayList<Class9071>(this.field9349.size() + 16);
        }
        else {
            this.field9294.clear();
            this.field9348.clear();
            this.field9349.clear();
        }
    }
    
    public void method5765() {
        if (this.field9364) {
            this.method5701();
            this.field9364 = false;
        }
    }
    
    public void method5766() {
        if (this.field9326 != null) {
            this.field9326.method23466();
        }
    }
    
    public void method5767() {
        if (this.field9326 != null) {
            this.field9326.method23467();
        }
    }
    
    public int method5768() {
        return this.field9339;
    }
    
    public int method5769() {
        return ++this.field9339;
    }
    
    public Class3442 method5770() {
        return this.field9291;
    }
    
    public List<Class9071> method5771() {
        return this.field9349;
    }
    
    private void method5772(final Class6092 class6092, final Class6664 class6093, final boolean b) {
        if (this.field9366 == 0) {
            this.method5773(class6092, class6093, b);
            this.field9288.field4647.method3807().method3771(201435902);
        }
        if (this.field9366 > -1) {
            --this.field9366;
        }
    }
    
    private void method5773(final Class6092 class6092, final Class6664 class6093, final boolean b) {
        final int field23504 = this.field9288.field4648.field23504;
        final boolean field23505 = this.field9288.field4648.field23483;
        try {
            this.field9288.field4648.field23504 = 1000;
            this.field9288.field4648.field23483 = false;
            final Class1656 method28908 = Class8571.method28908();
            int n = method28908.method5760();
            System.currentTimeMillis();
            Class8571.method28847("Loading visible chunks");
            long n2 = System.currentTimeMillis() + 5000L;
            int n3 = 0;
            int i;
            do {
                i = 0;
                for (int j = 0; j < 100; ++j) {
                    method28908.method5755();
                    method28908.method5707(class6092, class6093, false, this.field9339++, b);
                    if (!method28908.method5754()) {
                        i = 1;
                    }
                    final int n4 = n3 + method28908.method5761();
                    while (!method28908.method5754()) {
                        method28908.method5724(System.nanoTime() + 1000000000L);
                    }
                    n3 = n4 - method28908.method5761();
                    if (i == 0) {
                        break;
                    }
                }
                if (method28908.method5760() != n) {
                    i = 1;
                    n = method28908.method5760();
                }
                if (System.currentTimeMillis() > n2) {
                    Class8571.method28852("Chunks loaded: " + n3);
                    n2 = System.currentTimeMillis() + 5000L;
                }
            } while (i != 0);
            Class8571.method28852("Chunks loaded: " + n3);
            Class8571.method28852("Finished loading visible chunks");
            Class7520.field29146 = 0;
        }
        finally {
            this.field9288.field4648.field23504 = field23504;
            this.field9288.field4648.field23483 = field23505;
        }
    }
    
    public Class2014 method5774() {
        return Class2013.field11448;
    }
    
    public void method5775(final Collection<Class436> collection, final Collection<Class436> collection2) {
        synchronized (this.field9295) {
            this.field9295.removeAll(collection);
            this.field9295.addAll(collection2);
        }
    }
    
    public static int method5776(final Class1856 class1856, final BlockPos class1857) {
        return method5777(class1856, class1856.method6701(class1857), class1857);
    }
    
    public static int method5777(final Class1856 class1856, final Class7096 class1857, final BlockPos class1858) {
        if (class1857.method21711()) {
            return 15728880;
        }
        final int method6992 = class1856.method6992(Class237.field911, class1858);
        int method6993 = class1856.method6992(Class237.field912, class1858);
        final int method6994 = class1857.method21705(class1856, class1858);
        if (method6993 < method6994) {
            method6993 = method6994;
        }
        int method6995 = method6992 << 20 | method6993 << 4;
        if (Class8571.method29002() && class1856 instanceof Class1855 && (!Class1656.field9368 || !class1857.method21722(class1856, class1858))) {
            method6995 = Class8850.method30990(class1858, method6995);
        }
        return method6995;
    }
    
    public Class6153 method5778() {
        return this.field9308;
    }
    
    static {
        field9279 = LogManager.getLogger();
        field9280 = new Class1932("textures/environment/moon_phases.png");
        field9281 = new Class1932("textures/environment/sun.png");
        field9282 = new Class1932("textures/environment/clouds.png");
        field9283 = new Class1932("textures/environment/end_sky.png");
        field9284 = new Class1932("textures/misc/forcefield.png");
        field9285 = new Class1932("textures/environment/rain.png");
        field9286 = new Class1932("textures/environment/snow.png");
        field9287 = Direction.values();
        field9358 = Collections.unmodifiableSet((Set<?>)new HashSet<Object>(Arrays.asList(Direction.VALUES)));
        Class1656.field9365 = 0;
        Class1656.field9368 = false;
    }
}
