// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.types.DynamicOps;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;

public class Class8229 extends Class8228
{
    private final Class8530<?, ?> field33792;
    private final CompoundNBT field33793;
    
    @Deprecated
    public Class8229(final Class8530<?, ?> class8530) {
        this(class8530, Class261.field1247);
    }
    
    public Class8229(final Class8530<?, ?> field33792, final Class261 class261) {
        super(class261);
        this.field33792 = field33792;
        this.field33793 = this.method27266();
    }
    
    public <T> Class8229(final Dynamic<T> dynamic) {
        super(dynamic);
        this.field33792 = Class8530.method28614((com.mojang.datafixers.Dynamic<Object>)dynamic.get("feature").orElseEmptyMap());
        this.field33793 = this.method27266();
    }
    
    public CompoundNBT method27266() {
        final CompoundNBT class51 = new CompoundNBT();
        class51.putString("target_pool", "minecraft:empty");
        class51.putString("attachement_type", "minecraft:bottom");
        class51.putString("final_state", "minecraft:air");
        return class51;
    }
    
    public BlockPos method27267(final Class1795 class1795, final Class2052 class1796) {
        return BlockPos.ZERO;
    }
    
    @Override
    public List<Class9038> method27253(final Class1795 class1795, final BlockPos class1796, final Class2052 class1797, final Random random) {
        final ArrayList arrayList = Lists.newArrayList();
        arrayList.add(new Class9038(class1796, ((StateHolder<O, BlockState>) Blocks.JIGSAW.getDefaultState()).with((IProperty<Comparable>)Class3839.field17415, Direction.DOWN), this.field33793));
        return arrayList;
    }
    
    @Override
    public MutableBoundingBox method27254(final Class1795 class1795, final BlockPos class1796, final Class2052 class1797) {
        final BlockPos method27267 = this.method27267(class1795, class1797);
        return new MutableBoundingBox(class1796.getX(), class1796.getY(), class1796.getZ(), class1796.getX() + method27267.getX(), class1796.getY() + method27267.getY(), class1796.getZ() + method27267.getZ());
    }
    
    @Override
    public boolean method27255(final Class1795 class1795, final Class1851 class1796, final Class6346<?> class1797, final BlockPos class1798, final Class2052 class1799, final MutableBoundingBox class1800, final Random random) {
        return this.field33792.method28613(class1796, class1797, random, class1798);
    }
    
    @Override
    public <T> Dynamic<T> method27258(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic(dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("feature"), this.field33792.method28612((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps).getValue())));
    }
    
    @Override
    public Class7755 method27257() {
        return Class7755.field31690;
    }
    
    @Override
    public String toString() {
        return "Feature[" + Registry.field215.getKey(this.field33792.field35804) + "]";
    }
}
