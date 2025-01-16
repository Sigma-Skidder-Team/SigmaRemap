// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import net.minecraft.util.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

public interface IFluidState extends IStateHolder<IFluidState>
{
    Fluid method21779();
    
    default boolean method21780() {
        return this.method21779().method22163(this);
    }
    
    default boolean isEmpty() {
        return this.method21779().method22158();
    }
    
    default float method21782(final Class1855 class1855, final BlockPos class1856) {
        return this.method21779().method22160(this, class1855, class1856);
    }
    
    default float method21783() {
        return this.method21779().method22161(this);
    }
    
    default int method21784() {
        return this.method21779().method22164(this);
    }
    
    default boolean method21785(final Class1855 class1855, final BlockPos class1856) {
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                final BlockPos method1134 = class1856.add(i, 0, j);
                if (!class1855.method6702(method1134).method21779().method22165(this.method21779()) && !class1855.getBlockState(method1134).isOpaqueCube(class1855, method1134)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    default void method21786(final World class1847, final BlockPos class1848) {
        this.method21779().method22151(class1847, class1848, this);
    }
    
    default void method21787(final World class1847, final BlockPos class1848, final Random random) {
        this.method21779().method22150(class1847, class1848, this, random);
    }
    
    default boolean method21788() {
        return this.method21779().method22157();
    }
    
    default void method21789(final World class1847, final BlockPos class1848, final Random random) {
        this.method21779().method22152(class1847, class1848, this, random);
    }
    
    default Vec3d method21790(final Class1855 class1855, final BlockPos class1856) {
        return this.method21779().method22155(class1855, class1856, this);
    }
    
    default BlockState method21791() {
        return this.method21779().method22162(this);
    }
    
    @Nullable
    default Class6909 method21792() {
        return this.method21779().method22153();
    }
    
    default boolean method21793(final Class7909<Fluid> class7909) {
        return this.method21779().method22166(class7909);
    }
    
    default float method21794() {
        return this.method21779().method22159();
    }
    
    default boolean method21795(final Class1855 class1855, final BlockPos class1856, final Fluid class1857, final Direction class1858) {
        return this.method21779().method22154(this, class1855, class1856, class1857, class1858);
    }
    
    default <T> Dynamic<T> method21796(final DynamicOps<T> dynamicOps, final IFluidState IFluidState) {
        final ImmutableMap<IProperty<?>, Comparable<?>> method21776 = IFluidState.getValues();
        Object o;
        if (!method21776.isEmpty()) {
            o = dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("Name"), dynamicOps.createString(Registry.field206.getKey(IFluidState.method21779()).toString()), dynamicOps.createString("Properties"), dynamicOps.createMap((Map)method21776.entrySet().stream().map(entry -> Pair.of(dynamicOps2.createString(entry.getKey().getName()), dynamicOps2.createString(IStateHolder.getName((IProperty<Comparable>)entry.getKey(), (Comparable<?>)entry.getValue())))).collect(Collectors.toMap((Function<? super Object, ?>)Pair::getFirst, (Function<? super Object, ?>)Pair::getSecond)))));
        }
        else {
            o = dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("Name"), dynamicOps.createString(Registry.field206.getKey(IFluidState.method21779()).toString())));
        }
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, o);
    }
    
    default <T> IFluidState method21797(final Dynamic<T> dynamic) {
        final Fluid class7255 = Registry.field206.getOrDefault(new ResourceLocation(dynamic.getElement("Name").flatMap(dynamic.getOps()::getStringValue).orElse("minecraft:empty")));
        final Map map = dynamic.get("Properties").asMap(dynamic2 -> dynamic2.asString(""), dynamic3 -> dynamic3.asString(""));
        IFluidState method22148 = class7255.method22148();
        final StateContainer<Fluid, IFluidState> method22149 = class7255.method22146();
        for (final Map.Entry<String, String> entry : map.entrySet()) {
            final String s = entry.getKey();
            final IProperty method22150 = method22149.getProperty(s);
            if (method22150 == null) {
                continue;
            }
            method22148 = IStateHolder.withString(method22148, method22150, s, dynamic.toString(), (String)entry.getValue());
        }
        return method22148;
    }
    
    default VoxelShape method21798(final Class1855 class1855, final BlockPos class1856) {
        return this.method21779().method22167(this, class1855, class1856);
    }
}
