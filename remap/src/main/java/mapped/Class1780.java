// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import java.util.stream.Stream;
import java.util.Collection;
import java.util.Objects;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.HashMap;
import java.util.function.Function;
import com.google.gson.JsonParseException;
import com.google.common.collect.ImmutableMap$Builder;
import com.google.common.collect.Maps;
import com.google.gson.JsonObject;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import org.apache.logging.log4j.Logger;
import com.google.gson.Gson;

public class Class1780 extends Class1779
{
    private static final Gson field9883;
    private static final Logger field9879;
    private Map<Class8976<?>, Map<ResourceLocation, Class3662<?>>> field9884;
    private boolean field9885;
    
    public Class1780() {
        super(Class1780.field9883, "recipes");
        this.field9884 = (Map<Class8976<?>, Map<ResourceLocation, Class3662<?>>>)ImmutableMap.of();
    }
    
    public void method6377(final Map<ResourceLocation, JsonObject> map, final Class6582 class6582, final IProfiler class6583) {
        this.field9885 = false;
        final HashMap hashMap = Maps.newHashMap();
        for (final Map.Entry<ResourceLocation, V> entry : map.entrySet()) {
            final ResourceLocation class6584 = entry.getKey();
            try {
                final Class3662<?> method6385 = method6385(class6584, (JsonObject)entry.getValue());
                ((ImmutableMap$Builder)hashMap.computeIfAbsent(method6385.method11300(), p0 -> ImmutableMap.builder())).put((Object)class6584, (Object)method6385);
            }
            catch (final IllegalArgumentException | JsonParseException ex) {
                Class1780.field9879.error("Parsing error loading recipe {}", (Object)class6584, (Object)ex);
            }
        }
        this.field9884 = (Map)hashMap.entrySet().stream().collect(ImmutableMap.toImmutableMap((Function)Map.Entry::getKey, entry2 -> entry2.getValue().build()));
        Class1780.field9879.info("Loaded {} recipes", (Object)hashMap.size());
    }
    
    public <C extends Class446, T extends Class3662<C>> Optional<T> method6378(final Class8976<T> class8976, final C c, final World class8977) {
        return this.method6380(class8976).values().stream().flatMap(class8981 -> Class8349.method27854(class8978.method31918(class8981, class8979, class8980))).findFirst();
    }
    
    public <C extends Class446, T extends Class3662<C>> List<T> method6379(final Class8976<T> class8976, final C c, final World class8977) {
        return this.method6380(class8976).values().stream().flatMap(class8981 -> Class8349.method27854(class8978.method31918(class8981, class8979, class8980))).sorted(Comparator.comparing(class8982 -> class8982.method11292().method27649())).collect((Collector<? super Object, ?, List<T>>)Collectors.toList());
    }
    
    private <C extends Class446, T extends Class3662<C>> Map<ResourceLocation, Class3662<C>> method6380(final Class8976<T> key) {
        return (Map)this.field9884.getOrDefault(key, Collections.emptyMap());
    }
    
    public <C extends Class446, T extends Class3662<C>> Class2265<ItemStack> method6381(final Class8976<T> class8976, final C c, final World class8977) {
        final Optional<T> method6378 = this.method6378(class8976, c, class8977);
        if (!method6378.isPresent()) {
            final Class2265<ItemStack> method6379 = Class2265.method8507(c.method2239(), ItemStack.field34174);
            for (int i = 0; i < method6379.size(); ++i) {
                method6379.set(i, c.method2157(i));
            }
            return method6379;
        }
        return method6378.get().method11293(c);
    }
    
    public Optional<? extends Class3662<?>> method6382(final ResourceLocation class1932) {
        return (Optional<? extends Class3662<?>>)this.field9884.values().stream().map(map -> map.get(class1933)).filter(Objects::nonNull).findFirst();
    }
    
    public Collection<Class3662<?>> method6383() {
        return this.field9884.values().stream().flatMap(map -> map.values().stream()).collect((Collector<? super Object, ?, Collection<Class3662<?>>>)Collectors.toSet());
    }
    
    public Stream<ResourceLocation> method6384() {
        return this.field9884.values().stream().flatMap(map -> map.keySet().stream());
    }
    
    public static Class3662<?> method6385(final ResourceLocation class1932, final JsonObject jsonObject) {
        return Registry.field237.method506(new ResourceLocation(Class9583.method35895(jsonObject, "type"))).orElseThrow(() -> {
            new JsonSyntaxException("Invalid or unsupported recipe type '" + str + "'");
            return;
        }).method18179(class1932, jsonObject);
    }
    
    public void method6386(final Iterable<Class3662<?>> iterable) {
        this.field9885 = false;
        final HashMap hashMap = Maps.newHashMap();
        iterable.forEach(class3662 -> {
            if (map.computeIfAbsent(class3662.method11300(), p0 -> Maps.newHashMap()).put(class3662.method11298(), class3662) == null) {
                return;
            }
            else {
                new IllegalStateException("Duplicate recipe ignored with ID " + class3662.method11298());
                throw;
            }
        });
        this.field9884 = (Map<Class8976<?>, Map<ResourceLocation, Class3662<?>>>)ImmutableMap.copyOf((Map)hashMap);
    }
    
    static {
        field9883 = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        field9879 = LogManager.getLogger();
    }
}
