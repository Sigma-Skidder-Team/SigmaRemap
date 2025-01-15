// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.types.DynamicOps;
import java.util.Optional;
import com.google.common.collect.Sets;
import org.apache.logging.log4j.util.Supplier;
import java.util.stream.Stream;
import java.util.function.Predicate;
import com.mojang.datafixers.Dynamic;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Set;
import java.util.Map;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import org.apache.logging.log4j.Logger;

public class Class364 implements IDynamicSerializable
{
    private static final Logger field2193;
    private final Short2ObjectMap<Class377> field2194;
    private final Map<Class8912, Set<Class377>> field2195;
    private final Runnable field2196;
    private boolean field2197;
    
    public Class364(final Runnable field2196) {
        this.field2194 = (Short2ObjectMap<Class377>)new Short2ObjectOpenHashMap();
        this.field2195 = Maps.newHashMap();
        this.field2196 = field2196;
        this.field2197 = true;
    }
    
    public <T> Class364(final Runnable field2196, final Dynamic<T> dynamic) {
        this.field2194 = (Short2ObjectMap<Class377>)new Short2ObjectOpenHashMap();
        this.field2195 = Maps.newHashMap();
        this.field2196 = field2196;
        try {
            this.field2197 = dynamic.get("Valid").asBoolean(false);
            dynamic.get("Records").asStream().forEach(dynamic2 -> this.method1176(new Class377((Dynamic<T>)dynamic2, runnable)));
        }
        catch (final Exception ex) {
            Class364.field2193.error("Failed to load POI chunk", (Throwable)ex);
            this.method1182();
            this.field2197 = false;
        }
    }
    
    public Stream<Class377> method1174(final Predicate<Class8912> predicate, final Class2045 class2045) {
        return this.field2195.entrySet().stream().filter(entry -> predicate2.test(entry.getKey())).flatMap(entry2 -> entry2.getValue().stream()).filter(class2045.method8130());
    }
    
    public void method1175(final BlockPos class354, final Class8912 class355) {
        if (this.method1176(new Class377(class354, class355, this.field2196))) {
            Class364.field2193.debug("Added POI of type {} @ {}", new Supplier[] { () -> class355, () -> class354 });
            this.field2196.run();
        }
    }
    
    private boolean method1176(final Class377 class377) {
        final BlockPos method1259 = class377.method1259();
        final Class8912 method1260 = class377.method1260();
        final short method1261 = Class353.method1097(method1259);
        final Class377 class378 = (Class377)this.field2194.get(method1261);
        if (class378 == null) {
            this.field2194.put(method1261, (Object)class377);
            this.field2195.computeIfAbsent(method1260, p0 -> Sets.newHashSet()).add(class377);
            return true;
        }
        if (!method1260.equals(class378.method1260())) {
            throw Class8349.method27859(new IllegalStateException("POI data mismatch: already registered at " + method1259));
        }
        return false;
    }
    
    public void method1177(final BlockPos obj) {
        final Class377 class377 = (Class377)this.field2194.remove(Class353.method1097(obj));
        if (class377 != null) {
            this.field2195.get(class377.method1260()).remove(class377);
            Class364.field2193.debug("Removed POI of type {} @ {}", new Supplier[] { class377::method1260, class377::method1259 });
            this.field2196.run();
        }
        else {
            Class364.field2193.error("POI data mismatch: never registered at " + obj);
        }
    }
    
    public boolean method1178(final BlockPos obj) {
        final Class377 class377 = (Class377)this.field2194.get(Class353.method1097(obj));
        if (class377 != null) {
            final boolean method1256 = class377.method1256();
            this.field2196.run();
            return method1256;
        }
        throw Class8349.method27859(new IllegalStateException("POI never registered at " + obj));
    }
    
    public boolean method1179(final BlockPos class354, final Predicate<Class8912> predicate) {
        final Class377 class355 = (Class377)this.field2194.get(Class353.method1097(class354));
        return class355 != null && predicate.test(class355.method1260());
    }
    
    public Optional<Class8912> method1180(final BlockPos class354) {
        final Class377 class355 = (Class377)this.field2194.get(Class353.method1097(class354));
        return (class355 == null) ? Optional.empty() : Optional.of(class355.method1260());
    }
    
    @Override
    public <T> T serialize(final DynamicOps<T> dynamicOps) {
        return (T)dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("Records"), dynamicOps.createList((Stream)this.field2194.values().stream().map(class377 -> class377.serialize((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps2))), dynamicOps.createString("Valid"), dynamicOps.createBoolean(this.field2197)));
    }
    
    public void method1181(final Consumer<BiConsumer<BlockPos, Class8912>> consumer) {
        if (!this.field2197) {
            final Short2ObjectOpenHashMap short2ObjectOpenHashMap = new Short2ObjectOpenHashMap((Short2ObjectMap)this.field2194);
            this.method1182();
            consumer.accept((class354, p2) -> this.method1176((Class377)short2ObjectMap.computeIfAbsent(Class353.method1097(class354), p2 -> new Class377(class355, class356, this.field2196))));
            this.field2197 = true;
            this.field2196.run();
        }
    }
    
    private void method1182() {
        this.field2194.clear();
        this.field2195.clear();
    }
    
    public boolean method1183() {
        return this.field2197;
    }
    
    static {
        field2193 = LogManager.getLogger();
    }
}
