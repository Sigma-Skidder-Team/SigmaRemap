// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.nbt.INBT;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import java.util.HashMap;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import com.google.common.collect.Maps;
import com.mojang.datafixers.OptionalDynamic;
import java.io.IOException;
import com.mojang.datafixers.types.DynamicOps;
import javax.annotation.Nullable;
import java.util.function.BooleanSupplier;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.io.File;
import com.mojang.datafixers.DataFixer;
import java.util.function.Function;
import com.mojang.datafixers.Dynamic;
import java.util.function.BiFunction;
import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;
import java.util.Optional;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import org.apache.logging.log4j.Logger;

public class Class1882<R extends IDynamicSerializable> implements AutoCloseable
{
    private static final Logger field10241;
    private final Class1914 field10242;
    private final Long2ObjectMap<Optional<R>> field10243;
    private final LongLinkedOpenHashSet field10244;
    private final BiFunction<Runnable, Dynamic<?>, R> field10245;
    private final Function<Runnable, R> field10246;
    private final DataFixer field10247;
    private final Class1959 field10248;
    
    public Class1882(final File file, final BiFunction<Runnable, Dynamic<?>, R> field10245, final Function<Runnable, R> field10246, final DataFixer field10247, final Class1959 field10248) {
        this.field10243 = (Long2ObjectMap<Optional<R>>)new Long2ObjectOpenHashMap();
        this.field10244 = new LongLinkedOpenHashSet();
        this.field10245 = field10245;
        this.field10246 = field10246;
        this.field10247 = field10247;
        this.field10248 = field10248;
        this.field10242 = new Class1914(new Class1881(file), file.getName());
    }
    
    public void method7178(final BooleanSupplier booleanSupplier) {
        while (!this.field10244.isEmpty() && booleanSupplier.getAsBoolean()) {
            this.method7186(Class353.method1092(this.field10244.firstLong()).method1115());
        }
    }
    
    @Nullable
    public Optional<R> method7179(final long n) {
        return (Optional)this.field10243.get(n);
    }
    
    public Optional<R> method7180(final long n) {
        final Class353 method1092 = Class353.method1092(n);
        if (this.method7181(method1092)) {
            return Optional.empty();
        }
        final Optional<R> method1093 = this.method7179(n);
        if (method1093 != null) {
            return method1093;
        }
        this.method7183(method1092.method1115());
        final Optional<R> method1094 = this.method7179(n);
        if (method1094 != null) {
            return method1094;
        }
        throw Class8349.method27859(new IllegalStateException());
    }
    
    public boolean method7181(final Class353 class353) {
        return World.method6684(Class353.method1098(class353.method1103()));
    }
    
    public R method7182(final long n) {
        final Optional<R> method7180 = this.method7180(n);
        if (!method7180.isPresent()) {
            final IDynamicSerializable value = this.field10246.apply(() -> this.method7189(n2));
            this.field10243.put(n, (Object)Optional.of(value));
            return (R)value;
        }
        return method7180.get();
    }
    
    private void method7183(final Class7859 class7859) {
        this.method7185(class7859, (com.mojang.datafixers.types.DynamicOps<Class51>)Class8453.field34721, this.method7184(class7859));
    }
    
    @Nullable
    private Class51 method7184(final Class7859 class7859) {
        try {
            return this.field10242.method7557(class7859);
        }
        catch (final IOException ex) {
            Class1882.field10241.error("Error reading chunk {} data from disk", (Object)class7859, (Object)ex);
            return null;
        }
    }
    
    private <T> void method7185(final Class7859 class7859, final DynamicOps<T> dynamicOps, final T t) {
        if (t != null) {
            final Dynamic dynamic = new Dynamic((DynamicOps)dynamicOps, (Object)t);
            final int method7190 = method7190((Dynamic<?>)dynamic);
            final int worldVersion = Class9528.method35579().getWorldVersion();
            final boolean b = method7190 != worldVersion;
            final OptionalDynamic value = this.field10247.update(this.field10248.method7946(), dynamic, method7190, worldVersion).get("Sections");
            for (int i = 0; i < 16; ++i) {
                final long method7191 = Class353.method1090(class7859, i).method1117();
                final Optional map = value.get(Integer.toString(i)).get().map(dynamic2 -> this.field10245.apply(() -> this.method7189(n), (Dynamic<?>)dynamic2));
                this.field10243.put(method7191, (Object)map);
                map.ifPresent(p2 -> {
                    this.method7188(n2);
                    if (!(!b2)) {
                        this.method7189(n2);
                    }
                    return;
                });
            }
        }
        else {
            for (int j = 0; j < 16; ++j) {
                this.field10243.put(Class353.method1090(class7859, j).method1117(), (Object)Optional.empty());
            }
        }
    }
    
    private void method7186(final Class7859 class7859) {
        final INBT class7860 = (INBT)this.method7187(class7859, (com.mojang.datafixers.types.DynamicOps<Object>)Class8453.field34721).getValue();
        if (!(class7860 instanceof Class51)) {
            Class1882.field10241.error("Expected compound tag, got {}", (Object)class7860);
        }
        else {
            this.field10242.method7556(class7859, (Class51)class7860);
        }
    }
    
    private <T> Dynamic<T> method7187(final Class7859 class7859, final DynamicOps<T> dynamicOps) {
        final HashMap hashMap = Maps.newHashMap();
        for (int i = 0; i < 16; ++i) {
            final long method1117 = Class353.method1090(class7859, i).method1117();
            this.field10244.remove(method1117);
            final Optional optional = (Optional)this.field10243.get(method1117);
            if (optional != null) {
                if (optional.isPresent()) {
                    hashMap.put(dynamicOps.createString(Integer.toString(i)), ((IDynamicSerializable)optional.get()).serialize((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps));
                }
            }
        }
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("Sections"), dynamicOps.createMap((Map)hashMap), dynamicOps.createString("DataVersion"), dynamicOps.createInt(Class9528.method35579().getWorldVersion()))));
    }
    
    public void method7188(final long n) {
    }
    
    public void method7189(final long n) {
        final Optional optional = (Optional)this.field10243.get(n);
        if (optional != null && optional.isPresent()) {
            this.field10244.add(n);
        }
        else {
            Class1882.field10241.warn("No data for position: {}", (Object)Class353.method1092(n));
        }
    }
    
    private static int method7190(final Dynamic<?> dynamic) {
        return dynamic.get("DataVersion").asNumber().orElse(1945).intValue();
    }
    
    public void method7191(final Class7859 class7859) {
        if (!this.field10244.isEmpty()) {
            for (int i = 0; i < 16; ++i) {
                if (this.field10244.contains(Class353.method1090(class7859, i).method1117())) {
                    this.method7186(class7859);
                    return;
                }
            }
        }
    }
    
    @Override
    public void close() throws IOException {
        this.field10242.close();
    }
    
    static {
        field10241 = LogManager.getLogger();
    }
}
