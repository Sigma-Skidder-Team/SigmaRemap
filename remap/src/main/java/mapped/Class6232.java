// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Collector;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import java.util.List;
import com.google.gson.JsonDeserializationContext;
import java.util.Iterator;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;
import net.minecraft.util.text.ITextComponent;

public class Class6232 extends Class6227<Class140>
{
    public Class6232() {
        super(new Class1932("set_lore"), Class140.class);
    }
    
    public void method18550(final JsonObject jsonObject, final Class140 class140, final JsonSerializationContext jsonSerializationContext) {
        super.method18536(jsonObject, class140, jsonSerializationContext);
        jsonObject.addProperty("replace", Boolean.valueOf(Class140.method687(class140)));
        final JsonArray jsonArray = new JsonArray();
        final Iterator iterator = Class140.method688(class140).iterator();
        while (iterator.hasNext()) {
            jsonArray.add(Class5953.method17870((ITextComponent)iterator.next()));
        }
        jsonObject.add("lore", (JsonElement)jsonArray);
        if (Class140.method689(class140) != null) {
            jsonObject.add("entity", jsonSerializationContext.serialize((Object)Class140.method689(class140)));
        }
    }
    
    public Class140 method18551(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext, final Class122[] array) {
        return new Class140(array, Class9583.method35901(jsonObject, "replace", false), Streams.stream((Iterable)Class9583.method35917(jsonObject, "lore")).map(Class5953::method17872).collect((Collector<? super Object, Object, List<ITextComponent>>)ImmutableList.toImmutableList()), Class9583.method35921(jsonObject, "entity", (Class2065)null, jsonDeserializationContext, Class2065.class));
    }
}
