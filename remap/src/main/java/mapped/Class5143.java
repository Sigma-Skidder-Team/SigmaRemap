// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.function.Function;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import java.util.function.IntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import net.minecraft.util.math.BlockPos;

import java.util.List;

public class Class5143 implements Class5113
{
    private final boolean field22130;
    private final List<Class9341> field22131;
    private final BlockPos field22132;
    
    public Class5143(final boolean field22130, final List<Class9341> field22131, final BlockPos field22132) {
        this.field22130 = field22130;
        this.field22131 = field22131;
        this.field22132 = field22132;
    }
    
    @Override
    public <T> Dynamic<T> method16010(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("crystalInvulnerable"), dynamicOps.createBoolean(this.field22130), dynamicOps.createString("spikes"), dynamicOps.createList((Stream)this.field22131.stream().map(class9341 -> class9341.method34625((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps2).getValue())), dynamicOps.createString("crystalBeamTarget"), (this.field22132 != null) ? dynamicOps.createList((Stream)IntStream.of(this.field22132.getX(), this.field22132.getY(), this.field22132.getZ()).mapToObj((IntFunction<?>)dynamicOps::createInt)) : dynamicOps.createList((Stream)Stream.empty()))));
    }
    
    public static <T> Class5143 method16057(final Dynamic<T> dynamic) {
        final List list = dynamic.get("spikes").asList((Function)Class9341::method34626);
        final List list2 = dynamic.get("crystalBeamTarget").asList(dynamic2 -> dynamic2.asInt(0));
        BlockPos class354;
        if (list2.size() != 3) {
            class354 = null;
        }
        else {
            class354 = new BlockPos(list2.get(0), list2.get(1), list2.get(2));
        }
        return new Class5143(dynamic.get("crystalInvulnerable").asBoolean(false), list, class354);
    }
    
    public boolean method16058() {
        return this.field22130;
    }
    
    public List<Class9341> method16059() {
        return this.field22131;
    }
    
    @Nullable
    public BlockPos method16060() {
        return this.field22132;
    }
}
