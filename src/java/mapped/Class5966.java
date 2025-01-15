// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.List;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonDeserializer;

public class Class5966 implements JsonDeserializer<Class7686>
{
    private static String[] field24455;
    private final Class9333 field24456;
    
    public Class5966(final Class9333 field24456) {
        this.field24456 = field24456;
    }
    
    public Class7686 deserialize(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return new Class7686(this.field24456.method34573(), this.method17880(jsonDeserializationContext, jsonElement.getAsJsonArray()));
    }
    
    private List<Class8997> method17880(final JsonDeserializationContext jsonDeserializationContext, final JsonArray jsonArray) {
        final ArrayList arrayList = Lists.newArrayList();
        final Iterator iterator = jsonArray.iterator();
        while (iterator.hasNext()) {
            arrayList.add(jsonDeserializationContext.deserialize((JsonElement)iterator.next(), (Type)Class8997.class));
        }
        return arrayList;
    }
}
