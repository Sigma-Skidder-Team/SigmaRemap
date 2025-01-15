// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import java.util.stream.Stream;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import com.google.common.collect.Lists;
import java.util.List;

public class Class5135 implements Class5113
{
    public final Class7096 field22111;
    public final List<Class7096> field22112;
    public final List<Class7096> field22113;
    public final List<Class7096> field22114;
    
    public Class5135(final Class7096 field22111, final List<Class7096> field22112, final List<Class7096> field22113, final List<Class7096> field22114) {
        this.field22111 = field22111;
        this.field22112 = field22112;
        this.field22113 = field22113;
        this.field22114 = field22114;
    }
    
    public Class5135(final Class7096 class7096, final Class7096[] array, final Class7096[] array2, final Class7096[] array3) {
        this(class7096, Lists.newArrayList((Object[])array), Lists.newArrayList((Object[])array2), Lists.newArrayList((Object[])array3));
    }
    
    @Override
    public <T> Dynamic<T> method16010(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("to_place"), Class7096.method21763((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps, this.field22111).getValue(), dynamicOps.createString("place_on"), dynamicOps.createList((Stream)this.field22112.stream().map(class7096 -> Class7096.method21763((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps2, class7096).getValue())), dynamicOps.createString("place_in"), dynamicOps.createList((Stream)this.field22113.stream().map(class7097 -> Class7096.method21763((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps3, class7097).getValue())), dynamicOps.createString("place_under"), dynamicOps.createList((Stream)this.field22114.stream().map(class7098 -> Class7096.method21763((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps4, class7098).getValue())))));
    }
    
    public static <T> Class5135 method16045(final Dynamic<T> dynamic) {
        return new Class5135(dynamic.get("to_place").map((Function)Class7096::method21764).orElse(Class7521.field29147.method11878()), dynamic.get("place_on").asList((Function)Class7096::method21764), dynamic.get("place_in").asList((Function)Class7096::method21764), dynamic.get("place_under").asList((Function)Class7096::method21764));
    }
}
