// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import java.util.Iterator;
import javax.annotation.Nullable;
import java.util.Random;
import java.util.HashSet;
import com.google.common.collect.Sets;
import com.google.common.collect.Maps;
import java.util.Set;
import java.util.Map;
import java.util.List;

public abstract class Class1868 implements Class1867
{
    private static final List<Class3090> field10191;
    public final Map<Class4574<?>, Boolean> field10192;
    public final Set<BlockState> field10193;
    public final Set<Class3090> field10194;
    
    public Class1868(final Set<Class3090> field10194) {
        this.field10192 = Maps.newHashMap();
        this.field10193 = Sets.newHashSet();
        this.field10194 = field10194;
    }
    
    public List<Class3090> method7117() {
        return Class1868.field10191;
    }
    
    public Set<Class3090> method7118(final int n, final int n2, final int n3, final int n4) {
        final int n5 = n - n4 >> 2;
        final int n6 = n2 - n4 >> 2;
        final int n7 = n3 - n4 >> 2;
        final int n8 = n + n4 >> 2;
        final int n9 = n2 + n4 >> 2;
        final int n10 = n3 + n4 >> 2;
        final int n11 = n8 - n5 + 1;
        final int n12 = n9 - n6 + 1;
        final int n13 = n10 - n7 + 1;
        final HashSet hashSet = Sets.newHashSet();
        for (int i = 0; i < n13; ++i) {
            for (int j = 0; j < n11; ++j) {
                for (int k = 0; k < n12; ++k) {
                    hashSet.add(this.method6960(n5 + j, n6 + k, n7 + i));
                }
            }
        }
        return hashSet;
    }
    
    @Nullable
    public BlockPos method7119(final int n, final int n2, final int n3, final int n4, final List<Class3090> list, final Random random) {
        final int n5 = n - n4 >> 2;
        final int n6 = n3 - n4 >> 2;
        final int n7 = n + n4 >> 2;
        final int n8 = n3 + n4 >> 2;
        final int n9 = n7 - n5 + 1;
        final int n10 = n8 - n6 + 1;
        final int n11 = n2 >> 2;
        BlockPos class354 = null;
        int n12 = 0;
        for (int i = 0; i < n10; ++i) {
            for (int j = 0; j < n9; ++j) {
                final int n13 = n5 + j;
                final int n14 = n6 + i;
                if (list.contains(this.method6960(n13, n11, n14))) {
                    if (class354 == null || random.nextInt(n12 + 1) == 0) {
                        class354 = new BlockPos(n13 << 2, n2, n14 << 2);
                    }
                    ++n12;
                }
            }
        }
        return class354;
    }
    
    public float method7120(final int n, final int n2) {
        return 0.0f;
    }
    
    public boolean method7121(final Class4574<?> key) {
        return this.field10192.computeIfAbsent(key, p0 -> this.field10194.stream().anyMatch(class4575 -> class4575.method9853((Class4574<Class5113>)class4574)));
    }
    
    public Set<BlockState> method7122() {
        if (this.field10193.isEmpty()) {
            final Iterator<Class3090> iterator = this.field10194.iterator();
            while (iterator.hasNext()) {
                this.field10193.add(iterator.next().method9872().method13338());
            }
        }
        return this.field10193;
    }
    
    static {
        field10191 = Lists.newArrayList((Object[])new Class3090[] { Class7102.field27636, Class7102.field27633, Class7102.field27637, Class7102.field27651, Class7102.field27650, Class7102.field27653, Class7102.field27654 });
    }
}
