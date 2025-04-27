// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;

public class Class5132 implements Class5113
{
    public final double field22105;
    public final Class1964 field22106;
    
    public Class5132(final double field22105, final Class1964 field22106) {
        this.field22105 = field22105;
        this.field22106 = field22106;
    }
    
    @Override
    public <T> Dynamic<T> method16010(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic(dynamicOps, dynamicOps.createMap(ImmutableMap.of(dynamicOps.createString("probability"), dynamicOps.createDouble(this.field22105), dynamicOps.createString("type"), dynamicOps.createString(this.field22106.method7954()))));
    }
    
    public static <T> Class5132 method16041(final Dynamic<T> dynamic) {
        return new Class5132(dynamic.get("probability").asFloat(0.0f), Class1964.method7955(dynamic.get("type").asString("")));
    }
}
