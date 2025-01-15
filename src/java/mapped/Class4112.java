// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.types.DynamicOps;
import javax.annotation.Nullable;
import com.mojang.datafixers.Dynamic;

public class Class4112 extends Class4107
{
    private final Class2020 field18216;
    private final int field18217;
    
    public Class4112(final Class2020 field18216, final int field18217) {
        this.field18216 = field18216;
        this.field18217 = field18217;
    }
    
    public Class4112(final Dynamic<?> dynamic) {
        this(Class2020.method8063(dynamic.get("heightmap").asString(Class2020.field11521.method8060())), dynamic.get("offset").asInt(0));
    }
    
    @Nullable
    @Override
    public Class9038 method12350(final Class1852 class1852, final Class354 class1853, final Class9038 class1854, final Class9038 class1855, final Class9092 class1856) {
        return new Class9038(new Class354(class1855.field38248.method1074(), class1852.method6699(this.field18216, class1855.field38248.method1074(), class1855.field38248.method1076()) + this.field18217 + class1854.field38248.method1075(), class1855.field38248.method1076()), class1855.field38249, class1855.field38250);
    }
    
    @Override
    public Class7756 method12351() {
        return Class7756.field31694;
    }
    
    @Override
    public <T> Dynamic<T> method12352(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("heightmap"), dynamicOps.createString(this.field18216.method8060()), dynamicOps.createString("offset"), dynamicOps.createInt(this.field18217))));
    }
}
