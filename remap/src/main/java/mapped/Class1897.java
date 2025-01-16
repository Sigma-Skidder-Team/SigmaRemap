// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap$Entry;
import javax.annotation.Nullable;
import it.unimi.dsi.fastutil.longs.Long2ObjectMaps;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.LongSet;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.world.chunk.IChunkLightProvider;

public abstract class Class1897<M extends Class7501<M>> extends Class1896
{
    public static final Class7281 field10298;
    private static final Direction[] field10299;
    private final Class237 field10300;
    private final IChunkLightProvider field10301;
    public final LongSet field10302;
    public final LongSet field10303;
    public final LongSet field10304;
    public volatile M field10305;
    public final M field10306;
    public final LongSet field10307;
    public final LongSet field10308;
    public final Long2ObjectMap<Class7281> field10309;
    private final LongSet field10310;
    private final LongSet field10311;
    public volatile boolean field10312;
    
    public Class1897(final Class237 field10300, final IChunkLightProvider field10301, final M field10302) {
        super(3, 16, 256);
        this.field10302 = (LongSet)new LongOpenHashSet();
        this.field10303 = (LongSet)new LongOpenHashSet();
        this.field10304 = (LongSet)new LongOpenHashSet();
        this.field10307 = (LongSet)new LongOpenHashSet();
        this.field10308 = (LongSet)new LongOpenHashSet();
        this.field10309 = (Long2ObjectMap<Class7281>)Long2ObjectMaps.synchronize((Long2ObjectMap)new Long2ObjectOpenHashMap());
        this.field10310 = (LongSet)new LongOpenHashSet();
        this.field10311 = (LongSet)new LongOpenHashSet();
        this.field10300 = field10300;
        this.field10301 = field10301;
        this.field10306 = field10302;
        (this.field10305 = field10302.method23390()).method23400();
    }
    
    public boolean method7347(final long n) {
        return this.method7348(n, true) != null;
    }
    
    @Nullable
    public Class7281 method7348(final long n, final boolean b) {
        return this.method7349(b ? this.field10306 : this.field10305, n);
    }
    
    @Nullable
    public Class7281 method7349(final M m, final long n) {
        return m.method23396(n);
    }
    
    @Nullable
    public Class7281 method7350(final long n) {
        final Class7281 class7281 = (Class7281)this.field10309.get(n);
        return (class7281 == null) ? this.method7348(n, false) : class7281;
    }
    
    public abstract int method7351(final long p0);
    
    public int method7352(final long n) {
        return this.method7348(Class353.method1111(n), true).method22322(Class353.method1096(BlockPos.unpackX(n)), Class353.method1096(BlockPos.unpackY(n)), Class353.method1096(BlockPos.unpackZ(n)));
    }
    
    public void method7353(final long n, final int n2) {
        final long method1111 = Class353.method1111(n);
        if (this.field10307.add(method1111)) {
            this.field10306.method23394(method1111);
        }
        this.method7348(method1111, true).method22323(Class353.method1096(BlockPos.unpackX(n)), Class353.method1096(BlockPos.unpackY(n)), Class353.method1096(BlockPos.unpackZ(n)), n2);
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                for (int k = -1; k <= 1; ++k) {
                    this.field10308.add(Class353.method1111(BlockPos.offset(n, j, k, i)));
                }
            }
        }
    }
    
    @Override
    public int method7302(final long n) {
        if (n == Long.MAX_VALUE) {
            return 2;
        }
        if (!this.field10302.contains(n)) {
            return (!this.field10311.contains(n) && this.field10306.method23395(n)) ? 1 : 2;
        }
        return 0;
    }
    
    @Override
    public int method7345(final long n) {
        if (!this.field10303.contains(n)) {
            return (!this.field10302.contains(n) && !this.field10304.contains(n)) ? 2 : 0;
        }
        return 2;
    }
    
    @Override
    public void method7304(final long n, final int n2) {
        final int method7302 = this.method7302(n);
        if (method7302 != 0) {
            if (n2 == 0) {
                this.field10302.add(n);
                this.field10304.remove(n);
            }
        }
        if (method7302 == 0) {
            if (n2 != 0) {
                this.field10302.remove(n);
                this.field10303.remove(n);
            }
        }
        if (method7302 >= 2) {
            if (n2 != 2) {
                if (!this.field10311.contains(n)) {
                    this.field10306.method23398(n, this.method7354(n));
                    this.field10307.add(n);
                    this.method7358(n);
                    for (int i = -1; i <= 1; ++i) {
                        for (int j = -1; j <= 1; ++j) {
                            for (int k = -1; k <= 1; ++k) {
                                this.field10308.add(Class353.method1111(BlockPos.offset(n, j, k, i)));
                            }
                        }
                    }
                }
                else {
                    this.field10311.remove(n);
                }
            }
        }
        if (method7302 != 2) {
            if (n2 >= 2) {
                this.field10311.add(n);
            }
        }
        this.field10312 = !this.field10311.isEmpty();
    }
    
    public Class7281 method7354(final long n) {
        final Class7281 class7281 = (Class7281)this.field10309.get(n);
        return (class7281 == null) ? new Class7281() : class7281;
    }
    
    public void method7355(final Class1890<?, ?> class1890, final long n) {
        if (class1890.method7325() >= 8192) {
            final int method1098 = Class353.method1098(Class353.method1099(n));
            final int method1099 = Class353.method1098(Class353.method1100(n));
            final int method1100 = Class353.method1098(Class353.method1101(n));
            for (int i = 0; i < 16; ++i) {
                for (int j = 0; j < 16; ++j) {
                    for (int k = 0; k < 16; ++k) {
                        class1890.method7316(BlockPos.pack(method1098 + i, method1099 + j, method1100 + k));
                    }
                }
            }
        }
        else {
            class1890.method7317(n4 -> Class353.method1111(n4) == n2);
        }
    }
    
    public boolean method7356() {
        return this.field10312;
    }
    
    public void method7357(final Class1890<M, ?> class1890, final boolean b, final boolean b2) {
        if (this.method7356() || !this.field10309.isEmpty()) {
            for (final long longValue : this.field10311) {
                this.method7355(class1890, longValue);
                final Class7281 class1891 = (Class7281)this.field10309.remove(longValue);
                final Class7281 method23397 = this.field10306.method23397(longValue);
                if (this.field10310.contains(Class353.method1112(longValue))) {
                    if (class1891 != null) {
                        this.field10309.put(longValue, (Object)class1891);
                    }
                    else {
                        if (method23397 == null) {
                            continue;
                        }
                        this.field10309.put(longValue, (Object)method23397);
                    }
                }
            }
            this.field10306.method23399();
            final LongIterator iterator2 = this.field10311.iterator();
            while (((Iterator)iterator2).hasNext()) {
                this.method7359((long)((Iterator)iterator2).next());
            }
            this.field10311.clear();
            this.field10312 = false;
            for (final Long2ObjectMap$Entry long2ObjectMap$Entry : this.field10309.long2ObjectEntrySet()) {
                final long longKey = long2ObjectMap$Entry.getLongKey();
                if (this.method7347(longKey)) {
                    final Class7281 class1892 = (Class7281)long2ObjectMap$Entry.getValue();
                    if (this.field10306.method23396(longKey) == class1892) {
                        continue;
                    }
                    this.method7355(class1890, longKey);
                    this.field10306.method23398(longKey, class1892);
                    this.field10307.add(longKey);
                }
            }
            this.field10306.method23399();
            if (!b2) {
                for (final long longValue2 : this.field10309.keySet()) {
                    if (this.method7347(longValue2)) {
                        final int method23398 = Class353.method1098(Class353.method1099(longValue2));
                        final int method23399 = Class353.method1098(Class353.method1100(longValue2));
                        final int method23400 = Class353.method1098(Class353.method1101(longValue2));
                        for (final Direction class1893 : Class1897.field10299) {
                            final long method23401 = Class353.method1093(longValue2, class1893);
                            if (!this.field10309.containsKey(method23401) && this.method7347(method23401)) {
                                for (int j = 0; j < 16; ++j) {
                                    for (int k = 0; k < 16; ++k) {
                                        long n = 0L;
                                        long n2 = 0L;
                                        switch (Class8647.field36303[class1893.ordinal()]) {
                                            case 1: {
                                                n = BlockPos.pack(method23398 + k, method23399, method23400 + j);
                                                n2 = BlockPos.pack(method23398 + k, method23399 - 1, method23400 + j);
                                                break;
                                            }
                                            case 2: {
                                                n = BlockPos.pack(method23398 + k, method23399 + 16 - 1, method23400 + j);
                                                n2 = BlockPos.pack(method23398 + k, method23399 + 16, method23400 + j);
                                                break;
                                            }
                                            case 3: {
                                                n = BlockPos.pack(method23398 + j, method23399 + k, method23400);
                                                n2 = BlockPos.pack(method23398 + j, method23399 + k, method23400 - 1);
                                                break;
                                            }
                                            case 4: {
                                                n = BlockPos.pack(method23398 + j, method23399 + k, method23400 + 16 - 1);
                                                n2 = BlockPos.pack(method23398 + j, method23399 + k, method23400 + 16);
                                                break;
                                            }
                                            case 5: {
                                                n = BlockPos.pack(method23398, method23399 + j, method23400 + k);
                                                n2 = BlockPos.pack(method23398 - 1, method23399 + j, method23400 + k);
                                                break;
                                            }
                                            default: {
                                                n = BlockPos.pack(method23398 + 16 - 1, method23399 + j, method23400 + k);
                                                n2 = BlockPos.pack(method23398 + 16, method23399 + j, method23400 + k);
                                                break;
                                            }
                                        }
                                        class1890.method7320(n, n2, class1890.method7305(n, n2, class1890.method7302(n)), false);
                                        class1890.method7320(n2, n, class1890.method7305(n2, n, class1890.method7302(n2)), false);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            final ObjectIterator iterator5 = this.field10309.long2ObjectEntrySet().iterator();
            while (iterator5.hasNext()) {
                if (this.method7347(((Long2ObjectMap$Entry)iterator5.next()).getLongKey())) {
                    iterator5.remove();
                }
            }
        }
    }
    
    public void method7358(final long n) {
    }
    
    public void method7359(final long n) {
    }
    
    public void method7360(final long n, final boolean b) {
    }
    
    public void method7361(final long n, final boolean b) {
        if (!b) {
            this.field10310.remove(n);
        }
        else {
            this.field10310.add(n);
        }
    }
    
    public void method7362(final long n, final Class7281 class7281) {
        if (class7281 == null) {
            this.field10309.remove(n);
        }
        else {
            this.field10309.put(n, (Object)class7281);
        }
    }
    
    public void method7363(final long n, final boolean b) {
        final boolean contains = this.field10302.contains(n);
        if (!contains) {
            if (!b) {
                this.field10304.add(n);
                this.method7320(Long.MAX_VALUE, n, 0, true);
            }
        }
        if (contains) {
            if (b) {
                this.field10303.add(n);
                this.method7320(Long.MAX_VALUE, n, 2, false);
            }
        }
    }
    
    public void method7364() {
        if (this.method7323()) {
            this.method7324(Integer.MAX_VALUE);
        }
    }
    
    public void method7365() {
        if (!this.field10307.isEmpty()) {
            final Class7501<M> method23390 = ((Class7501<Class7501<M>>)this.field10306).method23390();
            method23390.method23400();
            this.field10305 = (M)method23390;
            this.field10307.clear();
        }
        if (!this.field10308.isEmpty()) {
            final LongIterator iterator = this.field10308.iterator();
            while (iterator.hasNext()) {
                this.field10301.method7420(this.field10300, Class353.method1092(iterator.nextLong()));
            }
            this.field10308.clear();
        }
    }
    
    static {
        field10298 = new Class7281();
        field10299 = Direction.values();
    }
}
