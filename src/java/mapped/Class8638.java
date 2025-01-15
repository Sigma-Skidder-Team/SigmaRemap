// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonElement;
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
    private final List<Class1932> field36238;
    
    private Class8638(final List<Class1932> field36238) {
        this.field36238 = field36238;
    }
    
    @Nullable
    public List<Class1932> method29313() {
        return this.field36238;
    }
    
    public static Class8638 method29314(final JsonObject jsonObject) {
        final JsonArray method35918 = Class9583.method35918(jsonObject, "textures", null);
        List<Class1932> list;
        if (method35918 == null) {
            list = null;
        }
        else {
            list = Streams.stream((Iterable)method35918).map(jsonElement -> Class9583.method35894(jsonElement, "texture")).map((Function<? super Object, ?>)Class1932::new).collect((Collector<? super Object, Object, List<Class1932>>)ImmutableList.toImmutableList());
        }
        return new Class8638(list);
    }
}
