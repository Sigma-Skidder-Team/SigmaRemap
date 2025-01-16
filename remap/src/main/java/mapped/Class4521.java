// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import java.util.Iterator;
import com.mojang.datafixers.types.DynamicOps;
import com.mojang.datafixers.Dynamic;
import com.google.common.collect.Lists;
import net.minecraft.nbt.INBT;

import java.util.List;

public abstract class Class4521 extends Class4473
{
    public final Class8228 field19936;
    public BlockPos field19937;
    private final int field19938;
    public final Class2052 field19939;
    private final List<Class9330> field19940;
    private final Class1795 field19941;
    
    public Class4521(final Class9520 class9520, final Class1795 field19941, final Class8228 field19942, final BlockPos field19943, final int field19944, final Class2052 field19945, final MutableBoundingBox field19946) {
        super(class9520, 0);
        this.field19940 = Lists.newArrayList();
        this.field19941 = field19941;
        this.field19936 = field19942;
        this.field19937 = field19943;
        this.field19938 = field19944;
        this.field19939 = field19945;
        this.field19849 = field19946;
    }
    
    public Class4521(final Class1795 field19941, final Class51 class51, final Class9520 class52) {
        super(class52, class51);
        this.field19940 = Lists.newArrayList();
        this.field19941 = field19941;
        this.field19937 = new BlockPos(class51.method319("PosX"), class51.method319("PosY"), class51.method319("PosZ"));
        this.field19938 = class51.method319("ground_level_delta");
        this.field19936 = Class7754.method24753((com.mojang.datafixers.Dynamic<Object>)new Dynamic((DynamicOps)Class8453.field34721, (Object)class51.method327("pool_element")), Registry.field234, "element_type", Class8230.field33794);
        this.field19939 = Class2052.valueOf(class51.method323("rotation"));
        this.field19849 = this.field19936.method27254(field19941, this.field19937, this.field19939);
        final Class52 method328 = class51.method328("junctions", 10);
        this.field19940.clear();
        method328.forEach(class53 -> this.field19940.add(Class9330.method34568((com.mojang.datafixers.Dynamic<Object>)new Dynamic((DynamicOps)Class8453.field34721, (Object)class53))));
    }
    
    @Override
    public void method13415(final Class51 class51) {
        class51.method298("PosX", this.field19937.getX());
        class51.method298("PosY", this.field19937.getY());
        class51.method298("PosZ", this.field19937.getZ());
        class51.method298("ground_level_delta", this.field19938);
        class51.method295("pool_element", (INBT)this.field19936.method27264((com.mojang.datafixers.types.DynamicOps<Object>)Class8453.field34721).getValue());
        class51.method306("rotation", this.field19939.name());
        final Class52 class52 = new Class52();
        final Iterator<Class9330> iterator = this.field19940.iterator();
        while (iterator.hasNext()) {
            class52.add((INBT)iterator.next().method34567((com.mojang.datafixers.types.DynamicOps<Object>)Class8453.field34721).getValue());
        }
        class51.method295("junctions", class52);
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final MutableBoundingBox class1853, final Class7859 class1854) {
        return this.field19936.method27255(this.field19941, class1851, class1852, this.field19937, this.field19939, class1853, random);
    }
    
    @Override
    public void method13454(final int n, final int n2, final int n3) {
        super.method13454(n, n2, n3);
        this.field19937 = this.field19937.add(n, n2, n3);
    }
    
    @Override
    public Class2052 method13457() {
        return this.field19939;
    }
    
    @Override
    public String toString() {
        return String.format("<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.field19937, this.field19939, this.field19936);
    }
    
    public Class8228 method13518() {
        return this.field19936;
    }
    
    public BlockPos method13519() {
        return this.field19937;
    }
    
    public int method13520() {
        return this.field19938;
    }
    
    public void method13521(final Class9330 class9330) {
        this.field19940.add(class9330);
    }
    
    public List<Class9330> method13522() {
        return this.field19940;
    }
}
