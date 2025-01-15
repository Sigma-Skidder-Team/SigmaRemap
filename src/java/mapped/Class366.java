// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;

public final class Class366 implements Class356
{
    private static String[] field2207;
    private final long field2208;
    
    private Class366(final long field2208) {
        this.field2208 = field2208;
    }
    
    public long method1238() {
        return this.field2208;
    }
    
    @Override
    public <T> T method1123(final DynamicOps<T> dynamicOps) {
        return (T)dynamicOps.createLong(this.field2208);
    }
    
    public static Class366 method1239(final Dynamic<?> dynamic) {
        return new Class366(dynamic.asNumber((Number)0).longValue());
    }
    
    public static Class366 method1240(final long n) {
        return new Class366(n);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.field2208 == ((Class366)o).field2208);
    }
    
    @Override
    public int hashCode() {
        return Long.hashCode(this.field2208);
    }
    
    @Override
    public String toString() {
        return Long.toString(this.field2208);
    }
}
