// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableMap$Builder;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;

public class Class9341
{
    private final int field40101;
    private final int field40102;
    private final int field40103;
    private final int field40104;
    private final boolean field40105;
    private final Class6221 field40106;
    
    public Class9341(final int field40101, final int field40102, final int field40103, final int field40104, final boolean field40105) {
        this.field40101 = field40101;
        this.field40102 = field40102;
        this.field40103 = field40103;
        this.field40104 = field40104;
        this.field40105 = field40105;
        this.field40106 = new Class6221(field40101 - field40103, 0.0, field40102 - field40103, field40101 + field40103, 256.0, field40102 + field40103);
    }
    
    public boolean method34618(final Class354 class354) {
        return class354.method1074() >> 4 == this.field40101 >> 4 && class354.method1076() >> 4 == this.field40102 >> 4;
    }
    
    public int method34619() {
        return this.field40101;
    }
    
    public int method34620() {
        return this.field40102;
    }
    
    public int method34621() {
        return this.field40103;
    }
    
    public int method34622() {
        return this.field40104;
    }
    
    public boolean method34623() {
        return this.field40105;
    }
    
    public Class6221 method34624() {
        return this.field40106;
    }
    
    public <T> Dynamic<T> method34625(final DynamicOps<T> dynamicOps) {
        final ImmutableMap$Builder builder = ImmutableMap.builder();
        builder.put(dynamicOps.createString("centerX"), dynamicOps.createInt(this.field40101));
        builder.put(dynamicOps.createString("centerZ"), dynamicOps.createInt(this.field40102));
        builder.put(dynamicOps.createString("radius"), dynamicOps.createInt(this.field40103));
        builder.put(dynamicOps.createString("height"), dynamicOps.createInt(this.field40104));
        builder.put(dynamicOps.createString("guarded"), dynamicOps.createBoolean(this.field40105));
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)builder.build()));
    }
    
    public static <T> Class9341 method34626(final Dynamic<T> dynamic) {
        return new Class9341(dynamic.get("centerX").asInt(0), dynamic.get("centerZ").asInt(0), dynamic.get("radius").asInt(0), dynamic.get("height").asInt(0), dynamic.get("guarded").asBoolean(false));
    }
}
