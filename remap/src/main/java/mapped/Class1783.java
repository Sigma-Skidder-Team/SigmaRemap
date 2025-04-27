// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.reflect.Type;
import com.google.gson.GsonBuilder;
import org.apache.logging.log4j.LogManager;
import java.util.Collections;
import java.util.Set;
import com.google.common.collect.ImmutableMap$Builder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import javax.annotation.Nullable;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import com.google.gson.Gson;
import org.apache.logging.log4j.Logger;

public class Class1783 extends Class1779
{
    private static final Logger field9892;
    private static final Gson field9893;
    private Map<ResourceLocation, Class122> field9894;
    
    public Class1783() {
        super(Class1783.field9893, "predicates");
        this.field9894 = ImmutableMap.of();
    }
    
    @Nullable
    public Class122 method6409(final ResourceLocation class1932) {
        return this.field9894.get(class1932);
    }
    
    public void method6377(final Map<ResourceLocation, JsonObject> map, final Class6582 class6582, final IProfiler class6583) {
        final ImmutableMap$Builder builder = ImmutableMap.builder();
        map.forEach((class6585, jsonObject) -> {
            try {
                immutableMap$Builder.put((Object)class6585, (Object)Class1783.field9893.fromJson(jsonObject, (Class)Class122.class));
            }
            catch (final Exception ex) {
                Class1783.field9892.error("Couldn't parse loot table {}", class6585, ex);
            }
        });
        final ImmutableMap build = builder.build();
        final Class7790 class6584 = new Class7790(Class7104.field27718, build::get, p0 -> null);
        build.forEach((obj, class6588) -> class6588.method636(class6587.method25017("{" + obj + "}", obj)));
        class6584.method25020().forEach((str, str2) -> Class1783.field9892.warn("Found validation problem in " + str + ": " + str2));
        this.field9894 = (Map<ResourceLocation, Class122>)build;
    }
    
    public Set<ResourceLocation> method6410() {
        return Collections.unmodifiableSet(this.field9894.keySet());
    }
    
    static {
        field9892 = LogManager.getLogger();
        field9893 = new GsonBuilder().registerTypeAdapter(Class5772.class, new Class5957()).registerTypeAdapter(Class5769.class, new Class5986()).registerTypeAdapter(Class5771.class, new Class5975()).registerTypeHierarchyAdapter(Class122.class, new Class5967()).registerTypeHierarchyAdapter(Class2065.class, new Class7904()).create();
    }
}
