// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Sets;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import org.apache.logging.log4j.LogManager;

import java.util.Random;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import javax.annotation.Nullable;
import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.Logger;

public abstract class Class3090
{
    public static final Logger field15438;
    public static final Set<Class3090> field15439;
    public static final Class94<Class3090> field15440;
    public static final Class8575 field15441;
    public static final Class8575 field15442;
    public String field15443;
    public final float field15444;
    public final float field15445;
    public final float field15446;
    public final float field15447;
    public final int field15448;
    public final int field15449;
    private final int field15450;
    public final String field15451;
    public final Class8314<?> field15452;
    public final Class2140 field15453;
    public final Class2145 field15454;
    public final Map<Class2126, List<Class8312<?>>> field15455;
    public final Map<Class2108, List<Class8530<?, ?>>> field15456;
    public final List<Class8530<?, ?>> field15457;
    public final Map<Class4574<?>, Class5113> field15458;
    private final Map<Class1976, List<Class6828>> field15459;
    private final ThreadLocal<Long2FloatLinkedOpenHashMap> field15460;
    
    @Nullable
    public static Class3090 method9834(final Class3090 class3090) {
        return Class3090.field15440.method499(Class90.field217.method504(class3090));
    }
    
    public static <C extends Class5118> Class8312<C> method9835(final Class7304<C> class7304, final C c) {
        return new Class8312<C>(class7304, c);
    }
    
    public Class3090(final Class8927 obj) {
        this.field15455 = Maps.newHashMap();
        this.field15456 = Maps.newHashMap();
        this.field15457 = Lists.newArrayList();
        this.field15458 = Maps.newHashMap();
        this.field15459 = Maps.newHashMap();
        this.field15460 = ThreadLocal.withInitial(() -> Class8349.method27850(() -> {
            final Class29 class29 = new Class29(this, 1024, 0.25f);
            class29.defaultReturnValue(Float.NaN);
            return class29;
        }));
        if (Class8927.method31473(obj) != null) {
            if (Class8927.method31474(obj) != null) {
                if (Class8927.method31475(obj) != null) {
                    if (Class8927.method31476(obj) != null) {
                        if (Class8927.method31477(obj) != null) {
                            if (Class8927.method31478(obj) != null) {
                                if (Class8927.method31479(obj) != null) {
                                    if (Class8927.method31480(obj) != null) {
                                        if (Class8927.method31481(obj) != null) {
                                            this.field15452 = Class8927.method31473(obj);
                                            this.field15454 = Class8927.method31474(obj);
                                            this.field15453 = Class8927.method31475(obj);
                                            this.field15444 = Class8927.method31476(obj);
                                            this.field15445 = Class8927.method31477(obj);
                                            this.field15446 = Class8927.method31478(obj);
                                            this.field15447 = Class8927.method31479(obj);
                                            this.field15448 = Class8927.method31480(obj);
                                            this.field15449 = Class8927.method31481(obj);
                                            this.field15450 = this.method9837();
                                            this.field15451 = Class8927.method31482(obj);
                                            final Class2108[] values = Class2108.values();
                                            for (int length = values.length, i = 0; i < length; ++i) {
                                                this.field15456.put(values[i], Lists.newArrayList());
                                            }
                                            final Class1976[] values2 = Class1976.values();
                                            for (int length2 = values2.length, j = 0; j < length2; ++j) {
                                                this.field15459.put(values2[j], Lists.newArrayList());
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new IllegalStateException("You are missing parameters to build a proper biome for " + this.getClass().getSimpleName() + "\n" + obj);
    }
    
    public boolean method9836() {
        return this.field15451 != null;
    }
    
    private int method9837() {
        final float method35653 = MathHelper.clamp(this.field15446 / 3.0f, -1.0f, 1.0f);
        return MathHelper.method35697(0.62222224f - method35653 * 0.05f, 0.5f + method35653 * 0.1f, 1.0f);
    }
    
    public int method9838() {
        return this.field15450;
    }
    
    public void method9839(final Class1976 class1976, final Class6828 class1977) {
        this.field15459.get(class1976).add(class1977);
    }
    
    public List<Class6828> method9840(final Class1976 class1976) {
        return this.field15459.get(class1976);
    }
    
    public Class2145 method9841() {
        return this.field15454;
    }
    
    public boolean method9842() {
        return this.method9863() > 0.85f;
    }
    
    public float method9843() {
        return 0.1f;
    }
    
    public float method9844(final BlockPos class354) {
        if (class354.getY() <= 64) {
            return this.method9867();
        }
        return this.method9867() - ((float)(Class3090.field15441.method29027(class354.getX() / 8.0f, class354.getZ() / 8.0f, false) * 4.0) + class354.getY() - 64.0f) * 0.05f / 30.0f;
    }
    
    public final float method9845(final BlockPos class354) {
        final long method1132 = class354.toLong();
        final Long2FloatLinkedOpenHashMap long2FloatLinkedOpenHashMap = this.field15460.get();
        final float value = long2FloatLinkedOpenHashMap.get(method1132);
        if (Float.isNaN(value)) {
            final float method1133 = this.method9844(class354);
            if (long2FloatLinkedOpenHashMap.size() == 1024) {
                long2FloatLinkedOpenHashMap.removeFirstFloat();
            }
            long2FloatLinkedOpenHashMap.put(method1132, method1133);
            return method1133;
        }
        return value;
    }
    
    public boolean method9846(final Class1852 class1852, final BlockPos class1853) {
        return this.method9847(class1852, class1853, true);
    }
    
    public boolean method9847(final Class1852 class1852, final BlockPos class1853, final boolean b) {
        if (this.method9845(class1853) < 0.15f) {
            if (class1853.getY() >= 0) {
                if (class1853.getY() < 256) {
                    if (class1852.method6992(Class237.field912, class1853) < 10) {
                        final Class7096 method6701 = class1852.method6701(class1853);
                        if (class1852.method6702(class1853).method21779() == Class7558.field29976) {
                            if (method6701.method21696() instanceof Class3859) {
                                if (!b) {
                                    return true;
                                }
                                boolean b2 = false;
                                Label_0185: {
                                    if (class1852.method6967(class1853.method1145())) {
                                        if (class1852.method6967(class1853.method1147())) {
                                            if (class1852.method6967(class1853.method1141())) {
                                                if (class1852.method6967(class1853.method1143())) {
                                                    b2 = true;
                                                    break Label_0185;
                                                }
                                            }
                                        }
                                    }
                                    b2 = false;
                                }
                                if (!b2) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    public boolean method9848(final Class1852 class1852, final BlockPos class1853) {
        if (this.method9845(class1853) < 0.15f) {
            if (class1853.getY() >= 0) {
                if (class1853.getY() < 256) {
                    if (class1852.method6992(Class237.field912, class1853) < 10) {
                        if (class1852.method6701(class1853).method21706()) {
                            if (Class7521.field29329.method11878().method21752(class1852, class1853)) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    public void method9849(final Class2108 class2108, final Class8530<?, ?> class2109) {
        if (class2109.field35804 == Class4535.field20022) {
            this.field15457.add(class2109);
        }
        this.field15456.get(class2108).add(class2109);
    }
    
    public <C extends Class5118> void method9850(final Class2126 key, final Class8312<C> class8312) {
        this.field15455.computeIfAbsent(key, p0 -> Lists.newArrayList()).add((Object)class8312);
    }
    
    public List<Class8312<?>> method9851(final Class2126 key) {
        return this.field15455.computeIfAbsent(key, p0 -> Lists.newArrayList());
    }
    
    public <C extends Class5113> void method9852(final Class8530<C, ? extends Class4574<C>> class8530) {
        this.field15458.put((Class4574<?>)class8530.field35804, class8530.field35805);
    }
    
    public <C extends Class5113> boolean method9853(final Class4574<C> class4574) {
        return this.field15458.containsKey(class4574);
    }
    
    @Nullable
    public <C extends Class5113> C method9854(final Class4574<C> class4574) {
        return (C)this.field15458.get(class4574);
    }
    
    public List<Class8530<?, ?>> method9855() {
        return this.field15457;
    }
    
    public List<Class8530<?, ?>> method9856(final Class2108 class2108) {
        return this.field15456.get(class2108);
    }
    
    public void method9857(final Class2108 class2108, final Class6346<? extends Class7065> class2109, final Class1851 class2110, final long n, final Class2317 class2111, final BlockPos class2112) {
        int n2 = 0;
        for (final Class8530 class2113 : this.field15456.get(class2108)) {
            class2111.method9439(n, n2, class2108.ordinal());
            try {
                class2113.method28613(class2110, class2109, class2111, class2112);
            }
            catch (final Exception ex) {
                final Class7689 method24421 = Class7689.method24421(ex, "Feature placement");
                method24421.method24418("Feature").method16297("Id", Class90.field215.method503(class2113.field35804)).method16296("Description", () -> class2114.field35804.toString());
                throw new Class2365(method24421);
            }
            ++n2;
        }
    }
    
    public int method9858(final double n, final double n2) {
        return Class9010.method32261(MathHelper.clamp(this.method9867(), 0.0f, 1.0f), MathHelper.clamp(this.method9863(), 0.0f, 1.0f));
    }
    
    public int method9859() {
        return Class8861.method31025(MathHelper.clamp(this.method9867(), 0.0f, 1.0f), MathHelper.clamp(this.method9863(), 0.0f, 1.0f));
    }
    
    public void method9860(final Random random, final Class1860 class1860, final int n, final int n2, final int n3, final double n4, final Class7096 class1861, final Class7096 class1862, final int n5, final long n6) {
        this.field15452.method27603(n6);
        this.field15452.method27602(random, class1860, this, n, n2, n3, n4, class1861, class1862, n5, n6);
    }
    
    public Class2081 method9861() {
        if (this.field15453 == Class2140.field12596) {
            return Class2081.field12032;
        }
        if (this.method9867() >= 0.2) {
            return (this.method9867() >= 1.0) ? Class2081.field12035 : Class2081.field12034;
        }
        return Class2081.field12033;
    }
    
    public final float method9862() {
        return this.field15444;
    }
    
    public final float method9863() {
        return this.field15447;
    }
    
    public ITextComponent method9864() {
        return new Class2259(this.method9865(), new Object[0]);
    }
    
    public String method9865() {
        if (this.field15443 == null) {
            this.field15443 = Class8349.method27836("biome", Class90.field217.method503(this));
        }
        return this.field15443;
    }
    
    public final float method9866() {
        return this.field15445;
    }
    
    public final float method9867() {
        return this.field15446;
    }
    
    public final int method9868() {
        return this.field15448;
    }
    
    public final int method9869() {
        return this.field15449;
    }
    
    public final Class2140 method9870() {
        return this.field15453;
    }
    
    public Class8314<?> method9871() {
        return this.field15452;
    }
    
    public Class4407 method9872() {
        return (Class4407)this.field15452.method27604();
    }
    
    @Nullable
    public String method9873() {
        return this.field15451;
    }
    
    static {
        field15438 = LogManager.getLogger();
        field15439 = Sets.newHashSet();
        field15440 = new Class94<Class3090>();
        field15441 = new Class8575(new Class2317(1234L), 0, 0);
        field15442 = new Class8575(new Class2317(2345L), 0, 0);
    }
}
