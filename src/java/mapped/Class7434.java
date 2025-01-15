// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.common.collect.Sets;
import java.util.Set;

public class Class7434 extends Class7422
{
    public Set<String> field28668;
    
    public Class7434() {
        this.field28668 = Sets.newHashSet();
    }
    
    public static Class7434 method22868(final String s) {
        final Class7434 class7434 = new Class7434();
        final JsonParser jsonParser = new JsonParser();
        try {
            final JsonElement value = jsonParser.parse(s).getAsJsonObject().get("ops");
            if (value.isJsonArray()) {
                final Iterator iterator = value.getAsJsonArray().iterator();
                while (iterator.hasNext()) {
                    class7434.field28668.add(((JsonElement)iterator.next()).getAsString());
                }
            }
        }
        catch (final Exception ex) {}
        return class7434;
    }
}
