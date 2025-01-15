// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.HashSet;
import java.util.Collection;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.util.Map;
import com.google.common.collect.Sets;
import com.google.gson.JsonObject;

public class Class5094 implements Class5092<Class8785>
{
    public Class8785 method15971(final JsonObject jsonObject) {
        final HashSet hashSet = Sets.newHashSet();
        for (final Map.Entry<String, V> entry : jsonObject.entrySet()) {
            final String s = entry.getKey();
            if (s.length() > 16) {
                throw new JsonParseException("Invalid language->'" + s + "': language code must not be more than " + 16 + " characters long");
            }
            final JsonObject method35913 = Class9583.method35913((JsonElement)entry.getValue(), "language");
            final String method35914 = Class9583.method35895(method35913, "region");
            final String method35915 = Class9583.method35895(method35913, "name");
            final boolean method35916 = Class9583.method35901(method35913, "bidirectional", false);
            if (method35914.isEmpty()) {
                throw new JsonParseException("Invalid language->'" + s + "'->region: empty value");
            }
            if (method35915.isEmpty()) {
                throw new JsonParseException("Invalid language->'" + s + "'->name: empty value");
            }
            if (hashSet.add(new Class1947(s, method35914, method35915, method35916))) {
                continue;
            }
            throw new JsonParseException("Duplicate language->'" + s + "' defined");
        }
        return new Class8785(hashSet);
    }
    
    @Override
    public String method15968() {
        return "language";
    }
}
