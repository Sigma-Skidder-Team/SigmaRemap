// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;

public class Class6929 implements Class6926
{
    public final int field27148;
    public final int field27149;
    public final int field27150;
    
    public Class6929(final int field27148, final int field27149, final int field27150) {
        this.field27148 = field27148;
        this.field27149 = field27149;
        this.field27150 = field27150;
    }
    
    @Override
    public <T> Dynamic<T> method21299(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic(dynamicOps, dynamicOps.createMap(ImmutableMap.of(dynamicOps.createString("count"), dynamicOps.createInt(this.field27148), dynamicOps.createString("baseline"), dynamicOps.createInt(this.field27149), dynamicOps.createString("spread"), dynamicOps.createInt(this.field27150))));
    }
    
    public static Class6929 method21303(final Dynamic<?> dynamic) {
        return new Class6929(dynamic.get("count").asInt(0), dynamic.get("baseline").asInt(0), dynamic.get("spread").asInt(0));
    }
}
