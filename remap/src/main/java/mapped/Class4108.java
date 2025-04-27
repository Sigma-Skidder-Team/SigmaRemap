// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.types.DynamicOps;
import javax.annotation.Nullable;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;

public class Class4108 extends Class4107
{
    private final float field18211;
    
    public Class4108(final float field18211) {
        this.field18211 = field18211;
    }
    
    public Class4108(final Dynamic<?> dynamic) {
        this(dynamic.get("integrity").asFloat(1.0f));
    }
    
    @Nullable
    @Override
    public Class9038 method12350(final Class1852 class1852, final BlockPos class1853, final Class9038 class1854, final Class9038 class1855, final Class9092 class1856) {
        final Random method32858 = class1856.method32858(class1855.field38248);
        return (this.field18211 < 1.0f && method32858.nextFloat() > this.field18211) ? null : class1855;
    }
    
    @Override
    public Class7756 method12351() {
        return Class7756.field31693;
    }
    
    @Override
    public <T> Dynamic<T> method12352(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic(dynamicOps, dynamicOps.createMap(ImmutableMap.of(dynamicOps.createString("integrity"), dynamicOps.createFloat(this.field18211))));
    }
}
