// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.apache.logging.log4j.LogManager;
import it.unimi.dsi.fastutil.shorts.ShortListIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.util.stream.StreamSupport;
import java.util.stream.Stream;
import java.util.Collections;
import java.util.function.Predicate;
import java.util.List;
import javax.annotation.Nullable;
import java.util.HashSet;
import java.util.Collection;
import com.google.common.collect.Sets;
import java.util.Set;
import java.util.Iterator;
import com.google.common.collect.Maps;
import java.util.function.Consumer;
import java.util.function.Supplier;
import it.unimi.dsi.fastutil.shorts.ShortList;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import org.apache.logging.log4j.Logger;

public class Class1862 implements Class1860
{
    private static final Logger field10140;
    public static final Class8199 field10141;
    private final Class8199[] field10142;
    private Class1873 field10143;
    private final Map<BlockPos, Class51> field10144;
    public boolean field10145;
    private final Class1847 field10146;
    private final Map<Class2020, Class9548> field10147;
    private final Class8288 field10148;
    private final Map<BlockPos, Class436> field10149;
    private final Class80<Entity>[] field10150;
    private final Map<String, Class5936> field10151;
    private final Map<String, LongSet> field10152;
    private final ShortList[] field10153;
    private Class6952<Class3833> field10154;
    private Class6952<Class7255> field10155;
    private boolean field10156;
    private long field10157;
    private volatile boolean field10158;
    private long field10159;
    private Supplier<Class2152> field10160;
    private Consumer<Class1862> field10161;
    private final Class7859 field10162;
    private volatile boolean field10163;
    
    public Class1862(final Class1847 class1847, final Class7859 class1848, final Class1873 class1849) {
        this(class1847, class1848, class1849, Class8288.field34078, (Class6952<Class3833>)Class6954.method21355(), (Class6952<Class7255>)Class6954.method21355(), 0L, null, null);
    }
    
    public Class1862(final Class1847 field10146, final Class7859 field10147, final Class1873 field10148, final Class8288 field10149, final Class6952<Class3833> field10150, final Class6952<Class7255> field10151, final long field10152, final Class8199[] array, final Consumer<Class1862> field10153) {
        this.field10142 = new Class8199[16];
        this.field10144 = Maps.newHashMap();
        this.field10147 = Maps.newEnumMap((Class)Class2020.class);
        this.field10149 = Maps.newHashMap();
        this.field10151 = Maps.newHashMap();
        this.field10152 = Maps.newHashMap();
        this.field10153 = new ShortList[16];
        this.field10150 = new Class80[16];
        this.field10146 = field10146;
        this.field10162 = field10147;
        this.field10148 = field10149;
        for (final Class2020 o : Class2020.values()) {
            if (Class9312.field39989.method34450().contains(o)) {
                this.field10147.put(o, new Class9548(this, o));
            }
        }
        for (int j = 0; j < this.field10150.length; ++j) {
            this.field10150[j] = new Class80<Entity>(Entity.class);
        }
        this.field10143 = field10148;
        this.field10154 = field10150;
        this.field10155 = field10151;
        this.field10159 = field10152;
        this.field10161 = field10153;
        if (array != null) {
            if (this.field10142.length != array.length) {
                Class1862.field10140.warn("Could not set level chunk sections, array length is {} instead of {}", (Object)array.length, (Object)this.field10142.length);
            }
            else {
                System.arraycopy(array, 0, this.field10142, 0, this.field10142.length);
            }
        }
    }
    
    public Class1862(final Class1847 class1847, final Class1865 class1848) {
        this(class1847, class1848.method7019(), class1848.method7024(), class1848.method7039(), class1848.method7102(), class1848.method7103(), class1848.method7041(), class1848.method7014(), null);
        final Iterator<Class51> iterator = class1848.method7096().iterator();
        while (iterator.hasNext()) {
            EntityType.method23378((Class51)iterator.next(), class1847, class1850 -> {
                this.method7010(class1850);
                return class1850;
            });
        }
        final Iterator<Class436> iterator2 = class1848.method7094().values().iterator();
        while (iterator2.hasNext()) {
            this.method7056(iterator2.next());
        }
        this.field10144.putAll(class1848.method7104());
        for (int i = 0; i < class1848.method7030().length; ++i) {
            this.field10153[i] = class1848.method7030()[i];
        }
        this.method7022(class1848.method7021());
        this.method7050(class1848.method7049());
        for (final Map.Entry<Object, V> entry : class1848.method7015()) {
            if (!Class9312.field39989.method34450().contains(entry.getKey())) {
                continue;
            }
            this.method7017(entry.getKey()).method35716(((Class9548)entry.getValue()).method35717());
        }
        this.method7044(class1848.method7043());
        this.field10158 = true;
    }
    
    @Override
    public Class9548 method7017(final Class2020 key) {
        return this.field10147.computeIfAbsent(key, class2020 -> new Class9548(this, class2020));
    }
    
    @Override
    public Set<BlockPos> method7013() {
        final HashSet hashSet = Sets.newHashSet((Iterable)this.field10144.keySet());
        hashSet.addAll(this.field10149.keySet());
        return hashSet;
    }
    
    @Override
    public Class8199[] method7014() {
        return this.field10142;
    }
    
    @Override
    public Class7096 method6701(final BlockPos class354) {
        final int method1074 = class354.getX();
        final int method1075 = class354.getY();
        final int method1076 = class354.getZ();
        if (this.field10146.method6745() == Class9505.field40898) {
            Class7096 class355 = null;
            if (method1075 == 60) {
                class355 = Class7521.field29517.method11878();
            }
            if (method1075 == 70) {
                class355 = Class6348.method18887(method1074, method1076);
            }
            return (class355 == null) ? Class7521.field29147.method11878() : class355;
        }
        try {
            if (method1075 >= 0 && method1075 >> 4 < this.field10142.length) {
                final Class8199 class356 = this.field10142[method1075 >> 4];
                if (!Class8199.method27155(class356)) {
                    return class356.method27148(method1074 & 0xF, method1075 & 0xF, method1076 & 0xF);
                }
            }
            return Class7521.field29147.method11878();
        }
        catch (final Throwable t) {
            final Class7689 method1077 = Class7689.method24421(t, "Getting block state");
            method1077.method24418("Block being got").method16296("Location", () -> Class5204.method16295(n, n2, n3));
            throw new Class2365(method1077);
        }
    }
    
    @Override
    public Class7099 method6702(final BlockPos class354) {
        return this.method7051(class354.getX(), class354.getY(), class354.getZ());
    }
    
    public Class7099 method7051(final int n, final int n2, final int n3) {
        try {
            if (n2 >= 0 && n2 >> 4 < this.field10142.length) {
                final Class8199 class8199 = this.field10142[n2 >> 4];
                if (!Class8199.method27155(class8199)) {
                    return class8199.method27149(n & 0xF, n2 & 0xF, n3 & 0xF);
                }
            }
            return Class7558.field29974.method22148();
        }
        catch (final Throwable t) {
            final Class7689 method24421 = Class7689.method24421(t, "Getting fluid state");
            method24421.method24418("Block being got").method16296("Location", () -> Class5204.method16295(n4, n5, n6));
            throw new Class2365(method24421);
        }
    }
    
    @Nullable
    @Override
    public Class7096 method7008(final BlockPos class354, final Class7096 class355, final boolean b) {
        final int n = class354.getX() & 0xF;
        final int method1075 = class354.getY();
        final int n2 = class354.getZ() & 0xF;
        Class8199 class356 = this.field10142[method1075 >> 4];
        if (class356 == Class1862.field10141) {
            if (class355.method21706()) {
                return null;
            }
            class356 = new Class8199(method1075 >> 4 << 4);
            this.field10142[method1075 >> 4] = class356;
        }
        final boolean method1076 = class356.method27154();
        final Class7096 method1077 = class356.method27152(n, method1075 & 0xF, n2, class355);
        if (method1077 == class355) {
            return null;
        }
        final Class3833 method1078 = class355.method21696();
        final Class3833 method1079 = method1077.method21696();
        this.field10147.get(Class2020.field11525).method35712(n, method1075, n2, class355);
        this.field10147.get(Class2020.field11526).method35712(n, method1075, n2, class355);
        this.field10147.get(Class2020.field11524).method35712(n, method1075, n2, class355);
        this.field10147.get(Class2020.field11522).method35712(n, method1075, n2, class355);
        final boolean method1080 = class356.method27154();
        if (method1076 != method1080) {
            this.field10146.method6762().method7405().method7291(class354, method1080);
        }
        if (this.field10146.field10067) {
            if (method1079 != method1078) {
                if (method1079 instanceof Class3840) {
                    this.field10146.method6730(class354);
                }
            }
        }
        else {
            method1077.method21738(this.field10146, class354, class355, b);
        }
        if (class356.method27148(n, method1075 & 0xF, n2).method21696() == method1078) {
            if (method1079 instanceof Class3840) {
                final Class436 method1081 = this.method7000(class354, Class2079.field12022);
                if (method1081 != null) {
                    method1081.method2201();
                }
            }
            if (!this.field10146.field10067) {
                class355.method21737(this.field10146, class354, method1077, b);
            }
            if (method1078 instanceof Class3840) {
                final Class436 method1082 = this.method7000(class354, Class2079.field12022);
                if (method1082 != null) {
                    method1082.method2201();
                }
                else {
                    this.field10146.method6729(class354, ((Class3840)method1078).method11898(this.field10146));
                }
            }
            this.field10158 = true;
            return method1077;
        }
        return null;
    }
    
    @Nullable
    public Class1886 method7052() {
        return this.field10146.method6762().method7405();
    }
    
    @Override
    public void method7010(final Entity class399) {
        this.field10156 = true;
        final int method35644 = MathHelper.floor(class399.getPosX() / 16.0);
        final int method35645 = MathHelper.floor(class399.getPosZ() / 16.0);
        if (method35644 != this.field10162.field32290 || method35645 != this.field10162.field32291) {
            Class1862.field10140.warn("Wrong location! ({}, {}) should be ({}, {}), {}", (Object)method35644, (Object)method35645, (Object)this.field10162.field32290, (Object)this.field10162.field32291, (Object)class399);
            class399.field2410 = true;
        }
        int method35646 = MathHelper.floor(class399.getPosY() / 16.0);
        if (method35646 < 0) {
            method35646 = 0;
        }
        if (method35646 >= this.field10150.length) {
            method35646 = this.field10150.length - 1;
        }
        class399.field2440 = true;
        class399.field2441 = this.field10162.field32290;
        class399.field2442 = method35646;
        class399.field2443 = this.field10162.field32291;
        this.field10150[method35646].add(class399);
    }
    
    @Override
    public void method7016(final Class2020 class2020, final long[] array) {
        this.field10147.get(class2020).method35716(array);
    }
    
    public void method7053(final Entity class399) {
        this.method7054(class399, class399.field2442);
    }
    
    public void method7054(final Entity class399, int n) {
        if (n < 0) {
            n = 0;
        }
        if (n >= this.field10150.length) {
            n = this.field10150.length - 1;
        }
        this.field10150[n].remove(class399);
    }
    
    @Override
    public int method7018(final Class2020 class2020, final int n, final int n2) {
        return this.field10147.get(class2020).method35713(n & 0xF, n2 & 0xF) - 1;
    }
    
    @Nullable
    private Class436 method7055(final BlockPos class354) {
        final Class3833 method21696 = this.method6701(class354).method21696();
        return method21696.method11802() ? ((Class3840)method21696).method11898(this.field10146) : null;
    }
    
    @Nullable
    @Override
    public Class436 method6727(final BlockPos class354) {
        return this.method7000(class354, Class2079.field12022);
    }
    
    @Nullable
    public Class436 method7000(final BlockPos class354, final Class2079 class355) {
        Class436 method7055 = this.field10149.get(class354);
        if (method7055 == null) {
            final Class51 class356 = this.field10144.remove(class354);
            if (class356 != null) {
                final Class436 method7056 = this.method7070(class354, class356);
                if (method7056 != null) {
                    return method7056;
                }
            }
        }
        if (method7055 != null) {
            if (method7055.method2197()) {
                this.field10149.remove(class354);
                return null;
            }
        }
        else if (class355 == Class2079.field12020) {
            method7055 = this.method7055(class354);
            this.field10146.method6729(class354, method7055);
        }
        return method7055;
    }
    
    public void method7056(final Class436 class436) {
        this.method7009(class436.method2193(), class436);
        if (this.field10145 || this.field10146.method6678()) {
            this.field10146.method6729(class436.method2193(), class436);
        }
    }
    
    @Override
    public void method7009(final BlockPos class354, final Class436 class355) {
        if (this.method6701(class354).method21696() instanceof Class3840) {
            class355.method2187(this.field10146, class354);
            class355.method2199();
            final Class436 class356 = this.field10149.put(class354.method1153(), class355);
            if (class356 != null) {
                if (class356 != class355) {
                    class356.method2198();
                }
            }
        }
    }
    
    @Override
    public void method7032(final Class51 class51) {
        this.field10144.put(new BlockPos(class51.method319("x"), class51.method319("y"), class51.method319("z")), class51);
    }
    
    @Nullable
    @Override
    public Class51 method7034(final BlockPos class354) {
        final Class436 method6727 = this.method6727(class354);
        if (method6727 != null && !method6727.method2197()) {
            final Class51 method6728 = method6727.method2180(new Class51());
            method6728.method312("keepPacked", false);
            return method6728;
        }
        Class51 method6729 = this.field10144.get(class354);
        if (method6729 != null) {
            method6729 = method6729.method333();
            method6729.method312("keepPacked", true);
        }
        return method6729;
    }
    
    @Override
    public void method7028(final BlockPos class354) {
        if (this.field10145 || this.field10146.method6678()) {
            final Class436 class355 = this.field10149.remove(class354);
            if (class355 != null) {
                class355.method2198();
            }
        }
    }
    
    public void method7057() {
        if (this.field10161 != null) {
            this.field10161.accept(this);
            this.field10161 = null;
        }
    }
    
    public void method7058() {
        this.field10158 = true;
    }
    
    public void method7059(final Entity class399, final AxisAlignedBB class400, final List<Entity> list, final Predicate<? super Entity> predicate) {
        final int method35644 = MathHelper.floor((class400.field25074 - 2.0) / 16.0);
        final int method35645 = MathHelper.floor((class400.field25077 + 2.0) / 16.0);
        final int method35646 = MathHelper.method35651(method35644, 0, this.field10150.length - 1);
        for (int method35647 = MathHelper.method35651(method35645, 0, this.field10150.length - 1), i = method35646; i <= method35647; ++i) {
            if (!this.field10150[i].isEmpty()) {
                for (final Entity class401 : this.field10150[i]) {
                    if (!class401.method1886().method18502(class400)) {
                        continue;
                    }
                    if (class401 == class399) {
                        continue;
                    }
                    if (predicate == null || predicate.test(class401)) {
                        list.add(class401);
                    }
                    if (!(class401 instanceof Class852)) {
                        continue;
                    }
                    for (final Class859 class402 : ((Class852)class401).method5123()) {
                        if (class402 != class399) {
                            if (class402.method1886().method18502(class400)) {
                                if (predicate == null || predicate.test(class402)) {
                                    list.add(class402);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public <T extends Entity> void method7060(final EntityType<?> class7499, final AxisAlignedBB class7500, final List<? super T> list, final Predicate<? super T> predicate) {
        final int method35644 = MathHelper.floor((class7500.field25074 - 2.0) / 16.0);
        final int method35645 = MathHelper.floor((class7500.field25077 + 2.0) / 16.0);
        final int method35646 = MathHelper.method35651(method35644, 0, this.field10150.length - 1);
        for (int method35647 = MathHelper.method35651(method35645, 0, this.field10150.length - 1), i = method35646; i <= method35647; ++i) {
            for (final Entity class7501 : this.field10150[i].method443(Entity.class)) {
                if (class7499 != null && class7501.method1642() != class7499) {
                    continue;
                }
                if (!class7501.method1886().method18502(class7500)) {
                    continue;
                }
                if (!predicate.test((Object)class7501)) {
                    continue;
                }
                list.add((Object)class7501);
            }
        }
    }
    
    public <T extends Entity> void method7061(final Class<? extends T> clazz, final AxisAlignedBB class6221, final List<T> list, final Predicate<? super T> predicate) {
        final int method35644 = MathHelper.floor((class6221.field25074 - 2.0) / 16.0);
        final int method35645 = MathHelper.floor((class6221.field25077 + 2.0) / 16.0);
        final int method35646 = MathHelper.method35651(method35644, 0, this.field10150.length - 1);
        for (int method35647 = MathHelper.method35651(method35645, 0, this.field10150.length - 1), i = method35646; i <= method35647; ++i) {
            for (final Entity class6222 : this.field10150[i].method443((Class<T>)clazz)) {
                if (!class6222.method1886().method18502(class6221)) {
                    continue;
                }
                if (predicate != null && !predicate.test((T)class6222)) {
                    continue;
                }
                list.add((T)class6222);
            }
        }
    }
    
    public boolean method7062() {
        return false;
    }
    
    @Override
    public Class7859 method7019() {
        return this.field10162;
    }
    
    public void method7063(final Class1873 field10143, final Class8654 class8654, final Class51 class8655, final int n) {
        final boolean b = field10143 != null;
        Sets.newHashSet((Iterable)this.field10149.keySet()).stream().filter(b ? (p0 -> true) : (class8658 -> (n2 & 1 << (class8658.method1075() >> 4)) != 0x0)).forEach(this.field10146::method6730);
        for (int i = 0; i < this.field10142.length; ++i) {
            Class8199 class8656 = this.field10142[i];
            if ((n & 1 << i) != 0x0) {
                if (class8656 == Class1862.field10141) {
                    class8656 = new Class8199(i << 4);
                    this.field10142[i] = class8656;
                }
                class8656.method27162(class8654);
            }
            else if (b) {
                if (class8656 != Class1862.field10141) {
                    this.field10142[i] = Class1862.field10141;
                }
            }
        }
        if (field10143 != null) {
            this.field10143 = field10143;
        }
        for (final Class2020 class8657 : Class2020.values()) {
            final String method8060 = class8657.method8060();
            if (class8655.method316(method8060, 12)) {
                this.method7016(class8657, class8655.method326(method8060));
            }
        }
        final Iterator<Class436> iterator = this.field10149.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().method2201();
        }
    }
    
    @Override
    public Class1873 method7024() {
        return this.field10143;
    }
    
    public void method7064(final boolean field10145) {
        this.field10145 = field10145;
    }
    
    public Class1847 method7065() {
        return this.field10146;
    }
    
    @Override
    public Collection<Map.Entry<Class2020, Class9548>> method7015() {
        return (Collection<Map.Entry<Class2020, Class9548>>)Collections.unmodifiableSet((Set<?>)this.field10147.entrySet());
    }
    
    public Map<BlockPos, Class436> method7066() {
        return this.field10149;
    }
    
    public Class80<Entity>[] method7067() {
        return this.field10150;
    }
    
    @Override
    public Class51 method7033(final BlockPos class354) {
        return this.field10144.get(class354);
    }
    
    @Override
    public Stream<BlockPos> method7035() {
        return StreamSupport.stream(BlockPos.method1158(this.field10162.method25426(), 0, this.field10162.method25427(), this.field10162.method25428(), 255, this.field10162.method25429()).spliterator(), false).filter(class354 -> this.method6701(class354).method21704() != 0);
    }
    
    @Override
    public Class6952<Class3833> method7036() {
        return this.field10154;
    }
    
    @Override
    public Class6952<Class7255> method7037() {
        return this.field10155;
    }
    
    @Override
    public void method7025(final boolean field10158) {
        this.field10158 = field10158;
    }
    
    @Override
    public boolean method7026() {
        return this.field10158 || (this.field10156 && this.field10146.method6754() != this.field10157);
    }
    
    public void method7068(final boolean field10156) {
        this.field10156 = field10156;
    }
    
    @Override
    public void method7020(final long field10157) {
        this.field10157 = field10157;
    }
    
    @Nullable
    @Override
    public Class5936 method7045(final String s) {
        return this.field10151.get(s);
    }
    
    @Override
    public void method7046(final String s, final Class5936 class5936) {
        this.field10151.put(s, class5936);
    }
    
    @Override
    public Map<String, Class5936> method7021() {
        return this.field10151;
    }
    
    @Override
    public void method7022(final Map<String, Class5936> map) {
        this.field10151.clear();
        this.field10151.putAll(map);
    }
    
    @Override
    public LongSet method7047(final String key) {
        return this.field10152.computeIfAbsent(key, p0 -> new LongOpenHashSet());
    }
    
    @Override
    public void method7048(final String key, final long n) {
        this.field10152.computeIfAbsent(key, p0 -> new LongOpenHashSet()).add(n);
    }
    
    @Override
    public Map<String, LongSet> method7049() {
        return this.field10152;
    }
    
    @Override
    public void method7050(final Map<String, LongSet> map) {
        this.field10152.clear();
        this.field10152.putAll(map);
    }
    
    @Override
    public long method7041() {
        return this.field10159;
    }
    
    @Override
    public void method7040(final long field10159) {
        this.field10159 = field10159;
    }
    
    public void method7069() {
        final Class7859 method7019 = this.method7019();
        for (int i = 0; i < this.field10153.length; ++i) {
            if (this.field10153[i] != null) {
                final ShortListIterator iterator = this.field10153[i].iterator();
                while (((Iterator)iterator).hasNext()) {
                    final BlockPos method7020 = Class1865.method7101((short)((Iterator)iterator).next(), i, method7019);
                    this.field10146.method6688(method7020, Class3833.method11786(this.method6701(method7020), this.field10146, method7020), 20);
                }
                this.field10153[i].clear();
            }
        }
        this.method7071();
        final Iterator iterator2 = Sets.newHashSet((Iterable)this.field10144.keySet()).iterator();
        while (iterator2.hasNext()) {
            this.method6727((BlockPos)iterator2.next());
        }
        this.field10144.clear();
        this.field10148.method27546(this);
    }
    
    @Nullable
    private Class436 method7070(final BlockPos class354, final Class51 class355) {
        Class436 class356;
        if (!"DUMMY".equals(class355.method323("id"))) {
            class356 = Class436.method2190(class355);
        }
        else {
            final Class3833 method21696 = this.method6701(class354).method21696();
            if (!(method21696 instanceof Class3840)) {
                class356 = null;
                Class1862.field10140.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", (Object)class354, (Object)this.method6701(class354));
            }
            else {
                class356 = ((Class3840)method21696).method11898(this.field10146);
            }
        }
        if (class356 == null) {
            Class1862.field10140.warn("Tried to load a block entity for block {} but failed at location {}", (Object)this.method6701(class354), (Object)class354);
        }
        else {
            class356.method2187(this.field10146, class354);
            this.method7056(class356);
        }
        return class356;
    }
    
    @Override
    public Class8288 method7039() {
        return this.field10148;
    }
    
    @Override
    public ShortList[] method7030() {
        return this.field10153;
    }
    
    public void method7071() {
        if (!(this.field10154 instanceof Class6951)) {
            if (this.field10154 instanceof Class6956) {
                this.field10146.method6833().method21343(((Class6956)this.field10154).method21357());
                this.field10154 = (Class6952<Class3833>)Class6954.method21355();
            }
        }
        else {
            ((Class6951)this.field10154).method21339(this.field10146.method6833(), class354 -> this.method6701(class354).method21696());
            this.field10154 = (Class6952<Class3833>)Class6954.method21355();
        }
        if (!(this.field10155 instanceof Class6951)) {
            if (this.field10155 instanceof Class6956) {
                this.field10146.method6834().method21343(((Class6956)this.field10155).method21357());
                this.field10155 = (Class6952<Class7255>)Class6954.method21355();
            }
        }
        else {
            ((Class6951)this.field10155).method21339(this.field10146.method6834(), class355 -> this.method6702(class355).method21779());
            this.field10155 = (Class6952<Class7255>)Class6954.method21355();
        }
    }
    
    public void method7072(final Class1849 class1849) {
        if (this.field10154 == Class6954.method21355()) {
            this.field10154 = new Class6956<Class3833>(Class90.field208::method503, class1849.method6907().method21347(this.field10162, true, false));
            this.method7025(true);
        }
        if (this.field10155 == Class6954.method21355()) {
            this.field10155 = new Class6956<Class7255>(Class90.field206::method503, class1849.method6908().method21347(this.field10162, true, false));
            this.method7025(true);
        }
    }
    
    @Override
    public Class9312 method7027() {
        return Class9312.field39989;
    }
    
    public Class2152 method7073() {
        return (this.field10160 != null) ? this.field10160.get() : Class2152.field12787;
    }
    
    public void method7074(final Supplier<Class2152> field10160) {
        this.field10160 = field10160;
    }
    
    @Override
    public boolean method7043() {
        return this.field10163;
    }
    
    @Override
    public void method7044(final boolean field10163) {
        this.field10163 = field10163;
        this.method7025(true);
    }
    
    static {
        field10140 = LogManager.getLogger();
        field10141 = null;
    }
}
