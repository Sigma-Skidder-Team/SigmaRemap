// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Supplier;
import com.google.common.collect.ImmutableMap$Builder;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import java.util.List;

public class Class5129 extends Class5127
{
    public final Class378 field22086;
    public final int field22087;
    public final int field22088;
    public final int field22089;
    public final int field22090;
    public final int field22091;
    public final int field22092;
    public final int field22093;
    public final int field22094;
    public final int field22095;
    public final boolean field22096;
    
    public Class5129(final Class357 class357, final Class357 class358, final Class378 field22086, final List<Class367> list, final int n, final int field22087, final int field22088, final int field22089, final int field22090, final int field22091, final int field22092, final int field22093, final int field22094, final int field22095, final boolean field22096) {
        super(class357, class358, list, n);
        this.field22086 = field22086;
        this.field22087 = field22087;
        this.field22088 = field22088;
        this.field22089 = field22089;
        this.field22090 = field22090;
        this.field22091 = field22091;
        this.field22092 = field22092;
        this.field22093 = field22093;
        this.field22094 = field22094;
        this.field22095 = field22095;
        this.field22096 = field22096;
    }
    
    @Override
    public <T> Dynamic<T> method16010(final DynamicOps<T> dynamicOps) {
        final ImmutableMap$Builder builder = ImmutableMap.builder();
        builder.put(dynamicOps.createString("foliage_placer"), this.field22086.method1123((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps)).put(dynamicOps.createString("height_rand_a"), dynamicOps.createInt(this.field22087)).put(dynamicOps.createString("height_rand_b"), dynamicOps.createInt(this.field22088)).put(dynamicOps.createString("trunk_height"), dynamicOps.createInt(this.field22089)).put(dynamicOps.createString("trunk_height_random"), dynamicOps.createInt(this.field22090)).put(dynamicOps.createString("trunk_top_offset"), dynamicOps.createInt(this.field22091)).put(dynamicOps.createString("trunk_top_offset_random"), dynamicOps.createInt(this.field22092)).put(dynamicOps.createString("foliage_height"), dynamicOps.createInt(this.field22093)).put(dynamicOps.createString("foliage_height_random"), dynamicOps.createInt(this.field22094)).put(dynamicOps.createString("max_water_depth"), dynamicOps.createInt(this.field22095)).put(dynamicOps.createString("ignore_vines"), dynamicOps.createBoolean(this.field22096));
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)builder.build())).merge((Dynamic)super.method16010((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps));
    }
    
    public static <T> Class5129 method16037(final Dynamic<T> dynamic) {
        final Class5127 method16033 = Class5127.method16033((com.mojang.datafixers.Dynamic<Object>)dynamic);
        return new Class5129(method16033.field22079, method16033.field22080, Class90.field220.method505(new Class1932(dynamic.get("foliage_placer").get("type").asString().orElseThrow(RuntimeException::new))).method25767((Dynamic<?>)dynamic.get("foliage_placer").orElseEmptyMap()), method16033.field22081, method16033.field22082, dynamic.get("height_rand_a").asInt(0), dynamic.get("height_rand_b").asInt(0), dynamic.get("trunk_height").asInt(-1), dynamic.get("trunk_height_random").asInt(0), dynamic.get("trunk_top_offset").asInt(0), dynamic.get("trunk_top_offset_random").asInt(0), dynamic.get("foliage_height").asInt(-1), dynamic.get("foliage_height_random").asInt(0), dynamic.get("max_water_depth").asInt(0), dynamic.get("ignore_vines").asBoolean(false));
    }
}
