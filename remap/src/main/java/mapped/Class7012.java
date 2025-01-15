// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.reflect.Type;
import com.google.gson.GsonBuilder;
import org.apache.logging.log4j.LogManager;
import java.util.LinkedHashSet;
import java.util.HashMap;
import java.io.OutputStreamWriter;
import com.google.common.base.Charsets;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Comparator;
import java.util.List;
import com.google.gson.JsonParseException;
import com.google.gson.JsonElement;
import com.mojang.datafixers.types.DynamicOps;
import com.mojang.datafixers.Dynamic;
import com.google.gson.internal.Streams;
import com.mojang.datafixers.types.JsonOps;
import java.io.Reader;
import com.google.gson.stream.JsonReader;
import java.io.StringReader;
import com.google.common.io.Files;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.Iterator;
import com.google.common.collect.Sets;
import com.google.common.collect.Maps;
import java.util.Set;
import java.io.File;
import java.util.Map;
import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;
import org.apache.logging.log4j.Logger;

public class Class7012
{
    private static final Logger field27332;
    private static final Gson field27333;
    private static final TypeToken<Map<Class1932, Class348>> field27334;
    private final MinecraftServer field27335;
    private final File field27336;
    private final Map<Class8863, Class348> field27337;
    private final Set<Class8863> field27338;
    private final Set<Class8863> field27339;
    private final Set<Class8863> field27340;
    private Class513 field27341;
    private Class8863 field27342;
    private boolean field27343;
    
    public Class7012(final MinecraftServer field27335, final File field27336, final Class513 field27337) {
        this.field27337 = Maps.newLinkedHashMap();
        this.field27338 = Sets.newLinkedHashSet();
        this.field27339 = Sets.newLinkedHashSet();
        this.field27340 = Sets.newLinkedHashSet();
        this.field27343 = true;
        this.field27335 = field27335;
        this.field27336 = field27336;
        this.field27341 = field27337;
        this.method21462();
    }
    
    public void method21456(final Class513 field27341) {
        this.field27341 = field27341;
    }
    
    public void method21457() {
        final Iterator<? extends Class4640<?>> iterator = Class7770.method24879().iterator();
        while (iterator.hasNext()) {
            ((Class4640)iterator.next()).method13725(this);
        }
    }
    
    public void method21458() {
        this.method21457();
        this.field27337.clear();
        this.field27338.clear();
        this.field27339.clear();
        this.field27340.clear();
        this.field27343 = true;
        this.field27342 = null;
        this.method21462();
    }
    
    private void method21459() {
        final Iterator<Class8863> iterator = this.field27335.method1566().method6399().iterator();
        while (iterator.hasNext()) {
            this.method21466(iterator.next());
        }
    }
    
    private void method21460() {
        final ArrayList arrayList = Lists.newArrayList();
        for (final Map.Entry<K, Class348> entry : this.field27337.entrySet()) {
            if (!entry.getValue().method1031()) {
                continue;
            }
            arrayList.add(entry.getKey());
            this.field27340.add((Class8863)entry.getKey());
        }
        final Iterator iterator2 = arrayList.iterator();
        while (iterator2.hasNext()) {
            this.method21472((Class8863)iterator2.next());
        }
    }
    
    private void method21461() {
        for (final Class8863 class8863 : this.field27335.method1566().method6399()) {
            if (!class8863.method31039().isEmpty()) {
                continue;
            }
            this.method21464(class8863, "");
            class8863.method31037().method32433(this.field27341);
        }
    }
    
    private void method21462() {
        if (this.field27336.isFile()) {
            try (final JsonReader jsonReader = new JsonReader((Reader)new StringReader(Files.toString(this.field27336, StandardCharsets.UTF_8)))) {
                jsonReader.setLenient(false);
                Dynamic set = new Dynamic((DynamicOps)JsonOps.INSTANCE, (Object)Streams.parse(jsonReader));
                if (!set.get("DataVersion").asNumber().isPresent()) {
                    set = set.set("DataVersion", set.createInt(1343));
                }
                final Map map = (Map)Class7012.field27333.getAdapter((TypeToken)Class7012.field27334).fromJsonTree((JsonElement)this.field27335.method1564().update(Class1959.field10683.method7946(), set, set.get("DataVersion").asInt(0), Class9528.method35579().getWorldVersion()).remove("DataVersion").getValue());
                if (map == null) {
                    throw new JsonParseException("Found null for advancements");
                }
                for (final Map.Entry<Class1932, V> entry : (List<Object>)map.entrySet().stream().sorted(Comparator.comparing((Function<? super T, ? extends Comparable>)Map.Entry::getValue)).collect(Collectors.toList())) {
                    final Class8863 method6398 = this.field27335.method1566().method6398(entry.getKey());
                    if (method6398 == null) {
                        Class7012.field27332.warn("Ignored advancement '{}' in progress file {} - it doesn't exist anymore?", (Object)entry.getKey(), (Object)this.field27336);
                    }
                    else {
                        this.method21471(method6398, (Class348)entry.getValue());
                    }
                }
            }
            catch (final JsonParseException ex) {
                Class7012.field27332.error("Couldn't parse player advancements in {}", (Object)this.field27336, (Object)ex);
            }
            catch (final IOException ex2) {
                Class7012.field27332.error("Couldn't access player advancements in {}", (Object)this.field27336, (Object)ex2);
            }
        }
        this.method21461();
        this.method21460();
        this.method21459();
    }
    
    public void method21463() {
        final HashMap hashMap = Maps.newHashMap();
        for (final Map.Entry<K, Class348> entry : this.field27337.entrySet()) {
            final Class348 class348 = entry.getValue();
            if (class348.method1032()) {
                hashMap.put(((Class8863)entry.getKey()).method31042(), class348);
            }
        }
        if (this.field27336.getParentFile() != null) {
            this.field27336.getParentFile().mkdirs();
        }
        final JsonElement jsonTree = Class7012.field27333.toJsonTree((Object)hashMap);
        jsonTree.getAsJsonObject().addProperty("DataVersion", (Number)Class9528.method35579().getWorldVersion());
        try (final FileOutputStream out = new FileOutputStream(this.field27336);
             final OutputStreamWriter outputStreamWriter = new OutputStreamWriter(out, Charsets.UTF_8.newEncoder())) {
            Class7012.field27333.toJson(jsonTree, (Appendable)outputStreamWriter);
        }
        catch (final IOException ex) {
            Class7012.field27332.error("Couldn't save player advancements to {}", (Object)this.field27336, (Object)ex);
        }
    }
    
    public boolean method21464(final Class8863 class8863, final String s) {
        boolean b = false;
        final Class348 method21470 = this.method21470(class8863);
        final boolean method21471 = method21470.method1031();
        if (method21470.method1033(s)) {
            this.method21467(class8863);
            this.field27340.add(class8863);
            b = true;
            if (!method21471) {
                if (method21470.method1031()) {
                    class8863.method31037().method32433(this.field27341);
                    if (class8863.method31036() != null) {
                        if (class8863.method31036().method22535()) {
                            if (this.field27341.world.method6765().method31216(Class8878.field37337)) {
                                this.field27335.method1537().method20619(new Class2259("chat.type.advancement." + class8863.method31036().method22531().method8015(), new Object[] { this.field27341.getDisplayName(), class8863.method31044() }));
                            }
                        }
                    }
                }
            }
        }
        if (method21470.method1031()) {
            this.method21472(class8863);
        }
        return b;
    }
    
    public boolean method21465(final Class8863 class8863, final String s) {
        boolean b = false;
        final Class348 method21470 = this.method21470(class8863);
        if (method21470.method1034(s)) {
            this.method21466(class8863);
            this.field27340.add(class8863);
            b = true;
        }
        if (!method21470.method1032()) {
            this.method21472(class8863);
        }
        return b;
    }
    
    private void method21466(final Class8863 class8863) {
        final Class348 method21470 = this.method21470(class8863);
        if (!method21470.method1031()) {
            for (final Map.Entry<String, V> entry : class8863.method31039().entrySet()) {
                final Class8000 method21471 = method21470.method1037(entry.getKey());
                if (method21471 == null) {
                    continue;
                }
                if (method21471.method26167()) {
                    continue;
                }
                final Class4220 method21472 = ((Class8832)entry.getValue()).method30844();
                if (method21472 == null) {
                    continue;
                }
                final Class4640<Class4220> method21473 = Class7770.method24878(method21472.method12683());
                if (method21473 == null) {
                    continue;
                }
                method21473.method13723(this, new Class8803<Class4220>(method21472, class8863, entry.getKey()));
            }
        }
    }
    
    private void method21467(final Class8863 class8863) {
        final Class348 method21470 = this.method21470(class8863);
        for (final Map.Entry<String, V> entry : class8863.method31039().entrySet()) {
            final Class8000 method21471 = method21470.method1037(entry.getKey());
            if (method21471 == null) {
                continue;
            }
            if (!method21471.method26167() && !method21470.method1031()) {
                continue;
            }
            final Class4220 method21472 = ((Class8832)entry.getValue()).method30844();
            if (method21472 == null) {
                continue;
            }
            final Class4640<Class4220> method21473 = Class7770.method24878(method21472.method12683());
            if (method21473 == null) {
                continue;
            }
            method21473.method13724(this, new Class8803<Class4220>(method21472, class8863, entry.getKey()));
        }
    }
    
    public void method21468(final Class513 class513) {
        Label_0065: {
            if (!this.field27343) {
                if (this.field27339.isEmpty()) {
                    if (this.field27340.isEmpty()) {
                        break Label_0065;
                    }
                }
            }
            final HashMap hashMap = Maps.newHashMap();
            final LinkedHashSet linkedHashSet = Sets.newLinkedHashSet();
            final LinkedHashSet linkedHashSet2 = Sets.newLinkedHashSet();
            for (final Class8863 class514 : this.field27340) {
                if (!this.field27338.contains(class514)) {
                    continue;
                }
                hashMap.put(class514.method31042(), this.field27337.get(class514));
            }
            for (final Class8863 class515 : this.field27339) {
                if (!this.field27338.contains(class515)) {
                    linkedHashSet2.add(class515.method31042());
                }
                else {
                    linkedHashSet.add(class515);
                }
            }
            if (!this.field27343) {
                if (hashMap.isEmpty()) {
                    if (linkedHashSet.isEmpty()) {
                        if (linkedHashSet2.isEmpty()) {
                            break Label_0065;
                        }
                    }
                }
            }
            class513.field3039.method17469(new Class4385(this.field27343, linkedHashSet, linkedHashSet2, hashMap));
            this.field27339.clear();
            this.field27340.clear();
        }
        this.field27343 = false;
    }
    
    public void method21469(final Class8863 field27342) {
        final Class8863 field27343 = this.field27342;
        Label_0046: {
            if (field27342 != null) {
                if (field27342.method31035() == null) {
                    if (field27342.method31036() != null) {
                        this.field27342 = field27342;
                        break Label_0046;
                    }
                }
            }
            this.field27342 = null;
        }
        if (field27343 != this.field27342) {
            this.field27341.field3039.method17469(new Class4269((this.field27342 != null) ? this.field27342.method31042() : null));
        }
    }
    
    public Class348 method21470(final Class8863 class8863) {
        Class348 class8864 = this.field27337.get(class8863);
        if (class8864 == null) {
            class8864 = new Class348();
            this.method21471(class8863, class8864);
        }
        return class8864;
    }
    
    private void method21471(final Class8863 class8863, final Class348 class8864) {
        class8864.method1030(class8863.method31039(), class8863.method31043());
        this.field27337.put(class8863, class8864);
    }
    
    private void method21472(final Class8863 class8863) {
        final boolean method21473 = this.method21473(class8863);
        final boolean contains = this.field27338.contains(class8863);
        if (method21473 && !contains) {
            this.field27338.add(class8863);
            this.field27339.add(class8863);
            if (this.field27337.containsKey(class8863)) {
                this.field27340.add(class8863);
            }
        }
        else if (!method21473) {
            if (contains) {
                this.field27338.remove(class8863);
                this.field27339.add(class8863);
            }
        }
        if (method21473 != contains) {
            if (class8863.method31035() != null) {
                this.method21472(class8863.method31035());
            }
        }
        final Iterator<Class8863> iterator = class8863.method31038().iterator();
        while (iterator.hasNext()) {
            this.method21472(iterator.next());
        }
    }
    
    private boolean method21473(Class8863 method31035) {
        for (int n = 0; method31035 != null && n <= 2; method31035 = method31035.method31035(), ++n) {
            if (n == 0 && this.method21474(method31035)) {
                return true;
            }
            if (method31035.method31036() == null) {
                return false;
            }
            if (this.method21470(method31035).method1031()) {
                return true;
            }
            if (method31035.method31036().method22536()) {
                return false;
            }
        }
        return false;
    }
    
    private boolean method21474(final Class8863 class8863) {
        if (!this.method21470(class8863).method1031()) {
            final Iterator<Class8863> iterator = class8863.method31038().iterator();
            while (iterator.hasNext()) {
                if (!this.method21474(iterator.next())) {
                    continue;
                }
                return true;
            }
            return false;
        }
        return true;
    }
    
    static {
        field27332 = LogManager.getLogger();
        field27333 = new GsonBuilder().registerTypeAdapter((Type)Class348.class, (Object)new Class5988()).registerTypeAdapter((Type)Class1932.class, (Object)new Class5958()).setPrettyPrinting().create();
        field27334 = new Class7514();
    }
}
