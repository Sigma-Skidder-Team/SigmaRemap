// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.types.DynamicOps;
import com.mojang.datafixers.Dynamic;

public class Class8562
{
    private static final int[] field35983;
    private final Class7611 field35984;
    private final Class9334 field35985;
    private final int field35986;
    
    public Class8562(final Class7611 field35984, final Class9334 field35985, final int b) {
        this.field35984 = field35984;
        this.field35985 = field35985;
        this.field35986 = Math.max(1, b);
    }
    
    public Class8562(final Dynamic<?> dynamic) {
        this(Registry.field239.getOrDefault(ResourceLocation.method7795(dynamic.get("type").asString(""))), Registry.field240.getOrDefault(ResourceLocation.method7795(dynamic.get("profession").asString(""))), dynamic.get("level").asInt(1));
    }
    
    public Class7611 method28780() {
        return this.field35984;
    }
    
    public Class9334 method28781() {
        return this.field35985;
    }
    
    public int method28782() {
        return this.field35986;
    }
    
    public Class8562 method28783(final Class7611 class7611) {
        return new Class8562(class7611, this.field35985, this.field35986);
    }
    
    public Class8562 method28784(final Class9334 class9334) {
        return new Class8562(this.field35984, class9334, this.field35986);
    }
    
    public Class8562 method28785(final int n) {
        return new Class8562(this.field35984, this.field35985, n);
    }
    
    public <T> T method28786(final DynamicOps<T> dynamicOps) {
        return (T)dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("type"), dynamicOps.createString(Registry.field239.getKey(this.field35984).toString()), dynamicOps.createString("profession"), dynamicOps.createString(Registry.field240.getKey(this.field35985).toString()), dynamicOps.createString("level"), dynamicOps.createInt(this.field35986)));
    }
    
    public static int method28787(final int n) {
        return method28789(n) ? Class8562.field35983[n - 1] : 0;
    }
    
    public static int method28788(final int n) {
        return method28789(n) ? Class8562.field35983[n] : 0;
    }
    
    public static boolean method28789(final int n) {
        return n >= 1 && n < 5;
    }
    
    static {
        field35983 = new int[] { 0, 10, 70, 150, 250 };
    }
}
