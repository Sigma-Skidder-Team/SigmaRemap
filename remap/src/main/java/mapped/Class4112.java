// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.types.DynamicOps;
import javax.annotation.Nullable;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;

public class Class4112 extends Class4107
{
    private final HeightmapType field18216;
    private final int field18217;
    
    public Class4112(final HeightmapType field18216, final int field18217) {
        this.field18216 = field18216;
        this.field18217 = field18217;
    }
    
    public Class4112(final Dynamic<?> dynamic) {
        this(HeightmapType.method8063(dynamic.get("heightmap").asString(HeightmapType.field11521.method8060())), dynamic.get("offset").asInt(0));
    }
    
    @Nullable
    @Override
    public Class9038 method12350(final Class1852 class1852, final BlockPos class1853, final Class9038 class1854, final Class9038 class1855, final Class9092 class1856) {
        return new Class9038(new BlockPos(class1855.field38248.getX(), class1852.method6699(this.field18216, class1855.field38248.getX(), class1855.field38248.getZ()) + this.field18217 + class1854.field38248.getY(), class1855.field38248.getZ()), class1855.field38249, class1855.field38250);
    }
    
    @Override
    public Class7756 method12351() {
        return Class7756.field31694;
    }
    
    @Override
    public <T> Dynamic<T> method12352(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic(dynamicOps, dynamicOps.createMap(ImmutableMap.of(dynamicOps.createString("heightmap"), dynamicOps.createString(this.field18216.method8060()), dynamicOps.createString("offset"), dynamicOps.createInt(this.field18217))));
    }
}
