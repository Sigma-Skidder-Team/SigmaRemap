// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class Class7425 extends Class7422
{
    private static final Logger field28625;
    public List<Class7437> field28626;
    
    public static Class7425 method22845(final String s) {
        final Class7425 class7425 = new Class7425();
        class7425.field28626 = Lists.newArrayList();
        try {
            final JsonObject asJsonObject = new JsonParser().parse(s).getAsJsonObject();
            if (asJsonObject.get("servers").isJsonArray()) {
                final Iterator iterator = asJsonObject.get("servers").getAsJsonArray().iterator();
                while (iterator.hasNext()) {
                    class7425.field28626.add(Class7437.method22877(((JsonElement)iterator.next()).getAsJsonObject()));
                }
            }
        }
        catch (final Exception ex) {
            Class7425.field28625.error("Could not parse McoServerList: " + ex.getMessage());
        }
        return class7425;
    }
    
    static {
        field28625 = LogManager.getLogger();
    }
}
