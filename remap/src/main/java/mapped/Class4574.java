// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;
import java.util.Iterator;
import it.unimi.dsi.fastutil.longs.LongIterator;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;
import org.apache.logging.log4j.Logger;

public abstract class Class4574<C extends Class5113> extends Class4535<C>
{
    private static final Logger field20064;
    
    public Class4574(final Function<Dynamic<?>, ? extends C> function) {
        super(function);
    }
    
    @Override
    public Class8530<C, ? extends Class4574<C>> method13527(final C c) {
        return new Class8530<C, Class4574<C>>((Class4574<C>)this, c);
    }
    
    @Override
    public boolean method13525(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final BlockPos class1853, final C c) {
        if (class1851.method6764().method29565()) {
            final int n = class1853.getX() >> 4;
            final int n2 = class1853.getZ() >> 4;
            final int n3 = n << 4;
            final int n4 = n2 << 4;
            boolean b = false;
            final LongIterator iterator = class1851.method6798(n, n2).method7047(this.method13596()).iterator();
            while (((Iterator)iterator).hasNext()) {
                final Class7859 class1854 = new Class7859((long)((Iterator)iterator).next());
                final Class5936 method7045 = class1851.method6798(class1854.field32290, class1854.field32291).method7045(this.method13596());
                if (method7045 == null) {
                    continue;
                }
                if (method7045 == Class5936.field24429) {
                    continue;
                }
                method7045.method17853(class1851, class1852, random, new MutableBoundingBox(n3, n4, n3 + 15, n4 + 15), new Class7859(n, n2));
                b = true;
            }
            return b;
        }
        return false;
    }
    
    public Class5936 method13588(final Class1851 class1851, final BlockPos class1852, final boolean b) {
        for (final Class5936 class1853 : this.method13592(class1851, class1852.getX() >> 4, class1852.getZ() >> 4)) {
            if (class1853.method17858() && class1853.method17851().isVecInside(class1852)) {
                if (!b) {
                    return class1853;
                }
                final Iterator<Class4473> iterator2 = class1853.method17852().iterator();
                while (iterator2.hasNext()) {
                    if (!iterator2.next().method13432().isVecInside(class1852)) {
                        continue;
                    }
                    return class1853;
                }
            }
        }
        return Class5936.field24429;
    }
    
    public boolean method13589(final Class1851 class1851, final BlockPos class1852) {
        return this.method13588(class1851, class1852, false).method17858();
    }
    
    public boolean method13590(final Class1851 class1851, final BlockPos class1852) {
        return this.method13588(class1851, class1852, true).method17858();
    }
    
    @Nullable
    public BlockPos method13591(final World class1847, final Class6346<? extends Class7065> class1848, final BlockPos class1849, final int n, final boolean b) {
        if (class1848.method18879().method7121(this)) {
            final int n2 = class1849.getX() >> 4;
            final int n3 = class1849.getZ() >> 4;
            int i = 0;
            final Class2317 class1850 = new Class2317();
            while (i <= n) {
                for (int j = -i; j <= i; ++j) {
                    final boolean b2 = j == -i || j == i;
                    for (int k = -i; k <= i; ++k) {
                        final boolean b3 = k == -i || k == i;
                        if (b2 || b3) {
                            final Class7859 method13593 = this.method13593(class1848, class1850, n2, n3, j, k);
                            final Class5936 method13594 = class1847.method6966(method13593.field32290, method13593.field32291, ChunkStatus.field39978).method7045(this.method13596());
                            if (method13594 != null) {
                                if (method13594.method17858()) {
                                    if (b && method13594.method17862()) {
                                        method13594.method17863();
                                        return method13594.method17861();
                                    }
                                    if (!b) {
                                        return method13594.method17861();
                                    }
                                }
                            }
                            if (i == 0) {
                                break;
                            }
                        }
                    }
                    if (i == 0) {
                        break;
                    }
                }
                ++i;
            }
            return null;
        }
        return null;
    }
    
    private List<Class5936> method13592(final Class1851 class1851, final int n, final int n2) {
        final ArrayList arrayList = Lists.newArrayList();
        final LongIterator iterator = class1851.method6966(n, n2, ChunkStatus.field39979).method7047(this.method13596()).iterator();
        while (iterator.hasNext()) {
            final long nextLong = iterator.nextLong();
            final Class5936 method7045 = class1851.method6966(Class7859.method25424(nextLong), Class7859.method25425(nextLong), ChunkStatus.field39978).method7045(this.method13596());
            if (method7045 == null) {
                continue;
            }
            arrayList.add(method7045);
        }
        return arrayList;
    }
    
    public Class7859 method13593(final Class6346<?> class6346, final Random random, final int n, final int n2, final int n3, final int n4) {
        return new Class7859(n + n3, n2 + n4);
    }
    
    public abstract boolean method13594(final BiomeManager p0, final Class6346<?> p1, final Random p2, final int p3, final int p4, final Class3090 p5);
    
    public abstract Class6378 method13595();
    
    public abstract String method13596();
    
    public abstract int method13597();
    
    static {
        field20064 = LogManager.getLogger();
    }
}