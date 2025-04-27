// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.reflect.Type;
import com.google.gson.GsonBuilder;
import org.apache.logging.log4j.LogManager;
import java.util.Set;
import com.google.common.collect.ImmutableMap$Builder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import com.google.gson.Gson;
import org.apache.logging.log4j.Logger;

public class Class1782 extends Class1779
{
    private static final Logger field9888;
    private static final Gson field9889;
    private Map<ResourceLocation, Class9317> field9890;
    private final Class1783 field9891;
    
    public Class1782(final Class1783 field9891) {
        super(Class1782.field9889, "loot_tables");
        this.field9890 = ImmutableMap.of();
        this.field9891 = field9891;
    }
    
    public Class9317 method6402(final ResourceLocation key) {
        return this.field9890.getOrDefault(key, Class9317.field40009);
    }
    
    public void method6377(final Map<ResourceLocation, JsonObject> map, final Class6582 class6582, final IProfiler class6583) {
        final ImmutableMap$Builder builder = ImmutableMap.builder();
        if (map.remove(Class9020.field38063) != null) {
            Class1782.field9888.warn("Datapack tried to redefine {} loot table, ignoring", Class9020.field38063);
        }
        map.forEach((class6585, jsonObject) -> {
            try {
                immutableMap$Builder.put((Object)class6585, (Object)Class1782.field9889.fromJson(jsonObject, (Class)Class9317.class));
            }
            catch (final Exception ex) {
                Class1782.field9888.error("Couldn't parse loot table {}", class6585, ex);
            }
        });
        builder.put((Object)Class9020.field38063, (Object)Class9317.field40009);
        final ImmutableMap build = builder.build();
        final Class7790 class6584 = new Class7790(Class7104.field27718, this.field9891::method6409, build::get);
        build.forEach((class6587, class6588) -> method6403(class6586, class6587, class6588));
        class6584.method25020().forEach((str, str2) -> Class1782.field9888.warn("Found validation problem in " + str + ": " + str2));
        this.field9890 = (Map<ResourceLocation, Class9317>)build;
    }
    
    public static void method6403(final Class7790 class7790, final ResourceLocation obj, final Class9317 class7791) {
        class7791.method34487(class7790.method25024(class7791.method34486()).method25016("{" + obj + "}", obj));
    }
    
    public static JsonElement method6404(final Class9317 class9317) {
        return Class1782.field9889.toJsonTree(class9317);
    }
    
    public Set<ResourceLocation> method6405() {
        return this.field9890.keySet();
    }
    
    static {
        field9888 = LogManager.getLogger();
        field9889 = new GsonBuilder().registerTypeAdapter(Class5772.class, new Class5957()).registerTypeAdapter(Class5769.class, new Class5986()).registerTypeAdapter(Class5771.class, new Class5975()).registerTypeAdapter(Class9299.class, new Class5971()).registerTypeAdapter(Class9320.class, new Class5980()).registerTypeAdapter(Class9317.class, new Class5969()).registerTypeHierarchyAdapter(Class6368.class, new Class5955()).registerTypeHierarchyAdapter(Class125.class, new Class5974()).registerTypeHierarchyAdapter(Class122.class, new Class5967()).registerTypeHierarchyAdapter(Class2065.class, new Class7904()).create();
    }
}
