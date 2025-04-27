// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.world.dimension;

import com.mojang.datafixers.types.DynamicOps;
import javax.annotation.Nullable;
import java.io.File;
import com.mojang.datafixers.Dynamic;
import mapped.*;
import net.minecraft.world.World;

import java.util.function.BiFunction;

public class DimensionType implements IDynamicSerializable
{
    public static final DimensionType field2223;
    public static final DimensionType field2224;
    public static final DimensionType field2225;
    private final int field2226;
    private final String field2227;
    private final String field2228;
    private final BiFunction<World, DimensionType, ? extends Dimension> field2229;
    private final boolean field2230;
    private final Class2178 field2231;
    
    private static DimensionType method1267(final String s, final DimensionType class383) {
        return Registry.method513(Registry.field226, class383.field2226, s, class383);
    }
    
    public DimensionType(final int field2226, final String field2227, final String field2228, final BiFunction<World, DimensionType, ? extends Dimension> field2229, final boolean field2230, final Class2178 field2231) {
        this.field2226 = field2226;
        this.field2227 = field2227;
        this.field2228 = field2228;
        this.field2229 = field2229;
        this.field2230 = field2230;
        this.field2231 = field2231;
    }
    
    public static DimensionType method1268(final Dynamic<?> dynamic) {
        return Registry.field226.getOrDefault(new ResourceLocation(dynamic.asString("")));
    }
    
    public static Iterable<DimensionType> method1269() {
        return Registry.field226;
    }
    
    public int method1270() {
        return this.field2226 - 1;
    }
    
    public String method1271() {
        return this.field2227;
    }
    
    public File method1272(final File parent) {
        return this.field2228.isEmpty() ? parent : new File(parent, this.field2228);
    }
    
    public Dimension create(final World class1847) {
        return this.field2229.apply(class1847, this);
    }
    
    @Override
    public String toString() {
        return method1276(this).toString();
    }
    
    @Nullable
    public static DimensionType method1274(final int n) {
        return Registry.field226.method499(n + 1);
    }
    
    @Nullable
    public static DimensionType method1275(final ResourceLocation class1932) {
        return Registry.field226.getOrDefault(class1932);
    }
    
    @Nullable
    public static ResourceLocation method1276(final DimensionType class383) {
        return Registry.field226.getKey(class383);
    }
    
    public boolean method1277() {
        return this.field2230;
    }
    
    public Class2178 getMagnifier() {
        return this.field2231;
    }
    
    @Override
    public <T> T serialize(final DynamicOps<T> dynamicOps) {
        return dynamicOps.createString(Registry.field226.getKey(this).toString());
    }
    
    static {
        field2223 = method1267("overworld", new DimensionType(1, DimensionType.\ua0dd\u8365\u7b4d\ub23a\u94c8\ucb49[0], DimensionType.\ua0dd\u8365\u7b4d\ub23a\u94c8\ucb49[0], Class6736::new, true, Class2179.field12911));
        field2224 = method1267("the_nether", new DimensionType(0, "_nether", "DIM-1", Class6739::new, false, Class2177.field12908));
        field2225 = method1267("the_end", new DimensionType(2, "_end", "DIM1", Class6738::new, false, Class2177.field12908));
    }
}
