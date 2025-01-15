// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.JsonParseException;
import org.apache.commons.lang3.Validate;
import com.google.common.collect.Lists;
import com.google.gson.JsonObject;

public class Class5096 implements Class5092<Class8637>
{
    public Class8637 method15973(final JsonObject jsonObject) {
        final ArrayList arrayList = Lists.newArrayList();
        final int method35910 = Class9583.method35910(jsonObject, "frametime", 1);
        if (method35910 != 1) {
            Validate.inclusiveBetween(1L, 2147483647L, (long)method35910, "Invalid default frame time");
        }
        if (jsonObject.has("frames")) {
            try {
                final JsonArray method35911 = Class9583.method35917(jsonObject, "frames");
                for (int i = 0; i < method35911.size(); ++i) {
                    final Class7272 method35912 = this.method15974(i, method35911.get(i));
                    if (method35912 != null) {
                        arrayList.add(method35912);
                    }
                }
            }
            catch (final ClassCastException ex) {
                throw new JsonParseException("Invalid animation->frames: expected array, was " + jsonObject.get("frames"), (Throwable)ex);
            }
        }
        final int method35913 = Class9583.method35910(jsonObject, "width", -1);
        final int method35914 = Class9583.method35910(jsonObject, "height", -1);
        if (method35913 != -1) {
            Validate.inclusiveBetween(1L, 2147483647L, (long)method35913, "Invalid width");
        }
        if (method35914 != -1) {
            Validate.inclusiveBetween(1L, 2147483647L, (long)method35914, "Invalid height");
        }
        return new Class8637(arrayList, method35913, method35914, method35910, Class9583.method35901(jsonObject, "interpolate", false));
    }
    
    private Class7272 method15974(final int n, final JsonElement jsonElement) {
        if (jsonElement.isJsonPrimitive()) {
            return new Class7272(Class9583.method35908(jsonElement, "frames[" + n + "]"));
        }
        if (!jsonElement.isJsonObject()) {
            return null;
        }
        final JsonObject method35913 = Class9583.method35913(jsonElement, "frames[" + n + "]");
        final int method35914 = Class9583.method35910(method35913, "time", -1);
        if (method35913.has("time")) {
            Validate.inclusiveBetween(1L, 2147483647L, (long)method35914, "Invalid frame time");
        }
        final int method35915 = Class9583.method35909(method35913, "index");
        Validate.inclusiveBetween(0L, 2147483647L, (long)method35915, "Invalid frame index");
        return new Class7272(method35915, method35914);
    }
    
    @Override
    public String method15968() {
        return "animation";
    }
}
