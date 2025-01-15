// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.common.collect.Lists;
import java.util.List;

public class Class7438 extends Class7422
{
    public long field28693;
    public List<Class7435> field28694;
    
    public Class7438() {
        this.field28694 = Lists.newArrayList();
    }
    
    public static Class7438 method22887(final String s) {
        final Class7438 class7438 = new Class7438();
        final JsonParser jsonParser = new JsonParser();
        try {
            final JsonObject asJsonObject = jsonParser.parse(s).getAsJsonObject();
            class7438.field28693 = Class7610.method23909("periodInMillis", asJsonObject, -1L);
            final JsonElement value = asJsonObject.get("playerActivityDto");
            if (value != null && value.isJsonArray()) {
                final Iterator iterator = value.getAsJsonArray().iterator();
                while (iterator.hasNext()) {
                    class7438.field28694.add(Class7435.method22869(((JsonElement)iterator.next()).getAsJsonObject()));
                }
            }
        }
        catch (final Exception ex) {}
        return class7438;
    }
}
