// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Collector;
import com.google.common.collect.ImmutableList;
import java.util.function.Function;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import javax.annotation.Nullable;
import java.util.List;

public class Class8638
{
    private final List<ResourceLocation> field36238;
    
    private Class8638(final List<ResourceLocation> field36238) {
        this.field36238 = field36238;
    }
    
    @Nullable
    public List<ResourceLocation> method29313() {
        return this.field36238;
    }
    
    public static Class8638 method29314(final JsonObject jsonObject) {
        final JsonArray method35918 = Class9583.method35918(jsonObject, "textures", null);
        List<ResourceLocation> list;
        if (method35918 == null) {
            list = null;
        }
        else {
            list = Streams.stream((Iterable)method35918).map(jsonElement -> Class9583.method35894(jsonElement, "texture")).map((Function<? super Object, ?>) ResourceLocation::new).collect(ImmutableList.toImmutableList());
        }
        return new Class8638(list);
    }
}
