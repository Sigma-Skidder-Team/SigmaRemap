// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Objects;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.types.DynamicOps;
import java.util.function.Function;
import com.mojang.datafixers.Dynamic;

public class Class377 implements IDynamicSerializable
{
    private final BlockPos field2216;
    private final Class8912 field2217;
    private int field2218;
    private final Runnable field2219;
    
    private Class377(final BlockPos class354, final Class8912 field2217, final int field2218, final Runnable field2219) {
        this.field2216 = class354.toImmutable();
        this.field2217 = field2217;
        this.field2218 = field2218;
        this.field2219 = field2219;
    }
    
    public Class377(final BlockPos class354, final Class8912 class355, final Runnable runnable) {
        this(class354, class355, class355.method31395(), runnable);
    }
    
    public <T> Class377(final Dynamic<T> dynamic, final Runnable runnable) {
        this(dynamic.get("pos").map((Function) BlockPos::deserialize).orElse(new BlockPos(0, 0, 0)), Class90.field241.method505(new Class1932(dynamic.get("type").asString(""))), dynamic.get("free_tickets").asInt(0), runnable);
    }
    
    @Override
    public <T> T serialize(final DynamicOps<T> dynamicOps) {
        return (T)dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("pos"), this.field2216.serialize((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps), dynamicOps.createString("type"), dynamicOps.createString(Class90.field241.method503(this.field2217).toString()), dynamicOps.createString("free_tickets"), dynamicOps.createInt(this.field2218)));
    }
    
    public boolean method1255() {
        if (this.field2218 > 0) {
            --this.field2218;
            this.field2219.run();
            return true;
        }
        return false;
    }
    
    public boolean method1256() {
        if (this.field2218 < this.field2217.method31395()) {
            ++this.field2218;
            this.field2219.run();
            return true;
        }
        return false;
    }
    
    public boolean method1257() {
        return this.field2218 > 0;
    }
    
    public boolean method1258() {
        return this.field2218 != this.field2217.method31395();
    }
    
    public BlockPos method1259() {
        return this.field2216;
    }
    
    public Class8912 method1260() {
        return this.field2217;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && Objects.equals(this.field2216, ((Class377)o).field2216));
    }
    
    @Override
    public int hashCode() {
        return this.field2216.hashCode();
    }
}
