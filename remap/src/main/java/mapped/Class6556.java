// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Optional;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import java.util.UUID;

public class Class6556
{
    public final UUID field26044;
    public final Class100 field26045;
    public final int field26046;
    
    public Class6556(final UUID field26044, final Class100 field26045, final int field26046) {
        this.field26044 = field26044;
        this.field26045 = field26045;
        this.field26046 = field26046;
    }
    
    public int method19871() {
        return this.field26046 * this.field26045.field291;
    }
    
    @Override
    public String toString() {
        return "GossipEntry{target=" + this.field26044 + ", type=" + this.field26045 + ", value=" + this.field26046 + '}';
    }
    
    public <T> Dynamic<T> method19872(final DynamicOps<T> dynamicOps) {
        return Util.method27858("Target", this.field26044, (com.mojang.datafixers.Dynamic<T>)new Dynamic(dynamicOps, dynamicOps.createMap(ImmutableMap.of(dynamicOps.createString("Type"), dynamicOps.createString(this.field26045.field290), dynamicOps.createString("Value"), dynamicOps.createInt(this.field26046)))));
    }
    
    public static Optional<Class6556> method19873(final Dynamic<?> dynamic) {
        return dynamic.get("Type").asString().map(Class100::method583).flatMap(p1 -> Util.method27857("Target", (Dynamic<?>)dynamic2).flatMap(p2 -> dynamic3.get("Value").asNumber().map(n -> new Class6556(uuid, class100, n.intValue()))));
    }
}
