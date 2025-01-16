// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.Long2ByteMap$Entry;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.Long2IntMaps;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import net.minecraft.util.math.ChunkPos;

public class Class1895 extends Class1894
{
    private static String[] field10293;
    private int field10294;
    private final Long2IntMap field10295;
    private final LongSet field10296;
    public final /* synthetic */ Class8730 field10297;
    
    public Class1895(final Class8730 field10297, final int n) {
        this.field10297 = field10297;
        super(field10297, n);
        this.field10295 = Long2IntMaps.synchronize((Long2IntMap)new Long2IntOpenHashMap());
        this.field10296 = (LongSet)new LongOpenHashSet();
        this.field10294 = 0;
        this.field10295.defaultReturnValue(n + 2);
    }
    
    @Override
    public void method7331(final long n, final int n2, final int n3) {
        this.field10296.add(n);
    }
    
    public void method7334(final int field10294) {
        for (final Long2ByteMap$Entry long2ByteMap$Entry : this.field10290.long2ByteEntrySet()) {
            final byte byteValue = long2ByteMap$Entry.getByteValue();
            this.method7335(long2ByteMap$Entry.getLongKey(), byteValue, this.method7336(byteValue), byteValue <= field10294 - 2);
        }
        this.field10294 = field10294;
    }
    
    private void method7335(final long n, final int n2, final boolean b, final boolean b2) {
        if (b != b2) {
            final Class1949 class1949 = new Class1949((Class9105<Object>)Class9105.field38567, Class8730.method30154(), new ChunkPos(n));
            if (!b2) {
                Class8730.method30156(this.field10297).method5386(Class1910.method7465(() -> Class8730.method30158(this.field10297).execute(() -> Class8730.method30159(this.field10297, n3, class1950)), n, true));
            }
            else {
                Class8730.method30155(this.field10297).method5386(Class1910.method7463(() -> Class8730.method30158(this.field10297).execute(() -> {
                    if (!this.method7336(this.method7302(n4))) {
                        Class8730.method30156(this.field10297).method5386(Class1910.method7465(() -> {}, n4, false));
                    }
                    else {
                        Class8730.method30160(this.field10297, n4, class1951);
                        Class8730.method30161(this.field10297).add(n4);
                    }
                }), n, () -> n5));
            }
        }
    }
    
    @Override
    public void method7333() {
        super.method7333();
        if (!this.field10296.isEmpty()) {
            final LongIterator iterator = this.field10296.iterator();
            while (iterator.hasNext()) {
                final long nextLong = iterator.nextLong();
                final int value = this.field10295.get(nextLong);
                final int method7302 = this.method7302(nextLong);
                if (value == method7302) {
                    continue;
                }
                Class8730.method30157(this.field10297).method7468(new ChunkPos(nextLong), () -> this.field10295.get(n), method7302, n4 -> {
                    if (n4 < this.field10295.defaultReturnValue()) {
                        this.field10295.put(n3, n4);
                    }
                    else {
                        this.field10295.remove(n3);
                    }
                    return;
                });
                this.method7335(nextLong, method7302, this.method7336(value), this.method7336(method7302));
            }
            this.field10296.clear();
        }
    }
    
    private boolean method7336(final int n) {
        return n <= this.field10294 - 2;
    }
}
