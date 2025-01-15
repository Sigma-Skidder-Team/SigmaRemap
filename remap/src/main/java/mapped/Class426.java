// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import org.apache.logging.log4j.LogManager;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.StringReader;
import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
import com.google.common.collect.Maps;
import com.google.common.collect.Lists;
import java.util.UUID;
import java.util.Map;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class Class426 extends Class399
{
    private static final Logger field2596;
    private static final Class8810<Float> field2597;
    private static final Class8810<Integer> field2598;
    private static final Class8810<Boolean> field2599;
    private static final Class8810<Class6909> field2600;
    private Class8061 field2601;
    private final List<Class1948> field2602;
    private final Map<Class399, Integer> field2603;
    private int field2604;
    private int field2605;
    private int field2606;
    private boolean field2607;
    private int field2608;
    private float field2609;
    private float field2610;
    private Class511 field2611;
    private UUID field2612;
    
    public Class426(final Class7499<? extends Class426> class7499, final Class1847 class7500) {
        super(class7499, class7500);
        this.field2601 = Class8644.field36250;
        this.field2602 = Lists.newArrayList();
        this.field2603 = Maps.newHashMap();
        this.field2604 = 600;
        this.field2605 = 20;
        this.field2606 = 20;
        this.field2421 = true;
        this.method2081(3.0f);
    }
    
    public Class426(final Class1847 class1847, final double n, final double n2, final double n3) {
        this(Class7499.field28957, class1847);
        this.method1656(n, n2, n3);
    }
    
    @Override
    public void method1649() {
        this.method1650().method33565(Class426.field2598, 0);
        this.method1650().method33565(Class426.field2597, 0.5f);
        this.method1650().method33565(Class426.field2599, false);
        this.method1650().method33565(Class426.field2600, Class8432.field34617);
    }
    
    public void method2081(final float f) {
        if (!this.field2391.field10067) {
            this.method1650().method33569(Class426.field2597, f);
        }
    }
    
    @Override
    public void method1881() {
        final double method1938 = this.method1938();
        final double method1939 = this.method1941();
        final double method1940 = this.method1945();
        super.method1881();
        this.method1656(method1938, method1939, method1940);
    }
    
    public float method2082() {
        return this.method1650().method33568(Class426.field2597);
    }
    
    public void method2083(final Class8061 field2601) {
        this.field2601 = field2601;
        if (!this.field2607) {
            this.method2084();
        }
    }
    
    private void method2084() {
        if (this.field2601 == Class8644.field36250 && this.field2602.isEmpty()) {
            this.method1650().method33569(Class426.field2598, 0);
        }
        else {
            this.method1650().method33569(Class426.field2598, Class5333.method16473(Class5333.method16466(this.field2601, this.field2602)));
        }
    }
    
    public void method2085(final Class1948 class1948) {
        this.field2602.add(class1948);
        if (!this.field2607) {
            this.method2084();
        }
    }
    
    public int method2086() {
        return this.method1650().method33568(Class426.field2598);
    }
    
    public void method2087(final int i) {
        this.field2607 = true;
        this.method1650().method33569(Class426.field2598, i);
    }
    
    public Class6909 method2088() {
        return this.method1650().method33568(Class426.field2600);
    }
    
    public void method2089(final Class6909 class6909) {
        this.method1650().method33569(Class426.field2600, class6909);
    }
    
    public void method2090(final boolean b) {
        this.method1650().method33569(Class426.field2599, b);
    }
    
    public boolean method2091() {
        return this.method1650().method33568(Class426.field2599);
    }
    
    public int method2092() {
        return this.field2604;
    }
    
    public void method2093(final int field2604) {
        this.field2604 = field2604;
    }
    
    @Override
    public void method1659() {
        super.method1659();
        final boolean method2091 = this.method2091();
        float method2092 = this.method2082();
        if (!this.field2391.field10067) {
            if (this.field2424 >= this.field2605 + this.field2604) {
                this.method1652();
                return;
            }
            final boolean b = this.field2424 < this.field2605;
            if (method2091 != b) {
                this.method2090(b);
            }
            if (b) {
                return;
            }
            if (this.field2610 != 0.0f) {
                method2092 += this.field2610;
                if (method2092 < 0.5f) {
                    this.method1652();
                    return;
                }
                this.method2081(method2092);
            }
            if (this.field2424 % 5 == 0) {
                final Iterator<Map.Entry<Class399, Integer>> iterator = this.field2603.entrySet().iterator();
                while (iterator.hasNext()) {
                    if (this.field2424 < ((Map.Entry<K, Integer>)iterator.next()).getValue()) {
                        continue;
                    }
                    iterator.remove();
                }
                final ArrayList arrayList = Lists.newArrayList();
                for (final Class1948 class1948 : this.field2601.method26449()) {
                    arrayList.add(new Class1948(class1948.method7906(), class1948.method7907() / 4, class1948.method7908(), class1948.method7909(), class1948.method7910()));
                }
                arrayList.addAll(this.field2602);
                if (!arrayList.isEmpty()) {
                    final List<Class399> method2093 = this.field2391.method7128((Class<? extends Class399>)Class511.class, this.method1886());
                    if (!method2093.isEmpty()) {
                        for (final Class511 class1949 : method2093) {
                            if (this.field2603.containsKey(class1949)) {
                                continue;
                            }
                            if (!class1949.method2776()) {
                                continue;
                            }
                            final double n = class1949.method1938() - this.method1938();
                            final double n2 = class1949.method1945() - this.method1945();
                            if (n * n + n2 * n2 > method2092 * method2092) {
                                continue;
                            }
                            this.field2603.put(class1949, this.field2424 + this.field2606);
                            for (final Class1948 class1950 : arrayList) {
                                if (!class1950.method7906().method16453()) {
                                    class1949.method2655(new Class1948(class1950));
                                }
                                else {
                                    class1950.method7906().method16452(this, this.method2098(), class1949, class1950.method7908(), 0.5);
                                }
                            }
                            if (this.field2609 != 0.0f) {
                                method2092 += this.field2609;
                                if (method2092 < 0.5f) {
                                    this.method1652();
                                    return;
                                }
                                this.method2081(method2092);
                            }
                            if (this.field2608 == 0) {
                                continue;
                            }
                            this.field2604 += this.field2608;
                            if (this.field2604 > 0) {
                                continue;
                            }
                            this.method1652();
                        }
                    }
                }
                else {
                    this.field2603.clear();
                }
            }
        }
        else {
            final Class6909 method2094 = this.method2088();
            if (!method2091) {
                final float n3 = 3.1415927f * method2092 * method2092;
                for (int n4 = 0; n4 < n3; ++n4) {
                    final float n5 = this.field2423.nextFloat() * 6.2831855f;
                    final float n6 = Class9546.method35640(this.field2423.nextFloat()) * method2092;
                    final float n7 = Class9546.method35639(n5) * n6;
                    final float n8 = Class9546.method35638(n5) * n6;
                    if (method2094.method21272() != Class8432.field34617) {
                        this.field2391.method6711(method2094, this.method1938() + n7, this.method1941(), this.method1945() + n8, (0.5 - this.field2423.nextDouble()) * 0.15, 0.009999999776482582, (0.5 - this.field2423.nextDouble()) * 0.15);
                    }
                    else {
                        final int method2095 = this.method2086();
                        this.field2391.method6711(method2094, this.method1938() + n7, this.method1941(), this.method1945() + n8, (method2095 >> 16 & 0xFF) / 255.0f, (method2095 >> 8 & 0xFF) / 255.0f, (method2095 & 0xFF) / 255.0f);
                    }
                }
            }
            else if (this.field2423.nextBoolean()) {
                for (int i = 0; i < 2; ++i) {
                    final float n9 = this.field2423.nextFloat() * 6.2831855f;
                    final float n10 = Class9546.method35640(this.field2423.nextFloat()) * 0.2f;
                    final float n11 = Class9546.method35639(n9) * n10;
                    final float n12 = Class9546.method35638(n9) * n10;
                    if (method2094.method21272() != Class8432.field34617) {
                        this.field2391.method6711(method2094, this.method1938() + n11, this.method1941(), this.method1945() + n12, 0.0, 0.0, 0.0);
                    }
                    else {
                        final int n13 = this.field2423.nextBoolean() ? 16777215 : this.method2086();
                        this.field2391.method6711(method2094, this.method1938() + n11, this.method1941(), this.method1945() + n12, (n13 >> 16 & 0xFF) / 255.0f, (n13 >> 8 & 0xFF) / 255.0f, (n13 & 0xFF) / 255.0f);
                    }
                }
            }
        }
    }
    
    public void method2094(final float field2609) {
        this.field2609 = field2609;
    }
    
    public void method2095(final float field2610) {
        this.field2610 = field2610;
    }
    
    public void method2096(final int field2605) {
        this.field2605 = field2605;
    }
    
    public void method2097(final Class511 field2611) {
        this.field2611 = field2611;
        this.field2612 = ((field2611 != null) ? field2611.method1865() : null);
    }
    
    @Nullable
    public Class511 method2098() {
        if (this.field2611 == null) {
            if (this.field2612 != null) {
                if (this.field2391 instanceof Class1849) {
                    final Class399 method6914 = ((Class1849)this.field2391).method6914(this.field2612);
                    if (method6914 instanceof Class511) {
                        this.field2611 = (Class511)method6914;
                    }
                }
            }
        }
        return this.field2611;
    }
    
    @Override
    public void method1760(final Class51 class51) {
        this.field2424 = class51.method319("Age");
        this.field2604 = class51.method319("Duration");
        this.field2605 = class51.method319("WaitTime");
        this.field2606 = class51.method319("ReapplicationDelay");
        this.field2608 = class51.method319("DurationOnUse");
        this.field2609 = class51.method321("RadiusOnUse");
        this.field2610 = class51.method321("RadiusPerTick");
        this.method2081(class51.method321("Radius"));
        this.field2612 = class51.method301("OwnerUUID");
        if (class51.method316("Particle", 8)) {
            try {
                this.method2089(Class7384.method22674(new StringReader(class51.method323("Particle"))));
            }
            catch (final CommandSyntaxException ex) {
                Class426.field2596.warn("Couldn't load custom particle {}", (Object)class51.method323("Particle"), (Object)ex);
            }
        }
        if (class51.method316("Color", 99)) {
            this.method2087(class51.method319("Color"));
        }
        if (class51.method316("Potion", 8)) {
            this.method2083(Class5333.method16475(class51));
        }
        if (class51.method316("Effects", 9)) {
            final Class52 method328 = class51.method328("Effects", 10);
            this.field2602.clear();
            for (int i = 0; i < method328.size(); ++i) {
                final Class1948 method329 = Class1948.method7918(method328.method346(i));
                if (method329 != null) {
                    this.method2085(method329);
                }
            }
        }
    }
    
    @Override
    public void method1761(final Class51 class51) {
        class51.method298("Age", this.field2424);
        class51.method298("Duration", this.field2604);
        class51.method298("WaitTime", this.field2605);
        class51.method298("ReapplicationDelay", this.field2606);
        class51.method298("DurationOnUse", this.field2608);
        class51.method304("RadiusOnUse", this.field2609);
        class51.method304("RadiusPerTick", this.field2610);
        class51.method304("Radius", this.method2082());
        class51.method306("Particle", this.method2088().method21274());
        if (this.field2612 != null) {
            class51.method300("OwnerUUID", this.field2612);
        }
        if (this.field2607) {
            class51.method298("Color", this.method2086());
        }
        if (this.field2601 != Class8644.field36250) {
            if (this.field2601 != null) {
                class51.method306("Potion", Class90.field212.method503(this.field2601).toString());
            }
        }
        if (!this.field2602.isEmpty()) {
            final Class52 class52 = new Class52();
            final Iterator<Class1948> iterator = this.field2602.iterator();
            while (iterator.hasNext()) {
                ((AbstractList<Class51>)class52).add(iterator.next().method7916(new Class51()));
            }
            class51.method295("Effects", class52);
        }
    }
    
    @Override
    public void method1880(final Class8810<?> class8810) {
        if (Class426.field2597.equals(class8810)) {
            this.method1881();
        }
        super.method1880(class8810);
    }
    
    @Override
    public Class2117 method1921() {
        return Class2117.field12343;
    }
    
    @Override
    public Class4252<?> method1932() {
        return new Class4339(this);
    }
    
    @Override
    public Class8295 method1933(final Class290 class290) {
        return Class8295.method27563(this.method2082() * 2.0f, 0.5f);
    }
    
    static {
        field2596 = LogManager.getLogger();
        field2597 = Class9184.method33564(Class426.class, Class7709.field30655);
        field2598 = Class9184.method33564(Class426.class, Class7709.field30654);
        field2599 = Class9184.method33564(Class426.class, Class7709.field30661);
        field2600 = Class9184.method33564(Class426.class, Class7709.field30662);
    }
}
