// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import java.util.function.Supplier;
import com.mojang.datafixers.DataFixUtils;
import java.nio.ByteBuffer;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import java.util.Set;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import com.mojang.datafixers.Dynamic;

public class Class9401
{
    private final Class95<Dynamic<?>> field40330;
    private Dynamic<?> field40331;
    private final Dynamic<?> field40332;
    private final boolean field40333;
    private final Int2ObjectMap<IntList> field40334;
    private final IntList field40335;
    public final int field40336;
    private final Set<Dynamic<?>> field40337;
    private final int[] field40338;
    
    public Class9401(final Dynamic<?> field40332) {
        this.field40330 = new Class95<Dynamic<?>>(32);
        this.field40334 = (Int2ObjectMap<IntList>)new Int2ObjectLinkedOpenHashMap();
        this.field40335 = (IntList)new IntArrayList();
        this.field40337 = Sets.newIdentityHashSet();
        this.field40338 = new int[4096];
        this.field40331 = (Dynamic<?>)field40332.emptyList();
        this.field40332 = field40332;
        this.field40336 = field40332.get("Y").asInt(0);
        this.field40333 = field40332.get("Blocks").get().isPresent();
    }
    
    public Dynamic<?> method34934(final int n) {
        if (n >= 0 && n <= 4095) {
            final Dynamic dynamic = this.field40330.method499(this.field40338[n]);
            return (Dynamic<?>)((dynamic != null) ? dynamic : Class9251.method34121());
        }
        return (Dynamic<?>)Class9251.method34121();
    }
    
    public void method34935(final int n, final Dynamic<?> dynamic) {
        if (this.field40337.add(dynamic)) {
            this.field40331 = (Dynamic<?>)this.field40331.merge("%%FILTER_ME%%".equals(Class9251.method34109(dynamic)) ? Class9251.method34121() : dynamic);
        }
        this.field40338[n] = Class9251.method34111(this.field40330, dynamic);
    }
    
    public int method34936(int n) {
        if (this.field40333) {
            final ByteBuffer byteBuffer = this.field40332.get("Blocks").asByteBufferOpt().get();
            final Class9318 class9318 = this.field40332.get("Data").asByteBufferOpt().map(byteBuffer2 -> new Class9318(DataFixUtils.toArray(byteBuffer2))).orElseGet(Class9318::new);
            final Class9318 class9319 = this.field40332.get("Add").asByteBufferOpt().map(byteBuffer3 -> new Class9318(DataFixUtils.toArray(byteBuffer3))).orElseGet(Class9318::new);
            this.field40337.add((Dynamic<?>)Class9251.method34121());
            Class9251.method34111(this.field40330, (Dynamic<?>)Class9251.method34121());
            this.field40331 = (Dynamic<?>)this.field40331.merge(Class9251.method34121());
            for (int i = 0; i < 4096; ++i) {
                final int n2 = i & 0xF;
                final int n3 = i >> 8 & 0xF;
                final int n4 = i >> 4 & 0xF;
                final int n5 = class9319.method34497(n2, n3, n4) << 12 | (byteBuffer.get(i) & 0xFF) << 4 | class9318.method34497(n2, n3, n4);
                if (Class9251.method34122().get(n5 >> 4)) {
                    this.method34937(n5 >> 4, i);
                }
                if (Class9251.method34123().get(n5 >> 4)) {
                    final int method34113 = Class9251.method34113(n2 == 0, n2 == 15, n4 == 0, n4 == 15);
                    if (method34113 != 0) {
                        n |= method34113;
                    }
                    else {
                        this.field40335.add(i);
                    }
                }
                this.method34935(i, Class7922.method25672(n5));
            }
            return n;
        }
        return n;
    }
    
    private void method34937(final int n, final int n2) {
        Object o = this.field40334.get(n);
        if (o == null) {
            o = new IntArrayList();
            this.field40334.put(n, o);
        }
        ((IntList)o).add(n2);
    }
    
    public Dynamic<?> method34938() {
        final Dynamic<?> field40332 = this.field40332;
        if (this.field40333) {
            final Dynamic set = field40332.set("Palette", (Dynamic)this.field40331);
            final Class9217 class9217 = new Class9217(Math.max(4, DataFixUtils.ceillog2(this.field40337.size())), 4096);
            for (int i = 0; i < this.field40338.length; ++i) {
                class9217.method33926(i, this.field40338[i]);
            }
            return (Dynamic<?>)set.set("BlockStates", set.createLongList(Arrays.stream(class9217.method33928()))).remove("Blocks").remove("Data").remove("Add");
        }
        return field40332;
    }
}
