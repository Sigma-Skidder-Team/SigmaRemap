// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import java.util.stream.Stream;
import com.mojang.datafixers.types.DynamicOps;
import javax.annotation.Nullable;
import com.mojang.datafixers.Dynamic;
import java.util.Collection;
import java.util.List;
import com.google.common.collect.ImmutableList;
import net.minecraft.util.math.BlockPos;

public class Class4106 extends Class4107
{
    public static final Class4106 field18207;
    public static final Class4106 field18208;
    public static final Class4106 field18209;
    private final ImmutableList<Block> field18210;
    
    public Class4106(final List<Block> list) {
        this.field18210 = (ImmutableList<Block>)ImmutableList.copyOf((Collection)list);
    }
    
    public Class4106(final Dynamic<?> dynamic) {
        this(dynamic.get("blocks").asList(dynamic2 -> BlockState.deserialize((com.mojang.datafixers.Dynamic<Object>)dynamic2).getBlock()));
    }
    
    @Nullable
    @Override
    public Class9038 method12350(final Class1852 class1852, final BlockPos class1853, final Class9038 class1854, final Class9038 class1855, final Class9092 class1856) {
        return this.field18210.contains(class1855.field38249.getBlock()) ? null : class1855;
    }
    
    @Override
    public Class7756 method12351() {
        return Class7756.field31692;
    }
    
    @Override
    public <T> Dynamic<T> method12352(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic(dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("blocks"), dynamicOps.createList((Stream)this.field18210.stream().map(class3833 -> BlockState.serialize(dynamicOps2, class3833.getDefaultState()).getValue())))));
    }
    
    static {
        field18207 = new Class4106((List<Block>)ImmutableList.of((Object) Blocks.STRUCTURE_BLOCK));
        field18208 = new Class4106((List<Block>)ImmutableList.of((Object) Blocks.AIR));
        field18209 = new Class4106((List<Block>)ImmutableList.of(Blocks.AIR, (Object) Blocks.STRUCTURE_BLOCK));
    }
}
