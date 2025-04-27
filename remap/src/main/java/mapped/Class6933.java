// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;

public class Class6933 implements Class6926
{
    public final Class2126 field27160;
    public final float field27161;
    
    public Class6933(final Class2126 field27160, final float field27161) {
        this.field27160 = field27160;
        this.field27161 = field27161;
    }
    
    @Override
    public <T> Dynamic<T> method21299(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic(dynamicOps, dynamicOps.createMap(ImmutableMap.of(dynamicOps.createString("step"), dynamicOps.createString(this.field27160.toString()), dynamicOps.createString("probability"), dynamicOps.createFloat(this.field27161))));
    }
    
    public static Class6933 method21307(final Dynamic<?> dynamic) {
        return new Class6933(Class2126.valueOf(dynamic.get("step").asString("")), dynamic.get("probability").asFloat(0.0f));
    }
}
