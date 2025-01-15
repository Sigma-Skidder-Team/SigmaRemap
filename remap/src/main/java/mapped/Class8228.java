// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.types.DynamicOps;
import java.util.List;
import java.util.Random;
import com.mojang.datafixers.Dynamic;

public abstract class Class8228
{
    private volatile Class261 field33791;
    
    public Class8228(final Class261 field33791) {
        this.field33791 = field33791;
    }
    
    public Class8228(final Dynamic<?> dynamic) {
        this.field33791 = Class261.method899(dynamic.get("projection").asString(Class261.field1247.method898()));
    }
    
    public abstract List<Class9038> method27253(final Class1795 p0, final BlockPos p1, final Class2052 p2, final Random p3);
    
    public abstract Class6997 method27254(final Class1795 p0, final BlockPos p1, final Class2052 p2);
    
    public abstract boolean method27255(final Class1795 p0, final Class1851 p1, final Class6346<?> p2, final BlockPos p3, final Class2052 p4, final Class6997 p5, final Random p6);
    
    public abstract Class7755 method27257();
    
    public void method27261(final Class1851 class1851, final Class9038 class1852, final BlockPos class1853, final Class2052 class1854, final Random random, final Class6997 class1855) {
    }
    
    public Class8228 method27262(final Class261 field33791) {
        this.field33791 = field33791;
        return this;
    }
    
    public Class261 method27263() {
        final Class261 field33791 = this.field33791;
        if (field33791 != null) {
            return field33791;
        }
        throw new IllegalStateException();
    }
    
    public abstract <T> Dynamic<T> method27258(final DynamicOps<T> p0);
    
    public <T> Dynamic<T> method27264(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.mergeInto(dynamicOps.mergeInto(this.method27258((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps).getValue(), dynamicOps.createString("element_type"), dynamicOps.createString(Class90.field234.method503(this.method27257()).toString())), dynamicOps.createString("projection"), dynamicOps.createString(this.field33791.method898())));
    }
    
    public int method27265() {
        return 1;
    }
}
