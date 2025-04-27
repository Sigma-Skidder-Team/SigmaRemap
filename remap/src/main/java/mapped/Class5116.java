// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import net.minecraft.util.math.BlockPos;

import java.util.Optional;

public class Class5116 implements Class5113
{
    private final Optional<BlockPos> field22064;
    private final boolean field22065;
    
    private Class5116(final Optional<BlockPos> field22064, final boolean field22065) {
        this.field22064 = field22064;
        this.field22065 = field22065;
    }
    
    public static Class5116 method16014(final BlockPos value, final boolean b) {
        return new Class5116(Optional.of(value), b);
    }
    
    public static Class5116 method16015() {
        return new Class5116(Optional.empty(), false);
    }
    
    public Optional<BlockPos> method16016() {
        return this.field22064;
    }
    
    public boolean method16017() {
        return this.field22065;
    }
    
    @Override
    public <T> Dynamic<T> method16010(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic(dynamicOps, this.field22064.map(class354 -> dynamicOps2.createMap((Map)ImmutableMap.of(dynamicOps2.createString("exit_x"), dynamicOps2.createInt(class354.getX()), dynamicOps2.createString("exit_y"), dynamicOps2.createInt(class354.getY()), dynamicOps2.createString("exit_z"), dynamicOps2.createInt(class354.getZ()), dynamicOps2.createString("exact"), dynamicOps2.createBoolean(this.field22065)))).orElse(dynamicOps.emptyMap()));
    }
    
    public static <T> Class5116 method16018(final Dynamic<T> dynamic) {
        return new Class5116(dynamic.get("exit_x").asNumber().flatMap(p1 -> dynamic2.get("exit_y").asNumber().flatMap(p2 -> dynamic3.get("exit_z").asNumber().map(n3 -> new BlockPos(n.intValue(), n2.intValue(), n3.intValue())))), dynamic.get("exact").asBoolean(false));
    }
}
