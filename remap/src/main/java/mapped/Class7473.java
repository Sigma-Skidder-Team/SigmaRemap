// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Collection;
import java.util.HashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap$Entry;
import com.google.common.collect.Maps;
import com.google.gson.JsonPrimitive;
import java.util.Map;
import com.google.gson.JsonObject;
import java.util.function.Function;
import java.util.Optional;
import java.util.Iterator;
import com.google.gson.JsonElement;
import com.google.gson.internal.Streams;
import java.io.Reader;
import com.google.gson.stream.JsonReader;
import java.io.StringReader;
import com.mojang.datafixers.DataFixer;
import java.util.HashSet;
import com.google.gson.JsonParseException;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import com.google.common.collect.Sets;
import java.util.Set;
import java.io.File;
import org.apache.logging.log4j.Logger;

public class Class7473 extends Class7474
{
    private static final Logger field28865;
    private final MinecraftServer field28866;
    private final File field28867;
    private final Set<Class9455<?>> field28868;
    private int field28869;
    
    public Class7473(final MinecraftServer field28866, final File field28867) {
        this.field28868 = Sets.newHashSet();
        this.field28869 = -300;
        this.field28866 = field28866;
        this.field28867 = field28867;
        if (field28867.isFile()) {
            try {
                this.method23077(field28866.method1564(), FileUtils.readFileToString(field28867));
            }
            catch (final IOException ex) {
                Class7473.field28865.error("Couldn't read statistics file {}", (Object)field28867, (Object)ex);
            }
            catch (final JsonParseException ex2) {
                Class7473.field28865.error("Couldn't parse statistics file {}", (Object)field28867, (Object)ex2);
            }
        }
    }
    
    public void method23074() {
        try {
            FileUtils.writeStringToFile(this.field28867, this.method23080());
        }
        catch (final IOException ex) {
            Class7473.field28865.error("Couldn't save stats", (Throwable)ex);
        }
    }
    
    @Override
    public void method23075(final PlayerEntity playerEntity, final Class9455<?> class513, final int n) {
        super.method23075(playerEntity, class513, n);
        this.field28868.add(class513);
    }
    
    private Set<Class9455<?>> method23076() {
        final HashSet hashSet = Sets.newHashSet((Iterable)this.field28868);
        this.field28868.clear();
        return hashSet;
    }
    
    public void method23077(final DataFixer dataFixer, final String s) {
        try (final JsonReader jsonReader = new JsonReader((Reader)new StringReader(s))) {
            jsonReader.setLenient(false);
            final JsonElement parse = Streams.parse(jsonReader);
            if (parse.isJsonNull()) {
                Class7473.field28865.error("Unable to parse Stat data from {}", (Object)this.field28867);
                return;
            }
            final Class51 method23079 = method23079(parse.getAsJsonObject());
            if (!method23079.method316("DataVersion", 99)) {
                method23079.method298("DataVersion", 1343);
            }
            final Class51 method23080 = Class9346.method34651(dataFixer, Class1959.field10681, method23079, method23079.method319("DataVersion"));
            if (method23080.method316("stats", 10)) {
                final Class51 method23081 = method23080.method327("stats");
                for (final String s2 : method23081.method293()) {
                    if (method23081.method316(s2, 10)) {
                        Class8349.method27855(Registry.field238.method506(new ResourceLocation(s2)), class52 -> {
                            class51.method327(s3);
                            final Class51 class53;
                            class53.method293().iterator();
                            final Iterator iterator2;
                            while (iterator2.hasNext()) {
                                final String s4 = iterator2.next();
                                if (!class53.method316(s4, 99)) {
                                    Class7473.field28865.warn("Invalid statistic value in {}: Don't know what {} is for key {}", (Object)this.field28867, (Object)class53.method313(s4), (Object)s4);
                                }
                                else {
                                    Class8349.method27855(this.method23078((Class2248<Object>)class52, s4), class55 -> this.field28871.put((Object)class55, class54.method319(s5)), () -> Class7473.field28865.warn("Invalid statistic in {}: Don't know what {} is", (Object)this.field28867, (Object)s6));
                                }
                            }
                            return;
                        }, () -> Class7473.field28865.warn("Invalid statistic type in {}: Don't know what {} is", (Object)this.field28867, (Object)s7));
                    }
                }
            }
        }
        catch (final IOException | JsonParseException ex) {
            Class7473.field28865.error("Unable to parse Stat data from {}", (Object)this.field28867, (Object)ex);
        }
    }
    
    private <T> Optional<Class9455<T>> method23078(final Class2248<T> class2248, final String s) {
        return Optional.ofNullable(ResourceLocation.method7795(s)).flatMap((Function<? super ResourceLocation, ? extends Optional<?>>)class2248.method8448()::method506).map((Function<? super Object, ? extends Class9455<T>>)class2248::method8449);
    }
    
    private static Class51 method23079(final JsonObject jsonObject) {
        final Class51 class51 = new Class51();
        for (final Map.Entry<K, JsonElement> entry : jsonObject.entrySet()) {
            final JsonElement jsonElement = entry.getValue();
            if (!jsonElement.isJsonObject()) {
                if (!jsonElement.isJsonPrimitive()) {
                    continue;
                }
                final JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
                if (!asJsonPrimitive.isNumber()) {
                    continue;
                }
                class51.method298((String)entry.getKey(), asJsonPrimitive.getAsInt());
            }
            else {
                class51.method295((String)entry.getKey(), method23079(jsonElement.getAsJsonObject()));
            }
        }
        return class51;
    }
    
    public String method23080() {
        final HashMap hashMap = Maps.newHashMap();
        for (final Object2IntMap$Entry object2IntMap$Entry : this.field28871.object2IntEntrySet()) {
            final Class9455 class9455 = (Class9455)object2IntMap$Entry.getKey();
            ((JsonObject)hashMap.computeIfAbsent(class9455.method35134(), p0 -> new JsonObject())).addProperty(method23081((Class9455<Object>)class9455).toString(), (Number)object2IntMap$Entry.getIntValue());
        }
        final JsonObject jsonObject = new JsonObject();
        for (final Map.Entry<Class2248<?>, V> entry : hashMap.entrySet()) {
            jsonObject.add(Registry.field238.getKey(entry.getKey()).toString(), (JsonElement)entry.getValue());
        }
        final JsonObject jsonObject2 = new JsonObject();
        jsonObject2.add("stats", (JsonElement)jsonObject);
        jsonObject2.addProperty("DataVersion", (Number)Class9528.method35579().getWorldVersion());
        return jsonObject2.toString();
    }
    
    private static <T> ResourceLocation method23081(final Class9455<T> class9455) {
        return class9455.method35134().method8448().getKey(class9455.method35135());
    }
    
    public void method23082() {
        this.field28868.addAll((Collection<? extends Class9455<?>>)this.field28871.keySet());
    }
    
    public void method23083(final Class513 class513) {
        final int method1545 = this.field28866.method1545();
        final Object2IntOpenHashMap object2IntOpenHashMap = new Object2IntOpenHashMap();
        if (method1545 - this.field28869 > 300) {
            this.field28869 = method1545;
            for (final Class9455 class514 : this.method23076()) {
                ((Object2IntMap)object2IntOpenHashMap).put((Object)class514, this.method23091(class514));
            }
        }
        class513.field3039.method17469(new Class4279((Object2IntMap<Class9455<?>>)object2IntOpenHashMap));
    }
    
    static {
        field28865 = LogManager.getLogger();
    }
}
